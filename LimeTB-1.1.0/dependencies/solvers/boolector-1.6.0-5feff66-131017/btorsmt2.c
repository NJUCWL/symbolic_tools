/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2011-2013 Armin Biere.
 *  Copyright (C) 2013 Aina Niemetz, Mathias Preiner.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 */

#include "btorsmt2.h"
#include "btormem.h"
#include "btorexp.h"
#include "btorutil.h"
#include "btorconst.h"

#include <stdarg.h>
#include <ctype.h>
#include <limits.h>

/*------------------------------------------------------------------------*/

typedef enum BtorSMT2TagClass {
  BTOR_CLASS_BITS_SMT2                  = 6,
  BTOR_CLASS_SIZE_SMT2                  = (1 << BTOR_CLASS_BITS_SMT2),
  BTOR_CLASS_MASK_SMT2                  = (BTOR_CLASS_SIZE_SMT2 - 1),

  BTOR_OTHER_TAG_CLASS_SMT2             = 0,

  BTOR_CONSTANT_TAG_CLASS_SMT2          = (BTOR_CLASS_SIZE_SMT2 << 0),
  BTOR_RESERVED_TAG_CLASS_SMT2          = (BTOR_CLASS_SIZE_SMT2 << 1),
  BTOR_COMMAND_TAG_CLASS_SMT2           = (BTOR_CLASS_SIZE_SMT2 << 2),
  BTOR_KEYWORD_TAG_CLASS_SMT2           = (BTOR_CLASS_SIZE_SMT2 << 3),
  BTOR_CORE_TAG_CLASS_SMT2              = (BTOR_CLASS_SIZE_SMT2 << 4),
  BTOR_ARRAY_TAG_CLASS_SMT2             = (BTOR_CLASS_SIZE_SMT2 << 5),
  BTOR_BITVEC_TAG_CLASS_SMT2            = (BTOR_CLASS_SIZE_SMT2 << 6),
  BTOR_LOGIC_TAG_CLASS_SMT2             = (BTOR_CLASS_SIZE_SMT2 << 7),
} BtorSMT2TagClass;

typedef enum BtorSMT2Tag {

  BTOR_INVALID_TAG_SMT2                 =  0 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_PARENT_TAG_SMT2                  =  1 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_LPAR_TAG_SMT2                    =  2 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_RPAR_TAG_SMT2                    =  3 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_SYMBOL_TAG_SMT2                  =  4 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_ATTRIBUTE_TAG_SMT2               =  5 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_EXP_TAG_SMT2                     =  6 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_LETBIND_TAG_SMT2                 =  7 + BTOR_OTHER_TAG_CLASS_SMT2,
  BTOR_PARLETBINDING_TAG_SMT2           =  8 + BTOR_OTHER_TAG_CLASS_SMT2,

  BTOR_DECIMAL_CONSTANT_TAG_SMT2        =  0 + BTOR_CONSTANT_TAG_CLASS_SMT2,
  BTOR_HEXADECIMAL_CONSTANT_TAG_SMT2    =  1 + BTOR_CONSTANT_TAG_CLASS_SMT2,
  BTOR_BINARY_CONSTANT_TAG_SMT2         =  2 + BTOR_CONSTANT_TAG_CLASS_SMT2,
  BTOR_STRING_CONSTANT_TAG_SMT2         =  3 + BTOR_CONSTANT_TAG_CLASS_SMT2,

  BTOR_PAR_TAG_SMT2                     =  0 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_NUMERAL_RESERVED_WORD_TAG_SMT2   =  1 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_DECIMAL_RESERVED_WORD_TAG_SMT2   =  2 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_STRING_RESERVED_WORD_TAG_SMT2    =  3 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_UNDERSCORE_TAG_SMT2              =  4 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_BANG_TAG_SMT2                    =  5 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_AS_TAG_SMT2                      =  6 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_LET_TAG_SMT2                     =  7 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_FORALL_TAG_SMT2                  =  8 + BTOR_RESERVED_TAG_CLASS_SMT2,
  BTOR_EXISTS_TAG_SMT2                  =  9 + BTOR_RESERVED_TAG_CLASS_SMT2,

  BTOR_SET_LOGIC_TAG_SMT2               =  0 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_SET_OPTION_TAG_SMT2              =  1 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_SET_INFO_TAG_SMT2                =  2 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_DECLARE_SORT_TAG_SMT2            =  3 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_DEFINE_SORT_TAG_SMT2             =  4 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_DECLARE_FUN_TAG_SMT2             =  5 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_DEFINE_FUN_TAG_SMT2              =  6 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_PUSH_TAG_SMT2                    =  7 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_POP_TAG_SMT2                     =  8 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_ASSERT_TAG_SMT2                  =  9 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_CHECK_SAT_TAG_SMT2               = 10 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_ASSERTIONS_TAG_SMT2          = 11 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_PROOF_TAG_SMT2               = 12 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_UNSAT_CORE_TAG_SMT2          = 13 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_VALUE_TAG_SMT2               = 14 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_ASSIGNMENT_TAG_SMT2          = 15 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_OPTION_TAG_SMT2              = 16 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_GET_INFO_TAG_SMT2                = 17 + BTOR_COMMAND_TAG_CLASS_SMT2,
  BTOR_EXIT_TAG_SMT2                    = 18 + BTOR_COMMAND_TAG_CLASS_SMT2,

  BTOR_ALL_STATISTICS_TAG_SMT2          =  0 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_AUTHORS_TAG_SMT2                 =  1 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_AXIOMS_TAG_SMT2                  =  2 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_CHAINABLE_TAG_SMT2               =  3 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_DEFINITION_TAG_SMT2              =  4 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_DIAG_OUTPUT_CHANNEL_TAG_SMT2     =  5 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_ERROR_BEHAVIOR_TAG_SMT2          =  6 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_EXPAND_DEFINITIONS_TAG_SMT2      =  7 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_EXTENSIONS_TAG_SMT2              =  8 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_FUNS_TAG_SMT2                    =  9 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_FUNS_DESCRIPTION_TAG_SMT2        = 10 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_INTERACTIVE_MODE_TAG_SMT2        = 11 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_LANGUAGE_TAG_SMT2                = 12 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_LEFT_ASSOC_TAG_SMT2              = 13 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_NAME_TAG_SMT2                    = 14 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_NAMED_TAG_SMT2                   = 15 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_NOTES_TAG_SMT2                   = 16 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_PRINT_SUCCESS_TAG_SMT2           = 17 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_PRODUCE_ASSIGNMENTS_TAG_SMT2     = 18 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_PRODUCE_MODELS_TAG_SMT2          = 19 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_PRODUCE_PROOFS_TAG_SMT2          = 20 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_PRODUCE_UNSAT_CORES_TAG_SMT2     = 21 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_RANDOM_SEED_TAG_SMT2             = 22 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_REASON_UNKNOWN_TAG_SMT2          = 23 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_REGULAR_OUTPUT_CHANNEL_TAG_SMT2  = 24 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_RIGHT_ASSOC_TAG_SMT2             = 25 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_SORTS_TAG_SMT2                   = 26 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_SORTS_DESCRIPTION_TAG_SMT2       = 27 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_STATUS_TAG_SMT2                  = 28 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_THEORIES_TAG_SMT2                = 29 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_VALUES_TAG_SMT2                  = 30 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_VERBOSITY_TAG_SMT2               = 31 + BTOR_KEYWORD_TAG_CLASS_SMT2,
  BTOR_VERSION_TAG_SMT2                 = 32 + BTOR_KEYWORD_TAG_CLASS_SMT2,

  BTOR_BOOL_TAG_SMT2                    =  0 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_TRUE_TAG_SMT2                    =  1 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_FALSE_TAG_SMT2                   =  2 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_NOT_TAG_SMT2                     =  3 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_IMPLIES_TAG_SMT2                 =  4 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_AND_TAG_SMT2                     =  5 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_OR_TAG_SMT2                      =  6 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_XOR_TAG_SMT2                     =  7 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_EQUAL_TAG_SMT2                   =  8 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_DISTINCT_TAG_SMT2                =  9 + BTOR_CORE_TAG_CLASS_SMT2,
  BTOR_ITE_TAG_SMT2                     = 10 + BTOR_CORE_TAG_CLASS_SMT2,

  BTOR_ARRAY_TAG_SMT2                   =  0 + BTOR_ARRAY_TAG_CLASS_SMT2,
  BTOR_SELECT_TAG_SMT2                  =  1 + BTOR_ARRAY_TAG_CLASS_SMT2,
  BTOR_STORE_TAG_SMT2                   =  2 + BTOR_ARRAY_TAG_CLASS_SMT2,

  BTOR_BITVEC_TAG_SMT2                  =  0 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_CONCAT_TAG_SMT2                  =  1 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_EXTRACT_TAG_SMT2                 =  2 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVNOT_TAG_SMT2                   =  3 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVNEG_TAG_SMT2                   =  4 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVAND_TAG_SMT2                   =  5 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVOR_TAG_SMT2                    =  6 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVADD_TAG_SMT2                   =  7 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVMUL_TAG_SMT2                   =  8 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVUDIV_TAG_SMT2                  =  9 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVUREM_TAG_SMT2                  = 10 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSHL_TAG_SMT2                   = 11 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVLSHR_TAG_SMT2                  = 12 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVULT_TAG_SMT2                   = 13 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVNAND_TAG_SMT2                  = 14 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVNOR_TAG_SMT2                   = 15 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVXOR_TAG_SMT2                   = 16 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVXNOR_TAG_SMT2                  = 17 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVCOMP_TAG_SMT2                  = 18 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSUB_TAG_SMT2                   = 19 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSDIV_TAG_SMT2                  = 20 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSREM_TAG_SMT2                  = 21 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSMOD_TAG_SMT2                  = 22 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVASHR_TAG_SMT2                  = 23 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_REPEAT_TAG_SMT2                  = 24 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_ZERO_EXTEND_TAG_SMT2             = 25 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_SIGN_EXTEND_TAG_SMT2             = 26 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_ROTATE_LEFT_TAG_SMT2             = 27 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_ROTATE_RIGHT_TAG_SMT2            = 28 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVULE_TAG_SMT2                   = 29 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVUGT_TAG_SMT2                   = 30 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVUGE_TAG_SMT2                   = 31 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSLT_TAG_SMT2                   = 32 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSLE_TAG_SMT2                   = 33 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSGT_TAG_SMT2                   = 34 + BTOR_BITVEC_TAG_CLASS_SMT2,
  BTOR_BVSGE_TAG_SMT2                   = 35 + BTOR_BITVEC_TAG_CLASS_SMT2,

  BTOR_AUFLIA_TAG_SMT2                  =  0 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_AUFLIRA_TAG_SMT2                 =  1 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_AUFNIRA_TAG_SMT2                 =  2 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_LRA_TAG_SMT2                     =  3 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_ABV_TAG_SMT2                  =  4 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_AUFBV_TAG_SMT2                =  5 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_AUFLIA_TAG_SMT2               =  6 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_AX_TAG_SMT2                   =  7 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_BV_TAG_SMT2                   =  8 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_IDL_TAG_SMT2                  =  9 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_LIA_TAG_SMT2                  = 10 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_LRA_TAG_SMT2                  = 11 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_NIA_TAG_SMT2                  = 12 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_NRA_TAG_SMT2                  = 13 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_RDL_TAG_SMT2                  = 14 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_UF_TAG_SMT2                   = 15 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_UFBV_TAG_SMT2                 = 16 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_UFIDL_TAG_SMT2                = 17 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_UFLIA_TAG_SMT2                = 18 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_UFLRA_TAG_SMT2                = 19 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_QF_UFNRA_TAG_SMT2                = 20 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_UFLRA_TAG_SMT2                   = 21 + BTOR_LOGIC_TAG_CLASS_SMT2,
  BTOR_UFNIA_TAG_SMT2                   = 22 + BTOR_LOGIC_TAG_CLASS_SMT2,

} BtorSMT2Tag;

typedef struct BtorSMT2Coo { int x, y; } BtorSMT2Coo;

typedef struct BtorSMT2Node {
  BtorSMT2Tag tag;
  unsigned bound:1;
  BtorSMT2Coo coo;
  char * name;
  BtorNode * exp;
  struct BtorSMT2Node * next;
} BtorSMT2Node;

typedef struct BtorSMT2Item {
  BtorSMT2Tag tag;
  BtorSMT2Coo coo;
  union { int num; struct { int hi, lo; }; };
  union { BtorSMT2Node * node; BtorNode * exp; char * str; };
} BtorSMT2Item;

BTOR_DECLARE_STACK(SMT2Item,BtorSMT2Item);

/*------------------------------------------------------------------------*/

static const char * btor_printable_ascii_chars_smt2 =
"!\"#$%&'()*+,-./"
"0123456789"
":;<=>?@"
"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
"[\\]^_`"
"abcdefghijklmnopqrstuvwxyz"
"{|}~"
" \t\r\n"
;

static const char * btor_letters_smt2 =
"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
"abcdefghijklmnopqrstuvwxyz"
;

static const char * btor_decimal_digits_smt2 = "0123456789";

static const char * btor_hexadecimal_digits_smt2 = "0123456789abcdefABCDEF";

static const char * btor_extra_symbol_chars_smt2 = "+-/*=%?!.$_~&^<>@";

static const char * btor_extra_keyword_chars_smt2 = "+-/*=%?!.$_~&^<>@";

typedef enum BtorSMT2CharClass {
  BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2            = (1<<0),
  BTOR_HEXADECIMAL_DIGIT_CHAR_CLASS_SMT2        = (1<<1),
  BTOR_STRING_CHAR_CLASS_SMT2                   = (1<<2),
  BTOR_SYMBOL_CHAR_CLASS_SMT2                   = (1<<3),
  BTOR_QUOTED_SYMBOL_CHAR_CLASS_SMT2            = (1<<4),
  BTOR_KEYWORD_CHAR_CLASS_SMT2                  = (1<<5),
} BtorSMT2CharClass;

typedef struct BtorSMT2Parser {
  Btor * btor; BtorMemMgr * mem;
  int verbosity, incremental, model, need_arrays;
  char * name; BtorSMT2Coo coo, lastcoo, nextcoo, perrcoo; FILE * file;
  int saved; int savedch; int last_end_of_line_ycoo;
  BtorSMT2Node * last_node;
  int nprefix; BtorCharStack * prefix;
  char * error;
  struct { unsigned size, count; BtorSMT2Node ** table; } symbol;
  unsigned char cc[256];
  BtorNodePtrStack outputs, inputs;
  BtorCharStack token;
  BtorSMT2ItemStack work;
  BtorParseResult * res;
  struct {
    int all, set_logic, asserts, check_sat, exits;
  } commands;
  int binding, expecting_let_body;
} BtorSMT2Parser;

