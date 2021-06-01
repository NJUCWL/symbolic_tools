/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2007-2013 Armin Biere.
 *  Copyright (C) 2013 Aina Niemetz.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 */

#include "btorsmt.h"
#include "btormem.h"
#include "btorstack.h"
#include "btorconst.h"
#include "btorutil.h"

#include <stdarg.h>
#include <assert.h>
#include <ctype.h>

/*------------------------------------------------------------------------*/

typedef struct BtorSMTParser BtorSMTParser;
typedef struct BtorSMTNode BtorSMTNode;
typedef struct BtorSMTNodes BtorSMTNodes;
typedef struct BtorSMTSymbol BtorSMTSymbol;

enum BtorSMTCharacterClass
{
  BTOR_SMTCC_IDENTIFIER_START = 1,
  BTOR_SMTCC_IDENTIFIER_MIDDLE = 2,
  BTOR_SMTCC_ARITHMETIC_OPERATOR = 4,
  BTOR_SMTCC_NUMERAL_START = 8,
  BTOR_SMTCC_DIGIT = 16,
  BTOR_SMTCC_SPACE = 32,
  BTOR_SMTCC_IDENTIFIER_PREFIX = 64,
};

enum BtorSMTToken
{
  BTOR_SMTOK_ERR = 0,
  BTOR_SMTOK_EOF = EOF,

  BTOR_SMTOK_IDENTIFIER = 'a',
  BTOR_SMTOK_NUMERAL = '0',
  BTOR_SMTOK_RATIONAL = '.',
  BTOR_SMTOK_USERVAL = '{',
  BTOR_SMTOK_LP = '(',
  BTOR_SMTOK_RP = ')',
  BTOR_SMTOK_STRING = '"',
  BTOR_SMTOK_VAR = '?',
  BTOR_SMTOK_FVAR = '$',
  BTOR_SMTOK_ATTR = ':',
  BTOR_SMTOK_ARITH = '=',

  BTOR_SMTOK_KEYWORD  = 256,    /* above ASCII codes */
  BTOR_SMTOK_AND = 256,
  BTOR_SMTOK_ASSUMPTION = 257,
  BTOR_SMTOK_BENCHMARK = 258,
  BTOR_SMTOK_DISTINCT = 259,
  BTOR_SMTOK_EXTRAFUNS = 260,
  BTOR_SMTOK_EXTRAPREDS = 261,
  BTOR_SMTOK_EXTRASORTS = 262,
  BTOR_SMTOK_FALSE = 263,
  BTOR_SMTOK_FLET = 264,
  BTOR_SMTOK_FORMULA = 265,
  BTOR_SMTOK_IFF = 266,
  BTOR_SMTOK_IF_THEN_ELSE = 267,
  BTOR_SMTOK_IMPLIES = 268,
  BTOR_SMTOK_ITE = 269,
  BTOR_SMTOK_LET = 270,
  BTOR_SMTOK_LOGICATTR = 271,
  BTOR_SMTOK_NOT = 272,
  BTOR_SMTOK_NOTES = 273,
  BTOR_SMTOK_OR = 274,
  BTOR_SMTOK_SAT = 275,
  BTOR_SMTOK_STATUS = 276,
  BTOR_SMTOK_TRUE = 277,
  BTOR_SMTOK_UNKNOWN = 278,
  BTOR_SMTOK_UNSAT = 279,
  BTOR_SMTOK_XOR = 280,

  BTOR_SMTOK_CONCAT = 281,      /* QF_BV specific symbols */
  BTOR_SMTOK_EQ = 282,
  BTOR_SMTOK_EXTRACT = 283,
  BTOR_SMTOK_BIT0 = 284,
  BTOR_SMTOK_BIT1 = 285,
  BTOR_SMTOK_BVADD = 286,
  BTOR_SMTOK_BVNOT = 287,
  BTOR_SMTOK_BVMUL = 288,
  BTOR_SMTOK_BVULE = 289,
  BTOR_SMTOK_BVAND = 290,
  BTOR_SMTOK_BVLSHR = 291,
  BTOR_SMTOK_BVSLT = 292,
  BTOR_SMTOK_BVULT = 293,
  BTOR_SMTOK_BVNEG = 294,
  BTOR_SMTOK_BVSLE = 295,
  BTOR_SMTOK_BVSHL = 296,
  BTOR_SMTOK_BVSUB = 297,
  BTOR_SMTOK_BVSDIV = 298,
  BTOR_SMTOK_BVASHR = 299,
  BTOR_SMTOK_BVOR = 300,
  BTOR_SMTOK_BVUDIV = 301,
  BTOR_SMTOK_BVUREM = 302,
  BTOR_SMTOK_BVNAND = 303,
  BTOR_SMTOK_BVNOR = 304,
  BTOR_SMTOK_BVUGT = 305,
  BTOR_SMTOK_BVUGE = 306,
  BTOR_SMTOK_BVSGT = 307,
  BTOR_SMTOK_BVSGE = 308,
  BTOR_SMTOK_BVCOMP = 309,

  BTOR_SMTOK_REPEAT = 310,
  BTOR_SMTOK_ZERO_EXTEND = 311,
  BTOR_SMTOK_SIGN_EXTEND = 312,
  BTOR_SMTOK_ROTATE_LEFT = 313,
  BTOR_SMTOK_ROTATE_RIGHT = 314,

  BTOR_SMTOK_BVXOR = 315,
  BTOR_SMTOK_BVSREM = 316,
  BTOR_SMTOK_BVSMOD = 317,
  BTOR_SMTOK_BVXNOR = 318,

  BTOR_SMTOK_SELECT = 319,
  BTOR_SMTOK_STORE = 320,

  BTOR_SMTOK_UNSUPPORTED_KEYWORD = 512,
  BTOR_SMTOK_AXIOMS = 512,
  BTOR_SMTOK_DEFINITIONS = 513,
  BTOR_SMTOK_EXISTS = 514,
  BTOR_SMTOK_EXTENSIONS = 515,
  BTOR_SMTOK_FORALL = 516,
  BTOR_SMTOK_FUNS = 517,
  BTOR_SMTOK_LANGUAGE = 518,
  BTOR_SMTOK_LOGIC = 519,
  BTOR_SMTOK_PREDS = 520,
  BTOR_SMTOK_SORTS = 521,
  BTOR_SMTOK_THEORY = 522,
  BTOR_SMTOK_THEORYATTR = 523,

  BTOR_SMTOK_INTERNAL = 1024,
  BTOR_SMTOK_BIND = 1024,
  BTOR_SMTOK_TRANSLATED = 1025,                 // TODO ...
};

typedef enum BtorSMTToken BtorSMTToken;

/* Uncomment the following line to find leaking nodes during debugging
 * of the this SMTLIB1 parser.
 *
#define BTOR_FIND_LEAKING_SMT_NODES
 */

struct BtorSMTNode
{
  void * head;
  void * tail;
  BtorNode * exp;                       // TODO overlay with tail/head?
#ifdef BTOR_FIND_LEAKING_SMT_NODES
  struct BtorSMTNode * prev, * next;
#endif
};

BTOR_DECLARE_STACK (SMTNodePtr,BtorSMTNode *);

struct BtorSMTSymbol
{
  char * name;
  BtorSMTToken token;
  BtorSMTSymbol * next;
  BtorSMTNode * last;
  BtorNode * exp;
};

struct BtorSMTParser
{
  BtorMemMgr * mem;
  Btor * btor;
  int verbosity;
  int parsed;

  int incremental;
  int max_window_size;
  int model;

  struct { int parsed, handled; } assumptions;
  struct { int parsed, handled, checked; } formulas;

  const char * name;
  int nprefix;
  BtorCharStack * prefix;
  FILE * file;
  int lineno;
  int saved; /* boolean flag */
  int saved_char;

  unsigned long long bytes;

  BtorLogic required_logic;

  char * error;
  BtorCharStack buffer;

  unsigned char types[256];

  BtorSMTSymbol * symbol;
  BtorSMTSymbol ** symtab;
  unsigned szsymtab;
  unsigned symbols;

  unsigned constants;

  BtorSMTNode * bind;
  BtorSMTNode * translated;

  BtorSMTNodePtrStack stack;
  BtorSMTNodePtrStack work;
  BtorSMTNodePtrStack delete;
  BtorIntStack heads;

  unsigned nodes;
#ifdef BTOR_FIND_LEAKING_SMT_NODES
  BtorSMTNode * first;
  BtorSMTNode * last;
#endif

  BtorNodePtrStack inputs;
  BtorNodePtrStack outputs;
  BtorNodePtrStack window;
};

/*------------------------------------------------------------------------*/

static unsigned btor_smt_primes[] = { 1001311, 2517041, 3543763, 4026227 };
#define BTOR_SMT_PRIMES ((sizeof btor_smt_primes)/ sizeof *btor_smt_primes)

static void *
car (BtorSMTNode * node)
{
  assert (node);
  return node->head;
}

static void *
cdr (BtorSMTNode * node)
{
  assert (node);
  return node->tail;
}

#define isleaf(l) (1lu & (unsigned long) (l))
#define leaf(l) ((void*)(1lu | (unsigned long) (l)))
#define strip(l) ((BtorSMTSymbol*)((~1lu) & (unsigned long) (l)))

static BtorSMTNode *
cons (BtorSMTParser * parser, void * h, void * t)
{
  BtorSMTNode * res;

  BTOR_NEW (parser->mem, res);
  BTOR_CLR (res);

#ifdef BTOR_FIND_LEAKING_SMT_NODES
  if (parser->last)
    {
      assert (parser->first);
      parser->last->next = res;
    }
  else
    {
      assert (!parser->first);
      parser->first = res;
    }

  res->prev = parser->last;
  parser->last = res;
#endif

  parser->nodes++;
  assert (parser->nodes > 0);

  res->head = h;
  res->tail = t;

  return res;
}

static unsigned
hash_name (const char * name)
{
  unsigned i, res;
  const char *p;
  char ch;

  i = 0;
  res = 0;

  for (p = name; (ch = *p); p++)
    {
      res += btor_smt_primes[i++] * (unsigned) ch;

      if (i == BTOR_SMT_PRIMES)
	i = 0;

      res = (res << 4) | (res >> 28);
    }

  return res;
}

static BtorSMTSymbol **
find_symbol_position (BtorSMTParser * parser, const char * name)
{
  unsigned h = hash_name (name) & (parser->szsymtab - 1);
  BtorSMTSymbol ** p, * s;

  for (p = parser->symtab + h;
       (s = *p) && strcmp (name, s->name);
       p = &s->next)
    ;

  return p;
}

static void
delete_symbol (BtorSMTParser * parser, BtorSMTSymbol * symbol)
{
  BtorNode * exp;

  assert (parser->symbols > 0);
  parser->symbols--;

  btor_freestr (parser->mem, symbol->name);

  if ((exp = symbol->exp))
    btor_release_exp (parser->btor, exp);

  BTOR_DELETE (parser->mem, symbol);
}

static void
remove_and_delete_symbol (BtorSMTParser * parser, BtorSMTSymbol * symbol)
{
  BtorSMTSymbol ** p;

  p = find_symbol_position (parser, symbol->name);
  assert (*p == symbol);

  *p = symbol->next;
  delete_symbol (parser, symbol);
}

static void
btor_delete_smt_node (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorSMTSymbol * s;

  if (!node)
    return;

  assert (parser->nodes > 0);
  parser->nodes--;

  if (node->exp)
    btor_release_exp (parser->btor, node->exp);

  if (!parser->model && isleaf (car (node)))
    {
      s = strip (car (node));
      if (s->last == node)
	remove_and_delete_symbol (parser, s);
    }

#ifdef BTOR_FIND_LEAKING_SMT_NODES
  assert (parser->first);
  assert (parser->last);

  if (node->next)
    {
      node->next->prev = node->prev;
    }
  else
    {
      assert (parser->last == node);
      parser->last = node->prev;
    }

  if (node->prev)
    {
      node->prev->next = node->next;
    }
  else
    {
      assert (parser->first == node);
      parser->first = node->next;
    }
#endif

  BTOR_DELETE (parser->mem, node);
}

