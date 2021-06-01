/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2013 Christian Reisenberger.
 *  Copyright (C) 2013 Aina Niemetz.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 */

#include "boolector.h"
#include "btorhash.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>
#include <stdarg.h>
#include <ctype.h>
#include <signal.h>

static int verbose, exitonabort, lineno, skip, ignore_sat;
static const char *name;

/*------------------------------------------------------------------------*/

static void
die (const char *fmt, ...)
{
  va_list ap;
  fputs ("*** btoruntrace: ", stderr);
  va_start (ap, fmt);
  vfprintf (stderr, fmt, ap);
  va_end (ap);
  fputc ('\n', stderr);
  fflush (stderr);
  exit (1);
}

static void
perr (const char *fmt, ...)
{
  va_list ap;
  fprintf (stderr, "*** btoruntrace: parse error in '%s' line %d: ", name,
	   lineno);
  va_start (ap, fmt);		//TODO recheck again
  vfprintf (stderr, fmt, ap);
  va_end (ap);
  fputc ('\n', stderr);
  fflush (stderr);
  exit (1);
}

static void
msg (const char *fmt, ...)
{
  va_list ap;
  if (!verbose)
    return;
  fputs ("c [btoruntrace] ", stdout);
  va_start (ap, fmt);
  vprintf (fmt, ap);
  va_end (ap);
  fputc ('\n', stdout);
  fflush (stdout);
}

/*------------------------------------------------------------------------*/

static int
isnumstr (const char *str)
{
  const char *p;
  int ch;
  if (*(p = str) == '-')
    p++;
  if (!isdigit (*p++))
    return 0;
  while (isdigit (ch = *p))
    p++;
  return !ch;
}

void
checklastarg (char *op)
{
  if (strtok (0, " "))
    {
      perr ("to many arguments for '%s'", op);
    }
}

static int
intarg (char *op)
{
  const char *tok;
  if (!(tok = strtok (0, " ")) || !isnumstr (tok))
    {
      perr ("expected integer argument for '%s'", op);
    }
  assert (tok);
  return atoi (tok);
}

static char *
strarg (char *op)
{
  char *tok;
  if (!(tok = strtok (0, " ")))
    {
      perr ("expected string argument for '%s'", op);
    }
  return tok;
}

#define PARSE_ARGS0(op) \
  checklastarg(op);

#define PARSE_ARGS1(op, type1) \
  arg1_ ## type1 = type1 ## arg(op); \
  checklastarg(op);

#define PARSE_ARGS2(op, type1, type2) \
  arg1_ ## type1 = type1 ## arg(op); \
  arg2_ ## type2 = type2 ## arg(op); \
  checklastarg(op);

#define PARSE_ARGS3(op, type1, type2, type3) \
  arg1_ ## type1 = type1 ## arg(op); \
  arg2_ ## type2 = type2 ## arg(op); \
  arg3_ ## type3 = type3 ## arg(op); \
  checklastarg(op);

/*------------------------------------------------------------------------*/


static void *
hmap_get (BtorPtrHashTable * hmap, char *key)
{
  assert (key);
  BtorPtrHashBucket *bucket = btor_find_in_ptr_hash_table (hmap, key);
  if (!bucket)
    die ("expression '%s' is not hashed", key);
  assert (bucket);
  return bucket->data.asPtr;
}

static void
hmap_add (BtorPtrHashTable * hmap, char *key, void *value)
{
  BtorPtrHashBucket *bucket = btor_find_in_ptr_hash_table (hmap, key);
  if (!bucket)
    {
      char *key_cp;
      BTOR_NEWN (hmap->mem, key_cp, (strlen (key) + 1));
      strcpy (key_cp, key);
      bucket = btor_insert_in_ptr_hash_table (hmap, key_cp);
    }
  assert (bucket);
  bucket->data.asPtr = value;
}