static int btor_xcoo_smt2 (BtorSMT2Parser * parser) {
  return parser->perrcoo.x ? parser->perrcoo.x : parser->coo.x;
}

static int btor_ycoo_smt2 (BtorSMT2Parser * parser) {
  return parser->perrcoo.x ? parser->perrcoo.y : parser->coo.y;
}

static char * btor_perr_smt2 (BtorSMT2Parser * parser, const char * fmt, ...) {
  size_t bytes;
  va_list ap;
  if (!parser->error) {
    va_start (ap, fmt);
    bytes = btor_parse_error_message_length (parser->name, fmt, ap);
    va_end (ap);
    va_start (ap, fmt);
    parser->error =
      btor_parse_error_message (parser->mem, parser->name,
	btor_xcoo_smt2 (parser), btor_ycoo_smt2 (parser),
	fmt, ap, bytes);
    va_end (ap);
  }
  return parser->error;
}

static void btor_savech_smt2 (BtorSMT2Parser * parser, char ch) {
  assert (!parser->saved);
  parser->saved = 1;
  parser->savedch = ch;
  if (ch == '\n') {
    assert (parser->nextcoo.x > 1);
    parser->nextcoo.x--;
    parser->nextcoo.y = parser->last_end_of_line_ycoo;
  } else {
    assert (parser->nextcoo.y > 1);
    parser->nextcoo.y--;
  }
}

static char * btor_cerr_smt2 (BtorSMT2Parser * parser,
			      const char * p, int ch, const char * s) {
  const char * d, * n;

  if (!parser->saved) btor_savech_smt2 (parser, ch);
  parser->perrcoo = parser->nextcoo;

  if (ch == EOF)
    return btor_perr_smt2 (parser, "%s end-of-file%s%s",
			   p, (s?" ":""), (s?s:""));
  if (isprint (ch) && ch != '\\')
    return btor_perr_smt2 (parser, "%s character '%c'%s%s",
			   p, ch, (s?" ":""), (s?s:""));

  switch (ch) {
    case '\\': n = "backslash"; d = "\\\\"; break;
    case '\n': n = "new line"; d = "\\n"; break;
    case '\t': n = "horizontal tabulator"; d = "\\t"; break;
    case '\r': n = "carriage return"; d = "\\r"; break;
    default: n="character"; d = 0; break;
  }

  if (d)
    return btor_perr_smt2 (parser, "%s %s '%s'%s%s",
			   p, n, d, (s?" ":""), (s?s:""));

  return btor_perr_smt2 (parser,
			 "%s (non-printable) character (code %d)%s%s",
			 p, ch, (s?" ":""), (s?s:""));
}

static unsigned btor_primes_smt2[] = {
  1000000007u, 2000000011u, 3000000019u, 4000000007u
};

#define BTOR_NPRIMES_SMT2 (sizeof btor_primes_smt2/sizeof*btor_primes_smt2)

static unsigned btor_hash_name_smt2 (BtorSMT2Parser * parser,
				     const char * name) {
  unsigned res = 0, i = 0;
  unsigned char ch;
  const char * p;
  for (p = name; (ch = *p); p++) {
    res += ch;
    res *= btor_primes_smt2[i++];
    if (i == BTOR_NPRIMES_SMT2) i = 0;
  }
  return res & (parser->symbol.size - 1);
}

static BtorSMT2Node ** btor_symbol_position_smt2 (BtorSMT2Parser * parser,
						    const char * name) {
  unsigned h = btor_hash_name_smt2 (parser, name);
  BtorSMT2Node ** p, * s;
  for (p = parser->symbol.table + h;
       (s = *p) && strcmp (s->name, name);
       p = &s->next)
    ;
  return p;
}

static int btor_nextch_smt2 (BtorSMT2Parser * parser) {
  int res;
  if (parser->saved) res = parser->savedch, parser->saved = 0;
  else if (parser->prefix &&
	   parser->nprefix < BTOR_COUNT_STACK (*parser->prefix))
    res = parser->prefix->start[parser->nprefix++];
  else res = getc (parser->file);
  if (res == '\n') {
    parser->nextcoo.x++;
    assert (parser->nextcoo.x > 0);
    parser->last_end_of_line_ycoo = parser->nextcoo.y;
    parser->nextcoo.y = 1;
  } else parser->nextcoo.y++, assert (parser->nextcoo.y > 0);
  return res;
}

static void btor_enlarge_symbol_table_smt2 (BtorSMT2Parser * parser) {
  unsigned old_size = parser->symbol.size;
  unsigned new_size = old_size ? 2*old_size : 1;
  BtorSMT2Node ** old_table = parser->symbol.table, * p, * next,  ** q;
  unsigned h, i;
  BTOR_NEWN (parser->mem, parser->symbol.table, new_size);
  BTOR_CLRN (parser->symbol.table, new_size);
  parser->symbol.size = new_size;
  for (i = 0; i < old_size; i++)
    for (p = old_table[i]; p; p = next) {
      next = p->next;
      h = btor_hash_name_smt2 (parser, p->name);
      p->next = *(q = parser->symbol.table + h);
      *q = p;
    }
  BTOR_DELETEN (parser->mem, old_table, old_size);
}

static void btor_insert_symbol_smt2 (BtorSMT2Parser * parser,
				     BtorSMT2Node * symbol) {
  BtorSMT2Node ** p;
  if (parser->symbol.size <= parser->symbol.count)
    btor_enlarge_symbol_table_smt2 (parser);
  p = btor_symbol_position_smt2 (parser, symbol->name);
  assert (!*p);
  *p = symbol;
  parser->symbol.count++;
  assert (parser->symbol.count > 0);
}

static BtorSMT2Node * btor_find_symbol_smt2 (BtorSMT2Parser * parser,
					       const char * name) {
  return *btor_symbol_position_smt2 (parser, name);
}

static BtorSMT2Node * btor_new_node_smt2 (BtorSMT2Parser * parser,
					  BtorSMT2Tag tag) {
  BtorSMT2Node * res;
  BTOR_NEW (parser->mem, res);
  BTOR_CLR (res);
  res->tag = tag;
  return res;
}

static void btor_release_symbol_smt2 (BtorSMT2Parser * parser,
				      BtorSMT2Node * symbol) {
  assert (symbol->tag != BTOR_PARENT_TAG_SMT2);
  if (symbol->exp) boolector_release (parser->btor, symbol->exp);
  btor_freestr (parser->mem, symbol->name);
  BTOR_DELETE (parser->mem, symbol);
}

static void btor_remove_symbol_smt2 (BtorSMT2Parser * parser,
				     BtorSMT2Node * symbol) {
  BtorSMT2Node ** p;
  p = btor_symbol_position_smt2 (parser, symbol->name);
  assert (*p == symbol);
  *p = symbol->next;
  btor_release_symbol_smt2 (parser, symbol);
  assert (parser->symbol.count > 0);
  parser->symbol.count--;
}

static void btor_release_symbols_smt2 (BtorSMT2Parser * parser) {
  BtorSMT2Node * p, *next;
  unsigned i;
  for (i = 0; i < parser->symbol.size; i++)
    for (p = parser->symbol.table[i]; p; p = next)
      next = p->next, btor_release_symbol_smt2 (parser, p);
  BTOR_DELETEN (parser->mem, parser->symbol.table, parser->symbol.size);
}