static void
btor_smt_message (BtorSMTParser * parser, int level, const char * fmt, ...)
{
  va_list ap;

  assert (level >= 0);

  if (parser->verbosity < level)
    return;

  fflush (stdout);
  fprintf (stdout, "[btorsmt] ");
  if (parser->incremental)
    printf ("%d : ", parser->formulas.checked);
  va_start (ap, fmt);
  vfprintf (stdout, fmt, ap);
  va_end (ap);
  fprintf (stdout, " after %.2f seconds\n", btor_time_stamp ());
  fflush (stdout);
}

static void
btor_recursively_delete_smt_node (BtorSMTParser * parser, BtorSMTNode * root)
{
  BtorSMTNode * node;

  assert (BTOR_EMPTY_STACK (parser->delete));

  BTOR_PUSH_STACK (parser->mem, parser->delete, root);
  while (!BTOR_EMPTY_STACK (parser->delete))
    {
      node = BTOR_POP_STACK (parser->delete);

      if (!node)
	continue;

      if (isleaf (node))
	continue;

      if (car (node) == parser->bind)
	{
	  /* NOTE: assignment == cdr (node) shared, so do not delete here */
	  assert (cdr (node));
	}
      else
	{
	  BTOR_PUSH_STACK (parser->mem, parser->delete, cdr (node));
	  BTOR_PUSH_STACK (parser->mem, parser->delete, car (node));
	}

      btor_delete_smt_node (parser, node);
    }
}

static unsigned
length (BtorSMTNode * node)
{
  BtorSMTNode * p;
  unsigned res;

  assert (!isleaf (node));

  res = 0;
  for (p = node; p; p = cdr (p))
    res++;

  return res;
}

static int
is_list_of_length (BtorSMTNode * node, unsigned l)
{
  if (isleaf (node))
    return 0;

  return length (node) == l;
}

static void
btor_release_smt_symbols (BtorSMTParser * parser)
{
  BtorSMTSymbol * p, * next;
  unsigned i;

  for (i = 0; i < parser->szsymtab; i++)
    {
      for (p = parser->symtab[i]; p; p = next)
	{
	  next = p->next;
	  delete_symbol (parser, p);
	}
    }
  BTOR_DELETEN (parser->mem, parser->symtab, parser->szsymtab);
  parser->symtab = 0;
  parser->szsymtab = 0;
}

static void
btor_release_smt_nodes (BtorSMTParser * parser)
{
  BtorSMTNode * node;

  while (!BTOR_EMPTY_STACK (parser->stack))
    {
      node = BTOR_POP_STACK (parser->stack);
      btor_recursively_delete_smt_node (parser, node);
    }

  while (!BTOR_EMPTY_STACK (parser->work))
    {
      node = BTOR_POP_STACK (parser->work);

      if (!node)
	continue;

      if (isleaf (node))
	continue;

#if 1
      if (car (node) == parser->bind)
	btor_delete_smt_node (parser, node);
#endif
    }

  assert (!parser->nodes);

#ifdef BTOR_FIND_LEAKING_SMT_NODES
  {
    /* Became redundant, keep it for debugging BTOR_FIND_LEAKING_SMT_NODES.
     */
    BtorSMTNode * p, * prev;
    BtorNode * e;

    assert (!parser->last);

    for (p = parser->last; p; p = prev)
      {
	assert (parser->nodes > 0);
	parser->nodes--;
	prev = p->prev;
	if ((e = p->exp))
	  btor_release_exp (parser->btor, e);
	BTOR_DELETE (parser->mem, p);
      }
    assert (!parser->nodes);
    parser->first = parser->last = 0;
  }
#endif
}

static void
btor_release_smt_internals (BtorSMTParser * parser)
{
  btor_release_smt_nodes (parser);
  btor_release_smt_symbols (parser);

  BTOR_RELEASE_STACK (parser->mem, parser->stack);
  BTOR_RELEASE_STACK (parser->mem, parser->work);
  BTOR_RELEASE_STACK (parser->mem, parser->delete);
  BTOR_RELEASE_STACK (parser->mem, parser->heads);
  BTOR_RELEASE_STACK (parser->mem, parser->buffer);
}

static void
btor_release_smt_vars (BtorSMTParser * parser)
{
  BtorNode ** p;

  for (p = parser->inputs.start; p < parser->inputs.top; p++)
    btor_release_exp (parser->btor, *p);

  BTOR_RELEASE_STACK (parser->mem, parser->inputs);
}

static void
btor_delete_smt_parser (BtorSMTParser * parser)
{
  BtorNode ** p;

  btor_release_smt_internals (parser);

  btor_freestr (parser->mem, parser->error);
  btor_release_smt_vars (parser);

  for (p = parser->outputs.start; p != parser->outputs.top; p++)
    btor_release_exp (parser->btor, *p);
  BTOR_RELEASE_STACK (parser->mem, parser->outputs);

  for (p = parser->window.start; p != parser->window.top; p++)
    btor_release_exp (parser->btor, *p);
  BTOR_RELEASE_STACK (parser->mem, parser->window);

  BTOR_DELETE (parser->mem, parser);
}

static char *
btor_perr_smt (BtorSMTParser * parser, const char * fmt, ...)
{
  size_t bytes;
  va_list ap;

  if (!parser->error)
    {
      va_start (ap, fmt);
      bytes = btor_parse_error_message_length (parser->name, fmt, ap);
      va_end (ap);

      va_start (ap, fmt);
      parser->error =
	btor_parse_error_message (parser->mem,
				  parser->name,
				  parser->lineno, -1,
				  fmt, ap, bytes);
      va_end (ap);
    }

  return parser->error;
}

static void
enlarge_symtab (BtorSMTParser * parser)
{
  BtorSMTSymbol * p, * next, ** old_symtab, ** new_symtab;
  unsigned h, i, old_size, new_size;

  old_symtab = parser->symtab;
  old_size = parser->szsymtab;

  new_size = old_size ? 2 * old_size : 1;
  BTOR_NEWN (parser->mem, new_symtab, new_size);
  BTOR_CLRN (new_symtab, new_size);

  for (i = 0; i < old_size; i++)
    {
      for (p = old_symtab[i]; p; p = next)
	{
	  next = p->next;
	  h = hash_name (p->name) & (new_size - 1);
	  p->next = new_symtab[h];
	  new_symtab[h] = p;
	}
    }

  BTOR_DELETEN (parser->mem, old_symtab, old_size);

  parser->symtab = new_symtab;
  parser->szsymtab = new_size;
}

static BtorSMTSymbol *
insert_symbol (BtorSMTParser * parser, const char * name)
{
  BtorSMTSymbol ** p, * res;

  if (parser->szsymtab == parser->symbols)
    enlarge_symtab (parser);

  p = find_symbol_position (parser, name);
  if (!(res = *p))
    {
      BTOR_NEW (parser->mem, res);
      BTOR_CLR (res);

      res->token = BTOR_SMTOK_IDENTIFIER;
      res->name = btor_strdup (parser->mem, name);

      parser->symbols++;
      *p = res;
    }

  return res;
}