static void
hmap_clear (BtorPtrHashTable * hmap)
{
  BtorPtrHashBucket *bucket = hmap->first;
  while (bucket)
    {
      char *key = (char *) bucket->key;
      btor_remove_from_ptr_hash_table (hmap, key, NULL, NULL);
      BTOR_DELETEN (hmap->mem, key, (strlen (key) + 1));
      bucket = hmap->first;
    }
}

/*------------------------------------------------------------------------*/

#define RET_NONE    0
#define RET_VOIDPTR 1
#define RET_INT     2
#define RET_CHARPTR 3
#define RET_ARRASS  4
#define RET_SKIP   -1

void
parse (FILE * file)
{
  int i, ch;
  int exp_ret;
  int arg1_int, arg2_int, arg3_int, ret_int;
  char *arg1_str, *arg2_str, *arg3_str, *ret_str, *exp_str;
  char **res1_pptr, **res2_pptr;;
  size_t len;
  char buffer[200], *tok;
  Btor *btor;
  void *ret_ptr;
  BtorNode **tmp;
  BtorPtrHashTable *hmap;
  BtorMemMgr *mm;


  msg ("reading %s", name);
  exp_ret = RET_NONE;
  ret_ptr = 0, ret_str = 0;
  buffer[len = 0] = 0;
  lineno = 1;
  arg2_int = 0;
  btor = 0;
  mm = btor_new_mem_mgr ();
  hmap = btor_new_ptr_hash_table (mm,
				  (BtorHashPtr) btor_hashstr,
				  (BtorCmpPtr) strcmp);

NEXT:
  ch = getc (file);
  if (ch == EOF)
    goto DONE;
  if (ch == '\r')
    goto NEXT;
  if (ch != '\n')
    {
      if (len + 1 >= sizeof (buffer))
	perr ("line buffer exceeded");
      buffer[len++] = ch;
      buffer[len] = 0;
      goto NEXT;
    }
  msg ("line %d : %s", lineno, buffer);

  /* NOTE take care of c function parameter evaluation order with more 
   * than 1 argument */
  if (!(tok = strtok (buffer, " ")))
    perr ("empty line");
  else if (exp_ret)
    {
      if (!strcmp (tok, "return"))
	{
	  if (exp_ret == RET_VOIDPTR)
	    {
	      exp_str = strarg ("return");
	      checklastarg ("return");
	      hmap_add (hmap, exp_str, ret_ptr);
	    }
	  else if (exp_ret == RET_INT)
	    {
	      int exp_int = intarg ("return");
	      checklastarg ("return");
	      if (exp_int != ret_int)
		die ("expected return value %d but got %d", exp_int, ret_int);
	    }
	  else if (exp_ret == RET_CHARPTR)
	    {
	      exp_str = strarg ("return");
	      checklastarg ("return");
	      if (strcmp (exp_str, ret_str))
		die ("expected return string %s but got %s", exp_str,
		     ret_str);
	    }
	  else if (exp_ret == RET_ARRASS)
	    {
	      assert (res1_pptr);
	      assert (res2_pptr);
	      PARSE_ARGS3 (tok, str, str, int);
	      hmap_add (hmap, arg1_str, res1_pptr);
      	      hmap_add (hmap, arg2_str, res2_pptr);
	      if (arg3_int != ret_int)
		die ("expected return value %d but got %d", arg2_int, ret_int);
	    }
	  else
	    assert (exp_ret == RET_SKIP);
	}
      else
	{
	  perr ("return expected");
	}
      exp_ret = RET_NONE;
    }
  else if (!strcmp (tok, "new"))
    {
      PARSE_ARGS0 (tok);
      btor = boolector_new ();
    }
  else if (!strcmp (tok, "clone"))
    {
      perr ("TODO!!! not implemented");
    }
  else if (!strcmp (tok, "enable_model_gen"))
    {
      PARSE_ARGS0 (tok);
      boolector_enable_model_gen (btor);
    }
  else if (!strcmp (tok, "enable_inc_usage"))
    {
      PARSE_ARGS0 (tok);
      boolector_enable_inc_usage (btor);
    }
  else if (!strcmp (tok, "set_sat_solver"))
    {
      PARSE_ARGS1 (tok, str);
      ret_int = boolector_set_sat_solver (btor, arg1_str);
      exp_ret = RET_INT;
    }
  else if (!strcmp (tok, "set_rewrite_level"))
    {
      PARSE_ARGS1 (tok, int);
      boolector_set_rewrite_level (btor, arg1_int);
    }
  else if (!strcmp (tok, "get_refs"))
    {
      PARSE_ARGS0 (tok);
      if (!skip)
	{
	  ret_int = boolector_get_refs (btor);
	  exp_ret = RET_INT;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "delete"))
    {
      PARSE_ARGS0 (tok);
      boolector_delete (btor);
    }
  else if (!strcmp (tok, "const"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_const (btor, arg1_str);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "zero"))
    {
      PARSE_ARGS1 (tok, int);
      ret_ptr = boolector_zero (btor, arg1_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "false"))
    {
      PARSE_ARGS0 (tok);
      ret_ptr = boolector_false (btor);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ones"))
    {
      PARSE_ARGS1 (tok, int);
      ret_ptr = boolector_ones (btor, arg1_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "true"))
    {
      PARSE_ARGS0 (tok);
      ret_ptr = boolector_true (btor);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "one"))
    {
      PARSE_ARGS1 (tok, int);
      ret_ptr = boolector_one (btor, arg1_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "unsigned_int"))
    {
      PARSE_ARGS2 (tok, int, int);
      ret_ptr = boolector_unsigned_int (btor, arg1_int, arg2_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "int"))
    {
      PARSE_ARGS2 (tok, int, int);
      ret_ptr = boolector_int (btor, arg1_int, arg2_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "var"))
    {
      PARSE_ARGS2 (tok, int, str);
      ret_ptr = boolector_var (btor, arg1_int, arg2_str);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "array"))
    {
      PARSE_ARGS3 (tok, int, int, str);
      ret_ptr = boolector_array (btor, arg1_int, arg2_int, arg3_str);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "not"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_not (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "neg"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_neg (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "redor"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_redor (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "redxor"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_redxor (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "redand"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_redand (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "slice"))
    {
      PARSE_ARGS3 (tok, str, int, int);
      ret_ptr =
	boolector_slice (btor, hmap_get (hmap, arg1_str), arg2_int, arg3_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "uext"))
    {
      PARSE_ARGS2 (tok, str, int);
      ret_ptr = boolector_uext (btor, hmap_get (hmap, arg1_str), arg2_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sext"))
    {
      PARSE_ARGS2 (tok, str, int);
      ret_ptr = boolector_sext (btor, hmap_get (hmap, arg1_str), arg2_int);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "implies"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_implies (btor, hmap_get (hmap, arg1_str),
			   hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "iff"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_iff (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "xor"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_xor (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "xnor"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_xnor (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "and"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_and (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "nand"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_nand (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "or"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_or (btor, hmap_get (hmap, arg1_str),
		      hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "nor"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_nor (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "eq"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_eq (btor, hmap_get (hmap, arg1_str),
		      hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ne"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ne (btor, hmap_get (hmap, arg1_str),
		      hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "add"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_add (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "uaddo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_uaddo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "saddo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_saddo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "mul"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_mul (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "umulo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_umulo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "smulo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_smulo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ult"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ult (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "slt"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_slt (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ulte"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ulte (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "slte"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_slte (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ugt"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ugt (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sgt"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sgt (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ugte"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ugte (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sgte"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sgte (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sll"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sll (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "srl"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_srl (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sra"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sra (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "rol"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_rol (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ror"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ror (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sub"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sub (btor, hmap_get (hmap, arg1_str),
		       hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "usubo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_usubo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "ssubo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_ssubo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "udiv"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_udiv (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sdiv"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sdiv (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "sdivo"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_sdivo (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "urem"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_urem (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "srem"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_srem (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "smod"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_smod (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "concat"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_concat (btor, hmap_get (hmap, arg1_str),
			  hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "read"))
    {
      PARSE_ARGS2 (tok, str, str);
      ret_ptr =
	boolector_read (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "write"))
    {
      PARSE_ARGS3 (tok, str, str, str);
      ret_ptr =
	boolector_write (btor, hmap_get (hmap, arg1_str),
			 hmap_get (hmap, arg2_str), hmap_get (hmap,
							      arg3_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "cond"))
    {
      PARSE_ARGS3 (tok, str, str, str);
      ret_ptr =
	boolector_cond (btor, hmap_get (hmap, arg1_str),
			hmap_get (hmap, arg2_str), hmap_get (hmap, arg3_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "param"))
    {
      PARSE_ARGS2 (tok, int, str);
      ret_ptr = boolector_param (btor, arg1_int, arg2_str);
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "fun"))
    {
      arg1_int = intarg (tok);			    /* paramc */
      tmp = malloc (sizeof(BtorNode*) * arg1_int);  /* params */
      for (i = 0; i < arg1_int; i++)		    
	tmp[i] = hmap_get (hmap, strarg (tok));
      arg1_str = strarg (tok);			    /* function body */
      checklastarg (tok);
      ret_ptr = boolector_fun (btor, arg1_int, tmp, hmap_get (hmap, arg1_str));
      free (tmp);
      exp_ret = RET_VOIDPTR; 
    }
  else if (!strcmp (tok, "apply"))
    {
      arg1_int = intarg (tok);			    /* argc */
      tmp = malloc (sizeof(BtorNode*) * arg1_int);  /* args */
      for (i = 0; i < arg1_int; i++)		    
	tmp[i] = hmap_get (hmap, strarg (tok));
      arg1_str = strarg (tok);			    /* function */
      checklastarg (tok);
      ret_ptr = 
	boolector_apply (btor, arg1_int, tmp, hmap_get (hmap, arg1_str));
      free (tmp);
      exp_ret = RET_VOIDPTR; 
    }
  else if (!strcmp (tok, "inc"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_inc (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "dec"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_dec (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "is_array"))
    {
      PARSE_ARGS1 (tok, str);
      if (!skip)
	{
	  ret_int = boolector_is_array (btor, hmap_get (hmap, arg1_str));
	  exp_ret = RET_INT;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "is_fun"))
    {
      PARSE_ARGS1 (tok, str);
      if (!skip)
	{
	  ret_int = boolector_is_fun (btor, hmap_get (hmap, arg1_str));
	  exp_ret = RET_INT;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "get_fun_arity"))
    {
      PARSE_ARGS1 (tok, str);
      if (!skip)
	{
	  ret_int = boolector_get_fun_arity (btor, hmap_get (hmap, arg1_str));
	  exp_ret = RET_INT;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "get_width"))
    {
      PARSE_ARGS1 (tok, str);
      if (!skip)
	{
	  ret_int = boolector_get_width (btor, hmap_get (hmap, arg1_str));
	  exp_ret = RET_INT;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "get_index_width"))
    {
      PARSE_ARGS1 (tok, str);
      if (!skip)
	{
	  ret_int =
	    boolector_get_index_width (btor, hmap_get (hmap, arg1_str));
	  exp_ret = RET_INT;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "get_symbol_of_var"))
    {
      PARSE_ARGS1 (tok, str);
      if (!skip)
	{
	  ret_str =
	    (char *) boolector_get_symbol_of_var (btor,
						  hmap_get (hmap, arg1_str));
	  exp_ret = RET_CHARPTR;
	}
      else
	exp_ret = RET_SKIP;
    }
  else if (!strcmp (tok, "copy"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_copy (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "release"))
    {
      PARSE_ARGS1 (tok, str);
      boolector_release (btor, hmap_get (hmap, arg1_str));
    }
  else if (!strcmp (tok, "assert"))
    {
      PARSE_ARGS1 (tok, str);
      boolector_assert (btor, hmap_get (hmap, arg1_str));
    }
  else if (!strcmp (tok, "assume"))
    {
      PARSE_ARGS1 (tok, str);
      boolector_assume (btor, hmap_get (hmap, arg1_str));
    }
  else if (!strcmp (tok, "sat"))
    {
      PARSE_ARGS0 (tok);
      ret_int = boolector_sat (btor);
      exp_ret = ignore_sat ? RET_SKIP : RET_INT;
    }
  else if (!strcmp (tok, "bv_assignment"))
    {
      PARSE_ARGS1 (tok, str);
      ret_ptr = boolector_bv_assignment (btor, hmap_get (hmap, arg1_str));
      exp_ret = RET_VOIDPTR;
    }
  else if (!strcmp (tok, "free_bv_assignment"))
    {
      PARSE_ARGS1 (tok, str);
      boolector_free_bv_assignment (btor, hmap_get (hmap, arg1_str));
    }
  else if (!strcmp (tok, "array_assignment"))
    {
      PARSE_ARGS1 (tok, str);
      boolector_array_assignment (btor, hmap_get (hmap, arg1_str), &res1_pptr,
				  &res2_pptr, &ret_int);
      exp_ret = RET_ARRASS;
    }
  else if (!strcmp (tok, "free_array_assignment"))
    {
      PARSE_ARGS3 (tok, str, str, int);
      boolector_free_array_assignment (btor, hmap_get (hmap, arg1_str),
				       hmap_get (hmap, arg2_str), arg3_int);
    }
  else
    perr ("invalid command '%s'", tok);
  lineno++;
  len = 0;
  goto NEXT;
DONE:
  msg ("done %s", name);
  hmap_clear (hmap);
  btor_delete_ptr_hash_table (hmap);
  btor_delete_mem_mgr (mm);
}

static void
exitonsig (int sig)
{
  msg ("exit(%d) on signal %d", sig, sig);
  exit (sig);
}

static const char *usage =
  "usage: btoruntrace [ <option> ... ] [ <trace> ]\n"
  "\n"
  "where <option> is one of the following:\n"
  "\n"
  "  -v | --verbose\n" "  -e | --exit-on-abort\n" "  -s | --skip-getters\n";

int
main (int argc, char **argv)
{
  int i;
  FILE *file;

  for (i = 1; i < argc; i++)
    {
      if (!strcmp (argv[i], "-h"))
	{
	  printf ("%s", usage);
	  exit (0);
	}
      else if (!strcmp (argv[i], "-v") || !strcmp (argv[i], "--verbose"))
	verbose = 1;
      else if (!strcmp (argv[i], "-e")
	       || !strcmp (argv[i], "--exit-on-abort"))
	exitonabort = 1;
      else if (!strcmp (argv[i], "-s") || !strcmp (argv[i], "--skip-getters"))
	skip = 1;
      else if (!strcmp (argv[i], "-i")
	       || !strcmp (argv[i], "--ignore-sat-result"))
	ignore_sat = 1;
      else if (argv[i][0] == '-')
	die ("invalid command line option '%s' (try '-h')", argv[i]);
      else if (name)
	die ("two traces '%s' and '%s' specified (try '-h')", name, argv[i]);
      else
	name = argv[i];
    }

  if (name)
    {
      file = fopen (name, "r");
      if (!file)
	die ("can not read '%s'", name);
    }
  else
    name = "<stdin>", file = stdin;

  if (exitonabort)
    {
      msg ("setting signal handlers since '-e' specified");
      signal (SIGINT, exitonsig);
      signal (SIGSEGV, exitonsig);
      signal (SIGABRT, exitonsig);
      signal (SIGTERM, exitonsig);
    }

  parse (file);

  fclose (file);
  return 0;
}