static void btor_init_char_classes_smt2 (BtorSMT2Parser * parser) {
  unsigned char * cc = parser->cc;
  const char * p;

  BTOR_CLRN (cc, 256);

  for (p = btor_decimal_digits_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2;

  for (p = btor_hexadecimal_digits_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_HEXADECIMAL_DIGIT_CHAR_CLASS_SMT2;

  for (p = btor_printable_ascii_chars_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_STRING_CHAR_CLASS_SMT2;

  for (p = btor_letters_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_SYMBOL_CHAR_CLASS_SMT2;
  for (p = btor_decimal_digits_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_SYMBOL_CHAR_CLASS_SMT2;
  for (p = btor_extra_symbol_chars_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_SYMBOL_CHAR_CLASS_SMT2;

  for (p = btor_printable_ascii_chars_smt2; *p; p++)
    if (*p != '\\' && *p != '|')
      cc[(unsigned char)*p] |= BTOR_QUOTED_SYMBOL_CHAR_CLASS_SMT2;

  for (p = btor_letters_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_KEYWORD_CHAR_CLASS_SMT2;
  for (p = btor_decimal_digits_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_KEYWORD_CHAR_CLASS_SMT2;
  for (p = btor_extra_keyword_chars_smt2; *p; p++)
    cc[(unsigned char)*p] |= BTOR_KEYWORD_CHAR_CLASS_SMT2;
}

#define INSERT(STR,TAG) \
do { \
  BtorSMT2Node * NODE = btor_new_node_smt2 (parser, (TAG)); \
  NODE->name = btor_strdup (parser->mem, (STR)); \
  btor_insert_symbol_smt2 (parser, NODE); \
} while (0)

static void btor_insert_keywords_smt2 (BtorSMT2Parser * parser) {
  INSERT (":all-statistics", BTOR_ALL_STATISTICS_TAG_SMT2);
  INSERT (":authors", BTOR_AUTHORS_TAG_SMT2);
  INSERT (":axioms", BTOR_AXIOMS_TAG_SMT2);
  INSERT (":chainable", BTOR_CHAINABLE_TAG_SMT2);
  INSERT (":definition", BTOR_DEFINITION_TAG_SMT2);
  INSERT (":diagnostic-output-channel", BTOR_DIAG_OUTPUT_CHANNEL_TAG_SMT2);
  INSERT (":error-behavior", BTOR_ERROR_BEHAVIOR_TAG_SMT2);
  INSERT (":expand-definitions", BTOR_EXPAND_DEFINITIONS_TAG_SMT2);
  INSERT (":extensions", BTOR_EXTENSIONS_TAG_SMT2);
  INSERT (":funs", BTOR_FUNS_TAG_SMT2);
  INSERT (":funs-description", BTOR_FUNS_DESCRIPTION_TAG_SMT2);
  INSERT (":interactive-mode", BTOR_INTERACTIVE_MODE_TAG_SMT2);
  INSERT (":language", BTOR_LANGUAGE_TAG_SMT2);
  INSERT (":left-assoc", BTOR_LEFT_ASSOC_TAG_SMT2);
  INSERT (":name", BTOR_NAME_TAG_SMT2);
  INSERT (":named", BTOR_NAMED_TAG_SMT2);
  INSERT (":notes", BTOR_NOTES_TAG_SMT2);
  INSERT (":print-success", BTOR_PRINT_SUCCESS_TAG_SMT2);
  INSERT (":produce-assignments", BTOR_PRODUCE_ASSIGNMENTS_TAG_SMT2);
  INSERT (":produce-models", BTOR_PRODUCE_MODELS_TAG_SMT2);
  INSERT (":produce-proofs", BTOR_PRODUCE_PROOFS_TAG_SMT2);
  INSERT (":produce-unsat-cores", BTOR_PRODUCE_UNSAT_CORES_TAG_SMT2);
  INSERT (":random-seed", BTOR_RANDOM_SEED_TAG_SMT2);
  INSERT (":reason-unknown", BTOR_REASON_UNKNOWN_TAG_SMT2);
  INSERT (":regular-output-channel", BTOR_REGULAR_OUTPUT_CHANNEL_TAG_SMT2);
  INSERT (":right-assoc", BTOR_RIGHT_ASSOC_TAG_SMT2);
  INSERT (":sorts", BTOR_SORTS_TAG_SMT2);
  INSERT (":sorts-description", BTOR_SORTS_DESCRIPTION_TAG_SMT2);
  INSERT (":status", BTOR_STATUS_TAG_SMT2);
  INSERT (":theories", BTOR_THEORIES_TAG_SMT2);
  INSERT (":values", BTOR_VALUES_TAG_SMT2);
  INSERT (":verbosity", BTOR_VERBOSITY_TAG_SMT2);
  INSERT (":version", BTOR_VERSION_TAG_SMT2);
}

static void btor_insert_reserved_words_smt2 (BtorSMT2Parser * parser) {
  INSERT ("!", BTOR_BANG_TAG_SMT2);
  INSERT ("_", BTOR_UNDERSCORE_TAG_SMT2);
  INSERT ("as", BTOR_AS_TAG_SMT2);
  INSERT ("DECIMAL", BTOR_DECIMAL_RESERVED_WORD_TAG_SMT2);
  INSERT ("exists", BTOR_EXISTS_TAG_SMT2);
  INSERT ("forall", BTOR_FORALL_TAG_SMT2);
  INSERT ("let", BTOR_LET_TAG_SMT2);
  INSERT ("par", BTOR_PAR_TAG_SMT2);
  INSERT ("STRING", BTOR_STRING_RESERVED_WORD_TAG_SMT2);
}

static void btor_insert_commands_smt2 (BtorSMT2Parser * parser) {
  INSERT ("assert", BTOR_ASSERT_TAG_SMT2);
  INSERT ("check-sat", BTOR_CHECK_SAT_TAG_SMT2);
  INSERT ("declare-sort", BTOR_DECLARE_SORT_TAG_SMT2);
  INSERT ("declare-fun", BTOR_DECLARE_FUN_TAG_SMT2);
  INSERT ("define-sort", BTOR_DEFINE_SORT_TAG_SMT2);
  INSERT ("define-fun", BTOR_DEFINE_FUN_TAG_SMT2);
  INSERT ("exit", BTOR_EXIT_TAG_SMT2);
  INSERT ("get-assertions", BTOR_GET_ASSERTIONS_TAG_SMT2);
  INSERT ("get-assignment", BTOR_GET_ASSIGNMENT_TAG_SMT2);
  INSERT ("get-info", BTOR_GET_INFO_TAG_SMT2);
  INSERT ("get-option", BTOR_GET_OPTION_TAG_SMT2);
  INSERT ("get-proof", BTOR_GET_PROOF_TAG_SMT2);
  INSERT ("get-unsat-core", BTOR_GET_UNSAT_CORE_TAG_SMT2);
  INSERT ("get-value", BTOR_GET_VALUE_TAG_SMT2);
  INSERT ("pop", BTOR_POP_TAG_SMT2);
  INSERT ("push", BTOR_PUSH_TAG_SMT2);
  INSERT ("set-logic", BTOR_SET_LOGIC_TAG_SMT2);
  INSERT ("set-info", BTOR_SET_INFO_TAG_SMT2);
  INSERT ("set-option", BTOR_SET_OPTION_TAG_SMT2);
}

static void btor_insert_core_symbols_smt2 (BtorSMT2Parser * parser) {
  INSERT ("Bool", BTOR_BOOL_TAG_SMT2);
  INSERT ("true", BTOR_TRUE_TAG_SMT2);
  INSERT ("false", BTOR_FALSE_TAG_SMT2);
  INSERT ("not", BTOR_NOT_TAG_SMT2);
  INSERT ("=>", BTOR_IMPLIES_TAG_SMT2);
  INSERT ("and", BTOR_AND_TAG_SMT2);
  INSERT ("or", BTOR_OR_TAG_SMT2);
  INSERT ("xor", BTOR_XOR_TAG_SMT2);
  INSERT ("=", BTOR_EQUAL_TAG_SMT2);
  INSERT ("distinct", BTOR_DISTINCT_TAG_SMT2);
  INSERT ("ite", BTOR_ITE_TAG_SMT2);
}

static void btor_insert_array_symbols_smt2 (BtorSMT2Parser * parser) {
  INSERT ("Array", BTOR_ARRAY_TAG_SMT2);
  INSERT ("select", BTOR_SELECT_TAG_SMT2);
  INSERT ("store", BTOR_STORE_TAG_SMT2);
}

static void btor_insert_bitvec_symbols_smt2 (BtorSMT2Parser * parser) {
  INSERT ("BitVec", BTOR_BITVEC_TAG_SMT2);
  INSERT ("concat", BTOR_CONCAT_TAG_SMT2);
  INSERT ("extract", BTOR_EXTRACT_TAG_SMT2);
  INSERT ("bvnot", BTOR_BVNOT_TAG_SMT2);
  INSERT ("bvneg", BTOR_BVNEG_TAG_SMT2);
  INSERT ("bvand", BTOR_BVAND_TAG_SMT2);
  INSERT ("bvor", BTOR_BVOR_TAG_SMT2);
  INSERT ("bvadd", BTOR_BVADD_TAG_SMT2);
  INSERT ("bvmul", BTOR_BVMUL_TAG_SMT2);
  INSERT ("bvudiv", BTOR_BVUDIV_TAG_SMT2);
  INSERT ("bvurem", BTOR_BVUREM_TAG_SMT2);
  INSERT ("bvshl", BTOR_BVSHL_TAG_SMT2);
  INSERT ("bvlshr", BTOR_BVLSHR_TAG_SMT2);
  INSERT ("bvult", BTOR_BVULT_TAG_SMT2);
  INSERT ("bvnand", BTOR_BVNAND_TAG_SMT2);
  INSERT ("bvnor", BTOR_BVNOR_TAG_SMT2);
  INSERT ("bvxor", BTOR_BVXOR_TAG_SMT2);
  INSERT ("bvxnor", BTOR_BVXNOR_TAG_SMT2);
  INSERT ("bvcomp", BTOR_BVCOMP_TAG_SMT2);
  INSERT ("bvsub", BTOR_BVSUB_TAG_SMT2);
  INSERT ("bvsdiv", BTOR_BVSDIV_TAG_SMT2);
  INSERT ("bvsrem", BTOR_BVSREM_TAG_SMT2);
  INSERT ("bvsmod", BTOR_BVSMOD_TAG_SMT2);
  INSERT ("bvashr", BTOR_BVASHR_TAG_SMT2);
  INSERT ("repeat", BTOR_REPEAT_TAG_SMT2);
  INSERT ("zero_extend", BTOR_ZERO_EXTEND_TAG_SMT2);
  INSERT ("sign_extend", BTOR_SIGN_EXTEND_TAG_SMT2);
  INSERT ("rotate_left", BTOR_ROTATE_LEFT_TAG_SMT2);
  INSERT ("rotate_right", BTOR_ROTATE_RIGHT_TAG_SMT2);
  INSERT ("bvule", BTOR_BVULE_TAG_SMT2);
  INSERT ("bvugt", BTOR_BVUGT_TAG_SMT2);
  INSERT ("bvuge", BTOR_BVUGE_TAG_SMT2);
  INSERT ("bvslt", BTOR_BVSLT_TAG_SMT2);
  INSERT ("bvsle", BTOR_BVSLE_TAG_SMT2);
  INSERT ("bvsgt", BTOR_BVSGT_TAG_SMT2);
  INSERT ("bvsge", BTOR_BVSGE_TAG_SMT2);
}

static void btor_insert_logics_smt2 (BtorSMT2Parser * parser) {
  INSERT ("AUFLIA", BTOR_AUFLIA_TAG_SMT2);
  INSERT ("AUFLIRA", BTOR_AUFLIRA_TAG_SMT2);
  INSERT ("AUFNIRA", BTOR_AUFNIRA_TAG_SMT2);
  INSERT ("LRA", BTOR_LRA_TAG_SMT2);
  INSERT ("QF_ABV", BTOR_QF_ABV_TAG_SMT2);
  INSERT ("QF_AUFBV", BTOR_QF_AUFBV_TAG_SMT2);
  INSERT ("QF_AUFLIA", BTOR_QF_AUFLIA_TAG_SMT2);
  INSERT ("QF_AX", BTOR_QF_AX_TAG_SMT2);
  INSERT ("QF_BV", BTOR_QF_BV_TAG_SMT2);
  INSERT ("QF_IDL", BTOR_QF_IDL_TAG_SMT2);
  INSERT ("QF_LIA", BTOR_QF_LIA_TAG_SMT2);
  INSERT ("QF_LRA", BTOR_QF_LRA_TAG_SMT2);
  INSERT ("QF_NIA", BTOR_QF_NIA_TAG_SMT2);
  INSERT ("QF_NRA", BTOR_QF_NRA_TAG_SMT2);
  INSERT ("QF_RDL", BTOR_QF_RDL_TAG_SMT2);
  INSERT ("QF_UF", BTOR_QF_UF_TAG_SMT2);
  INSERT ("QF_UFBV", BTOR_QF_UFBV_TAG_SMT2);
  INSERT ("QF_UFIDL", BTOR_QF_UFIDL_TAG_SMT2);
  INSERT ("QF_UFLIA", BTOR_QF_UFLIA_TAG_SMT2);
  INSERT ("QF_UFLRA", BTOR_QF_UFLRA_TAG_SMT2);
  INSERT ("QF_UFNRA", BTOR_QF_UFNRA_TAG_SMT2);
  INSERT ("UFLRA", BTOR_UFLRA_TAG_SMT2);
  INSERT ("UFNIA", BTOR_UFNIA_TAG_SMT2);
}

static BtorSMT2Parser * btor_new_smt2_parser (Btor * btor,
					      BtorParseOpt * opts) {
  BtorSMT2Parser * res;
  BTOR_NEW (btor->mm, res);
  BTOR_CLR (res);
  res->verbosity = opts->verbosity;
  res->incremental = opts->incremental;
  res->model = opts->need_model;
  res->btor = btor;
  res->mem = btor->mm;

  btor_init_char_classes_smt2 (res);

  btor_insert_keywords_smt2 (res);
  btor_insert_reserved_words_smt2 (res);
  btor_insert_commands_smt2 (res);
  btor_insert_core_symbols_smt2 (res);
  btor_insert_array_symbols_smt2 (res);
  btor_insert_bitvec_symbols_smt2 (res);
  btor_insert_logics_smt2 (res);

  return res;
}

static void btor_release_item_smt2 (BtorSMT2Parser * parser,
				    BtorSMT2Item * item) {
  if (item->tag == BTOR_EXP_TAG_SMT2) {
    boolector_release (parser->btor, item->exp);
  } else if (item->tag & BTOR_CONSTANT_TAG_CLASS_SMT2)
    btor_freestr (parser->mem, item->str);
}

static void btor_release_work_smt2 (BtorSMT2Parser * parser) {
  BtorSMT2Item item;
  while (!BTOR_EMPTY_STACK (parser->work)) {
    item = BTOR_POP_STACK (parser->work);
    btor_release_item_smt2 (parser, &item);
  }
  BTOR_RELEASE_STACK (parser->mem, parser->work);
}

static void btor_delete_smt2_parser (BtorSMT2Parser * parser) {
  BtorMemMgr * mem = parser->mem;

  btor_release_symbols_smt2 (parser);
  btor_release_work_smt2 (parser);

  if (parser->name) btor_freestr (mem, parser->name);
  if (parser->error) btor_freestr (mem, parser->error);

  while (!BTOR_EMPTY_STACK (parser->inputs))
    boolector_release (parser->btor, BTOR_POP_STACK (parser->inputs));
  BTOR_RELEASE_STACK (mem, parser->inputs);

  while (!BTOR_EMPTY_STACK (parser->outputs))
    boolector_release (parser->btor, BTOR_POP_STACK (parser->outputs));
  BTOR_RELEASE_STACK (mem, parser->outputs);

  BTOR_RELEASE_STACK (mem, parser->token);

  BTOR_DELETE (mem, parser);
}

static void btor_msg_smt2 (BtorSMT2Parser * parser,
			   int level, const char * fmt, ...) {
  va_list ap;
  if (parser->verbosity < level) return;
  printf ("[btorsmt2] ");
  va_start (ap, fmt);
  vprintf (fmt, ap);
  va_end (ap);
  printf ("\n");
  fflush (stdout);
}

static int btor_isspace_smt2 (int ch) {
  return ch == ' ' || ch == '\t' || ch == '\r' || ch == '\n';
}

static unsigned btor_cc_smt2 (BtorSMT2Parser * parser, int ch) {
  if (ch < 0 || ch >= 256) return 0;
  return parser->cc[(unsigned char) ch];
}

static void btor_pushch_smt2 (BtorSMT2Parser * parser, int ch) {
  assert (ch != EOF);
  BTOR_PUSH_STACK (parser->mem, parser->token, ch);
}

static int btor_read_token_aux_smt2 (BtorSMT2Parser * parser) {
  BtorSMT2Node * node;
  unsigned char cc;
  int ch;
  assert (!BTOR_INVALID_TAG_SMT2);              // error code:          0
  BTOR_RESET_STACK (parser->token);
  parser->last_node = 0;
RESTART:
  do {
    parser->coo = parser->nextcoo;
    if ((ch = btor_nextch_smt2 (parser)) == EOF) {
      assert (EOF < 0);
      return EOF;                               // end of tokens:       EOF
    }
  } while (btor_isspace_smt2 (ch));
  if (ch == ';') {
    while ((ch = btor_nextch_smt2 (parser)) != '\n')
      if (ch == EOF) {
	assert (!BTOR_INVALID_TAG_SMT2);
	return !btor_perr_smt2 (parser, "unexpected end-of-file in comment");
      }
    goto RESTART;
  }
  cc = btor_cc_smt2 (parser, ch);
  if (ch == '(') {
    btor_pushch_smt2 (parser, '(');
    btor_pushch_smt2 (parser, 0);
    return BTOR_LPAR_TAG_SMT2;
  }
  if (ch == ')') {
    btor_pushch_smt2 (parser, ')');
    btor_pushch_smt2 (parser, 0);
    return BTOR_RPAR_TAG_SMT2;
  }
  if (ch == '#') {
    btor_pushch_smt2 (parser, '#');
    if ((ch = btor_nextch_smt2 (parser)) == EOF)
      return !btor_perr_smt2 (parser, "unexpected end-of-file after '#'");
    if (ch == 'b') {
      btor_pushch_smt2 (parser, 'b');
      if((ch = btor_nextch_smt2 (parser)) == EOF)
	return !btor_perr_smt2 (parser, "unexpected end-of-file after '#b'");
      if (ch != '0' && ch != '1')
	return !btor_perr_smt2 (parser, "expected '0' or '1' after '#b'");
      btor_pushch_smt2 (parser, ch);
      for (;;) {
	ch = btor_nextch_smt2 (parser);
	if (ch != '0' && ch != '1') break;
	btor_pushch_smt2 (parser, ch);
      }
      btor_savech_smt2 (parser, ch);
      btor_pushch_smt2 (parser, 0);
      return BTOR_BINARY_CONSTANT_TAG_SMT2;
    } else if (ch == 'x') {
      btor_pushch_smt2 (parser, 'x');
      if ((ch = btor_nextch_smt2 (parser)) == EOF)
	return !btor_perr_smt2 (parser, "unexpected end-of-file after '#x'");
      if (!(btor_cc_smt2 (parser, ch) &
	    BTOR_HEXADECIMAL_DIGIT_CHAR_CLASS_SMT2))
	return !btor_perr_smt2 (parser,
		 "expected hexa-decimal digit after '#x'");
      btor_pushch_smt2 (parser, ch);
      for (;;) {
	ch = btor_nextch_smt2 (parser);
	if (!(btor_cc_smt2 (parser, ch) &
	       BTOR_HEXADECIMAL_DIGIT_CHAR_CLASS_SMT2)) break;
	btor_pushch_smt2 (parser, ch);
      }
      btor_savech_smt2 (parser, ch);
      btor_pushch_smt2 (parser, 0);
      return BTOR_HEXADECIMAL_CONSTANT_TAG_SMT2;
    } else return !btor_perr_smt2 (parser, "expected 'x' or 'b' after '#'");
  } else if (ch == '"') {
    btor_pushch_smt2 (parser, '"');
    for (;;) {
      if ((ch = btor_nextch_smt2 (parser)) == EOF)
	return !btor_cerr_smt2 (parser, "unexpected", ch, "in string");
      if (ch == '"') {
	btor_pushch_smt2 (parser, '"');
	btor_pushch_smt2 (parser, 0);
	return BTOR_STRING_CONSTANT_TAG_SMT2;
      }
      if (ch == '\\') {
	if ((ch = btor_nextch_smt2 (parser)) != '"' && ch != '\\')
	  return !btor_cerr_smt2 (parser, "unexpected", ch,
				  "after backslash '\\\\' in string");
      } else if (!(btor_cc_smt2 (parser, ch) & BTOR_STRING_CHAR_CLASS_SMT2)) {
	// TODO unreachable?
	return !btor_cerr_smt2 (parser, "invalid", ch, "in string");
      }
      btor_pushch_smt2 (parser, ch);
    }
  } else if (ch == '|') {
    btor_pushch_smt2 (parser, '|');
    for (;;) {
      if ((ch = btor_nextch_smt2 (parser)) == EOF)
	return !btor_cerr_smt2 (parser, "unexpected", ch, "in quoted symbol");
      if (ch == '|') {
	btor_pushch_smt2 (parser, '|');
	btor_pushch_smt2 (parser, 0);
	if (!(node = btor_find_symbol_smt2 (parser, parser->token.start))) {
	  node = btor_new_node_smt2 (parser, BTOR_SYMBOL_TAG_SMT2);
	  node->name = btor_strdup (parser->mem, parser->token.start);
	  btor_insert_symbol_smt2 (parser, node);
	}
	parser->last_node = node;
	return BTOR_SYMBOL_TAG_SMT2;
      }
      if (!(btor_cc_smt2 (parser, ch) & BTOR_QUOTED_SYMBOL_CHAR_CLASS_SMT2))
	return !btor_cerr_smt2 (parser, "invalid", ch, "in quoted symbol");
      btor_pushch_smt2 (parser, ch);
    }
  } else if (ch == ':') {
    btor_pushch_smt2 (parser, ':');
    if ((ch = btor_nextch_smt2 (parser)) == EOF)
      return !btor_perr_smt2 (parser, "unexpected end-of-file after ':'");
    if (!(btor_cc_smt2 (parser, ch) & BTOR_KEYWORD_CHAR_CLASS_SMT2))
      return !btor_cerr_smt2 (parser, "unexpected", ch, "after ':'");
    btor_pushch_smt2 (parser, ch);
    while ((btor_cc_smt2 (parser, ch = btor_nextch_smt2 (parser)) &
	    BTOR_KEYWORD_CHAR_CLASS_SMT2)) {
      assert (ch != EOF);
      btor_pushch_smt2 (parser, ch);
    }
    btor_savech_smt2 (parser, ch);
    btor_pushch_smt2 (parser, 0);
    if (!(node = btor_find_symbol_smt2 (parser, parser->token.start))) {
      node = btor_new_node_smt2 (parser, BTOR_ATTRIBUTE_TAG_SMT2);
      node->name = btor_strdup (parser->mem, parser->token.start);
      btor_insert_symbol_smt2 (parser, node);
    }
    parser->last_node = node;
    return node->tag;
  } else if (ch == '0') {
    btor_pushch_smt2 (parser, '0');
    ch = btor_nextch_smt2 (parser);
    if (ch == '.') {
      btor_pushch_smt2 (parser, '.');
      if ((ch = btor_nextch_smt2 (parser)) == EOF)
	return !btor_perr_smt2 (parser, "unexpected end-of-file after '0.'");
      if (!(btor_cc_smt2 (parser, ch) & BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2))
	return !btor_perr_smt2 (parser, "expected decimal digit after '0.'");
      btor_pushch_smt2 (parser, ch);
      for (;;) {
	ch = btor_nextch_smt2 (parser);
	if (!(btor_cc_smt2 (parser, ch) &
		BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2)) break;
	btor_pushch_smt2 (parser, ch);
      }
    }
    btor_savech_smt2 (parser, ch);
    btor_pushch_smt2 (parser, 0);
    return BTOR_DECIMAL_CONSTANT_TAG_SMT2;
  } else if (cc & BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2) {
    btor_pushch_smt2 (parser, ch);
    for (;;) {
      ch = btor_nextch_smt2 (parser);
      if (!(btor_cc_smt2 (parser, ch) & BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2))
	break;
      btor_pushch_smt2 (parser, ch);
    }
    if (ch == '.') {
      btor_pushch_smt2 (parser, '.');
      if ((ch = btor_nextch_smt2 (parser)) == EOF) {
	btor_pushch_smt2 (parser, 0);
	return !btor_perr_smt2 (parser,
				"unexpected end-of-file after '%s'",
				parser->token.start);
      }
      if (!(btor_cc_smt2 (parser, ch) & BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2)) {
	btor_pushch_smt2 (parser, 0);
	return !btor_perr_smt2 (parser,
				"expected decimal digit after '%s'",
				parser->token.start);
      }
      btor_pushch_smt2 (parser, ch);
      for (;;) {
	ch = btor_nextch_smt2 (parser);
	if (!(btor_cc_smt2 (parser, ch) &
		BTOR_DECIMAL_DIGIT_CHAR_CLASS_SMT2)) break;
	btor_pushch_smt2 (parser, ch);
      }
    }
    btor_savech_smt2 (parser, ch);
    btor_pushch_smt2 (parser, 0);
    return BTOR_DECIMAL_CONSTANT_TAG_SMT2;
  } else if (cc & BTOR_SYMBOL_CHAR_CLASS_SMT2) {
    btor_pushch_smt2 (parser, ch);
    for (;;) {
      ch = btor_nextch_smt2 (parser);
      if (!(btor_cc_smt2 (parser, ch) & BTOR_SYMBOL_CHAR_CLASS_SMT2)) break;
      btor_pushch_smt2 (parser, ch);
    }
    btor_savech_smt2 (parser, ch);
    btor_pushch_smt2 (parser, 0);
    if (!strcmp (parser->token.start, "_")) return BTOR_UNDERSCORE_TAG_SMT2;
    if (!(node = btor_find_symbol_smt2 (parser, parser->token.start))) {
      node = btor_new_node_smt2 (parser, BTOR_SYMBOL_TAG_SMT2);
      node->name = btor_strdup (parser->mem, parser->token.start);
      btor_insert_symbol_smt2 (parser, node);
    }
    parser->last_node = node;
    return node->tag;
  } else return !btor_cerr_smt2 (parser, "illegal", ch, 0);

  // TODO should be dead code ...?
  return !btor_perr_smt2 (parser, "internal token reading error");
}

static int btor_read_token_smt2 (BtorSMT2Parser * parser) {
  int res;
  parser->lastcoo = parser->coo;
  res = btor_read_token_aux_smt2 (parser);
  if (parser->verbosity >= 4) {
    printf ("[btorsmt2] line %-8d column %-4d token %08x %s\n",
	    parser->coo.x, parser->coo.y, res,
	    res == EOF ? "<end-of-file>" :
	    res == BTOR_INVALID_TAG_SMT2 ? "<error>" :parser->token.start);
    fflush (stdout);
  }
  return res;
}

static int btor_read_rpar_smt2 (BtorSMT2Parser * parser, const char * msg) {
  int tag = btor_read_token_smt2 (parser);
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "expected ')'%s at end-of-file",
			    msg ? msg : "");
  if (tag == BTOR_INVALID_TAG_SMT2) { assert (parser->error); return 0; }
  if (tag != BTOR_RPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser, "expected ')'%s at '%s'",
			    msg ? msg : "", parser->token.start);
  return 1;
}

static int btor_read_lpar_smt2 (BtorSMT2Parser * parser, const char * msg) {
  int tag = btor_read_token_smt2 (parser);
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "expected '('%s at end-of-file",
			    msg ? msg : "");
  if (tag == BTOR_INVALID_TAG_SMT2) { assert (parser->error); return 0; }
  if (tag != BTOR_LPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser, "expected '('%s at '%s'",
			    msg ? msg : "", parser->token.start);
  return 1;
}

static int btor_skip_sexprs (BtorSMT2Parser * parser, int initial) {
  int tag, open = initial;
  while (open > 0) {
    tag = btor_read_token_smt2 (parser);
    if (tag == EOF) {
      if (open > 0)
	 return !btor_perr_smt2 (parser, "')' missing at end-of-file");
      return 1;
    }
    if (tag == BTOR_INVALID_TAG_SMT2) { assert (parser->error); return 0; }
    else if (tag == BTOR_LPAR_TAG_SMT2) open++;
    else if (tag == BTOR_RPAR_TAG_SMT2) open--;
  }
  return 1;
}

static int btor_read_symbol (BtorSMT2Parser * parser,
			     const char * errmsg,
			     BtorSMT2Node ** resptr) {
  int tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "expected symbol%s but reached end-of-file",
			    errmsg ? errmsg : "");
  if (tag != BTOR_SYMBOL_TAG_SMT2)
    return !btor_perr_smt2 (parser, "expected symbol%s at '%s'",
		errmsg ? errmsg : "", parser->token.start);
  assert (parser->last_node->tag == BTOR_SYMBOL_TAG_SMT2);
  *resptr = parser->last_node;
  return 1;
}

static int btor_str2int32_smt2 (BtorSMT2Parser * parser, int posonly,
				const char * str, int * resptr) {
  int res, ch, digit;
  const char * p;
  res = 0;
  assert (sizeof (int) == 4);
  for (p = str; (ch = *p); p++) {
    if (res > INT_MAX/10)
INVALID:
      return !btor_perr_smt2 (parser, "invalid 32-bit integer '%s'", str);
    assert ('0' <= ch && ch <= '9');
    if (res) res *= 10;
    digit = ch - '0';
    if (INT_MAX - digit < res) goto INVALID;
    res += digit;
  }
  if (posonly && !res) return !btor_perr_smt2 (parser,
    "expected positive non-zero 32-bit integer at '%s'", str);
  *resptr = res;
  return 1;
}

static BtorSMT2Item * btor_push_item_smt2 (BtorSMT2Parser * parser,
					   BtorSMT2Tag tag) {
  BtorSMT2Item item;
  BTOR_CLR (&item);
  item.coo = parser->coo;
  item.tag = tag;
  BTOR_PUSH_STACK (parser->mem, parser->work, item);
  return parser->work.top-1;
}

static BtorSMT2Item * btor_last_lpar_smt2 (BtorSMT2Parser * parser) {
  BtorSMT2Item * p = parser->work.top;
  do {
    if (p-- == parser->work.start) return 0;
  } while (p->tag != BTOR_LPAR_TAG_SMT2);
  return p;
}

#define BTOR_TAG_CLASS_MASK_SMT2 \
  (BTOR_RESERVED_TAG_CLASS_SMT2 | \
   BTOR_COMMAND_TAG_CLASS_SMT2 | \
   BTOR_KEYWORD_TAG_CLASS_SMT2 | \
   BTOR_CORE_TAG_CLASS_SMT2 | \
   BTOR_ARRAY_TAG_CLASS_SMT2 | \
   BTOR_BITVEC_TAG_CLASS_SMT2 | \
   BTOR_LOGIC_TAG_CLASS_SMT2 )

static int btor_item_with_node_smt2 (BtorSMT2Item * item) {
  if (item->tag == BTOR_SYMBOL_TAG_SMT2) return 1;
  if (item->tag == BTOR_ATTRIBUTE_TAG_SMT2) return 1;
  if (item->tag & BTOR_TAG_CLASS_MASK_SMT2) return 1;
  return 0;
}

static const char * btor_item2str_smt2 (BtorSMT2Item * item) {
  if (btor_item_with_node_smt2 (item)) {
    if (!item->node) return "<zero-node-item>";
    assert (item->node->name);
    return item->node->name;
  } else if (item->tag & BTOR_CONSTANT_TAG_CLASS_SMT2) {
    assert (item->str);
    return item->str;
  } else return "<non-printable-item>";
}

static int btor_bvconst_str_smt2 (const char * str) {
  const char * p;
  if (str[0] != 'b' || str[1] != 'v') return 0;
  if (!isdigit (str[2])) return 0;
  for (p = str + 3; *p; p++) if (!isdigit (*p)) return 0;
  return 1;
}

static int btor_prev_item_was_lpar_smt2 (BtorSMT2Parser * parser) {
  if (BTOR_COUNT_STACK (parser->work) >= 2 &&
      parser->work.top[-2].tag == BTOR_LPAR_TAG_SMT2) return 1;
  return !btor_perr_smt2 (parser,
	   "expected '(' before '%s'", parser->token.start);
}

static int btor_parse_int32_smt2 (BtorSMT2Parser * parser,
				   int posonly, int * resptr) {
  int tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
	     "expected decimal constant but reached end-of-file");
  if (tag != BTOR_DECIMAL_CONSTANT_TAG_SMT2)
    return !btor_perr_smt2 (parser,
	     "expected decimal constant at '%s'",
	     parser->token.start);
  return btor_str2int32_smt2 (parser, posonly, parser->token.start, resptr);
}

static int btor_check_boolean_args_smt2 (BtorSMT2Parser * parser,
					 BtorSMT2Item * p,
					 int nargs) {
  int i, width;
  for (i = 1; i <= nargs; i++) {
    if (boolector_is_array (parser->btor, p[i].exp)) {
      parser->perrcoo = p[i].coo;
      return !btor_perr_smt2 (parser,
	"argument %d of '%s' is an array term",
	       i, p->node->name);
    }
    if ((width = boolector_get_width (parser->btor, p[i].exp)) != 1) {
      parser->perrcoo = p[i].coo;
      return !btor_perr_smt2 (parser,
	"argument %d of '%s' is a bit-vector of width %d",
	       i, p->node->name, width);
    }
  }
  return 1;
}

static int btor_check_arg_sorts_match_smt2 (BtorSMT2Parser * parser,
					    BtorSMT2Item * p,
					    int nargs) {
  int i, domain, width, len;
  assert (nargs >= 1);
  width = boolector_get_width (parser->btor, p[1].exp);
  parser->perrcoo = p->coo;
  if (boolector_is_array (parser->btor, p[1].exp)) {
    domain = boolector_get_index_width (parser->btor, p[1].exp);
    for (i = 2; i <= nargs; i++) {
      if (!boolector_is_array (parser->btor, p[i].exp))
	return !btor_perr_smt2 (parser,
    "first argument of '%s' is an array but argument %d not",
    p->node->name, i);
      if ((len = boolector_get_width (parser->btor, p[i].exp)) != width)
	return !btor_perr_smt2 (parser,
    "first argument of '%s' is an array of bit-vectors of width %d "
    "but argument %d is an array of bit-vectors of width %d",
    p->node->name, width, i, len);
      if ((len = boolector_get_index_width (parser->btor, p[i].exp))
	  != domain)
	return !btor_perr_smt2 (parser,
    "first argument of '%s' is an array with index bit-vectors of width %d "
    "but argument %d is an array with index bit-vectors of width %d",
    p->node->name, domain, i, len);
    }
  } else {
    for (i = 1; i <= nargs; i++) {
      if (boolector_is_array (parser->btor, p[i].exp))
	return !btor_perr_smt2 (parser,
    "argument %d of '%s' is an array but first argument not",
    i, p->node->name);
      if ((len = boolector_get_width (parser->btor, p[i].exp)) != width)
	return !btor_perr_smt2 (parser,
    "first argument of '%s' is bit-vector of width %d "
    "but argument %d is a bit-vector of width %d",
    p->node->name, width, i, len);
    }
  }
  parser->perrcoo.x = 0;
  return 1;
}

static int btor_check_ite_args_sorts_match_smt2 (BtorSMT2Parser * parser,
						 BtorSMT2Item * p) {
  int domain, width, len;
  assert (p->tag == BTOR_ITE_TAG_SMT2);
  if (boolector_is_array (parser->btor, p[1].exp)) {
    parser->perrcoo = p[1].coo;
    return !btor_perr_smt2 (parser, "first argument of 'ite' is an array");
  }
  if ((len = boolector_get_width (parser->btor, p[1].exp)) != 1) {
    parser->perrcoo = p[1].coo;
    return !btor_perr_smt2 (parser,
	      "first argument of 'ite' is bit-vector of bit-width %d", len);
  }
  if (boolector_is_array (parser->btor, p[2].exp)) {
    if (!boolector_is_array (parser->btor, p[3].exp)) {
      parser->perrcoo = p->coo;
      return !btor_perr_smt2 (parser,
	"second argument of 'ite' is an array but third not");
    }
    width = boolector_get_width (parser->btor, p[2].exp);
    len = boolector_get_width (parser->btor, p[3].exp);
    if (width != len) {
      parser->perrcoo = p->coo;
      return !btor_perr_smt2 (parser,
	"second argument of 'ite' is array of bit-vectors of width %d and "
	"third argument is array of bit-vectors of width %d",
	width, len);
    }
    domain = boolector_get_index_width (parser->btor, p[2].exp);
    len = boolector_get_index_width (parser->btor, p[3].exp);
    if (domain != len) {
      parser->perrcoo = p->coo;
      return !btor_perr_smt2 (parser,
"second argument of 'ite' is array with index bit-vectors of width %d and "
"third argument is array with index bit-vectors of width %d",
	domain, len);
    }
  } else {
    if (boolector_is_array (parser->btor, p[3].exp)) {
      parser->perrcoo = p->coo;
      return !btor_perr_smt2 (parser,
	"third argument of 'ite' is an array but second not");
    }
    width = boolector_get_width (parser->btor, p[2].exp);
    len = boolector_get_width (parser->btor, p[3].exp);
    if (width != len) {
      parser->perrcoo = p->coo;
      return !btor_perr_smt2 (parser,
	"second argument of 'ite' is bit-vector of width %d and "
	"third argument is bit-vector of width %d",
	width, len);
    }
  }
  return 1;
}

static int btor_check_nargs_smt2 (BtorSMT2Parser * parser,
				  BtorSMT2Item * p,
				  int actual,
				  int required) {
  int diff = actual - required;
  const char * op = p->node->name;
  if (diff) parser->perrcoo = p->coo;
  if (diff == -1)
    return !btor_perr_smt2 (parser, "one argument to '%s' missing", op);
  if (diff < 0)
    return !btor_perr_smt2 (parser,
			    "%d arguments to '%s' missing", -diff, op);
  if (diff == 1)
    return !btor_perr_smt2 (parser,
			    "'%s' has one argument too much", op);
  if (diff > 0)
    return !btor_perr_smt2 (parser,
			    "'%s' has %d arguments too much", op, diff);
  return 1;
}

static int btor_check_not_array_args_smt2 (BtorSMT2Parser * parser,
					   BtorSMT2Item * p, int nargs) {
  int i;
  for (i = 1; i <= nargs; i++)
    if (boolector_is_array (parser->btor, p[i].exp)) {
      parser->perrcoo = p[i].coo;
      return !btor_perr_smt2 (parser, "argument %d of '%s' is an array",
			      i, p->node->name);
    }
  return 1;
}

static BtorNode * btor_translate_shift_smt2 (
		   Btor * btor, BtorNode * a0, BtorNode * a1,
		    BtorNode * (*f)(Btor*,BtorNode*,BtorNode*)) {
  BtorNode * c, * e, * t, * e0, * u, * l, * tmp, * res;
  int len, l0, l1, p0, p1;

  len = boolector_get_width (btor, a0);

  assert (len == boolector_get_width (btor, a1));

  l1 = 0;
  for (l0 = 1; l0 < len; l0 *= 2)
    l1++;

  assert (l0 == (1 << l1));

  if (len == 1) {
    assert (l0 == 1);
    assert (l1 == 0);

    if (f != boolector_sra) {
      tmp = boolector_not (btor, a1);
      res = boolector_and (btor, a0, tmp);
      boolector_release (btor, tmp);
    } else res = boolector_copy (btor, a0);
  } else {
    assert (len >= 1);

    p0 = l0 - len;
    p1 = len - l1;

    assert (p0 >= 0);
    assert (p1 > 0);

    u = boolector_slice (btor, a1, len - 1, len - p1);
    l = boolector_slice (btor, a1, l1 - 1, 0);

    assert (boolector_get_width (btor, u) == p1);
    assert (boolector_get_width (btor, l) == l1);

    if (p1 > 1) c = boolector_redor (btor, u);
    else c = boolector_copy (btor, u);

    boolector_release (btor, u);

    if (f == boolector_sra) {
      tmp = boolector_slice (btor, a0, len - 1, len - 1);
      t = boolector_sext (btor, tmp, len - 1);
      boolector_release (btor, tmp);
    } else t = boolector_zero (btor, len);

    if (!p0) e0 = boolector_copy (btor, a0);
    else if (f == boolector_sra) e0 = boolector_sext (btor, a0, p0);
    else e0 = boolector_uext (btor, a0, p0);

    assert (boolector_get_width (btor, e0) == l0);

    e = f (btor, e0, l);
    boolector_release (btor, e0);
    boolector_release (btor, l);

    if (p0 > 0) {
      tmp = boolector_slice (btor, e, len - 1, 0);
      boolector_release (btor, e);
      e = tmp;
    }

    res =  boolector_cond (btor, c, t, e);

    boolector_release (btor, c);
    boolector_release (btor, t);
    boolector_release (btor, e);
  }
  return res;
}

static BtorNode * btor_shl_smt2 (Btor * btor, BtorNode * a, BtorNode * b) {
  return btor_translate_shift_smt2 (btor, a, b, boolector_sll);
}

static BtorNode * btor_ashr_smt2 (Btor * btor, BtorNode * a, BtorNode * b) {
  return btor_translate_shift_smt2 (btor, a, b, boolector_sra);
}

static BtorNode * btor_lshr_smt2 (Btor * btor, BtorNode * a, BtorNode * b) {
  return btor_translate_shift_smt2 (btor, a, b, boolector_srl);
}

static BtorNode * btor_translate_rotate_smt2 (
		   Btor * btor, BtorNode * exp, int shift, int left) {
  BtorNode * l, * r, * res;
  int len;

  assert (shift >= 0);

  len = boolector_get_width (btor, exp);
  assert (len > 0);
  shift %= len;

  if (shift) {
    if (left) shift = len - shift;

    assert (1 <= shift && shift < len);

    l = boolector_slice (btor, exp, shift - 1, 0);
    r = boolector_slice (btor, exp, len - 1, shift);

    res = boolector_concat (btor, l, r);

    boolector_release (btor, l);
    boolector_release (btor, r);
  } else res = boolector_copy (btor, exp);
  assert (boolector_get_width (btor, res) == len);
  return res;
}

static BtorNode * btor_rotate_left_smt2 (Btor * btor,
					 BtorNode * exp, int shift) {
  return btor_translate_rotate_smt2 (btor, exp, shift, 1);
}

static BtorNode * btor_rotate_right_smt2 (Btor * btor,
					  BtorNode * exp, int shift) {
  return btor_translate_rotate_smt2 (btor, exp, shift, 0);
}

static int btor_parse_term_smt2 (BtorSMT2Parser * parser,
				 BtorNode ** resptr,
				 BtorSMT2Coo * cooptr) {
  int tag, width, domain, len, nargs, i, j, open = 0, work_cnt;
  BtorNode * (*binfun)(Btor *,BtorNode*,BtorNode*);
  BtorNode * (*extfun)(Btor *, BtorNode *, int);
  BtorNode * (*rotatefun)(Btor *, BtorNode *, int);
  BtorNode * (*unaryfun)(Btor *,BtorNode*);
  BtorNode * res, * exp, * tmp, * old;
  BtorSMT2Item * l, * p;
  unaryfun = 0;
  binfun = 0;
  work_cnt = BTOR_COUNT_STACK (parser->work);
  do {
    tag = btor_read_token_smt2 (parser);
    if (tag == BTOR_INVALID_TAG_SMT2) return 0;
    if (tag == EOF) {
      l = btor_last_lpar_smt2 (parser);
      if (!l) return !btor_perr_smt2 (parser,
		       "expected expression but reached end-of-file");
      return !btor_perr_smt2 (parser,
	"unexpected end-of-file since '(' at line %d column %d still open",
	l->coo.x, l->coo.y);
    }
    if (tag == BTOR_RPAR_TAG_SMT2) {
      if (parser->expecting_let_body) {
	l = 0;
	if (open) {
	  l = btor_last_lpar_smt2 (parser);
	  if (++l >= parser->work.top) l = 0;
	}
	if (l) {
	  assert (l->tag == BTOR_LET_TAG_SMT2);
	  return !btor_perr_smt2 (parser,
		   "body to 'let' at line %d column %d missing",
		   l->coo.x, l->coo.y);
	} else {
	  // TODO reachable?
	  return !btor_perr_smt2 (parser, "body to 'let' missing");
	}
      }
      assert (open >= 0);
      if (!open) return !btor_perr_smt2 (parser, "expected expression");
      l = btor_last_lpar_smt2 (parser);
      assert (l);
      p = l + 1;
      if (p == parser->work.top)
	return !btor_perr_smt2 (parser, "unexpected '()'");
      nargs = parser->work.top - p - 1;
      tag = p->tag;
      if (tag != BTOR_LET_TAG_SMT2 &&
	  tag != BTOR_LETBIND_TAG_SMT2 &&
	  tag != BTOR_PARLETBINDING_TAG_SMT2) {
	for (i = 1; i <= nargs; i++)
	  if (p[i].tag != BTOR_EXP_TAG_SMT2) {
	  parser->perrcoo = p[i].coo;
	  return !btor_perr_smt2 (parser, "expected expression");
	}
      }
      /* function application */
      if (tag == BTOR_EXP_TAG_SMT2
	  && nargs && boolector_is_fun (parser->btor, p[0].exp)) {
	BtorNodePtrStack fargs;
	BTOR_INIT_STACK (fargs);
	for (i = 1; i <= nargs; i++) {
	  if (p[i].tag != BTOR_EXP_TAG_SMT2) {
	    BTOR_RELEASE_STACK (parser->mem, fargs);
	    parser->perrcoo = p[i].coo;
	    return !btor_perr_smt2 (parser, "expected expression");
	  }
	  BTOR_PUSH_STACK (parser->mem, fargs, p[i].exp);
	}
	tmp = p[0].exp;
	if (nargs != boolector_get_fun_arity (parser->btor, tmp)) {
	  BTOR_RELEASE_STACK (parser->mem, fargs);
	  return !btor_perr_smt2 (parser, "invalid number of arguments");
	}
	i = boolector_fun_sort_check (parser->btor, nargs, fargs.start, tmp);
	if (i >= 0) {
	  BTOR_RELEASE_STACK (parser->mem, fargs);
	  return !btor_perr_smt2 (parser,
				  "invalid sort for argument %d", i + 1);
	}
	parser->work.top = p;
	l->tag = BTOR_EXP_TAG_SMT2;
	l->exp = boolector_apply (parser->btor, nargs, fargs.start, tmp); 
	for (i = 0; i <= nargs; i++)
	  boolector_release (parser->btor, p[i].exp);
	BTOR_RELEASE_STACK (parser->mem, fargs);
      } else if (tag == BTOR_EXP_TAG_SMT2) {
	if (nargs) {
	  parser->perrcoo = l->coo;
	  return !btor_perr_smt2 (parser,
		   "list with %d expressions", nargs + 1);
	}
	p->coo = l->coo;
	*l = *p;
	parser->work.top--;
	assert (l + 1 == parser->work.top);
      } else if (tag == BTOR_NOT_TAG_SMT2) {
	if (nargs != 1) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
		    "'not' with %d arguments but expected exactly one",
		    nargs);
	}
	tmp = p[1].exp;
	if (boolector_is_array (parser->btor, tmp)) {
	  parser->perrcoo = p[1].coo;
	  return !btor_perr_smt2 (parser,
	    "unexpected array expression as argument to 'not'");
	}
	if ((width = boolector_get_width (parser->btor, tmp)) != 1) {
	  parser->perrcoo = p[1].coo;
	  return !btor_perr_smt2 (parser,
	   "unexpected bit-vector of width %d as argument to 'not'", width);
	}
	parser->work.top = p;
	l->tag = BTOR_EXP_TAG_SMT2;
	l->exp = boolector_not (parser->btor, tmp);
	boolector_release (parser->btor, tmp);
      } else if (tag == BTOR_IMPLIES_TAG_SMT2) {
	if (!nargs) return !btor_perr_smt2 (parser,
			     "argument to '%s' missing", p->node->name);
	if (!btor_check_boolean_args_smt2 (parser, p, nargs)) return 0;
	exp = 0;
	for (i = nargs; i >= 1; i--) {
	  if (exp) {
	    old = exp;
	    exp = boolector_implies (parser->btor, p[i].exp, old);
	    boolector_release (parser->btor, old);
	  } else exp = boolector_copy (parser->btor, p[i].exp);
	}
	assert (exp);
RELEASE_EXP_AND_OVERWRITE:
	for (i = 1; i <= nargs; i++)
	  boolector_release (parser->btor, p[i].exp);
	parser->work.top = p;
	l->tag = BTOR_EXP_TAG_SMT2;
	l->exp = exp;
      } else if (tag == BTOR_AND_TAG_SMT2) {
	binfun = boolector_and;
BIN_LEFT_ASSOCIATIVE_CORE:
	if (!nargs) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
		    "argument to '%s' missing", p->node->name);
	}
	if (!btor_check_boolean_args_smt2 (parser, p, nargs)) return 0;
	exp = 0;
	for (i = 1; i <= nargs; i++) {
	  if (exp) {
	    old = exp;
	    exp = binfun (parser->btor, old, p[i].exp);
	    boolector_release (parser->btor, old);
	  } else exp = boolector_copy (parser->btor, p[i].exp);
	}
	assert (exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_OR_TAG_SMT2) {
	binfun = boolector_or; goto BIN_LEFT_ASSOCIATIVE_CORE;
      } else if (tag == BTOR_XOR_TAG_SMT2) {
	binfun = boolector_xor; goto BIN_LEFT_ASSOCIATIVE_CORE;
      } else if (tag == BTOR_EQUAL_TAG_SMT2) {
	if (!nargs) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser, "arguments to '=' missing");
	}
	if (nargs == 1) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser, "only one argument to '='");
	}
	if (!btor_check_arg_sorts_match_smt2 (parser, p, nargs)) return 0;
	exp = boolector_true (parser->btor);
	for (i = 1; i < nargs; i++) {
	  tmp = boolector_eq (parser->btor, p[i].exp, p[i+1].exp);
	  old = exp;
	  exp = boolector_and (parser->btor, old, tmp);
	  boolector_release (parser->btor, old);
	  boolector_release (parser->btor, tmp);
	}
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_DISTINCT_TAG_SMT2) {
	if (!nargs) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
				  "arguments to 'distinct' missing");
	}
	if (nargs == 1) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
				  "only one argument to 'distinct'");
	}
	if (!btor_check_arg_sorts_match_smt2 (parser, p, nargs)) return 0;
	exp = boolector_true (parser->btor);
	for (i = 1; i < nargs; i++) {
	  for (j = i + 1; j <= nargs; j++) {
	    tmp = boolector_ne (parser->btor, p[i].exp, p[j].exp);
	    old = exp;
	    exp = boolector_and (parser->btor, old, tmp);
	    boolector_release (parser->btor, old);
	    boolector_release (parser->btor, tmp);
	  }
	}
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_ITE_TAG_SMT2) {
	if(!btor_check_nargs_smt2 (parser, p, nargs, 3)) return 0;
	if (!btor_check_ite_args_sorts_match_smt2 (parser, p)) return 0;
	exp = boolector_cond (parser->btor, p[1].exp, p[2].exp, p[3].exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_SELECT_TAG_SMT2) {
	if(!btor_check_nargs_smt2 (parser, p, nargs, 2)) return 0;
	if (!boolector_is_array (parser->btor, p[1].exp)) {
	  parser->perrcoo = p[1].coo;
	  return !btor_perr_smt2 (parser,
		   "first argument of 'select' is not an array");
	}
	if (boolector_is_array (parser->btor, p[2].exp)) {
	  parser->perrcoo = p[2].coo;
	  return !btor_perr_smt2 (parser,
		   "second argument of 'select' is an array");
	}
	width = boolector_get_width (parser->btor, p[2].exp);
	domain = boolector_get_index_width (parser->btor, p[1].exp);
	if (width != domain) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
	     "first (array) argument of 'select' has index bit-width %d "
	     "but the second (index) argument has bit-width %d",
	     domain, width);
	}
	exp = boolector_read (parser->btor, p[1].exp, p[2].exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_STORE_TAG_SMT2) {
	if(!btor_check_nargs_smt2 (parser, p, nargs, 3)) return 0;
	if (!boolector_is_array (parser->btor, p[1].exp)) {
	  parser->perrcoo = p[1].coo;
	  return !btor_perr_smt2 (parser,
		   "first argument of 'store' is not an array");
	}
	if (boolector_is_array (parser->btor, p[2].exp)) {
	  parser->perrcoo = p[2].coo;
	  return !btor_perr_smt2 (parser,
		   "second argument of 'store' is an array");
	}
	if (boolector_is_array (parser->btor, p[3].exp)) {
	  parser->perrcoo = p[3].coo;
	  return !btor_perr_smt2 (parser,
		   "third argument of 'store' is an array");
	}
	width = boolector_get_width (parser->btor, p[2].exp);
	domain = boolector_get_index_width (parser->btor, p[1].exp);
	if (width != domain) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
	     "first (array) argument of 'store' has index bit-width %d "
	     "but the second (index) argument has bit-width %d",
	     domain, width);
	}
	width = boolector_get_width (parser->btor, p[1].exp);
	len = boolector_get_width (parser->btor, p[3].exp);
	if (width != len) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
	     "first (array) argument of 'store' has element bit-width %d "
	     "but the third (stored bit-vector) argument has bit-width %d",
	     width, len);
	}
	exp = boolector_write (parser->btor, p[1].exp, p[2].exp, p[3].exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_CONCAT_TAG_SMT2) {
	if (!btor_check_nargs_smt2 (parser, p, nargs, 2)) return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	exp = boolector_concat (parser->btor, p[1].exp, p[2].exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_EXTRACT_TAG_SMT2) {
	if (!btor_check_nargs_smt2 (parser, p, nargs, 1)) return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	width = boolector_get_width (parser->btor, p[1].exp);
	if (width <= p->hi) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
		   "first (high) 'extract' parameter %d too large "
		   "for bit-vector argument of bit-width %d",
                   p->hi, width);
	}
	exp = boolector_slice (parser->btor, p[1].exp, p->hi, p->lo);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_BVNOT_TAG_SMT2) {
	unaryfun = boolector_not;
UNARY_BV_FUN:
	if (!btor_check_nargs_smt2 (parser, p, nargs, 1))
	  return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	exp = unaryfun (parser->btor, p[1].exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_BVAND_TAG_SMT2) {
	binfun = boolector_and;
BINARY_BV_FUN:
	if (!btor_check_nargs_smt2 (parser, p, nargs, 2)) return 0;
	if (!btor_check_arg_sorts_match_smt2 (parser, p, 2)) return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	exp = binfun (parser->btor, p[1].exp, p[2].exp);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_BVOR_TAG_SMT2) {
	binfun = boolector_or; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVNEG_TAG_SMT2) {
	unaryfun = boolector_neg; goto  UNARY_BV_FUN;
      } else if (tag == BTOR_BVADD_TAG_SMT2) {
	binfun = boolector_add; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVMUL_TAG_SMT2) {
	binfun = boolector_mul; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVUDIV_TAG_SMT2) {
	binfun = boolector_udiv; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVUREM_TAG_SMT2) {
	binfun = boolector_urem; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSHL_TAG_SMT2) {
	binfun = btor_shl_smt2; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVLSHR_TAG_SMT2) {
	binfun = btor_lshr_smt2; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVULT_TAG_SMT2) {
	binfun = boolector_ult; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVNAND_TAG_SMT2) {
	binfun = boolector_nand; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVNOR_TAG_SMT2) {
	binfun = boolector_nor; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVXOR_TAG_SMT2) {
	binfun = boolector_xor; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVXNOR_TAG_SMT2) {
	binfun = boolector_xnor; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVCOMP_TAG_SMT2) {
	binfun = boolector_eq; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSUB_TAG_SMT2) {
	binfun = boolector_sub; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSDIV_TAG_SMT2) {
	binfun = boolector_sdiv; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSREM_TAG_SMT2) {
	binfun = boolector_srem; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSMOD_TAG_SMT2) {
	binfun = boolector_smod; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVASHR_TAG_SMT2) {
	binfun = btor_ashr_smt2; goto BINARY_BV_FUN;
      } else if (tag == BTOR_REPEAT_TAG_SMT2) {
	if (!btor_check_nargs_smt2 (parser, p, nargs, 1)) return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	width = boolector_get_width (parser->btor, p[1].exp);
	if (p->num && ((INT_MAX / p->num) < width)) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
		   "resulting bit-width of 'repeat' too large");
	}
	exp = boolector_copy (parser->btor, p[1].exp);
	for (i = 1; i < p->num; i++) {
	  old = exp;
	  exp = boolector_concat (parser->btor, old, p[1].exp);
	  boolector_release (parser->btor, old);
	}
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_ZERO_EXTEND_TAG_SMT2) {
	extfun = boolector_uext;
EXTEND_BV_FUN:
	if (!btor_check_nargs_smt2 (parser, p, nargs, 1)) return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	width = boolector_get_width (parser->btor, p[1].exp);
	if (INT_MAX - p->num < width) {
	  parser->perrcoo = p->coo;
	  return !btor_perr_smt2 (parser,
		   "resulting bit-width of '%s' too large", p->node->name);
	}
	exp = extfun (parser->btor, p[1].exp, p->num);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_SIGN_EXTEND_TAG_SMT2) {
	extfun = boolector_sext; goto EXTEND_BV_FUN;
      } else if (tag == BTOR_ROTATE_LEFT_TAG_SMT2) {
	rotatefun = btor_rotate_left_smt2;
ROTATE_BV_FUN:
	if (!btor_check_nargs_smt2 (parser, p, nargs, 1)) return 0;
	if (!btor_check_not_array_args_smt2 (parser, p, nargs)) return 0;
	width = boolector_get_width (parser->btor, p[1].exp);
	exp = rotatefun (parser->btor, p[1].exp, p->num % width);
	goto RELEASE_EXP_AND_OVERWRITE;
      } else if (tag == BTOR_ROTATE_RIGHT_TAG_SMT2) {
	rotatefun = btor_rotate_right_smt2; goto ROTATE_BV_FUN;
      } else if (tag == BTOR_BVULE_TAG_SMT2) {
	binfun = boolector_ulte; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVUGT_TAG_SMT2) {
	binfun = boolector_ugt; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVUGE_TAG_SMT2) {
	binfun = boolector_ugte; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSLT_TAG_SMT2) {
	binfun = boolector_slt; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSLE_TAG_SMT2) {
	binfun = boolector_slte; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSGT_TAG_SMT2) {
	binfun = boolector_sgt; goto BINARY_BV_FUN;
      } else if (tag == BTOR_BVSGE_TAG_SMT2) {
	binfun = boolector_sgte; goto BINARY_BV_FUN;
      } else if (tag == BTOR_LET_TAG_SMT2) {
	BtorSMT2Node * s;
	for (i = 1; i < nargs; i++) {
	  if (p[i].tag != BTOR_SYMBOL_TAG_SMT2) {
	    parser->perrcoo = p[i].coo;
	    return !btor_perr_smt2 (parser,
		      "expected symbol as argument %d of 'let'", i);
	  }
	}
	if (p[nargs].tag != BTOR_SYMBOL_TAG_SMT2) {
	  if (p[i].tag != BTOR_EXP_TAG_SMT2) {
	    parser->perrcoo = p[i].coo;
	    return !btor_perr_smt2 (parser,
		      "expected expression as argument %d of 'let'", nargs);
	  }
	}
	l[0].tag = BTOR_EXP_TAG_SMT2;
	l[0].exp= p[nargs].exp;
	for (i = 1; i < nargs; i++) {
	  assert (p[i].tag == BTOR_SYMBOL_TAG_SMT2);
	  s = p[i].node;
	  assert (s);
	  assert (s->coo.x);
	  assert (s->tag == BTOR_SYMBOL_TAG_SMT2);
	  btor_remove_symbol_smt2 (parser, s);
	}
	parser->work.top = p;
      } else if (tag == BTOR_LETBIND_TAG_SMT2) {
	assert (p[1].tag == BTOR_SYMBOL_TAG_SMT2);
	if (nargs == 1)
	  return !btor_perr_smt2 (parser,
		    "term to be bound to '%s' missing", p[1].node->name);
	if (nargs > 2) {
	  parser->perrcoo = p[3].coo;
	  return !btor_perr_smt2 (parser,
		    "second term bound to '%s'", p[1].node->name);
	}
	if (p[2].tag != BTOR_EXP_TAG_SMT2) {
	  parser->perrcoo = p[2].coo;
	  return !btor_perr_smt2 (parser, 
	           "expected expression in 'let' binding");
	}
	l[0] = p[1];
	assert (!l[0].node->exp);
	assert (p[2].tag == BTOR_EXP_TAG_SMT2);
	l[0].node->exp = p[2].exp;
	assert (!l[0].node->bound);
	l[0].node->bound = 1;
	parser->work.top = p;
	assert (!parser->binding);
	parser->binding = 1;
      } else if (tag == BTOR_PARLETBINDING_TAG_SMT2) {
	assert (parser->binding);
	parser->binding = 0;
#ifndef NDEBUG
	for (i = 1; i <= nargs; i++) assert (p[i].tag == BTOR_SYMBOL_TAG_SMT2);
#endif
	for (i = 0; i < nargs; i++) l[i] = p[i + 1];
	parser->work.top = l + nargs;
	assert (!parser->expecting_let_body);
	parser->expecting_let_body = 1;
      } else {
	// TODO unreachable?
	parser->perrcoo = p->coo;
	return !btor_perr_smt2 (parser,
		 "internal parse error: can not close yet unsupported '%s'",
		  btor_item2str_smt2 (p));
      }
      assert (open > 0);
      open--;
    } else {
      if (parser->expecting_let_body) parser->expecting_let_body = 0;
      p = btor_push_item_smt2 (parser, tag);
      if (tag == BTOR_LPAR_TAG_SMT2) {
	if (parser->binding) {
	  BtorSMT2Node * s;
	  BtorSMT2Item * q;
	  btor_push_item_smt2 (parser, BTOR_LETBIND_TAG_SMT2);
	  parser->binding = 0;
	  tag = btor_read_token_smt2 (parser);
	  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
	  if (tag == EOF)
	    return !btor_perr_smt2 (parser,
  "expected symbol to be bound after '(' at line %d column %d but reached end-of-file",
  p->coo.x, p->coo.y);
	  if (tag != BTOR_SYMBOL_TAG_SMT2)
	    return !btor_perr_smt2 (parser,
  "expected symbol to be bound at '%s' after '(' at line %d column %d",
  parser->token.start, p->coo.x, p->coo.y);
	  s = parser->last_node;
	  assert (s);
	  if (s->coo.x)
	    return
	      !btor_perr_smt2 (parser,
		 "symbol '%s' to be bound already %s at line %d column %d",
		 s->name,
		 s->bound ? "bound with 'let'" : "declared as function",
		 s->coo.x, s->coo.y);
	  s->coo = parser->coo;
	  q = btor_push_item_smt2 (parser, BTOR_SYMBOL_TAG_SMT2);
	  q->node = s;
	}
	open++;
      } else if (parser->binding) {
	return !btor_perr_smt2 (parser,
		 "expected binding at '%s'", parser->token.start);
      } else if (btor_item_with_node_smt2 (p)) {
	p->node = parser->last_node;
	if (tag & BTOR_COMMAND_TAG_CLASS_SMT2)
	  return !btor_perr_smt2 (parser,
				  "unexpected command '%s'",
				  p->node->name);
	if (tag & BTOR_KEYWORD_TAG_CLASS_SMT2)
	  return !btor_perr_smt2 (parser,
				  "unexpected keyword '%s'",
				  p->node->name);
	if (tag & BTOR_LOGIC_TAG_CLASS_SMT2)
	  return !btor_perr_smt2 (parser,
				  "unexpected logic '%s'",
				  p->node->name);
	if (tag & BTOR_RESERVED_TAG_CLASS_SMT2) {
	  if (tag == BTOR_LET_TAG_SMT2) {
	     if (!btor_read_lpar_smt2 (parser, " after 'let'")) return 0;
	     btor_push_item_smt2 (parser, BTOR_LPAR_TAG_SMT2);
	     open++, assert (open > 0);
	     btor_push_item_smt2 (parser, BTOR_PARLETBINDING_TAG_SMT2);
	     assert (!parser->binding);
	     parser->binding = 1;
	  } else if (tag == BTOR_UNDERSCORE_TAG_SMT2) {
	    const char * read_rpar_msg = 0;
	    BtorSMT2Node * node = 0;
	    if (!btor_prev_item_was_lpar_smt2 (parser)) return 0;
	    tag = btor_read_token_smt2 (parser);
	    node = parser->last_node;
	    if (tag == BTOR_INVALID_TAG_SMT2) return 0;
	    if (tag == EOF)
	      return !btor_perr_smt2 (parser,
		      "unexpected end-of-file after '_'");
	    if (tag == BTOR_REPEAT_TAG_SMT2) {
	      assert (node && tag == (int) node->tag);
	      read_rpar_msg = " to close '(_ repeat'";
ONE_FIXED_NUM_PARAMETRIC:
	      assert (BTOR_COUNT_STACK (parser->work) >= 2);
	      if (BTOR_COUNT_STACK (parser->work) < 3) {
		assert (BTOR_COUNT_STACK (parser->work) == 2);
		assert (parser->work.start[0].tag == BTOR_LPAR_TAG_SMT2);
		assert (parser->work.start[1].tag == BTOR_UNDERSCORE_TAG_SMT2);
		parser->perrcoo = parser->work.start[0].coo;
		return !btor_perr_smt2 (parser,
			 "expected another '(' before '(_ %s'", node->name);
	      }
	      if (parser->work.top[-3].tag != BTOR_LPAR_TAG_SMT2) {
		parser->perrcoo = parser->work.top[-3].coo;
		return !btor_perr_smt2 (parser,
			 "expected '(' at '%s' before '(_ %s'",
			 btor_item2str_smt2 (parser->work.top - 3),
			 node->name);
	      }
	      l = p - 1;
	      if (!btor_parse_int32_smt2 (parser, 0, &l->num)) return 0;
	      l->tag = tag;
	      l->node = node;
	      parser->work.top = p;
	      if (!btor_read_rpar_smt2 (parser,  read_rpar_msg)) return 0;
	      assert (open > 0);
	      open--;
	    } else if (tag == BTOR_ZERO_EXTEND_TAG_SMT2) {
	      read_rpar_msg = " to close '(_ zero_extend'";
	      goto ONE_FIXED_NUM_PARAMETRIC;
	    } else if (tag == BTOR_SIGN_EXTEND_TAG_SMT2) {
	      read_rpar_msg = " to close '(_ sign_extend'";
	      goto ONE_FIXED_NUM_PARAMETRIC;
	    } else if (tag == BTOR_ROTATE_LEFT_TAG_SMT2) {
	      read_rpar_msg = " to close '(_ rotate_left'";
	      goto ONE_FIXED_NUM_PARAMETRIC;
	    } else if (tag == BTOR_ROTATE_RIGHT_TAG_SMT2) {
	      read_rpar_msg = " to close '(_ rotate_right'";
	      goto ONE_FIXED_NUM_PARAMETRIC;
	    } else if (tag == BTOR_EXTRACT_TAG_SMT2) {
	      BtorSMT2Coo firstcoo;
	      assert (node && tag == (int) node->tag);
	      if (BTOR_COUNT_STACK (parser->work) < 3 ||
		  parser->work.top[-3].tag != BTOR_LPAR_TAG_SMT2)
		goto ONE_FIXED_NUM_PARAMETRIC;
	      l = p - 1;
	      if (!btor_parse_int32_smt2 (parser, 0, &l->hi)) return 0;
	      firstcoo = parser->coo;
	      if (!btor_parse_int32_smt2 (parser, 0, &l->lo)) return 0;
	      if (l->hi < l->lo) {
		parser->perrcoo = firstcoo;
		return !btor_perr_smt2 (parser,
	    "first parameter '%d' of '(_ extract' smaller than second '%d'",
		  l->hi, l->lo);
	      }
	      l->tag = tag;
	      l->node = node;
	      parser->work.top = p;
	      if (!btor_read_rpar_smt2 (parser,
					" to close '(_ extract'")) return 0;
	      assert (open > 0);
	      open--;
	    } else if (tag == BTOR_SYMBOL_TAG_SMT2 &&
		       btor_bvconst_str_smt2 (parser->token.start)) {
	      char * constr, * decstr;
	      BtorSMT2Coo coo;
	      int len;
	      exp = 0;
	      decstr = btor_strdup (parser->mem, parser->token.start + 2);
	      constr = btor_decimal_to_const (parser->mem,
					      parser->token.start + 2);
	      coo = parser->coo;
	      coo.y += 2;
	      if (!btor_parse_int32_smt2 (parser, 1, &width))
		goto UNDERSCORE_DONE;
	      len = (int) strlen (constr);
	      if (len > width) {
		parser->perrcoo = coo;
		(void) btor_perr_smt2 (parser,
	    "decimal constant '%s' needs %d bits which exceeds bit-width '%d'",
		decstr, len, width);
	      } else if (len == width)
		exp = boolector_const (parser->btor, constr);
	      else if (!len)
		exp = boolector_zero (parser->btor, width);
	      else {
		char * uconstr =
		  btor_uext_const (parser->mem, constr, width - len);
		exp = boolector_const (parser->btor, uconstr);
		btor_freestr (parser->mem, uconstr);
	      }
UNDERSCORE_DONE:
	      btor_freestr (parser->mem, decstr);
	      btor_delete_const (parser->mem, constr);
	      if (!exp) return 0;
	      assert (boolector_get_width (parser->btor, exp) == width);

	      assert (p > parser->work.start);
	      p--, parser->work.top--;
	      assert (p->tag == BTOR_LPAR_TAG_SMT2);
	      assert (open > 0);
	      open--;
	      p->tag = BTOR_EXP_TAG_SMT2;
	      p->exp = exp;

	      if (!btor_read_rpar_smt2 (parser, " to close '(_ bv..'")) return 0;

	    } else return !btor_perr_smt2 (parser,
			    "invalid parametric term '_ %s'",
			    parser->token.start);
	  } else {
	    assert (p->node->name);
	    return !btor_perr_smt2 (parser,
		     "unsupported reserved word '%s'", p->node->name);
	  }
	} else if (tag == BTOR_SYMBOL_TAG_SMT2) {
	  assert (p->node);
	  if (!p->node->exp)
	    return !btor_perr_smt2 (parser, "undefined symbol '%s'",
				    p->node->name);
	  p->tag = BTOR_EXP_TAG_SMT2;
	  p->exp = boolector_copy (parser->btor, p->node->exp);
	} else if (tag == BTOR_TRUE_TAG_SMT2) {
	  p->tag = BTOR_EXP_TAG_SMT2;
	  p->exp = boolector_true (parser->btor);
	} else if (tag == BTOR_FALSE_TAG_SMT2) {
	  p->tag = BTOR_EXP_TAG_SMT2;
	  p->exp = boolector_false (parser->btor);
	} else if (tag == BTOR_ATTRIBUTE_TAG_SMT2) {
	  return !btor_perr_smt2 (parser, "unexpected attribute '%s'",
				  parser->token.start);
	} else if (tag & BTOR_CORE_TAG_CLASS_SMT2) {
	  if (tag == BTOR_BOOL_TAG_SMT2)
	    return !btor_perr_smt2 (parser, "unexpected 'Bool'");
	} else if (tag & BTOR_ARRAY_TAG_CLASS_SMT2) {
	  if (tag == BTOR_ARRAY_TAG_SMT2)
	    return !btor_perr_smt2 (parser, "unexpected 'Array'");
	} else if (tag & BTOR_BITVEC_TAG_CLASS_SMT2) {
	  if (tag == BTOR_BITVEC_TAG_SMT2)
	    return !btor_perr_smt2 (parser, "unexpected 'BitVec'");
	} else return !btor_perr_smt2 (parser, "unexpected token '%s'",
			btor_item2str_smt2 (p));
      } else if (tag == BTOR_BINARY_CONSTANT_TAG_SMT2) {
	p->tag = BTOR_EXP_TAG_SMT2;
	p->exp = boolector_const (parser->btor, parser->token.start + 2);
      } else if (tag == BTOR_HEXADECIMAL_CONSTANT_TAG_SMT2) {
	char * constr = btor_hex_to_const (parser->mem,
					   parser->token.start + 2);
	int len = strlen (constr), width = strlen (parser->token.start+2)*4;
	char * uconstr;
	assert (len <= width);
	if (len == width) uconstr = constr;
	else uconstr = btor_uext_const (parser->mem, constr, width - len);
	p->tag = BTOR_EXP_TAG_SMT2;
	p->exp = boolector_const (parser->btor, uconstr);
	if (uconstr != constr) btor_delete_const (parser->mem, uconstr);
	btor_delete_const (parser->mem, constr);
      } else return !btor_perr_smt2 (parser,
				     "unexpected token '%s'",
				     parser->token.start);
    }
  } while (open);
  if (BTOR_COUNT_STACK (parser->work) - work_cnt != 1) {
    parser->perrcoo = p->coo;
    // This should not occur, but we keep it as a bad style of
    // defensive programming for future extensions of the parser.
    return !btor_perr_smt2 (parser,
	      "internal parse error: worker stack of size %d",
	      BTOR_COUNT_STACK (parser->work));
  }
  parser->work.top -= 1;
  p = parser->work.top;
  if (p->tag != BTOR_EXP_TAG_SMT2) {
    parser->perrcoo = p->coo;
    // Ditto, same comment wrt defensive programming an future use.
    return !btor_perr_smt2 (parser,
	     "internal parse error: failed to translate parsed term at '%s'",
	     btor_item2str_smt2 (p));
  }
  res = boolector_copy (parser->btor, p->exp);
  *cooptr = p->coo;
  btor_release_item_smt2 (parser, p);
  assert (BTOR_COUNT_STACK (parser->work) == work_cnt);
  *resptr = res;
  return 1;
}