static BtorSMTParser *
btor_new_smt_parser (Btor * btor, BtorParseOpt * opts)
{
  BtorSMTSymbol * bind, *translated;
  BtorMemMgr * mem = btor->mm;
  BtorSMTParser * res;
  unsigned char type;
  int ch;

  BTOR_NEW (mem, res);
  BTOR_CLR (res);

  res->verbosity = opts->verbosity;
  res->incremental = opts->incremental;
  res->max_window_size = opts->window;
  res->model = opts->need_model;

  if (opts->incremental)
    btor->msgtick = 0;

  btor_smt_message (res, 2, "initializing SMT parser");
  if (opts->incremental &
      (BTOR_PARSE_MODE_BASIC_INCREMENTAL |
       BTOR_PARSE_MODE_INCREMENTAL_BUT_CONTINUE))
    {
      btor_smt_message (res, 2, "incremental checking of SMT benchmark");
      if (opts->incremental & BTOR_PARSE_MODE_BASIC_INCREMENTAL)
	btor_smt_message (res, 2, "stop after first satisfiable ':formula'");
      else if (opts->incremental & BTOR_PARSE_MODE_INCREMENTAL_BUT_CONTINUE)
	btor_smt_message (res, 2, "check all ':formula' for satisfiability");

      if (opts->incremental & BTOR_PARSE_MODE_INCREMENTAL_IN_DEPTH)
	btor_smt_message (res, 2,
	  "incremental in-depth mode with window size %d",
	  res->max_window_size);

      if (opts->incremental & BTOR_PARSE_MODE_INCREMENTAL_LOOK_AHEAD)
	btor_smt_message (res, 2,
	  "incremental look-ahead mode with window size %d",
	  res->max_window_size);

      if (opts->incremental & BTOR_PARSE_MODE_INCREMENTAL_INTERVAL)
	btor_smt_message (res, 2,
	  "incremental interval mode with window size %d",
	  res->max_window_size);
    }

  res->mem = mem;
  res->btor = btor;

  res->required_logic = BTOR_LOGIC_QF_BV;

  type = BTOR_SMTCC_IDENTIFIER_START | BTOR_SMTCC_IDENTIFIER_MIDDLE;

  for (ch = 'a'; ch <= 'z'; ch++)
    res->types[ch] |= type;
  for (ch = 'A'; ch <= 'Z'; ch++)
    res->types[ch] |= type;

  res->types['_'] |= type;
  res->types['.'] |= BTOR_SMTCC_IDENTIFIER_MIDDLE;
  res->types['\''] |= BTOR_SMTCC_IDENTIFIER_MIDDLE;

  type = BTOR_SMTCC_IDENTIFIER_MIDDLE;
  type |= BTOR_SMTCC_DIGIT;

  res->types['0'] |= type;

  type |= BTOR_SMTCC_NUMERAL_START;
  for (ch = '1'; ch <= '9'; ch++)
    res->types[ch] |= type;

  res->types['='] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['<'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['>'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['&'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['@'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['#'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['+'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['-'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['*'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['/'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['%'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['|'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;
  res->types['~'] |= BTOR_SMTCC_ARITHMETIC_OPERATOR;

  res->types[' '] |= BTOR_SMTCC_SPACE;
  res->types['\t'] |= BTOR_SMTCC_SPACE;
  res->types['\n'] |= BTOR_SMTCC_SPACE;
  res->types[0xd] |= BTOR_SMTCC_SPACE;

  res->types[':'] |= BTOR_SMTCC_IDENTIFIER_PREFIX;
  res->types['?'] |= BTOR_SMTCC_IDENTIFIER_PREFIX;
  res->types['$'] |= BTOR_SMTCC_IDENTIFIER_PREFIX;

  insert_symbol (res, "and")->token = BTOR_SMTOK_AND;
  insert_symbol (res, ":assumption")->token = BTOR_SMTOK_ASSUMPTION;
  insert_symbol (res, ":axioms")->token = BTOR_SMTOK_AXIOMS;
  insert_symbol (res, "benchmark")->token = BTOR_SMTOK_BENCHMARK;
  insert_symbol (res, ":definitions")->token = BTOR_SMTOK_DEFINITIONS;
  insert_symbol (res, "distinct")->token = BTOR_SMTOK_DISTINCT;
  insert_symbol (res, "exists")->token = BTOR_SMTOK_EXISTS;
  insert_symbol (res, ":extensions")->token = BTOR_SMTOK_EXTENSIONS;
  insert_symbol (res, ":extrafuns")->token = BTOR_SMTOK_EXTRAFUNS;
  insert_symbol (res, ":extrapreds")->token = BTOR_SMTOK_EXTRAPREDS;
  insert_symbol (res, ":extrasorts")->token = BTOR_SMTOK_EXTRASORTS;
  insert_symbol (res, "false")->token = BTOR_SMTOK_FALSE;
  insert_symbol (res, "flet")->token = BTOR_SMTOK_FLET;
  insert_symbol (res, "forall")->token = BTOR_SMTOK_FORALL;
  insert_symbol (res, ":formula")->token = BTOR_SMTOK_FORMULA;
  insert_symbol (res, ":funs")->token = BTOR_SMTOK_FUNS;
  insert_symbol (res, "iff")->token = BTOR_SMTOK_IFF;
  insert_symbol (res, "if_then_else")->token = BTOR_SMTOK_IF_THEN_ELSE;
  insert_symbol (res, "implies")->token = BTOR_SMTOK_IMPLIES;
  insert_symbol (res, "ite")->token = BTOR_SMTOK_ITE;
  insert_symbol (res, ":language")->token = BTOR_SMTOK_LANGUAGE;
  insert_symbol (res, "let")->token = BTOR_SMTOK_LET;
  insert_symbol (res, "logic")->token = BTOR_SMTOK_LOGIC;
  insert_symbol (res, ":logic")->token = BTOR_SMTOK_LOGICATTR;
  insert_symbol (res, ":notes")->token = BTOR_SMTOK_NOTES;
  insert_symbol (res, "not")->token = BTOR_SMTOK_NOT;
  insert_symbol (res, "or")->token = BTOR_SMTOK_OR;
  insert_symbol (res, ":preds")->token = BTOR_SMTOK_PREDS;
  insert_symbol (res, "sat")->token = BTOR_SMTOK_SAT;
  insert_symbol (res, ":sorts")->token = BTOR_SMTOK_SORTS;
  insert_symbol (res, ":status")->token = BTOR_SMTOK_STATUS;
  insert_symbol (res, "theory")->token = BTOR_SMTOK_THEORY;
  insert_symbol (res, ":theory")->token = BTOR_SMTOK_THEORYATTR;
  insert_symbol (res, "true")->token = BTOR_SMTOK_TRUE;
  insert_symbol (res, "unknown")->token = BTOR_SMTOK_UNKNOWN;
  insert_symbol (res, "unsat")->token = BTOR_SMTOK_UNSAT;
  insert_symbol (res, "xor")->token = BTOR_SMTOK_XOR;

  bind = insert_symbol (res, "<internal bind symbol>");
  bind->token = BTOR_SMTOK_BIND;
  res->bind = leaf (bind);

  translated = insert_symbol (res, "<internal translated symbol>");
  translated->token = BTOR_SMTOK_TRANSLATED;
  res->translated = leaf (translated);

  insert_symbol (res, "=")->token = BTOR_SMTOK_EQ;
  insert_symbol (res, "concat")->token = BTOR_SMTOK_CONCAT;
  insert_symbol (res, "bit0")->token = BTOR_SMTOK_BIT0;
  insert_symbol (res, "bit1")->token = BTOR_SMTOK_BIT1;
  insert_symbol (res, "bvadd")->token = BTOR_SMTOK_BVADD;
  insert_symbol (res, "bvnot")->token = BTOR_SMTOK_BVNOT;
  insert_symbol (res, "bvmul")->token = BTOR_SMTOK_BVMUL;
  insert_symbol (res, "bvule")->token = BTOR_SMTOK_BVULE;
  insert_symbol (res, "bvand")->token = BTOR_SMTOK_BVAND;
  insert_symbol (res, "bvlshr")->token = BTOR_SMTOK_BVLSHR;
  insert_symbol (res, "bvslt")->token = BTOR_SMTOK_BVSLT;
  insert_symbol (res, "bvult")->token = BTOR_SMTOK_BVULT;
  insert_symbol (res, "bvneg")->token = BTOR_SMTOK_BVNEG;
  insert_symbol (res, "bvsle")->token = BTOR_SMTOK_BVSLE;
  insert_symbol (res, "bvshl")->token = BTOR_SMTOK_BVSHL;
  insert_symbol (res, "bvsub")->token = BTOR_SMTOK_BVSUB;
  insert_symbol (res, "bvsdiv")->token = BTOR_SMTOK_BVSDIV;
  insert_symbol (res, "bvashr")->token = BTOR_SMTOK_BVASHR;
  insert_symbol (res, "bvor")->token = BTOR_SMTOK_BVOR;
  insert_symbol (res, "bvudiv")->token = BTOR_SMTOK_BVUDIV;
  insert_symbol (res, "bvurem")->token = BTOR_SMTOK_BVUREM;
  insert_symbol (res, "bvnor")->token = BTOR_SMTOK_BVNOR;
  insert_symbol (res, "bvnand")->token = BTOR_SMTOK_BVNAND;
  insert_symbol (res, "bvugt")->token = BTOR_SMTOK_BVUGT;
  insert_symbol (res, "bvuge")->token = BTOR_SMTOK_BVUGE;
  insert_symbol (res, "bvsgt")->token = BTOR_SMTOK_BVSGT;
  insert_symbol (res, "bvsge")->token = BTOR_SMTOK_BVSGE;
  insert_symbol (res, "bvcomp")->token = BTOR_SMTOK_BVCOMP;
  insert_symbol (res, "bvxor")->token = BTOR_SMTOK_BVXOR;
  insert_symbol (res, "bvsrem")->token = BTOR_SMTOK_BVSREM;
  insert_symbol (res, "bvsmod")->token = BTOR_SMTOK_BVSMOD;
  insert_symbol (res, "bvxnor")->token = BTOR_SMTOK_BVXNOR;
  insert_symbol (res, "select")->token = BTOR_SMTOK_SELECT;
  insert_symbol (res, "store")->token = BTOR_SMTOK_STORE;

  return res;
}

static int
btor_nextch_smt (BtorSMTParser * parser)
{
  int res;

  if (parser->saved)
    {
      res = parser->saved_char;
      parser->saved = 0;
    }
  else if (parser->prefix &&
	   parser->nprefix < BTOR_COUNT_STACK (*parser->prefix))
    {
      parser->bytes++;
      res = parser->prefix->start[parser->nprefix++];
    }
  else
    {
      parser->bytes++;
      res = getc (parser->file);
    }

  if (res == '\n')
    parser->lineno++;

  return res;
}

static void
btor_savech_smt (BtorSMTParser * parser, int ch)
{
  assert (!parser->saved);

  parser->saved_char = ch;
  parser->saved = 1;

  if (ch == '\n')
    {
      assert (parser->lineno > 1);
      parser->lineno--;
    }
}

static unsigned char
int2type (BtorSMTParser * parser, int ch)
{
  assert (0 <= ch && ch < 256);
  return parser->types[ch];
}

static int
has_prefix (const char * str, const char * prefix)
{
  const char * p, * q;

  for (p = str, q = prefix; *q && *p == *q; p++, q++)
    ;

  return !*q;
}

static BtorSMTToken
nextok (BtorSMTParser * parser)
{
  unsigned char type;
  BtorSMTToken res;
  int ch, count;

  parser->symbol = 0;
  BTOR_RESET_STACK (parser->buffer);

SKIP_WHITE_SPACE:

  ch = btor_nextch_smt (parser);
  if (ch == EOF)
    return EOF;

  type = int2type (parser, ch);
  if (type & BTOR_SMTCC_SPACE)
    goto SKIP_WHITE_SPACE;

  if (type & BTOR_SMTCC_IDENTIFIER_START)
    {
      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      while (int2type (parser, (ch = btor_nextch_smt (parser))) &
	     BTOR_SMTCC_IDENTIFIER_MIDDLE)
	BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      count = 0;

      if (ch == '[')
	{
	  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

	  ch = btor_nextch_smt (parser);

	  for (;;)
	    {
	      if (int2type (parser, ch) & BTOR_SMTCC_NUMERAL_START)
		{
		  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

		  while (int2type (parser, (ch = btor_nextch_smt (parser))) &
			 BTOR_SMTCC_DIGIT)
		    BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

		COUNT_AND_CONTINUE_WITH_NEXT_INDEX:

		  count++;

		  if (ch == ']')
		    break;

		  if (ch != ':')
		    goto UNEXPECTED_CHARACTER;

		  BTOR_PUSH_STACK (parser->mem, parser->buffer, ':');
		  ch = btor_nextch_smt (parser);
		}
	      else if (ch == '0')
		{
		  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
		  ch = btor_nextch_smt (parser);
		  goto COUNT_AND_CONTINUE_WITH_NEXT_INDEX;
		}
	      else
		goto UNEXPECTED_CHARACTER;
	    }

	  if (!count)
	    return !btor_perr_smt (parser, "empty index list");

	  assert (ch == ']');
	  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	}
      else
	{
	  if (!ch)
	    goto UNEXPECTED_CHARACTER;

	  btor_savech_smt (parser, ch);
	}

      BTOR_PUSH_STACK (parser->mem, parser->buffer, 0);

      parser->symbol = insert_symbol (parser, parser->buffer.start);

      if (count == 2 && has_prefix (parser->symbol->name, "extract["))
	parser->symbol->token = BTOR_SMTOK_EXTRACT;

      if (count == 1)
	{
	  if (has_prefix (parser->symbol->name, "repeat["))
	    parser->symbol->token = BTOR_SMTOK_REPEAT;

	  if (has_prefix (parser->symbol->name, "zero_extend["))
	    parser->symbol->token = BTOR_SMTOK_ZERO_EXTEND;

	  if (has_prefix (parser->symbol->name, "sign_extend["))
	    parser->symbol->token = BTOR_SMTOK_SIGN_EXTEND;

	  if (has_prefix (parser->symbol->name, "rotate_left["))
	    parser->symbol->token = BTOR_SMTOK_ROTATE_LEFT;

	  if (has_prefix (parser->symbol->name, "rotate_right["))
	    parser->symbol->token = BTOR_SMTOK_ROTATE_RIGHT;
	}

CHECK_FOR_UNSUPPORTED_KEYWORD:

      if (parser->symbol->token >= BTOR_SMTOK_UNSUPPORTED_KEYWORD)
	return !btor_perr_smt (parser,
			     "unsupported keyword '%s'",
			      parser->buffer.start);

      return parser->symbol->token;
    }

  if (ch == '(')
    return BTOR_SMTOK_LP;

  if (ch == ')')
    return BTOR_SMTOK_RP;

  if (type & BTOR_SMTCC_IDENTIFIER_PREFIX)
    {
      res = ch;

      assert (ch == '?' || ch == '$' || ch == ':');

      assert ((ch == '?') == (res == BTOR_SMTOK_VAR));
      assert ((ch == '$') == (res == BTOR_SMTOK_FVAR));
      assert ((ch == ':') == (res == BTOR_SMTOK_ATTR));

      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      ch = btor_nextch_smt (parser);
      if (!(int2type (parser, ch) & BTOR_SMTCC_IDENTIFIER_START))
	return !btor_perr_smt (parser, "expected identifier after '%c'", res);

      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      while (int2type (parser, (ch = btor_nextch_smt (parser))) &
	     BTOR_SMTCC_IDENTIFIER_MIDDLE)
	BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      if (!ch)
	goto UNEXPECTED_CHARACTER;

      btor_savech_smt (parser, ch);
      BTOR_PUSH_STACK (parser->mem, parser->buffer, 0);

      parser->symbol = insert_symbol (parser, parser->buffer.start);

      if (res == BTOR_SMTOK_VAR || res == BTOR_SMTOK_FVAR)
	parser->symbol->token = res;

      goto CHECK_FOR_UNSUPPORTED_KEYWORD;
    }

  if (type & BTOR_SMTCC_NUMERAL_START)
    {
      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      while (int2type (parser, (ch = btor_nextch_smt (parser))) & BTOR_SMTCC_DIGIT)
	BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

CHECK_FOR_FRACTIONAL_PART:

      if (ch == '.')
	{
	  res = BTOR_SMTOK_RATIONAL;

	  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	  ch = btor_nextch_smt (parser);

	  if (int2type (parser, ch) & BTOR_SMTCC_NUMERAL_START)
	    {
	      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

	      while (int2type (parser, (ch = btor_nextch_smt (parser))) &
		     BTOR_SMTCC_NUMERAL_START)
		BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	    }
	  else if (ch == '0')
	    {
	      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

	      ch = btor_nextch_smt (parser);
	      if (int2type (parser, ch) & BTOR_SMTCC_DIGIT)
		goto UNEXPECTED_DIGIT_AFTER_ZERO;
	    }
	  else
	    goto UNEXPECTED_CHARACTER;
	}
      else
	res = BTOR_SMTOK_NUMERAL;

      if (!ch)
	goto UNEXPECTED_CHARACTER;

      btor_savech_smt (parser, ch);
      BTOR_PUSH_STACK (parser->mem, parser->buffer, 0);

      parser->symbol = insert_symbol (parser, parser->buffer.start);
      parser->symbol->token = res;

      return res;
    }

  if (ch == '0')
    {
      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      ch = btor_nextch_smt (parser);
      if (int2type (parser, ch) & BTOR_SMTCC_DIGIT)
	{
UNEXPECTED_DIGIT_AFTER_ZERO:
	  return !btor_perr_smt (parser, "unexpected digit after '0'");
	}

      goto CHECK_FOR_FRACTIONAL_PART;
    }

  if (type & BTOR_SMTCC_ARITHMETIC_OPERATOR)
    {
      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      while (int2type (parser, (ch = btor_nextch_smt (parser))) &
	     BTOR_SMTCC_ARITHMETIC_OPERATOR)
	BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      if (!ch)
	goto UNEXPECTED_CHARACTER;

      BTOR_PUSH_STACK (parser->mem, parser->buffer, 0);

      parser->symbol = insert_symbol (parser, parser->buffer.start);
      if (parser->symbol->token == BTOR_SMTOK_IDENTIFIER)
	parser->symbol->token = BTOR_SMTOK_ARITH;

      return parser->symbol->token;
    }

  if (ch == ';')
    {
      while ((ch = btor_nextch_smt (parser)) != '\n')
	if (ch == EOF)
	  return BTOR_SMTOK_EOF;

      goto SKIP_WHITE_SPACE;
    }

  if (ch == '{')
    {
      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);

      while ((ch = btor_nextch_smt (parser)) != '}')
	{
	  if (ch == '{')
	    return !btor_perr_smt (parser, "unescaped '{' after '{'");

	  if (ch == '\\')
	    {
	      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	      ch = btor_nextch_smt (parser);
	    }

	  if (ch == EOF)
	    return !btor_perr_smt (parser, "unexpected EOF after '{'");

	  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	}

      assert (ch == '}');
      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
      BTOR_PUSH_STACK (parser->mem, parser->buffer, 0);

      parser->symbol = insert_symbol (parser, parser->buffer.start);
      parser->symbol->token = BTOR_SMTOK_USERVAL;

      return BTOR_SMTOK_USERVAL;
    }

  if (ch == '"')
    {
      while ((ch = btor_nextch_smt (parser)) != '"')
	{
	  if (ch == '\\')
	    {
	      BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	      ch = btor_nextch_smt (parser);
	    }

	  if (ch == EOF)
	    return !btor_perr_smt (parser, "unexpected EOF after '\"'");

	  BTOR_PUSH_STACK (parser->mem, parser->buffer, ch);
	}

      BTOR_PUSH_STACK (parser->mem, parser->buffer, 0);

      parser->symbol = insert_symbol (parser, parser->buffer.start);
      parser->symbol->token = BTOR_SMTOK_STRING;

      return BTOR_SMTOK_STRING;
    }

UNEXPECTED_CHARACTER:
  if (isprint (ch))
    return !btor_perr_smt (parser, "unexpected character '%c'", ch);

  return !btor_perr_smt (parser, "unexpected character with ASCII code %d", ch);
}

static void
btorsmtppaux (FILE * file, BtorSMTNode * node, int indent)
{
  int i;

  if (isleaf (node))
    fprintf (file, "%s", ((BtorSMTSymbol*) strip (node))->name);
  else
    {
      fputc ('(', file);

      for (;;)
	{
	  btorsmtppaux (file, car (node), indent + 1);
	  if (!(node = cdr (node)))
	    break;

	  fputc ('\n', file);
	  for (i = 0; i <= indent; i++)
	    fputc (' ', file);
	}

      fputc (')', file);
    }
}

void
btorsmtpp (BtorSMTNode * node)
{
  btorsmtppaux (stdout, node, 0);
  fputc ('\n', stdout);
  fflush (stdout);
}

static void
push_input (BtorSMTParser * parser, BtorNode * v)
{
  if (parser->model)
    BTOR_PUSH_STACK (parser->mem,
		     parser->inputs, btor_copy_exp (parser->btor, v));
}

static const char *
next_numeral (const char * str)
{
  const char * p = str;
  char ch;

  assert (str);

  if (isdigit (*p++))
    {
      while (isdigit (ch = *p++))
	;

      if (ch == ':')
	{
	  assert (isdigit (*p));
	  return p;
	}

      assert (ch == ']');
    }
  else
    {
      while ((ch = *p++))
	if (ch == '[')
	  {
	    assert (isdigit (*p));
	    return p;
	  }
    }

  return 0;
}

static int
extrafun (BtorSMTParser * parser, BtorSMTNode * fdecl)
{
  BtorSMTSymbol * symbol, * sortsymbol;
  BtorSMTNode * node, * sort;
  int addrlen, datalen;
  const char * p;

  if (!fdecl ||
      !cdr (fdecl) ||
      isleaf (fdecl) ||
      !isleaf (node = car (fdecl)) ||
      (symbol = strip (node))->token != BTOR_SMTOK_IDENTIFIER)
    return !btor_perr_smt (parser, "invalid function declaration");

  if (cdr (cdr (fdecl)))
    return !btor_perr_smt (parser,
			 "no support for function declaration "
			 "with more than one argument");

  sort = car (cdr (fdecl));
  if (!sort ||
      !isleaf (sort) ||
      (sortsymbol = strip (sort))->token != BTOR_SMTOK_IDENTIFIER)
    {
INVALID_SORT:
      return !btor_perr_smt (parser,
			   "invalid or unsupported sort "
			   "in function declaration");
    }

  if (symbol->exp)
    return !btor_perr_smt (parser,
			 "multiple definitions for '%s'",
			 symbol->name);

  p = sortsymbol->name;

  if (!strcmp (p, "Bool"))
    {
      symbol->exp = btor_var_exp (parser->btor, 1, symbol->name);
      push_input (parser, symbol->exp);
    }
  else if (has_prefix (p, "BitVec"))
    {
      if (!(p = next_numeral (p)) || next_numeral (p))
	goto INVALID_SORT;

      datalen = atoi (p);       /* TODO Overflow? */
      if (!datalen)
	goto INVALID_SORT;

      symbol->exp = btor_var_exp (parser->btor, datalen, symbol->name);
      push_input (parser, symbol->exp);
    }
  else if (has_prefix (p, "Array"))
    {
      if (!(p = next_numeral (p)))
	goto INVALID_SORT;

      addrlen = atoi (p);       /* TODO Overflow? */
      if (!addrlen)
	goto INVALID_SORT;

      if (!(p = next_numeral (p)) || next_numeral (p))
	goto INVALID_SORT;

      datalen = atoi (p);       /* TODO Overflow? */
      if (!datalen)
	goto INVALID_SORT;

      symbol->exp = btor_array_exp (parser->btor, datalen, addrlen,
				    symbol->name);

      if (parser->required_logic == BTOR_LOGIC_QF_BV)
	{
	  btor_smt_message (parser, 2, "requires QF_AUFBV");
	  parser->required_logic = BTOR_LOGIC_QF_AUFBV;
	}

      push_input (parser, symbol->exp);

      /* TODO what about 'symbol->name' back annotation? */
    }
  else
    goto INVALID_SORT;

  return 1;
}

static int
extrafuns (BtorSMTParser * parser, BtorSMTNode * list)
{
  BtorSMTNode * p;

  if (!list || isleaf (list))
    return !btor_perr_smt (parser,
	      "expected non empty list as argument to ':extrafuns'");

  for (p = list; p; p = cdr (p))
    if (!extrafun (parser, car (p)))
      return 0;

  return !parser->error;
}

static int
extrapred (BtorSMTParser * parser, BtorSMTNode * pdecl)
{
  BtorSMTSymbol * symbol;
  BtorSMTNode * node;

  if (!pdecl ||
      isleaf (pdecl) ||
      !isleaf (node = car (pdecl)) ||
      (symbol = strip (node))->token != BTOR_SMTOK_IDENTIFIER)
    return !btor_perr_smt (parser, "invalid predicate declaration");

  if (cdr (pdecl))
    return !btor_perr_smt (parser,
	      "no support for predicate declarations with arguments");

  if (symbol->exp)
    return !btor_perr_smt (parser,
			 "multiple definitions for '%s'",
			 symbol->name);

  symbol->exp = btor_var_exp (parser->btor, 1, symbol->name);
  push_input (parser, symbol->exp);

  return 1;
}

static int
extrapreds (BtorSMTParser * parser, BtorSMTNode * list)
{
  BtorSMTNode * p;

  if (!list || isleaf (list))
    return !btor_perr_smt (parser,
	      "expected non empty list as argument to ':extrapreds'");

  for (p = list; p; p = cdr (p))
    if (!extrapred (parser, car (p)))
      return 0;

  return !parser->error;
}

static BtorSMTToken
node2token (BtorSMTNode * node)
{
  return (node && isleaf (node)) ? strip (node)->token : BTOR_SMTOK_ERR;
}

static int
is_let_or_flet (BtorSMTNode * node)
{
  int token = node2token (node);
  return token == BTOR_SMTOK_LET || token == BTOR_SMTOK_FLET;
}

static BtorNode *
node2exp (BtorSMTParser * parser, BtorSMTNode * node)
{
  const char * p, * start, * end;
  char * tmp, * extended, ch;
  BtorSMTSymbol * symbol;
  int len, tlen, token;

  if (isleaf (node))
    {
      symbol = strip (node);
      if (symbol->exp)
	return symbol->exp;

      token = symbol->token;
      if (token == BTOR_SMTOK_TRUE || token == BTOR_SMTOK_BIT1)
	return symbol->exp = btor_const_exp (parser->btor, "1");

      if (token == BTOR_SMTOK_FALSE || token == BTOR_SMTOK_BIT0)
	return symbol->exp = btor_const_exp (parser->btor, "0");

      p = symbol->name;
      if (*p++ == 'b' && *p++ == 'v')
	{
	  if (isdigit (*p))
	    {
	      start = p++;
	      for (end = p; isdigit (*end); end++)
		;

	      if (*end == '[')
		{
		  for (p = end + 1; isdigit (*p); p++)
		    ;

		  if (*p == ']')
		    {
		      len = atoi (end + 1);
		      if (len)
			{
			  tmp = btor_decimal_to_const_n (
				  parser->mem, start, end - start);

			  tlen = (int) strlen (tmp);

			  if (tlen <= len)
			    {
			      if (tlen < len)
				{
				  extended =
				    btor_uext_const (
				      parser->mem, tmp, len - tlen);

				  btor_delete_const (parser->mem, tmp);
				  tmp = extended;
				}

			      symbol->exp = btor_const_exp (parser->btor, tmp);
			      parser->constants++;
			    }

			  btor_delete_const (parser->mem, tmp);
			}
		    }
		}
	    }
	  else if (*p == 'b')
	    {
	      if (*++p == 'i' && *++p == 'n')
		{
		  for (start = ++p; (ch = *p) == '0' || ch == '1'; p++)
		    ;

		  if (start < p && !*p)
		    {
		      symbol->exp = btor_const_exp (parser->btor, start);
		      parser->constants++;
		    }
		}
	    }
	  else if (*p++ == 'h' && *p++ == 'e' && *p++ == 'x')
	    {
	      for (start = p; isxdigit (*p); p++)
		;

	      if (start < p && !*p)
		{
		  len = 4 * (p - start);
		  tmp = btor_hex_to_const (parser->mem, start);
		  tlen = (int) strlen (tmp);
		  assert (tlen <= len);
		  if (tlen < len)
		    {
		      extended = btor_uext_const (parser->mem,
						  tmp, len - tlen);
		      btor_delete_const (parser->mem, tmp);
		      tmp = extended;
		    }
		  symbol->exp = btor_const_exp (parser->btor, tmp);
		  btor_delete_const (parser->mem, tmp);
		  parser->constants++;
		}
	    }
	  else
	    {
	      /* DO NOT ADD ANYTHING HERE BECAUSE 'p' CHANGED */
	    }
	}

      if (symbol->exp)
	return symbol->exp;

      (void) btor_perr_smt (parser, "'%s' undefined", strip (node)->name);
      return 0;
    }
  else
    {
      assert (node->exp);
      return node->exp;
    }

  return 0;
}

static BtorNode *
node2nonarrayexp (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorNode * res;

  res = node2exp (parser, node);
  if (res && btor_is_array_exp (parser->btor, res))
    {
      (void) btor_perr_smt (parser, "unexpected array argument");
      res = 0;
    }

  return res;
}

static void
translate_node (BtorSMTParser * parser, BtorSMTNode * node, BtorNode * exp)
{
  (void) parser;
  assert (!isleaf (node));
  assert (!node->exp);
  node->exp = exp;
}

static void
translate_symbol (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorSMTNode * c;
  BtorNode * a;

  assert (!node->exp);
  if (!is_list_of_length (node, 1))
    {
      (void) btor_perr_smt (parser, "symbolic head with argument");
      return;
    }

  c = car (node);
  if ((a = node2nonarrayexp (parser, c)))
    translate_node (parser, node, btor_copy_exp (parser->btor, a));
}

static void
translate_unary (BtorSMTParser * parser,
		 BtorSMTNode * node, const char * name,
		 BtorNode * (*f)(Btor *, BtorNode *))
{
  BtorSMTNode * c;
  BtorNode * a;

  assert (!node->exp);

  if (!is_list_of_length (node, 2))
    {
      (void) btor_perr_smt (parser,
			    "expected exactly one argument to '%s'",
			    name);
      return;
    }

  c = car (cdr (node));
  if ((a = node2nonarrayexp (parser, c)))
    translate_node (parser, node, f (parser->btor, a));
}

static void
translate_binary (BtorSMTParser * parser,
		  BtorSMTNode * node, const char * name,
		  BtorNode * (*f)(Btor *, BtorNode *, BtorNode *))
{
  BtorSMTNode * c0, * c1;
  BtorNode * a0, * a1;

  assert (!node->exp);

  if (!is_list_of_length (node, 3))
    {
      (void) btor_perr_smt (parser,
			  "expected exactly two arguments to '%s'", name);
      return;
    }

  c0 = car (cdr (node));
  c1 = car (cdr (cdr (node)));

  if ((a0 = node2nonarrayexp (parser, c0)))
    if ((a1 = node2nonarrayexp (parser, c1)))
      {
	if (btor_get_exp_len (parser->btor, a0) !=
	    btor_get_exp_len (parser->btor, a1))
	  (void) btor_perr_smt (parser, "expression width mismatch");
	else
	  translate_node (parser, node, f (parser->btor, a0, a1));
      }
}

static void
translate_eq (BtorSMTParser * parser, BtorSMTNode * node)
{
  int isarray0, isarray1, len0, len1;
  BtorSMTNode * c0, * c1;
  BtorNode * a0, * a1;

  assert (!node->exp);

  if (!is_list_of_length (node, 3))
    {
      (void) btor_perr_smt (parser, "expected exactly two arguments to '='");
      return;
    }

  c0 = car (cdr (node));
  a0 = node2exp (parser, c0);
  if (!a0)
    return;

  c1 = car (cdr (cdr (node)));
  a1 = node2exp (parser, c1);
  if (!a1)
    return;

  len0 = btor_get_exp_len (parser->btor, a0);
  len1 = btor_get_exp_len (parser->btor, a1);

  if (len0 != len1)
    {
      (void) btor_perr_smt (parser, "expression width mismatch in '='");
      return;
    }

  isarray0 = btor_is_array_exp (parser->btor, a0);
  isarray1 = btor_is_array_exp (parser->btor, a1);

  if (isarray0 != isarray1)
    {
      (void) btor_perr_smt (parser,
			  "'=' between array and non array expression");
      return;
    }

  if (isarray0 && isarray1)
    {
      len0 = btor_get_index_exp_len (parser->btor, a0);
      len1 = btor_get_index_exp_len (parser->btor, a1);

      if (len0 != len1)
	{
	  (void) btor_perr_smt (parser, "index width mismatch in '='");
	  return;
	}
    }

  assert (!parser->error);
  translate_node (parser, node, btor_eq_exp (parser->btor, a0, a1));
}

static void
translate_associative_binary (BtorSMTParser * parser,
			      BtorSMTNode * node, const char * name,
			      BtorNode * (*f)(Btor *,
					     BtorNode *, BtorNode *))
{
  BtorNode * res, * tmp, * exp;
  BtorSMTNode * child, * p;
  int len;

  assert (!node->exp);

  child = car (cdr (node));

  if (!(exp = node2nonarrayexp (parser, child)))
    {
CHECK_FOR_PARSE_ERROR_AND_RETURN:
      assert (parser->error);
      return;
    }

  len = btor_get_exp_len (parser->btor, exp);
  res = btor_copy_exp (parser->btor, exp);

  for (p = cdr (cdr (node)); p; p = cdr (p))
    {
      child = car (p);
      if (!(exp = node2nonarrayexp (parser, child)))
	{
RELEASE_RES_CHECK_FOR_PARSE_ERROR_AND_RETURN:
	  btor_release_exp (parser->btor, res);
	  assert (parser->error);
	  goto CHECK_FOR_PARSE_ERROR_AND_RETURN;
	}

      if (btor_get_exp_len (parser->btor, exp) != len)
	{
	  btor_perr_smt (parser, "mismatched width of arguments of '%s'", name);
	  goto RELEASE_RES_CHECK_FOR_PARSE_ERROR_AND_RETURN;
	}

      tmp = f (parser->btor, res, exp);         /* left associative ? */
      btor_release_exp (parser->btor, res);
      res = tmp;
    }

  translate_node (parser, node, res);
}

static void
translate_cond (BtorSMTParser * parser, BtorSMTNode * node, const char * name)
{
  int isarray1, isarray2, len1, len2;
  BtorSMTNode * c0, * c1, * c2;
  BtorNode * a0, * a1, * a2;

  assert (!node->exp);

  if (!is_list_of_length (node, 4))
    {
      (void) btor_perr_smt (parser,
			  "expected exactly three arguments to '%s'", name);
      return;
    }

  c0 = car (cdr (node));
  c1 = car (cdr (cdr (node)));
  c2 = car (cdr (cdr (cdr (node))));

  a0 = node2nonarrayexp (parser, c0);
  if (!a0)
    return;

  if (btor_get_exp_len (parser->btor, a0) != 1)
    {
      (void) btor_perr_smt (parser, "non boolean conditional");
      return;
    }

  a1 = node2exp (parser, c1);
  if (!a1)
    return;

  a2 = node2exp (parser, c2);
  if (!a2)
    return;

  len1 = btor_get_exp_len (parser->btor, a1);
  len2 = btor_get_exp_len (parser->btor, a2);

  if (len1 != len2)
    {
      (void) btor_perr_smt (parser, "expression width mismatch in conditional");
      return;
    }

  isarray1 = btor_is_array_exp (parser->btor, a1);
  isarray2 = btor_is_array_exp (parser->btor, a2);

  if (isarray1 != isarray2)
    {
      (void) btor_perr_smt (parser,
		      "conditional between array and non array expression");
      return;
    }

  if (isarray1 && isarray2)
    {
      len1 = btor_get_index_exp_len (parser->btor, a1);
      len2 = btor_get_index_exp_len (parser->btor, a2);

      if (len1 != len2)
	{
	  (void) btor_perr_smt (parser, "index width mismatch in conditional");
	  return;
	}
    }

  translate_node (parser, node, btor_cond_exp (parser->btor, a0, a1, a2));
}

static void
translate_extract (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorSMTSymbol * symbol;
  int upper, lower, len;
  const char * p;
  BtorNode * exp;

  assert (!node->exp);

  symbol = strip (car (node));
  assert (symbol->token == BTOR_SMTOK_EXTRACT);
  p = symbol->name;

  if (!is_list_of_length (node, 2))
    {
      (void) btor_perr_smt (parser, "expected exactly one argument to '%s'", p);
      return;
    }

  if (!(exp = node2nonarrayexp (parser, car (cdr (node)))))
    {
      assert (parser->error);
      return;
    }

  len = btor_get_exp_len (parser->btor, exp);

  p = next_numeral (p);
  assert (p);
  upper = atoi (p);             /* TODO Overflow? */
  p = next_numeral (p);
  lower = atoi (p);             /* TODO Overflow? */
  assert (!next_numeral (p));

  if (len <= upper || upper < lower)
    {
      (void) btor_perr_smt (parser,
			  "invalid '%s' on expression of width %d",
			  p, len);
      return;
    }

  translate_node (parser, node,
		  btor_slice_exp (parser->btor, exp, upper, lower));
}

static void
translate_repeat (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorNode * tmp, * exp, * res;
  BtorSMTSymbol * symbol;
  const char * p;
  int i, count;

  assert (!node->exp);

  symbol = strip (car (node));
  assert (symbol->token == BTOR_SMTOK_REPEAT);

  p = symbol->name;

  if (!is_list_of_length (node, 2))
    {
      (void) btor_perr_smt (parser, "expected exactly one argument to '%s'", p);
      return;
    }

  if (!(exp = node2nonarrayexp (parser, car (cdr (node)))))
    {
      assert (parser->error);
      return;
    }

  p = next_numeral (p);
  assert (p);
  assert (!next_numeral (p));
  count = atoi (p);             /* TODO Overflow? */

  if (!count)
    {
      (void) btor_perr_smt (parser, "can not handle 'repeat[0]'");
      return;
    }

  res = btor_copy_exp (parser->btor, exp);

  for (i = 1; i < count; i++)
    {
      tmp = btor_concat_exp (parser->btor, exp, res);
      btor_release_exp (parser->btor, res);
      res = tmp;
    }

  translate_node (parser, node, res);
}

static void
translate_extend (BtorSMTParser * parser,
		  BtorSMTNode * node,
		  BtorNode * (*f)(Btor *, BtorNode *, int))
{
  BtorSMTSymbol * symbol;
  const char * p;
  BtorNode * exp;
  int pad;

  assert (!node->exp);

  symbol = strip (car (node));
  p = symbol->name;

  if (!is_list_of_length (node, 2))
    {
      (void) btor_perr_smt (parser, "expected exactly one argument to '%s'", p);
      return;
    }

  if (!(exp = node2nonarrayexp (parser, car (cdr (node)))))
    {
      assert (parser->error);
      return;
    }

  p = next_numeral (p);
  assert (p);
  assert (!next_numeral (p));
  pad = atoi (p);               /* TODO Overflow? */

  translate_node (parser, node, f (parser->btor, exp, pad));
}

static void
translate_rotate (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorNode * exp, * l, * r;
  BtorSMTSymbol * symbol;
  int shift, token, len;
  const char * p;

  assert (!node->exp);

  symbol = strip (car (node));
  token = symbol->token;
  assert (token == BTOR_SMTOK_ROTATE_LEFT || token == BTOR_SMTOK_ROTATE_RIGHT);

  p = symbol->name;

  if (!is_list_of_length (node, 2))
    {
      (void) btor_perr_smt (parser, "expected exactly one argument to '%s'", p);
      return;
    }

  if (!(exp = node2nonarrayexp (parser, car (cdr (node)))))
    {
      assert (parser->error);
      return;
    }

  p = next_numeral (p);
  assert (p);
  assert (!next_numeral (p));
  shift = atoi (p);             /* TODO Overflow? */
  assert (shift >= 0);

  len = btor_get_exp_len (parser->btor, exp);
  assert (len > 0);
  shift %= len;

  if (shift)
    {
      if (token == BTOR_SMTOK_ROTATE_LEFT)
	shift = len - shift;

      assert (1 <= shift && shift < len);

      l = btor_slice_exp (parser->btor, exp, shift - 1, 0);
      r = btor_slice_exp (parser->btor, exp, len - 1, shift);

      translate_node (parser, node, btor_concat_exp (parser->btor, l, r));
      assert (btor_get_exp_len (parser->btor, node->exp) == len);

      btor_release_exp (parser->btor, l);
      btor_release_exp (parser->btor, r);
    }
  else
    translate_node (parser, node, btor_copy_exp (parser->btor, exp));
}

static void
translate_concat (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorSMTNode * c0, * c1;
  BtorNode * a0, * a1;

  assert (!node->exp);

  if (!is_list_of_length (node, 3))
    {
      (void) btor_perr_smt (parser,
			  "expected exactly two arguments to 'concat'");
      return;
    }

  c0 = car (cdr (node));
  c1 = car (cdr (cdr (node)));

  if ((a0 = node2nonarrayexp (parser, c0)))
    if ((a1 = node2nonarrayexp (parser, c1)))
      translate_node (parser, node, btor_concat_exp (parser->btor, a0, a1));
}

static void
translate_shift (BtorSMTParser * parser,
		 BtorSMTNode * node, const char * name,
		 BtorNode * (*f)(Btor *, BtorNode *, BtorNode *))
{
  BtorNode * a0, * a1, * c, * e, * t, * e0, * u, * l, * tmp;
  int len, l0, l1, p0, p1;
  BtorSMTNode * c0, * c1;

  assert (!node->exp);

  if (!is_list_of_length (node, 3))
    {
      (void) btor_perr_smt (parser,
			  "expected exactly two arguments to '%s'", name);
      return;
    }

  c0 = car (cdr (node));
  c1 = car (cdr (cdr (node)));

  if (!(a0 = node2nonarrayexp (parser, c0)))
    {
      assert (parser->error);
      return;
    }

  if (!(a1 = node2nonarrayexp (parser, c1)))
    {
      assert (parser->error);
      return;
    }

  len = btor_get_exp_len (parser->btor, a0);

  if (len != btor_get_exp_len (parser->btor, a1))
    {
      (void) btor_perr_smt (parser, "expression width mismatch");
      return;
    }

  l1 = 0;
  for (l0 = 1; l0 < len; l0 *= 2)
    l1++;

  assert (l0 == (1 << l1));

  if (len == 1)
    {
      assert (l0 == 1);
      assert (l1 == 0);

      if (f == btor_sra_exp)
	translate_node (parser, node, btor_copy_exp (parser->btor, a0));
      else
	{
	  tmp = btor_not_exp (parser->btor, a1);
	  translate_node (parser, node,
			  btor_and_exp (parser->btor, a0, tmp));
	  btor_release_exp (parser->btor, tmp);
	}
    }
  else
    {
      assert (len >= 1);

      p0 = l0 - len;
      p1 = len - l1;

      assert (p0 >= 0);
      assert (p1 > 0);

      u = btor_slice_exp (parser->btor, a1, len - 1, len - p1);
      l = btor_slice_exp (parser->btor, a1, l1 - 1, 0);

      assert (btor_get_exp_len (parser->btor, u) == p1);
      assert (btor_get_exp_len (parser->btor, l) == l1);

      if (p1 > 1)
	c = btor_redor_exp (parser->btor, u);
      else
	c = btor_copy_exp (parser->btor, u);

      btor_release_exp (parser->btor, u);

      if (f == btor_sra_exp)
	{
	  tmp = btor_slice_exp (parser->btor, a0, len - 1, len - 1);
	  t = btor_sext_exp (parser->btor, tmp, len - 1);
	  btor_release_exp (parser->btor, tmp);
	}
      else
	t = btor_zero_exp (parser->btor, len);

      if (!p0)
	e0 = btor_copy_exp (parser->btor, a0);
      else if (f == btor_sra_exp)
	e0 = btor_sext_exp (parser->btor, a0, p0);
      else
	e0 = btor_uext_exp (parser->btor, a0, p0);

      assert (btor_get_exp_len (parser->btor, e0) == l0);

      e = f (parser->btor, e0, l);
      btor_release_exp (parser->btor, e0);
      btor_release_exp (parser->btor, l);

      if (p0 > 0)
	{
	  tmp = btor_slice_exp (parser->btor, e, len - 1, 0);
	  btor_release_exp (parser->btor, e);
	  e = tmp;
	}

      translate_node (parser, node, btor_cond_exp (parser->btor, c, t, e));

      btor_release_exp (parser->btor, c);
      btor_release_exp (parser->btor, t);
      btor_release_exp (parser->btor, e);
    }
}

static void
translate_select (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorSMTNode * c0, * c1;
  BtorNode * a0, * a1;

  assert (!node->exp);

  if (!is_list_of_length (node, 3))
    {
      (void) btor_perr_smt (parser,
			  "expected exactly two arguments to 'select'");
      return;
    }

  c0 = car (cdr (node));
  c1 = car (cdr (cdr (node)));

  if (!(a0 = node2exp (parser, c0)))
    {
      assert (parser->error);
      return;
    }

  if (!btor_is_array_exp (parser->btor, a0))
    {
      (void) btor_perr_smt (parser, "invalid first argument to 'select'");
      return;
    }

  if (!(a1 = node2nonarrayexp (parser, c1)))
    {
      assert (parser->error);
      return;
    }

  if (btor_get_index_exp_len (parser->btor, a0) !=
      btor_get_exp_len (parser->btor, a1))
    {
      (void) btor_perr_smt (parser, "mismatched bit width of 'select' index");
      return;
    }

  translate_node (parser, node, btor_read_exp (parser->btor, a0, a1));
}

static void
translate_store (BtorSMTParser * parser, BtorSMTNode * node)
{
  BtorSMTNode * c0, * c1, * c2;
  BtorNode * a0, * a1, * a2;

  assert (!node->exp);

  if (!is_list_of_length (node, 4))
    {
      (void) btor_perr_smt (parser,
			  "expected exactly three arguments to 'store'");
      return;
    }

  c0 = car (cdr (node));
  c1 = car (cdr (cdr (node)));
  c2 = car (cdr (cdr (cdr (node))));

  if (!(a0 = node2exp (parser, c0)))
    {
      assert (parser->error);
      return;
    }

  if (!btor_is_array_exp (parser->btor, a0))
    {
      (void) btor_perr_smt (parser, "invalid first argument to 'store'");
      return;
    }

  if (!(a1 = node2nonarrayexp (parser, c1)))
    {
      assert (parser->error);
      return;
    }

  if (btor_get_index_exp_len (parser->btor, a0) !=
      btor_get_exp_len (parser->btor, a1))
    {
      (void) btor_perr_smt (parser, "mismatched bit width of 'store' index");
      return;
    }

  if (!(a2 = node2nonarrayexp (parser, c2)))
    {
      assert (parser->error);
      return;
    }

  if (btor_get_exp_len (parser->btor, a2) !=
      btor_get_exp_len (parser->btor, a0))
    {
      (void) btor_perr_smt (parser, "mismatched bit width of 'store' value");
      return;
    }

  translate_node (parser, node, btor_write_exp (parser->btor, a0, a1, a2));
}

static BtorNode *
translate_formula (BtorSMTParser * parser, BtorSMTNode * root)
{
  BtorSMTNode * node, * child, * p, ** s, ** t, * tmp;
  BtorSMTNode * assignment, * body;
  BtorSMTSymbol * symbol;
  BtorSMTToken token;
  int start, end;
  BtorNode * exp;

  assert (BTOR_EMPTY_STACK (parser->work));
  assert (BTOR_EMPTY_STACK (parser->stack));

  assert (root);
  BTOR_PUSH_STACK (parser->mem, parser->stack, root);

  while (!BTOR_EMPTY_STACK (parser->stack))
    {
      node = BTOR_POP_STACK (parser->stack);

      if (node)
	{
	  if (isleaf (node))
	    {
	      /* DO NOTHING HERE */
	    }
	  else if (car (node) == parser->bind)
	    {
	      BTOR_PUSH_STACK (parser->mem, parser->work, node);
	    }
	  else if (is_let_or_flet (car (node)))
	    {
	      /* node       == ([f]let assignment body)
	       * assignment == (var term)
	       */
	      if (!cdr (node) ||
		  !(assignment = car (cdr (node))) ||
		  isleaf (assignment) ||
		  !(token = node2token (car (assignment))) ||
		  (token != BTOR_SMTOK_FVAR && token != BTOR_SMTOK_VAR) ||
		  !cdr (assignment) ||
		  cdr (cdr (assignment)) ||
		  !cdr (cdr (node)) ||
		  cdr (cdr (cdr (node))))
		return btor_perr_smt (parser, "illformed 'let' or 'flet'"),
		       (BtorNode*) 0;

	      body = car (cdr (cdr (node)));

	      BTOR_PUSH_STACK (parser->mem, parser->stack, node);
	      BTOR_PUSH_STACK (parser->mem, parser->stack, 0);

	      BTOR_PUSH_STACK (parser->mem, parser->stack, body);

	      BTOR_PUSH_STACK (parser->mem, parser->stack,
			       cons (parser, parser->bind, assignment));

	      BTOR_PUSH_STACK (parser->mem,
			       parser->stack, car (cdr (assignment)));
	    }
	  else
	    {
	      BTOR_PUSH_STACK (parser->mem, parser->stack, node);
	      BTOR_PUSH_STACK (parser->mem, parser->stack, 0);

	      start = BTOR_COUNT_STACK (parser->stack);

	      for (p = node; p; p = cdr (p))
		{
		  child = car (p);
		  assert (child);
		  BTOR_PUSH_STACK (parser->mem, parser->stack, child);
		}

	      end = BTOR_COUNT_STACK (parser->stack);

	      if (start < end)
		{
		  s = parser->stack.start + start;
		  t = parser->stack.start + end - 1;

		  while (s < t)
		    {
		      tmp = *s;
		      *s = *t;
		      *t = tmp;

		      s++;
		      t--;
		    }
		}
	    }
	}
      else
	{
	  assert (!BTOR_EMPTY_STACK (parser->stack));

	  node = BTOR_POP_STACK (parser->stack);

	  assert (node);
	  assert (!isleaf (node));

	  BTOR_PUSH_STACK (parser->mem, parser->work, node);
	}
    }

  node = 0;
  for (s = parser->work.start; s < parser->work.top; s++)
    {
      node = *s;

      assert (node);
      assert (!isleaf (node));

      child = car (node);

      if (!child)
	return btor_perr_smt (parser, "empty list"),
	       (BtorNode*) 0;

      if (isleaf (child))
	{
	  symbol = strip (child);

	  switch (symbol->token)
	    {
	      case BTOR_SMTOK_NOT:
		translate_unary (parser, node, "not", btor_not_exp);
		break;
	      case BTOR_SMTOK_AND:
		translate_associative_binary (parser,
					      node, "and", btor_and_exp);
		break;
	      case BTOR_SMTOK_OR:
		translate_associative_binary (parser,
					      node, "or", btor_or_exp);
		break;
	      case BTOR_SMTOK_IMPLIES:
		translate_binary (parser, node, "implies", btor_implies_exp);
		break;
	      case BTOR_SMTOK_XOR:
		translate_associative_binary (parser,
					      node, "xor", btor_xor_exp);
		break;
	      case BTOR_SMTOK_IFF:
		translate_associative_binary (parser,
					      node, "iff", btor_xnor_exp);
		break;

	      case BTOR_SMTOK_EQ:
		translate_eq (parser, node);
		break;

	      case BTOR_SMTOK_DISTINCT:
		translate_binary (parser, node, "distinct", btor_ne_exp);
		break;
	      case BTOR_SMTOK_ITE:
		translate_cond (parser, node, "ite");
		break;
	      case BTOR_SMTOK_IF_THEN_ELSE:
		translate_cond (parser, node, "if_then_else");
		break;
	      case BTOR_SMTOK_BIND:
		assert (cdr (node));
		assert (cdr (cdr (node)));
		assert (!cdr (cdr (cdr (node))));
		assert (isleaf (car (cdr (node))));
		symbol = strip (car (cdr (node)));
		if (symbol->exp)
		  return btor_perr_smt (parser, "unsupported nested '[f]let'"),
			 (BtorNode*) 0;
		body = car (cdr (cdr (node)));
		if ((exp = node2exp (parser, body)))
		  {
		    if (symbol->token == BTOR_SMTOK_FVAR)
		      {
			if (btor_get_exp_len (parser->btor, exp) != 1)
			  {
			    return btor_perr_smt (parser,
				     "flet assignment width not one"),
				   (BtorNode*) 0;
			  }
		      }
		    else
		      assert (symbol->token == BTOR_SMTOK_VAR);

		    assert (!symbol->exp);
		    symbol->exp = btor_copy_exp (parser->btor, exp);
		  }
		/* Prevent leaking of 'bind' nodes.
		 */
		*s = 0;
		btor_delete_smt_node (parser, node);
		break;
	      case BTOR_SMTOK_LET:
	      case BTOR_SMTOK_FLET:
		symbol = strip (car (car (cdr (node))));
		assert (symbol->token == BTOR_SMTOK_FVAR ||
			symbol->token == BTOR_SMTOK_VAR);
		assert (symbol->exp);
		body = car (cdr (cdr (node)));
		if ((exp = node2exp (parser, body)))
		  node->exp = btor_copy_exp (parser->btor, exp);
		btor_release_exp (parser->btor, symbol->exp);
		symbol->exp = 0;
		break;
	      case BTOR_SMTOK_EXTRACT:
		translate_extract (parser, node);
		break;
	      case BTOR_SMTOK_REPEAT:
		translate_repeat (parser, node);
		break;
	      case BTOR_SMTOK_ZERO_EXTEND:
		translate_extend (parser, node, btor_uext_exp);
		break;
	      case BTOR_SMTOK_SIGN_EXTEND:
		translate_extend (parser, node, btor_sext_exp);
		break;
	      case BTOR_SMTOK_ROTATE_RIGHT:
	      case BTOR_SMTOK_ROTATE_LEFT:
		translate_rotate (parser, node);
		break;
	      case BTOR_SMTOK_CONCAT:
		translate_concat (parser, node);
		break;
	      case BTOR_SMTOK_BVNOT:
		translate_unary (parser, node, "bvnot", btor_not_exp);
		break;
	      case BTOR_SMTOK_BVNEG:
		translate_unary (parser, node, "bvneg", btor_neg_exp);
		break;
	      case BTOR_SMTOK_BVADD:
		translate_associative_binary (parser, node, "bvadd",
					      btor_add_exp);
		break;
	      case BTOR_SMTOK_BVSUB:
		translate_binary (parser, node, "bvsub", btor_sub_exp);
		break;
	      case BTOR_SMTOK_BVSDIV:
		translate_binary (parser, node, "bvsdiv", btor_sdiv_exp);
		break;
	      case BTOR_SMTOK_BVUDIV:
		translate_binary (parser, node, "bvudiv", btor_udiv_exp);
		break;
	      case BTOR_SMTOK_BVUREM:
		translate_binary (parser, node, "bvurem", btor_urem_exp);
		break;
	      case BTOR_SMTOK_BVSREM:
		translate_binary (parser, node, "bvsrem", btor_srem_exp);
		break;
	      case BTOR_SMTOK_BVSMOD:
		translate_binary (parser, node, "bvsmod", btor_smod_exp);
		break;
	      case BTOR_SMTOK_BVMUL:
		translate_associative_binary (parser, node, "bvmul",
					      btor_mul_exp);
		break;
	      case BTOR_SMTOK_BVULE:
		translate_binary (parser, node, "bvule", btor_ulte_exp);
		break;
	      case BTOR_SMTOK_BVSLE:
		translate_binary (parser, node, "bvsle", btor_slte_exp);
		break;
	      case BTOR_SMTOK_BVSGT:
		translate_binary (parser, node, "bvsgt", btor_sgt_exp);
		break;
	      case BTOR_SMTOK_BVSGE:
		translate_binary (parser, node, "bvsge", btor_sgte_exp);
		break;
	      case BTOR_SMTOK_BVCOMP:
		translate_binary (parser, node, "bvcomp", btor_eq_exp);
		break;
	      case BTOR_SMTOK_BVULT:
		translate_binary (parser, node, "bvult", btor_ult_exp);
		break;
	      case BTOR_SMTOK_BVUGT:
		translate_binary (parser, node, "bvugt", btor_ugt_exp);
		break;
	      case BTOR_SMTOK_BVUGE:
		translate_binary (parser, node, "bvuge", btor_ugte_exp);
		break;
	      case BTOR_SMTOK_BVSLT:
		translate_binary (parser, node, "bvslt", btor_slt_exp);
		break;
	      case BTOR_SMTOK_BVAND:
		translate_binary (parser, node, "bvand", btor_and_exp);
		break;
	      case BTOR_SMTOK_BVOR:
		translate_binary (parser, node, "bvor", btor_or_exp);
		break;
	      case BTOR_SMTOK_BVXOR:
		translate_binary (parser, node, "bvxor", btor_xor_exp);
		break;
	      case BTOR_SMTOK_BVXNOR:
		translate_binary (parser, node, "bvxnor", btor_xnor_exp);
		break;
	      case BTOR_SMTOK_BVNOR:
		translate_binary (parser, node, "bvnor", btor_nor_exp);
		break;
	      case BTOR_SMTOK_BVNAND:
		translate_binary (parser, node, "bvnand", btor_nand_exp);
		break;
	      case BTOR_SMTOK_BVLSHR:
		translate_shift (parser, node, "bvlshr", btor_srl_exp);
		break;
	      case BTOR_SMTOK_BVASHR:
		translate_shift (parser, node, "bvashr", btor_sra_exp);
		break;
	      case BTOR_SMTOK_BVSHL:
		translate_shift (parser, node, "bvshl", btor_sll_exp);
		break;
	      case BTOR_SMTOK_SELECT:
		translate_select (parser, node);
		break;
	      case BTOR_SMTOK_STORE:
		translate_store (parser, node);
		break;
	      default:
		assert (symbol->token != BTOR_SMTOK_TRANSLATED);
		translate_symbol (parser, node);
		break;
	    }
	}
      else
	{
	  if (is_list_of_length (node, 1))
	    {
	      if ((exp = node2exp (parser, child)))
		translate_node (parser, node,
				btor_copy_exp (parser->btor, exp));
	    }
	  else
	    (void) btor_perr_smt (parser, "invalid list expression");
	}

      if (parser->error)
	return (BtorNode *) 0;
    }

  BTOR_RESET_STACK (parser->work);

  if (!(exp = node2exp (parser, root)))
    {
      assert (parser->error);
      return (BtorNode *) 0;
    }

  if (btor_get_exp_len (parser->btor, exp) != 1)
    return btor_perr_smt (parser, "non boolean formula"), (BtorNode *) 0;

  assert (!parser->error);

  assert (exp);

  return btor_copy_exp (parser->btor, exp);
}

static void
btor_smt_parser_inc_add_release_sat (BtorSMTParser * parser,
				     BtorParseResult *res,
				     BtorNode * exp)
{
  char formula[40];
  int satres, maxformula, checked;
  assert (parser->formulas.checked < parser->formulas.parsed);
  if (parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_INTERVAL)
    {
      maxformula = parser->formulas.checked;
      maxformula += parser->max_window_size - 1;
      if (maxformula >= parser->formulas.parsed)
	maxformula = parser->formulas.parsed - 1;
      sprintf (formula, "%d - %d", parser->formulas.checked, maxformula);
      checked = maxformula - parser->formulas.checked + 1;
    }
  else
    {
      sprintf (formula, "%d", parser->formulas.checked);
      checked = 1;
    }

  if (parser->formulas.checked + 1 == parser->formulas.parsed)
    {
      btor_smt_message (parser, 3,
	"adding last ':formula' %s permanently", formula);
      btor_add_constraint_exp (parser->btor, exp);
    }
  else
    {
      btor_smt_message (parser, 3,
	"adding ':formula' %s as assumption", formula);
      btor_add_assumption_exp (parser->btor, exp);
    }
  btor_release_exp (parser->btor, exp);

  satres = btor_sat_btor (parser->btor);
  if (satres == BTOR_SAT)
    {
      btor_smt_message (parser, 1, "':formula' %s SAT", formula);
      res->result = BTOR_PARSE_SAT_STATUS_SAT;
    }
  else
    {
      assert (satres == BTOR_UNSAT);
      btor_smt_message (parser, 1, "':formula' %s UNSAT", formula);
      if (res->result == BTOR_PARSE_SAT_STATUS_UNKNOWN)
	res->result = BTOR_PARSE_SAT_STATUS_UNSAT;
    }
  if (parser->verbosity >= 2)
    btor_print_stats_btor (parser->btor);

  assert (parser->btor->msgtick == parser->formulas.checked);


  parser->formulas.checked += checked;
  parser->btor->msgtick += checked;

  if (parser->btor->msgtick == parser->formulas.parsed)
    parser->btor->msgtick = -1;
}

static int
continue_parsing (BtorSMTParser * parser, BtorParseResult * res)
{
  if (res->result != BTOR_PARSE_SAT_STATUS_SAT) return 1;
  return parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_BUT_CONTINUE;
}

static BtorNode *
or_and_flush_window (BtorSMTParser * parser)
{
  BtorNode * next, * res, * tmp;

  res = 0;
  while (!BTOR_EMPTY_STACK (parser->window))
    {
      next = BTOR_POP_STACK (parser->window);
      if (res)
	{
	  tmp = btor_or_exp (parser->btor, next, res);
	  btor_release_exp (parser->btor, res);
	  btor_release_exp (parser->btor, next);
	  res = tmp;
	}
      else
	res = next;
    }
  assert (res);
  return res;
}

static char *
translate_benchmark (BtorSMTParser * parser,
		     BtorSMTNode * top,
		     BtorParseResult *res)
{
  int count_window, missing, indepth, lookahead, interval;
  BtorSMTSymbol * symbol, * logic, * benchmark;
  BtorSMTNode * p, * node, * q;
  BtorNode * exp, * next;
  BtorSMTToken status;

  btor_smt_message (parser, 2, "extracting expressions");

  p = top;

  if (!p ||
      !(node = car (p)) ||
      !isleaf (node) ||
      strip (node)->token != BTOR_SMTOK_BENCHMARK)
    return btor_perr_smt (parser, "expected 'benchmark' keyword");

  p = cdr (p);

  if (!p ||
      !(benchmark = car (p)) ||
      !isleaf (benchmark) ||
      strip (benchmark)->token != BTOR_SMTOK_IDENTIFIER)
    return btor_perr_smt (parser, "expected benchmark name");

  benchmark = strip (benchmark);

  btor_smt_message (parser, 2, "benchmark %s", benchmark->name);

  indepth = parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_IN_DEPTH;
  lookahead = parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_LOOK_AHEAD;
  interval = parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_INTERVAL;

  symbol = 0;

  for (p = top; p; p = cdr (p))
    {
      node = car (p);
      if (!isleaf (node))
	continue;

      symbol = strip (node);

      if (symbol->token == BTOR_SMTOK_EXTRASORTS ||
	  symbol->token == BTOR_SMTOK_EXTRAFUNS ||
	  symbol->token == BTOR_SMTOK_EXTRAPREDS ||
	  symbol->token == BTOR_SMTOK_ASSUMPTION ||
	  symbol->token == BTOR_SMTOK_FORMULA)
	return btor_perr_smt (parser, "'%s' before ':logic'", symbol->name);

      if (symbol->token == BTOR_SMTOK_LOGICATTR)
	break;
    }

  if (!p)
    return btor_perr_smt (parser, "no ':logic' attribute found");

  p = cdr (p);
  if (!p)
    return btor_perr_smt (parser, "argument to ':logic' missing");

  node = car (p);
  if (!isleaf (node))
    return btor_perr_smt (parser, "invalid argument to ':logic'");

  logic = strip (node);
  if (!strcmp (logic->name, "QF_BV"))
    res->logic = BTOR_LOGIC_QF_BV;
  else if (!strcmp (logic->name, "QF_AUFBV"))
    res->logic = BTOR_LOGIC_QF_AUFBV;
  else
    return btor_perr_smt (parser, "unsupported logic '%s'", logic->name);

  for (p = top; p; p = cdr (p))
    {
      node = car (p);
      if (!isleaf (node))
	continue;

      symbol = strip (node);
      if (symbol->token == BTOR_SMTOK_STATUS)
	break;
    }

  if (p)
    {
      p = cdr (p);
      if (!p)
	return btor_perr_smt (parser, "argument to ':status' missing");

      node = car (p);
      if (!isleaf (node))
	{
INVALID_STATUS_ARGUMENT:
	  return btor_perr_smt (parser, "invalid ':status' argument");
	}

      symbol = strip (node);
      status = symbol->token;

      if (status == BTOR_SMTOK_SAT)
	res->status = BTOR_PARSE_SAT_STATUS_SAT;
      else if (status == BTOR_SMTOK_UNSAT)
	res->status = BTOR_PARSE_SAT_STATUS_UNSAT;
      else if (status == BTOR_SMTOK_UNKNOWN)
	res->status = BTOR_PARSE_SAT_STATUS_UNKNOWN;
      else
	goto INVALID_STATUS_ARGUMENT;

    }

  for (p = top;
       p && continue_parsing (parser, res);
       p = cdr (p))
    {
      q = p;
      node = car (p);
      if (!isleaf (node))
	goto CONTINUE;

      symbol = strip (node);

      switch (symbol->token)
	{
	  case BTOR_SMTOK_EXTRAFUNS:
	    p = cdr (p);
	    if (!p)
	      return btor_perr_smt (parser,
				  "argument to ':extrafuns' missing");

	    if (!extrafuns (parser, car (p)))
	      {
		assert (parser->error);
		return parser->error;
	      }

	    break;

	  case BTOR_SMTOK_EXTRAPREDS:

	    p = cdr (p);
	    if (!p)
	      return btor_perr_smt (parser,
				  "argument to ':extrapreds' missing");

	    if (!extrapreds (parser, car (p)))
	      {
		assert (parser->error);
		return parser->error;
	      }

	    break;

	  case BTOR_SMTOK_ASSUMPTION:

	    p = cdr (p);
	    if (!p)
	      return btor_perr_smt (parser,
		       "argument to ':assumption' missing");

	    exp = translate_formula (parser, car (p));
	    if (!exp)
	      {
		assert (parser->error);
		return parser->error;
	      }

	    btor_recursively_delete_smt_node (parser, p->head);
	    p->head = 0;

	    if (parser->incremental)
	      {
		btor_smt_message (parser, 3,
		  "adding ':assumption' %d", parser->assumptions.handled);
		btor_add_constraint_exp (parser->btor, exp);
		btor_release_exp (parser->btor, exp);
	      }
	    else
	      {
		BTOR_PUSH_STACK (parser->mem, parser->outputs, exp);
	      }

	    parser->assumptions.handled++;

	    break;

	  case BTOR_SMTOK_FORMULA:

	    p = cdr (p);
	    if (!p)
	      return btor_perr_smt (parser, "argument to ':formula' missing");

	    exp = translate_formula (parser, car (p));
	    if (!exp)
	      {
		assert (parser->error);
		return parser->error;
	      }

	    btor_recursively_delete_smt_node (parser, p->head);
	    p->head = 0;

	    if (!parser->incremental)
	      {
		BTOR_PUSH_STACK (parser->mem, parser->outputs, exp);
	      }
	    else
	    if (indepth || lookahead)
	      {
		count_window = BTOR_COUNT_STACK (parser->window);
		missing = parser->max_window_size - count_window;

		assert (missing >= 0);

		if (!missing ||
		    parser->formulas.checked + 1 == parser->formulas.parsed)
		  {
		    if (indepth)
  btor_smt_message (parser, 3,
    "found last in-depth ':formula' %d at window position %d",
			parser->formulas.handled, count_window);
		    else
  btor_smt_message (parser, 3,
    "saving next ':formula' %d outside of current look-ahead window",
    parser->formulas.handled);

		    BTOR_PUSH_STACK (parser->mem, parser->window, exp);

		    do
		      {
			BTOR_DEQUEUE_STACK (parser->window, next);
			btor_smt_parser_inc_add_release_sat (parser, res, next);
		      }
		    while (indepth &&
			   continue_parsing (parser, res) &&
			   !BTOR_EMPTY_STACK (parser->window));
		  }
		else
		  {
		    btor_smt_message (parser, 3,
	"saving ':formula' %d at window position %d still %d missing",
	parser->formulas.handled, count_window, missing);

		    BTOR_PUSH_STACK (parser->mem, parser->window, exp);
		  }
	      }
	    else if (interval)
	      {
		BTOR_PUSH_STACK (parser->mem, parser->window, exp);

		if (parser->formulas.checked + 1 == parser->formulas.parsed)
		  count_window = missing = 0;
		else
		  {
		    count_window = BTOR_COUNT_STACK (parser->window);
		    missing = parser->max_window_size - count_window;
		  }

		assert (missing >= 0);

		if (missing)
		  btor_smt_message (parser, 3,
      "saving ':formula' %d at window position %d still %d missing",
      parser->formulas.handled, count_window, missing);
		else
		  {
		    next = or_and_flush_window (parser);
		    btor_smt_parser_inc_add_release_sat (parser, res, next);
		  }
	      }
	    else
	      btor_smt_parser_inc_add_release_sat (parser, res, exp);

	    parser->formulas.handled++;

	    break;

	  case BTOR_SMTOK_EXTRASORTS:
	    return btor_perr_smt (parser, "':extrasorts' unsupported");

	  default:
	    break;
	}
CONTINUE:
      for (;;)
	{
	  node = q->head;
	  q->head = 0;
	  btor_recursively_delete_smt_node (parser, node);
	  if (q == p)
	    break;
	  q = cdr (q);
	}
    }

  if (!BTOR_EMPTY_STACK (parser->window))
    {
      assert (parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_WINDOW);
      if ((parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_BUT_CONTINUE) ||
	  res->result != BTOR_PARSE_SAT_STATUS_SAT)
	{
	  btor_smt_message (parser, 1,
  "finished parsing + added all assumptions in incremental window %d mode",
	    parser->max_window_size);
	  btor_smt_message (parser, 1,
  "still need to work on %d remaining unchecked formulas",
	    BTOR_COUNT_STACK (parser->window));
	while (!BTOR_EMPTY_STACK (parser->window) &&
	  ((parser->incremental & BTOR_PARSE_MODE_INCREMENTAL_BUT_CONTINUE) ||
	   res->result != BTOR_PARSE_SAT_STATUS_SAT)) {
	  BtorNode * next;
	  if (interval)
	    {
	      next = or_and_flush_window (parser);
	      assert (BTOR_EMPTY_STACK (parser->window));
	    }
	  else
	    BTOR_DEQUEUE_STACK (parser->window, next);
	  btor_smt_parser_inc_add_release_sat (parser, res, next);
	}
      }
    }

  if (parser->required_logic == BTOR_LOGIC_QF_AUFBV &&
      res->logic == BTOR_LOGIC_QF_BV)
  {
    if (parser->incremental)
      {
	btor_smt_message (parser, 1,
	  "need QF_AUFBV but only QF_BV specified in incremental mode");
	res->logic = BTOR_LOGIC_QF_AUFBV;
      }
    else
      return btor_perr_smt (parser,
	 "need QF_AUFBV but only QF_BV specified in non-incremental mode");
  }

  if (parser->required_logic == BTOR_LOGIC_QF_BV &&
      res->logic == BTOR_LOGIC_QF_AUFBV)
    {
      btor_smt_message (parser, 1,
	"no arrays found: only need QF_BV (even though QF_AUFBV specified)");
      res->logic = BTOR_LOGIC_QF_BV;
    }

  assert (!parser->error);

  return 0;
}

static void
count_assumptions_and_formulas (BtorSMTParser * parser, BtorSMTNode * top)
{
  BtorSMTNode * p, * n;
  BtorSMTSymbol * s;

  parser->formulas.parsed = parser->assumptions.parsed = 0;

  for (p = top; p; p = cdr (p))
    {
      n = car (p);

      if (!isleaf (n))
	continue;

      s = strip (n);

      if (s->token == BTOR_SMTOK_FORMULA)
	parser->formulas.parsed++;

      if (s->token == BTOR_SMTOK_ASSUMPTION)
	parser->assumptions.parsed++;
    }
}

static void
set_last_occurrence_of_symbols (BtorSMTParser * parser, BtorSMTNode * top)
{
  BtorSMTNode * n, * h, * t;
  BtorSMTSymbol * s;
  int occs = 0;

  assert (BTOR_EMPTY_STACK (parser->stack));

  BTOR_PUSH_STACK (parser->mem, parser->stack, top);
  while (!BTOR_EMPTY_STACK (parser->stack))
    {
      n = BTOR_POP_STACK (parser->stack);
      if (isleaf (n))
	continue;

      h = car (n);
      t = cdr (n);

      if (t)
	{
	  assert (!isleaf (t));
	  BTOR_PUSH_STACK (parser->mem, parser->stack, t);
	}

      assert (h);
      if (isleaf (h))
	{
	  s = strip (h);
	  if (s->token == BTOR_SMTOK_IDENTIFIER)
	    {
	      s->last = n;
	      occs++;
	    }
	}
      else
	BTOR_PUSH_STACK (parser->mem, parser->stack, h);
    }

  btor_smt_message (parser, 1, "found %d occurrences of symbols", occs);
}

static const char *
parse (BtorSMTParser * parser, BtorCharStack * prefix,
       FILE * file, const char * name,
       BtorParseResult * res)
{
  BtorSMTNode * node, * top, ** p, ** first;
  BtorSMTToken token;
  const char * err;
  int head;

  assert (!parser->parsed);
  parser->parsed = 1;

  btor_smt_message (parser, 1, "parsing SMT file %s", name);

  parser->name = name;
  parser->nprefix = 0;
  parser->prefix = prefix;
  parser->file = file;
  parser->lineno = 1;
  parser->saved = 0;

  BTOR_CLR (res);

  res->status = BTOR_PARSE_SAT_STATUS_UNKNOWN;
  res->result = BTOR_PARSE_SAT_STATUS_UNKNOWN;

  assert (BTOR_EMPTY_STACK (parser->stack));
  assert (BTOR_EMPTY_STACK (parser->heads));

NEXT_TOKEN:

  token = nextok (parser);

  if (token == BTOR_SMTOK_LP)
    {
      head = BTOR_COUNT_STACK (parser->stack);
      BTOR_PUSH_STACK (parser->mem, parser->heads, head);
      goto NEXT_TOKEN;
    }

  if (token == BTOR_SMTOK_RP)
    {
      if (BTOR_EMPTY_STACK (parser->heads))
	return btor_perr_smt (parser, "too many closing ')'");

      node = 0;
      head = BTOR_POP_STACK (parser->heads);
      assert (head <= BTOR_COUNT_STACK (parser->stack));
      first = parser->stack.start + head;
      p = parser->stack.top;
      while (first < p)
	node = cons (parser, *--p, node);

      parser->stack.top = first;
      BTOR_PUSH_STACK (parser->mem, parser->stack, node);

      if (!BTOR_EMPTY_STACK (parser->heads))
	goto NEXT_TOKEN;

      token = nextok (parser);
      if (token != BTOR_SMTOK_EOF)
	return btor_perr_smt (parser, "expected EOF");

      assert (BTOR_COUNT_STACK (parser->stack) == 1);
      top = parser->stack.start[0];
      BTOR_RESET_STACK (parser->stack);

      btor_smt_message (parser, 2, "read %llu bytes", parser->bytes);
      btor_smt_message (parser, 2, "found %u symbols", parser->symbols);
      btor_smt_message (parser, 2, "generated %u nodes", parser->nodes);

      count_assumptions_and_formulas (parser, top);

      btor_smt_message (parser, 1, "found %d assumptions",
			parser->assumptions.parsed);

      btor_smt_message (parser, 1, "found %d formulas",
			parser->formulas.parsed);

      set_last_occurrence_of_symbols (parser, top);

      err = translate_benchmark (parser, top, res);
      btor_recursively_delete_smt_node (parser, top);

      if (err)
	{
	  assert (parser->error);
	  return parser->error;
	}

      btor_smt_message (parser, 2, "found %u constants", parser->constants);

      res->inputs = parser->inputs.start;
      res->ninputs = BTOR_COUNT_STACK (parser->inputs);

      res->noutputs = BTOR_COUNT_STACK (parser->outputs);
      res->outputs = parser->outputs.start;

      return 0;         /* DONE */
    }

  if (token == BTOR_SMTOK_ERR)
    {
      assert (parser->error);
      return parser->error;
    }

  if (token == BTOR_SMTOK_EOF)
    return btor_perr_smt (parser, "unexpected EOF");

  if (BTOR_EMPTY_STACK (parser->heads))
    return btor_perr_smt (parser, "expected '('");

  assert (parser->symbol);
  BTOR_PUSH_STACK (parser->mem, parser->stack, leaf (parser->symbol));

  goto NEXT_TOKEN;
}

static const char *
btor_parse_smt_parser (BtorSMTParser * parser, BtorCharStack * prefix,
		       FILE * file, const char * name,
		       BtorParseResult * res)
{
  (void) parse (parser, prefix, file, name, res);
  btor_release_smt_internals (parser);
  return parser->error;
}

static BtorParserAPI static_btor_smt_parser_api =
{
  (BtorInitParser) btor_new_smt_parser,
  (BtorResetParser) btor_delete_smt_parser,
  (BtorParse) btor_parse_smt_parser,
};

const BtorParserAPI *
btor_smt_parser_api () {
  return &static_btor_smt_parser_api;
}
