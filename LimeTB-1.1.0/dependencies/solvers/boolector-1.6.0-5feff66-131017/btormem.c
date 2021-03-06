/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2007-2009 Robert Daniel Brummayer.
 *  Copyright (C) 2007-2012 Armin Biere.
 *  Copyright (C) 2012 Mathias Preiner.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 *  This file is part of Boolector.
 */

#include "btormem.h"
#include "btorexit.h"

#include <stdlib.h>
#include <assert.h>
#include <string.h>
#include <stdarg.h>
#include <stdio.h>

/*------------------------------------------------------------------------*/

#define BTOR_ABORT_MEM(cond,msg) \
do { \
  if (cond) \
    { \
      fputs ("[btormem] " msg "\n", stdout); \
      exit (BTOR_ERR_EXIT); \
    } \
} while (0)


#define ADJUST() \
do { \
  if (mm->maxallocated < mm->allocated) \
    mm->maxallocated = mm->allocated; \
} while (0)

#define SAT_ADJUST() \
do { \
  if (mm->sat_maxallocated < mm->sat_allocated) \
    mm->sat_maxallocated = mm->sat_allocated; \
} while (0)


/*------------------------------------------------------------------------*/
/* This enables logging of all memory allocations.
 */
#if 0
#define BTOR_LOG_MEM(FMT,ARGS...) \
do { \
  fputs ("[btorlogmem] ", stdout); \
  printf (FMT, ##ARGS); \
  fflush (stdout); \
} while (0)
#else
#define BTOR_LOG_MEM(...) do { } while (0)
#endif

/*------------------------------------------------------------------------*/

BtorMemMgr *
btor_new_mem_mgr (void)
{
  BtorMemMgr *mm = (BtorMemMgr *) malloc (sizeof (BtorMemMgr));
  BTOR_ABORT_MEM (!mm, "out of memory in 'btor_new_mem_mgr'");
  mm->allocated = 0;
  mm->maxallocated = 0;
  mm->sat_allocated = 0;
  mm->sat_maxallocated = 0;
  return mm;
}

void *
btor_malloc (BtorMemMgr * mm, size_t size)
{
  void *result;
  if (!size) return 0;
  assert (mm);
  result = malloc (size);
  BTOR_ABORT_MEM (!result, "out of memory in 'btor_malloc'");
  mm->allocated += size;
  ADJUST ();
  BTOR_LOG_MEM ("%p malloc %10ld\n", result, size);
  return result;
}

void *
btor_sat_malloc (BtorMemMgr *mm, size_t size)
{
  void *result;
  if (!size) return 0;
  assert (mm);
  result = malloc (size);
  BTOR_ABORT_MEM (!result, "out of memory in 'btor_sat_malloc'");
  mm->sat_allocated += size;
  SAT_ADJUST ();
  return result;
}

void *
btor_realloc (BtorMemMgr * mm, void *p, size_t old_size, size_t new_size)
{
  void *result;
  assert (mm);
  assert (!p == !old_size);
  assert (mm->allocated >= old_size);
  BTOR_LOG_MEM ("%p free   %10ld (realloc)\n", p, old_size);
  result = realloc (p, new_size);
  BTOR_ABORT_MEM (!result, "out of memory in 'btor_realloc'");
  mm->allocated -= old_size;
  mm->allocated += new_size;
  ADJUST ();
  BTOR_LOG_MEM ("%p malloc %10ld (realloc)\n", result, new_size);
  return result;
}

void *
btor_sat_realloc (BtorMemMgr * mm, void *p, size_t old_size, size_t new_size)
{
  void *result;
  assert (mm);
  assert (!p == !old_size);
  assert (mm->sat_allocated >= old_size);
  result = realloc (p, new_size);
  BTOR_ABORT_MEM (!result, "out of memory in 'btor_sat_realloc'");
  mm->sat_allocated -= old_size;
  mm->sat_allocated += new_size;
  SAT_ADJUST ();
  return result;
}

void *
btor_calloc (BtorMemMgr * mm, size_t nobj, size_t size)
{
  size_t bytes = nobj * size;
  void *result;
  assert (mm);
  result = calloc (nobj, size);
  BTOR_ABORT_MEM (!result, "out of memory in 'btor_calloc'");
  mm->allocated += bytes;
  ADJUST ();
  BTOR_LOG_MEM ("%p malloc %10ld (calloc)\n", result, bytes);
  return result;
}

void
btor_free (BtorMemMgr * mm, void *p, size_t freed)
{
  assert (mm);
  assert (!p == !freed);
  assert (mm->allocated >= freed);
  mm->allocated -= freed;
  BTOR_LOG_MEM ("%p free   %10ld\n", p, freed);
  free (p);
}

void
btor_sat_free (BtorMemMgr * mm, void *p, size_t freed)
{
  assert (mm);
  if (p)
    mm->sat_allocated -= freed;
  free (p);
}

char *
btor_strdup (BtorMemMgr * mm, const char *str)
{
  char *res;

  if (str)
    {
      res = btor_malloc (mm, strlen (str) + 1);
      ADJUST ();
      strcpy (res, str);
    }
  else
    res = 0;

  return res;
}

void
btor_freestr (BtorMemMgr * mm, char *str)
{
  if (str)
    btor_free (mm, str, strlen (str) + 1);
}

void
btor_delete_mem_mgr (BtorMemMgr * mm)
{
  assert (mm);
  assert (getenv ("BTORLEAK") ||
	  getenv ("BTORLEAKMEM") ||
	  !mm->allocated);
  free (mm);
}

size_t
btor_parse_error_message_length (const char * name,
				 const char * fmt, va_list ap)
{
  /* Additional characters for:

  "<name>:<lineno>:[<columno>:] "

  */
  size_t bytes = strlen (name) + 25;
  const char * p;

  for (p = fmt; *p; p++)
    {
      if (*p == '%')
	{
	  p++;
	  assert (*p);
	  if (*p == 'c')
	    {
	      (void) va_arg (ap, int);
	      bytes += 1;
	    }
	  else if (*p == 'd' || *p == 'u')
	    {
	      (void) va_arg (ap, unsigned);
	      bytes += 12;
	    }
	  else
	    {
	      assert (*p == 's');
	      bytes += strlen (va_arg (ap, const char *));
	    }
	}
      else
	bytes++;
    }

  return bytes;
}

char *
btor_parse_error_message (BtorMemMgr * mem,
			  const char * name,
			  int lineno,
			  int columno,
			  const char * fmt,
			  va_list ap,
			  size_t bytes)
{
  char * res;
  char *tmp;

  tmp = btor_malloc (mem, bytes);
  if (columno > 0) sprintf (tmp, "%s:%d:%d: ", name, lineno, columno);
  else  sprintf (tmp, "%s:%d: ", name, lineno);
  assert (strlen (tmp) + 1 < bytes);
  vsprintf (tmp + strlen (tmp), fmt, ap);
  res = btor_strdup (mem, tmp);
  btor_free (mem, tmp, bytes);

  return res;
}