static int btor_parse_bitvec_sort_smt2 (BtorSMT2Parser * parser,
					int skiplu, int * resptr) {
  int tag, res;
  if (!skiplu) {
    if (!btor_read_lpar_smt2 (parser, 0)) return 0;
    tag  = btor_read_token_smt2 (parser);
    if (tag == BTOR_INVALID_TAG_SMT2) return 0;
    if (tag == EOF)
      return !btor_perr_smt2 (parser,
			      "expected '_' but reached end-of-file");
    if (tag != BTOR_UNDERSCORE_TAG_SMT2)
      return !btor_perr_smt2 (parser,
			      "expected '_' at '%s'", parser->token.start);
  }
  tag  = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "expected 'BitVec' but reached end-of-file");
  if (tag != BTOR_BITVEC_TAG_SMT2)
    return !btor_perr_smt2 (parser,
			    "expected 'BitVec' at '%s'",
			    parser->token.start);
  tag  = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "expected bit-width but reached end-of-file");
  if (tag != BTOR_DECIMAL_CONSTANT_TAG_SMT2)
    return !btor_perr_smt2 (parser,
			    "expected bit-width at '%s'",
			    parser->token.start);
  assert (parser->token.start[0] != '-');
  if (parser->token.start[0] == '0') {
    assert (!parser->token.start[1]);
    return !btor_perr_smt2 (parser, "invalid zero bit-width");
  }
  if (strchr (parser->token.start, '.'))
    return !btor_perr_smt2 (parser,
	      "invalid floating point bit-width '%s'",
	      parser->token.start);
  res = 0;
  if (!btor_str2int32_smt2 (parser, 1, parser->token.start, &res)) return 0;
  *resptr = res;
  btor_msg_smt2 (parser, 3, "parsed bit-vector sort of width %d", res);
  return btor_read_rpar_smt2 (parser, " to close bit-vector sort");
}

static int btor_declare_fun_smt2 (BtorSMT2Parser * parser) {
  int tag, domain, width;
  BtorSMT2Node * fun;
  fun = 0;
  width = domain = 0;
  if (!btor_read_symbol (parser, " after 'declare-fun'", &fun)) return 0;
  assert (fun && fun->tag == BTOR_SYMBOL_TAG_SMT2);
  if (fun->coo.x)
    return !btor_perr_smt2 (parser,
	     "symbol '%s' already defined at line %d column %d",
	     fun->name, fun->coo.x, fun->coo.y);
  fun->coo = parser->coo;
  if (!btor_read_lpar_smt2 (parser, " after function name")) return 0;
  if (!btor_read_rpar_smt2 (parser,
  " (only constants and no uninterpreted functions are supported) after '('"))
    return 0;
  tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
	      "reached end-of-file but expected '(' or 'Bool'");
  if (tag == BTOR_BOOL_TAG_SMT2) { width = 1; goto BITVEC; }
  else if (tag != BTOR_LPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser,
			    "expected '(' or 'Bool' at '%s'",
			    parser->token.start);
  tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "reached end-of-file expecting '_' or 'Array'");
  if (tag == BTOR_UNDERSCORE_TAG_SMT2) {
    if (!btor_parse_bitvec_sort_smt2 (parser, 1, &width)) return 0;
BITVEC:
    fun->exp = boolector_var (parser->btor, width, fun->name);
    btor_msg_smt2 (parser, 2,
      "declared '%s' as bit-vector of width %d at line %d column %d",
      fun->name, width, fun->coo.x, fun->coo.y);
  } else if (tag == BTOR_ARRAY_TAG_SMT2) {
    if (parser->commands.set_logic && parser->res->logic == BTOR_LOGIC_QF_BV)
      return !btor_perr_smt2 (parser, "'Array' invalid for logic 'QF_BV'");
    if (!btor_parse_bitvec_sort_smt2 (parser, 0, &domain)) return 0;
    if (!btor_parse_bitvec_sort_smt2 (parser, 0, &width)) return 0;
    if (!btor_read_rpar_smt2 (parser, " after element sort of Array"))
      return 0;
    fun->exp = boolector_array (parser->btor,
			       width, domain,
			       fun->name);
    btor_msg_smt2 (parser, 2,
      "declared bit-vector array '%s' "
      "index element width %d %d at line %d column %d",
      fun->name, domain, width, fun->coo.x, fun->coo.y);
    parser->need_arrays = 1;
  } else return !btor_perr_smt2 (parser, "expected '_' or 'Array' at '%s'",
				 parser->token.start);
  (void) boolector_copy (parser->btor, fun->exp);
  BTOR_PUSH_STACK (parser->mem, parser->inputs, fun->exp);
  return btor_read_rpar_smt2 (parser, " to close declaration");
}

static int btor_define_fun_smt2 (BtorSMT2Parser * parser) {
  int tag, domain, width, nargs = 0;
  BtorNode * exp = 0;
  BtorSMT2Coo coo;
  BtorSMT2Item * item;
  BtorSMT2Node * fun, * arg;
  BtorNodePtrStack args;
  fun = 0;
  arg = 0;
  width = domain = 0;
  coo.x = coo.y = 0;
  if (!btor_read_symbol (parser, " after 'define-fun'", &fun)) return 0;
  assert (fun && fun->tag == BTOR_SYMBOL_TAG_SMT2);
  if (fun->coo.x)
    return !btor_perr_smt2 (parser,
	     "symbol '%s' already defined at line %d column %d",
	     fun->name, fun->coo.x, fun->coo.y);
  fun->coo = parser->coo;
  if (!btor_read_lpar_smt2 (parser, " after function name")) return 0;

SORTED_VAR:
  tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_LPAR_TAG_SMT2) {
    if (!btor_read_symbol (parser, " after '('", &arg)) return 0;
    assert (arg && arg->tag == BTOR_SYMBOL_TAG_SMT2);
    if (arg->coo.x)
      return !btor_perr_smt2 (parser,
	       "symbol '%s' already defined at line %d column %d",
	       arg->name, arg->coo.x, arg->coo.y);
    arg->coo = parser->coo;

    if (!btor_parse_bitvec_sort_smt2 (parser, 0, &width)) return 0;

    nargs++;
    arg->exp = boolector_param (parser->btor, width, arg->name);
    item = btor_push_item_smt2 (parser, arg->tag);
    item->node = arg;

    if (!btor_read_rpar_smt2 (parser, " after argument sort")) return 0;
    goto SORTED_VAR;
  }
  if (tag != BTOR_RPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser, " expected ')'");

  tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
	      "reached end-of-file but expected '(' or 'Bool'");
  if (tag == BTOR_BOOL_TAG_SMT2) { width = 1; goto BITVEC; }
  else if (tag != BTOR_LPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser,
			    "expected '(' or 'Bool' at '%s'",
			    parser->token.start);
  tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "reached end-of-file expecting '_' or 'Array'");
  if (tag == BTOR_UNDERSCORE_TAG_SMT2) {
    if (!btor_parse_bitvec_sort_smt2 (parser, 1, &width)) return 0;
BITVEC:
    btor_msg_smt2 (parser, 2,
      "defined '%s' as bit-vector of width %d at line %d column %d",
      fun->name, width, fun->coo.x, fun->coo.y);
  }
  else if (tag == BTOR_ARRAY_TAG_SMT2) {
    if (nargs)
      return !btor_perr_smt2 (parser,
	       "sort Array is not supported for arity > 0");
    assert (!domain);
    assert (!width);
    if (parser->commands.set_logic && parser->res->logic == BTOR_LOGIC_QF_BV)
      return !btor_perr_smt2 (parser, "'Array' invalid for logic 'QF_BV'");
    if (!btor_parse_bitvec_sort_smt2 (parser, 0, &domain)) return 0;
    if (!btor_parse_bitvec_sort_smt2 (parser, 0, &width)) return 0;
    if (!btor_read_rpar_smt2 (parser, " after element sort of Array"))
      return 0;

    btor_msg_smt2 (parser, 2,
      "defined bit-vector array '%s' "
      "index element width %d %d at line %d column %d",
      fun->name, domain, width, fun->coo.x, fun->coo.y);
    parser->need_arrays = 1;
  }
  else return !btor_perr_smt2 (parser, "expected '_' at '%s'",
			       parser->token.start);

  if (!btor_parse_term_smt2 (parser, &exp, &coo)) return 0;

  if (boolector_get_width (parser->btor, exp) != width) {
    domain = boolector_get_width (parser->btor, exp);
    boolector_release (parser->btor, exp);
    return !btor_perr_smt2 (parser,
			    "invalid term bit-width, expected %d but was %d",
			    width, domain);
  }
  if (boolector_is_array (parser->btor, exp)
      && boolector_get_index_width (parser->btor, exp) != domain) {
    width = boolector_get_index_width (parser->btor, exp);
    boolector_release (parser->btor, exp);
    return !btor_perr_smt2 (parser,
			    "invalid array index bit-width, expected %d but "
			    "was %d", domain, width);
  }

  assert (nargs == BTOR_COUNT_STACK (parser->work));
  if (nargs) {
    BTOR_INIT_STACK (args);
    item = parser->work.top - nargs;
    /* collect arguments, remove symbols (scope is only this function) */
    while (item < parser->work.top) {
      arg = item->node;
      item++;
      assert (arg);
      assert (arg->coo.x);
      assert (arg->tag == BTOR_SYMBOL_TAG_SMT2);
      BTOR_PUSH_STACK (parser->mem, args,
                       boolector_copy (parser->btor, arg->exp));
      btor_remove_symbol_smt2 (parser, arg);
    }
    parser->work.top -= nargs;
    assert (BTOR_EMPTY_STACK (parser->work));

    fun->exp = boolector_fun (parser->btor, nargs, args.start, exp);
    while (!BTOR_EMPTY_STACK (args))
      boolector_release (parser->btor, BTOR_POP_STACK (args));
    boolector_release (parser->btor, exp);
    BTOR_RELEASE_STACK (parser->mem, args);
    parser->need_arrays = 1;
  }
  else {
    fun->exp = exp;
  }

  return btor_read_rpar_smt2 (parser, " to close definition");
}

static int btor_set_info_smt2 (BtorSMT2Parser * parser) {
  int tag = btor_read_token_smt2 (parser);
  if (tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag == EOF)
    return !btor_perr_smt2 (parser,
			    "unexpected end-of-file after 'set-info'");
  if (tag == BTOR_RPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser, "keyword after 'set-info' missing");
  if (tag == BTOR_STATUS_TAG_SMT2) {
    tag = btor_read_token_smt2 (parser);
    if (tag == BTOR_INVALID_TAG_SMT2) return 0;
    if (tag == EOF)
      return !btor_perr_smt2 (parser,
	       "unexpected end-of-file after ':status'");
    if (tag == BTOR_RPAR_TAG_SMT2)
      return !btor_perr_smt2 (parser, "value after ':status' missing");
    if (tag != BTOR_SYMBOL_TAG_SMT2)
INVALID_STATUS_VALUE:
      return !btor_perr_smt2 (parser,
			      "invalid value '%s' after ':status'",
			      parser->token.start);
    if (!strcmp (parser->token.start, "sat"))
      parser->res->status = BTOR_PARSE_SAT_STATUS_SAT;
    else if (!strcmp (parser->token.start, "unsat"))
      parser->res->status = BTOR_PARSE_SAT_STATUS_UNSAT;
    else if (!strcmp (parser->token.start, "unknown"))
      parser->res->status = BTOR_PARSE_SAT_STATUS_UNKNOWN;
    else goto INVALID_STATUS_VALUE;

    btor_msg_smt2 (parser, 2, "parsed status '%s'", parser->token.start);
    return btor_read_rpar_smt2 (parser, " after 'set-logic'");
  }
  return btor_skip_sexprs (parser, 1);
}

static int btor_read_command_smt2 (BtorSMT2Parser * parser) {
  BtorNode * exp = 0;
  BtorSMT2Coo coo;
  int tag;
  coo.x = coo.y = 0;
  tag = btor_read_token_smt2 (parser);
  if (tag == EOF || tag == BTOR_INVALID_TAG_SMT2) return 0;
  if (tag != BTOR_LPAR_TAG_SMT2)
    return !btor_perr_smt2 (parser,
			    "expected '(' at '%s'", parser->token.start);
  tag = btor_read_token_smt2 (parser);
  if (tag == EOF) {
    parser->perrcoo = parser->lastcoo;
    return !btor_perr_smt2 (parser, "unexpected end-of-file after '('");
  }
  if (tag == BTOR_INVALID_TAG_SMT2) { assert (parser->error); return 0; }
  if (!(tag & BTOR_COMMAND_TAG_CLASS_SMT2))
    return !btor_perr_smt2 (parser,
			    "expected command at '%s'", parser->token.start);
  switch (tag)
    {
      case BTOR_SET_LOGIC_TAG_SMT2:
	if (parser->commands.all)
	  btor_msg_smt2 (parser, 1,
			 "WARNING 'set-logic' not first command in '%s'",
			 parser->name);
	tag = btor_read_token_smt2 (parser);
	if (tag == EOF) {
	  parser->perrcoo = parser->lastcoo;
	  return !btor_perr_smt2 (parser,
				  "unexpected end-of-file after 'set-logic'");
	}
	if (tag == BTOR_INVALID_TAG_SMT2) { assert (parser->error); return 0; }
	if (!(tag & BTOR_LOGIC_TAG_CLASS_SMT2))
	  return !btor_perr_smt2 (parser, "expected logic at '%s'",
				  parser->token.start);
	if (tag == BTOR_QF_BV_TAG_SMT2) parser->res->logic = BTOR_LOGIC_QF_BV;
	else if (tag == BTOR_QF_AUFBV_TAG_SMT2 ||
		 tag == BTOR_QF_UFBV_TAG_SMT2 ||
		 tag == BTOR_QF_ABV_TAG_SMT2)
	  parser->res->logic = BTOR_LOGIC_QF_AUFBV;
	else return !btor_perr_smt2 (parser, "unsupported logic '%s'",
				     parser->token.start);
	btor_msg_smt2 (parser, 2, "logic %s", parser->token.start);
	if (!btor_read_rpar_smt2 (parser, " after logic")) return 0;
	if (parser->commands.set_logic++)
	  btor_msg_smt2 (parser, 1, "WARNING additional 'set-logic' command");
	break;

      case BTOR_CHECK_SAT_TAG_SMT2:
	if (!btor_read_rpar_smt2 (parser, " after 'check-sat'")) return 0;
	if (parser->commands.check_sat++)
	  btor_msg_smt2 (parser, 1, "WARNING additional 'check-sat' command");
	break;

      case BTOR_DECLARE_FUN_TAG_SMT2:
	if (!btor_declare_fun_smt2 (parser)) return 0;
	break;

      case BTOR_DEFINE_FUN_TAG_SMT2:
	if (!btor_define_fun_smt2 (parser)) return 0;
	break;

      case BTOR_ASSERT_TAG_SMT2:
	if (!btor_parse_term_smt2 (parser, &exp, &coo)) return 0;
	BTOR_PUSH_STACK (parser->mem, parser->outputs, exp);
	if (boolector_is_array (parser->btor, exp)) {
	  parser->perrcoo = coo;
	  return !btor_perr_smt2 (parser,
		    "assert argument is an array and not a formula");
	}
	if (boolector_get_width (parser->btor, exp) != 1) {
	  parser->perrcoo = coo;
	  return !btor_perr_smt2 (parser,
		    "assert argument is a bit-vector of length %d",
		    boolector_get_width (parser->btor, exp));
	}
	if (!btor_read_rpar_smt2 (parser, " after asserted expression")) return 0;
	assert (!parser->error);
	parser->commands.asserts++;
	break;

      case BTOR_EXIT_TAG_SMT2:
	if (!btor_read_rpar_smt2 (parser, " after 'exit'")) return 0;
	assert (!parser->commands.exits);
	parser->commands.exits++;
	tag = btor_read_token_smt2 (parser);
	if (tag == BTOR_INVALID_TAG_SMT2) return 0;
	if (tag != EOF)
	  return !btor_perr_smt2 (parser,
		   "expected end-of-file after 'exit' command at '%s'",
		   parser->token.start);
	goto DONE;
	break;

      case BTOR_SET_INFO_TAG_SMT2:
	if (!btor_set_info_smt2 (parser)) return 0;
	break;

      default:
	return !btor_perr_smt2 (parser, "unsupported command '%s'",
				parser->token.start);
	break;
    }
DONE:
  parser->commands.all++;
  return 1;
}

static const char * btor_parse_smt2_parser (BtorSMT2Parser * parser,
					    BtorCharStack * prefix,
					    FILE * file, const char * name,
					    BtorParseResult * res) {
  double start = btor_time_stamp (), delta;
  parser->name = btor_strdup (parser->mem, name);
  parser->nprefix = 0;
  parser->prefix = prefix;
  parser->nextcoo.x = 1;
  parser->nextcoo.y = 1;
  parser->file = file;
  parser->saved = 0;
  BTOR_CLR (res);
  parser->res = res;
  while (btor_read_command_smt2 (parser))
    ;
  if (parser->error) return parser->error;
  if (!parser->commands.all)
    btor_msg_smt2 (parser, 1, "WARNING no commands in '%s'", parser->name);
  else {
    if (!parser->commands.set_logic)
      btor_msg_smt2 (parser, 1,
		     "WARNING 'set-logic' command missing in '%s'",
		     parser->name);
    if (!parser->commands.asserts)
      btor_msg_smt2 (parser, 1,
		     "WARNING no 'assert' command in '%s'",
		     parser->name);
    if (!parser->commands.check_sat)
      btor_msg_smt2 (parser, 1,
		     "WARNING 'check-sat' command missing in '%s'",
		     parser->name);
    if (!parser->commands.exits)
      btor_msg_smt2 (parser, 1,
		     "WARNING no 'exit' command at end of '%s'",
		     parser->name);
  }
  parser->res->inputs = parser->inputs.start;
  parser->res->outputs = parser->outputs.start;
  parser->res->ninputs = BTOR_COUNT_STACK (parser->inputs);
  parser->res->noutputs = BTOR_COUNT_STACK (parser->outputs);
  delta = btor_time_stamp () - start;
  if (delta < 0) delta = 0;
  btor_msg_smt2 (parser, 1, "parsed %d commands in %.2f seconds",
		 parser->commands.all, delta);

  if (parser->commands.set_logic) {
    assert (!parser->need_arrays ||
	    parser->res->logic == BTOR_LOGIC_QF_AUFBV);
    if (!parser->need_arrays &&
	parser->res->logic == BTOR_LOGIC_QF_AUFBV) {
      btor_msg_smt2 (parser, 1,
	"no arrays found thus restricting logic to 'QF_BV'");
      parser->res->logic = BTOR_LOGIC_QF_BV;
    }
  } else if (parser->need_arrays) {
    btor_msg_smt2 (parser, 1, "found arrays thus using 'QF_AUFBV' logic");
    assert (parser->res->logic == BTOR_LOGIC_QF_BV);
    parser->res->logic = BTOR_LOGIC_QF_AUFBV;
  }
  return 0;
}

static BtorParserAPI static_btor_smt2_parser_api = {
  (BtorInitParser) btor_new_smt2_parser,
  (BtorResetParser) btor_delete_smt2_parser,
  (BtorParse) btor_parse_smt2_parser
};

const BtorParserAPI * btor_smt2_parser_api () {
  return &static_btor_smt2_parser_api;
}
