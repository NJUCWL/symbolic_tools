/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2012-2013 Aina Niemetz, Mathias Preiner.
 *  Copyright (C) 2013 Armin Biere.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 */

#include "btorbeta.h"
#include "btorlog.h"
#include "btorutil.h"
#include "btoriter.h"
#include "btorrewrite.h"
#include "btormisc.h"
#include "btorparamcache.h"

#define BETA_RED_LAMBDA_CHAINS -2
#define BETA_RED_CUTOFF        -1
#define BETA_RED_FULL           0
#define BETA_RED_BOUNDED        1

struct BtorNodeTuple
{
  BtorNode *e0;
  BtorNode *e1;
};

typedef struct BtorNodeTuple BtorNodeTuple;

static BtorNodeTuple *
new_node_tuple (Btor * btor, BtorNode * e0, BtorNode * e1)
{
  assert (btor);
  assert (e0);
  assert (e1);

  BtorNodeTuple *t;

  BTOR_NEW (btor->mm, t);
  t->e0 = btor_copy_exp (btor, e0);
  t->e1 = btor_copy_exp (btor, e1);
  return t;
}

static void
delete_node_tuple (Btor * btor, BtorNodeTuple * t)
{
  assert (btor);
  assert (t);

  btor_release_exp (btor, t->e0);
  btor_release_exp (btor, t->e1);
  BTOR_DELETE (btor->mm, t);
}

#if 0
static unsigned int
hash_node_tuple (BtorNodeTuple * t)
{
  assert (t);

  unsigned int hash;
  hash = (unsigned int) BTOR_REAL_ADDR_NODE (t->e0)->id;
  hash += (unsigned int) BTOR_REAL_ADDR_NODE (t->e1)->id;
  hash *= 7334147u;
  return hash;
}

static int
compare_node_tuple (BtorNodeTuple * t0, BtorNodeTuple * t1)
{
  assert (t0);
  assert (t1);

  int result;
  result = BTOR_REAL_ADDR_NODE (t0->e0)->id;
  result -= BTOR_REAL_ADDR_NODE (t1->e0)->id;
  if (result != 0)
    return result;
  result = BTOR_REAL_ADDR_NODE (t0->e1)->id;
  result -= BTOR_REAL_ADDR_NODE (t1->e1)->id;
  return result;
}
#endif

static void
cache_beta_result (Btor * btor, BtorNode * lambda, BtorNode * exp, 
		   BtorNode * result)
{
  assert (btor);
  assert (lambda);
  assert (exp);
  assert (result);
  assert (BTOR_IS_REGULAR_NODE (lambda));
  assert (BTOR_IS_LAMBDA_NODE (lambda));

  BtorNodePair *pair;
  BtorPtrHashBucket *bucket;

  pair = new_exp_pair (btor, lambda, exp);

  bucket = btor_find_in_ptr_hash_table (btor->cache, pair);
  if (bucket)
    {
      delete_exp_pair (btor, pair);
      assert ((BtorNode *) bucket->data.asPtr == result);
    }
  else
    btor_insert_in_ptr_hash_table (btor->cache, pair)->data.asPtr =
      btor_copy_exp (btor, result);
  BTORLOG ("%s: (%s, %s) -> %s", __FUNCTION__, node2string (lambda),
	   node2string (exp), node2string (result));
}

static BtorNode *
cached_beta_result (Btor * btor, BtorNode * lambda, BtorNode * exp)
{
  assert (btor);
  assert (lambda);
  assert (exp);
  assert (BTOR_IS_REGULAR_NODE (lambda));
  assert (BTOR_IS_LAMBDA_NODE (lambda));

  BtorNodePair *pair;
  BtorPtrHashBucket *bucket;

  pair = new_exp_pair (btor, lambda, exp);
  bucket = btor_find_in_ptr_hash_table (btor->cache, pair);
  delete_exp_pair (btor, pair);

  if (bucket)
    return (BtorNode *) bucket->data.asPtr;

  return 0;
}

BtorNode *
btor_param_cur_assignment (BtorNode * param)
{
  assert (param);
  assert (BTOR_IS_REGULAR_NODE (param));
  assert (BTOR_IS_PARAM_NODE (param));

  param = BTOR_REAL_ADDR_NODE (param);
  if (BTOR_EMPTY_STACK (((BtorParamNode *) param)->assigned_exp))
    return 0;

  return BTOR_TOP_STACK (((BtorParamNode *) param)->assigned_exp);
}

void
btor_assign_args (Btor * btor, BtorNode * fun, BtorNode * args)
{
  assert (btor);
  assert (fun);
  assert (args);
  assert (BTOR_IS_REGULAR_NODE (fun));
  assert (BTOR_IS_REGULAR_NODE (args));
  assert (BTOR_IS_LAMBDA_NODE (fun));
  assert (BTOR_IS_ARGS_NODE (args));

  BTORLOG ("%s: %s (%d params, %d args)", __FUNCTION__, node2string (fun),
	   ((BtorLambdaNode *) fun)->num_params,
	   ((BtorArgsNode *) args)->num_args);

  BtorNode *cur_lambda, *cur_arg;
  BtorIterator it;
  BtorArgsIterator ait;

  init_args_iterator (&ait, args);
  init_lambda_iterator (&it, fun);

  while (has_next_args_iterator (&ait))
    {
      assert (has_next_lambda_iterator (&it));
      cur_arg = next_args_iterator (&ait);
      cur_lambda = next_lambda_iterator (&it);
      btor_assign_param (btor, cur_lambda, cur_arg);
    }
}

void
btor_assign_param (Btor * btor, BtorNode * lambda, BtorNode * arg)
{
  assert (btor);
  assert (lambda);
  assert (arg);
  assert (BTOR_IS_REGULAR_NODE (lambda));
  assert (BTOR_IS_LAMBDA_NODE (lambda));

  BtorParamNode *param;

  param = BTOR_LAMBDA_GET_PARAM (lambda);
  assert (BTOR_IS_REGULAR_NODE (param));
  assert (BTOR_REAL_ADDR_NODE (arg)->len == param->len);
  BTORLOG ("  assign: %s (%s)", node2string (lambda), node2string (arg));
  BTOR_PUSH_STACK (btor->mm, param->assigned_exp, arg);
}

void
btor_unassign_params (Btor * btor, BtorNode * lambda)
{
  assert (lambda);
  assert (BTOR_IS_REGULAR_NODE (lambda));
  assert (BTOR_IS_LAMBDA_NODE (lambda));
  assert (BTOR_IS_PARAM_NODE (lambda->e[0]));

  BtorParamNode *param;

  BTORLOG ("%s:", __FUNCTION__);
  do 
    {
      BTORLOG ("  unassign %s", node2string (lambda));
      param = (BtorParamNode *) lambda->e[0];

      if (BTOR_EMPTY_STACK (param->assigned_exp))
	break;

      (void) BTOR_POP_STACK (param->assigned_exp);
      lambda = BTOR_REAL_ADDR_NODE (lambda->e[1]);
    }
  while (BTOR_IS_LAMBDA_NODE (lambda));
}

#define BETA_REDUCE_OPEN_NEW_SCOPE(lambda) \
do  \
  { \
     BTOR_PUSH_STACK (mm, scopes, cur_scope); \
     BTOR_PUSH_STACK (mm, scope_results, cur_scope_results); \
     BTOR_PUSH_STACK (mm, scope_lambdas, cur_scope_lambda); \
     cur_scope = btor_new_ptr_hash_table (mm, \
		   (BtorHashPtr) btor_hash_exp_by_id, \
		   (BtorCmpPtr) btor_compare_exp_by_id); \
     cur_scope_results = btor_new_ptr_hash_table (mm, \
			  (BtorHashPtr) btor_hash_exp_by_id, \
			  (BtorCmpPtr) btor_compare_exp_by_id); \
     cur_scope_lambda = lambda; \
  } \
while (0)

#define BETA_REDUCE_CLOSE_SCOPE() \
do \
  { \
    assert (cur_scope); \
    assert (cur_scope_lambda); \
    /* delete current scope */ \
    btor_delete_ptr_hash_table (cur_scope); \
    for (b = cur_scope_results->first; b; b = b->next) \
      btor_release_exp (btor, (BtorNode *) b->data.asPtr); \
    btor_delete_ptr_hash_table (cur_scope_results); \
    /* pop previous scope */ \
    cur_scope = (BtorPtrHashTable *) BTOR_POP_STACK (scopes); \
    cur_scope_results = (BtorPtrHashTable *) BTOR_POP_STACK (scope_results); \
    cur_scope_lambda = BTOR_POP_STACK (scope_lambdas); \
  } \
while (0)

#define BETA_REDUCE_PUSH_RESULT_IF_CACHED(lambda, assignment) \
do \
  { \
    cached = cached_beta_result (btor, lambda, assignment); \
    if (cached) \
      { \
	result = btor_copy_exp (btor, cached); \
	result_parameterized =  \
	  BTOR_REAL_ADDR_NODE (cached)->parameterized \
	    ? BTOR_REAL_ADDR_NODE (cached) : 0; \
	goto BETA_REDUCE_PUSH_ARG_STACK; \
      } \
  } \
while (0)

/* We distinguish the following options for (un)bounded reduction:
 *
 *   BETA_RED_LAMBDA_CHAINS: merge lambda chains
 *
 *   BETA_RED_CUTOFF: cut off at subsequent lambda and write nodes, 
 *		      evaluate conditionals
 *
 *   BETA_RED_FULL:   full reduction, 
 *		      do not evaluate conditionals
 *
 *   BETA_RED_BOUNDED (bound): bounded reduction, stop reduction at 'bound'
 *			       lambdas
 */
BtorNode *
btor_beta_reduce (Btor * btor, BtorNode * exp, int mode,
		  BtorNode ** parameterized, int bound)
{
  assert (btor);
  assert (exp);
  assert (mode == BETA_RED_CUTOFF
	  || mode == BETA_RED_FULL
	  || mode == BETA_RED_LAMBDA_CHAINS
	  || mode == BETA_RED_BOUNDED);
  assert (bound >= 0);
  assert (bound == 0 || mode == BETA_RED_CUTOFF || mode == BETA_RED_BOUNDED);
  assert (mode != BETA_RED_CUTOFF || bound == 2);

  int i, aux_rewrite_level = 0;
  const char *eval_res;
  double start;
  BtorMemMgr *mm;
  BtorNode *cur, *real_cur, *next, *result, *param, *cached, *args;
  BtorNode *result_parameterized, *cur_scope_lambda, *cur_parent;
  BtorNodePtrStack work_stack, arg_stack, parameterized_stack;
  BtorPtrHashBucket *mbucket, *b;
  BtorPtrHashTable *cache, *cur_scope, *cur_scope_results;
  BtorVoidPtrStack scopes, scope_results;
  BtorNodePtrStack scope_lambdas, e, p;
#ifndef NDEBUG
  BtorNodePtrStack unassign_stack;
#endif

  result = 0;
  result_parameterized = 0;

  mm = btor->mm;
  cache = btor->cache;
  start = btor_time_stamp ();
  btor->stats.beta_reduce_calls++;

  BTORLOG ("%s: %s (mode %d)", __FUNCTION__, node2string (exp), mode);

  /* we have to disable rewriting in case we beta reduce during read propagation
   * as otherwise we might lose lazily synthesized and encoded nodes */
  if (mode == BETA_RED_CUTOFF)
    {
      aux_rewrite_level = btor->rewrite_level;
      btor->rewrite_level = 0;
    }

  BTOR_INIT_STACK (work_stack);
  BTOR_INIT_STACK (arg_stack);
  BTOR_INIT_STACK (parameterized_stack);
  BTOR_INIT_STACK (scopes);
  BTOR_INIT_STACK (scope_results);
  BTOR_INIT_STACK (scope_lambdas);
  BTOR_INIT_STACK (e);
  BTOR_INIT_STACK (p);
#ifndef NDEBUG
  BTOR_INIT_STACK (unassign_stack);
#endif

  BTOR_PUSH_STACK (mm, work_stack, exp);
  BTOR_PUSH_STACK (mm, work_stack, 0);

  cur_scope = btor_new_ptr_hash_table (mm,
		(BtorHashPtr) btor_hash_exp_by_id,
		(BtorCmpPtr) btor_compare_exp_by_id);
  cur_scope_results = btor_new_ptr_hash_table (mm,
			(BtorHashPtr) btor_hash_exp_by_id,
			(BtorCmpPtr) btor_compare_exp_by_id);
  cur_scope_lambda = 0;

  while (!BTOR_EMPTY_STACK (work_stack))
    {
      cur_parent = BTOR_POP_STACK (work_stack);
      cur = BTOR_POP_STACK (work_stack);
      // TODO: directly push simplified exp onto stack at the beginning
      /* we do not want the simplification of top level read contraints */
      if (BTOR_REAL_ADDR_NODE (cur)->constraint
	  && BTOR_IS_APPLY_NODE (BTOR_REAL_ADDR_NODE (cur)))
	cur = btor_pointer_chase_simplified_exp (btor, cur);
      else
	cur = btor_simplify_exp (btor, cur);

      real_cur = BTOR_REAL_ADDR_NODE (cur);
      mbucket = btor_find_in_ptr_hash_table (cur_scope, real_cur);

      if (!mbucket)
	{
	  if (BTOR_IS_LAMBDA_NODE (real_cur)
	      /* only open new scope at first lambda of nested lambdas */
	      && (!BTOR_IS_NESTED_LAMBDA_NODE (real_cur)
		  || BTOR_IS_FIRST_NESTED_LAMBDA (real_cur)))
	    BETA_REDUCE_OPEN_NEW_SCOPE (real_cur);

	  /* initialize mark in current scope */
	  mbucket = btor_insert_in_ptr_hash_table (cur_scope, real_cur);
	  mbucket->data.asInt = 0;
	}
//      printf ("visit: %s (%d)\n", node2string (real_cur), mbucket->data.asInt);

      if (mbucket->data.asInt == 0)
	{
	  assert (real_cur);
	  assert (!real_cur->beta_mark || BTOR_IS_LAMBDA_NODE (real_cur));
	  mbucket->data.asInt = 1;

	  BTOR_RESET_STACK (e);
	  for (i = 0; i < real_cur->arity; i++)
	    BTOR_PUSH_STACK (mm, e, btor_simplify_exp (btor, real_cur->e[i]));

	  /* bounded reduction (BETA_RED_BOUNDED, BETA_RED_CUTOFF) */
	  if (bound > 0
	      && BTOR_IS_LAMBDA_NODE (real_cur)
	      && BTOR_COUNT_STACK (scopes) >= bound)
	    {
	      assert (real_cur == cur_scope_lambda);
	      goto BETA_REDUCE_PREPARE_PUSH_ARG_STACK;
	    }

    // TODO: nested lambdas
	  if (mode == BETA_RED_LAMBDA_CHAINS
	      /* skip all lambdas that are not part of the lambda chain */
	      && ((BTOR_IS_LAMBDA_NODE (real_cur) && !real_cur->chain)
	      /* skip all nodes that are not parameterized as we can't merge 
	       * lambdas that might be below */
		   || (!BTOR_IS_LAMBDA_NODE (real_cur)
		       && !real_cur->parameterized)))
	    {
	      goto BETA_REDUCE_PREPARE_PUSH_ARG_STACK;
	    }
	  else if (mode == BETA_RED_CUTOFF
		   /* do not skip expression to be beta reduced */
		   && (real_cur != BTOR_REAL_ADDR_NODE (exp)
		   /* add_param_cond_to_clause: if we have an encoded apply,
		    * that is a condition of a bvcond, then we are not allowed
		    * to proceed with beta reduction
		    * (lambda below is not encoded) */
		       || (!BTOR_IS_LAMBDA_NODE (real_cur)
			   && real_cur->tseitin))
		   /* cut off at nodes that are already encoded */
		   && (real_cur->tseitin
		   /* cut off at non-lambda array nodes
		    * (lambda nodes are cut off via bound) */
		       || (BTOR_IS_ARRAY_NODE (real_cur)
		           && !BTOR_IS_LAMBDA_NODE (real_cur))))
	    {
	      goto BETA_REDUCE_PREPARE_PUSH_ARG_STACK;
	    }

	  /* do not beta-reduce nodes that will not change anyway */
	  if ((!real_cur->lambda_below && !real_cur->parameterized))
	    // FIXME: assignment is not yet assigned, we have to check if 
	    //	      something is on the arg stack
//	      || (BTOR_IS_LAMBDA_NODE (real_cur)
//		  && !btor_param_cur_assignment (e[0])
//		  && BTOR_REAL_ADDR_NODE (e[1])->parameterized))
	    {
BETA_REDUCE_PREPARE_PUSH_ARG_STACK:
	      result = btor_copy_exp (btor, real_cur);
	      result_parameterized = real_cur->parameterized ? real_cur : 0;
	      goto BETA_REDUCE_PUSH_ARG_STACK;
	    }

	  next = 0;
	  if (BTOR_IS_PARAM_NODE (real_cur))
	    {
	      /* we allow unassigned params (next == 0) */
	      if ((next = btor_param_cur_assignment (real_cur)))
		{
		  result = btor_copy_exp (btor, next);
		  result_parameterized = real_cur;
		  goto BETA_REDUCE_PUSH_ARG_STACK;
		}
	      else
		next = real_cur;
	    }
	  /* evaluate conditionals if condition is encoded or parameterized */
	  else if (mode == BETA_RED_CUTOFF
		   && BTOR_IS_ARRAY_OR_BV_COND_NODE (real_cur))
	    {
	      assert (BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))->tseitin
		      || BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))->parameterized
		      || BTOR_IS_BV_CONST_NODE (
			   BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))));
	      eval_res = btor_eval_exp (btor, BTOR_PEEK_STACK (e, 0));
	      next = eval_res[0] == '1' ? BTOR_PEEK_STACK (e, 1) : BTOR_PEEK_STACK (e, 2);
	      assert (next);
	      btor_freestr (mm, (char *) eval_res);
	      mbucket->data.asInt = 0;
	    }

	  if (next)
	    {
	      if (BTOR_IS_INVERTED_NODE (cur))
		next = BTOR_INVERT_NODE (next);

	      if (mode == BETA_RED_FULL || mode == BETA_RED_BOUNDED)
		BTOR_REAL_ADDR_NODE (next)->parent = real_cur;

	      BTOR_PUSH_STACK (mm, work_stack, next);
	      BTOR_PUSH_STACK (mm, work_stack, real_cur);
	    }
	  else
	    {
	      /* assign params of lambda expression */
	      if (BTOR_IS_LAMBDA_NODE (real_cur)
		  /* if there is no argument on the stack, we have no
		   * assignment for the parameter */
		  && !BTOR_EMPTY_STACK (arg_stack)
		  /* if it is nested, its parameter is already assigned */
		  && !btor_param_cur_assignment (BTOR_PEEK_STACK (e, 0))
		  /* we have an assignment if there is a lambda application */
		  && BTOR_IS_APPLY_NODE (cur_parent))
		{
		  assert (!btor_find_in_ptr_hash_table (cur_scope,
			    BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))));

		  args = BTOR_TOP_STACK (arg_stack);
		  assert (BTOR_IS_ARGS_NODE (args));

		  if (cache)
		    BETA_REDUCE_PUSH_RESULT_IF_CACHED (real_cur, args);

		  btor_assign_args (btor, real_cur, args);
#ifndef NDEBUG
		  BTOR_PUSH_STACK (mm, unassign_stack, real_cur);
#endif
		}

	      BTOR_PUSH_STACK (mm, work_stack, cur);
	      BTOR_PUSH_STACK (mm, work_stack, cur_parent);

	      /* NOTE: all arguments of an apply have to be visited first
	       *       in order to get a correct assignment for the parameter
	       *       of a lambda. */
	      for (i = 0; i < real_cur->arity; i++)
		{
		  BTOR_PUSH_STACK (mm, work_stack, BTOR_PEEK_STACK (e, i));
		  BTOR_PUSH_STACK (mm, work_stack, real_cur);
		}
	    }
	}
      else if (mbucket->data.asInt == 1)
	{
	  assert (mbucket);
	  result_parameterized = (real_cur->parameterized) ? real_cur : 0;

	  /* copy "leaves" or expression that were cut off */
	  if (BTOR_IS_BV_CONST_NODE (real_cur)
	      || BTOR_IS_BV_VAR_NODE (real_cur)
	      || BTOR_IS_ARRAY_VAR_NODE (real_cur)
	      || BTOR_IS_PARAM_NODE (real_cur)
	      || (mode == BETA_RED_CUTOFF
		  && real_cur != BTOR_REAL_ADDR_NODE (exp)
		  && (real_cur->tseitin
		      || (BTOR_IS_ARRAY_NODE (real_cur)
		          && !BTOR_IS_LAMBDA_NODE (real_cur))))
	      /* we reached given bound */
	      || (bound > 0
		  && BTOR_IS_LAMBDA_NODE (real_cur)
		  && BTOR_COUNT_STACK (scopes) >= bound))
	    {
	      result = btor_copy_exp (btor, real_cur);
	    }
	  else
	    {
	      assert (BTOR_IS_UNARY_NODE (real_cur)
		      || BTOR_IS_BINARY_NODE (real_cur)
		      || BTOR_IS_TERNARY_NODE (real_cur)
		      || BTOR_IS_ARGS_NODE (real_cur));
	      assert (mode != BETA_RED_CUTOFF
		      || !BTOR_IS_ARRAY_OR_BV_COND_NODE (real_cur));
	      assert (BTOR_COUNT_STACK (arg_stack) >= real_cur->arity);

	      BTOR_RESET_STACK (e);
	      BTOR_RESET_STACK (p);
	      for (i = 0; i < real_cur->arity; i++)
		{
		  BTOR_PUSH_STACK (mm, e, BTOR_POP_STACK (arg_stack));
		  BTOR_PUSH_STACK (mm, p, BTOR_POP_STACK (parameterized_stack));
		}
	      switch (real_cur->kind)
		{
		  case BTOR_SLICE_NODE:
		    result = btor_slice_exp (
			       btor, BTOR_PEEK_STACK (e, 0), 
			       real_cur->upper, real_cur->lower);
		    break;
		  case BTOR_AND_NODE:
		    result = btor_and_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_BEQ_NODE:
		  case BTOR_AEQ_NODE:
		    result = btor_eq_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_ADD_NODE:
		    result = btor_add_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_MUL_NODE:
		    result = btor_mul_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_ULT_NODE:
		    result = btor_ult_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_SLL_NODE:
		    result = btor_sll_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_SRL_NODE:
		    result = btor_srl_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_UDIV_NODE:
		    result = btor_udiv_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_UREM_NODE:
		    result = btor_urem_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_CONCAT_NODE:
		    result = btor_concat_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_READ_NODE:
		    result = btor_read_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		    break;
		  case BTOR_ARGS_NODE:
		    result = btor_args_exp (btor, real_cur->arity, e.start); 
		    break;

		  case BTOR_APPLY_NODE:
		    /* array exp has been beta-reduced to read value */
		    if (!BTOR_IS_FUN_NODE (BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))))
		      {
			assert (
			  !BTOR_IS_ARRAY_NODE (
			    BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))));
			result = btor_copy_exp (btor, BTOR_PEEK_STACK (e, 0));
		      }
		    else
		      {
			assert (BTOR_IS_FUN_NODE (BTOR_PEEK_STACK (e, 0)));
			assert (BTOR_IS_ARGS_NODE (BTOR_PEEK_STACK (e, 1)));
			/* NOTE: do not use btor_apply_exp here since 
			 * beta reduction is used in btor_rewrite_apply_exp. */
			result =
			  btor_apply_exp_node (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
		      }

		    if (cache 
			&& BTOR_IS_LAMBDA_NODE (real_cur->e[0])
			&& mode == BETA_RED_FULL)
		      {
			assert (!BTOR_REAL_ADDR_NODE (
				  real_cur->e[0])->simplified || cur == exp);
			assert (!BTOR_REAL_ADDR_NODE (
				  real_cur->e[1])->simplified || cur == exp);
			cache_beta_result (btor,
			  btor_simplify_exp (btor, real_cur->e[0]),
			  btor_simplify_exp (btor, BTOR_PEEK_STACK (e, 1)), result);
		      }
		    break;

		  case BTOR_LAMBDA_NODE:
		    /* lambda expression not reduced, nothing changed
		     * NOTE: lambda may be constant and thus, we return e[1] */
		    if (real_cur->e[0] == BTOR_PEEK_STACK (e, 0)
			&& real_cur->e[1] == BTOR_PEEK_STACK (e, 1)
		        && BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 1))->parameterized)
		      {
			assert (!real_cur->beta_mark);
			result = btor_copy_exp (btor, real_cur);
		      }
		    /* lambda reduced to some term with e[0] due to rewriting */
		    else if (real_cur->beta_mark == 1 ||
			     (real_cur->e[0] == BTOR_PEEK_STACK (e, 0)
			      && BTOR_REAL_ADDR_NODE (
				   BTOR_PEEK_STACK (e, 1))->parameterized))
		      {
			// FIXME: we do not support reducing nested lambdas 
			//        like that, see test_merge.smt2 if we fully 
			//        reduce lambda 14 without assigning the params
			//assert (!BTOR_IS_NESTED_LAMBDA_NODE (real_cur));
			if (real_cur->beta_mark == 0)
			  {
			    assert (BTOR_IS_REGULAR_NODE (BTOR_PEEK_STACK (e, 0)));
			    param = btor_param_exp (btor, BTOR_PEEK_STACK (e, 0)->len, "");

			    /* mark lambda as to-be-rebuilt in 2nd pass */
			    real_cur->beta_mark = 1;
			    btor_assign_param (btor, real_cur, param);

#ifndef NDEBUG
			    BTOR_PUSH_STACK (mm, unassign_stack, real_cur);
#endif
			    /* open new scope in order to discard all 
			     * built expressions under 'real_cur' */
			    BETA_REDUCE_OPEN_NEW_SCOPE (real_cur);

			    /* add lambda to cur_scope (otherwise a new scope
			     * will be opened) */
			    btor_insert_in_ptr_hash_table (
			      cur_scope, real_cur)->data.asInt = 0;
			    BTOR_PUSH_STACK (mm, work_stack, real_cur);
			    BTOR_PUSH_STACK (mm, work_stack, cur_parent);

			    for (i = 0; i < real_cur->arity; i++)
			      btor_release_exp (btor, BTOR_PEEK_STACK (e, i));

			    /* rebuild lambda */
			    continue;
			  }
			/* build new lambda with new param 2nd pass */
			else
			  {
			    assert (real_cur->beta_mark == 1);
			    assert (BTOR_IS_REGULAR_NODE (BTOR_PEEK_STACK (e, 0)));
			    assert (BTOR_IS_PARAM_NODE (BTOR_PEEK_STACK (e, 0)));
			    result =
			      btor_lambda_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1));
			    /* decrement ref counter of param e[0] created in
			     * 1st pass */
			    btor_release_exp (btor, BTOR_PEEK_STACK (e, 0));
			    real_cur->beta_mark = 0;

			    assert (btor_param_cur_assignment (real_cur->e[0]));
			    btor_unassign_params (btor, real_cur);

#ifndef NDEBUG
			    (void) BTOR_POP_STACK (unassign_stack);
#endif

			    /* close scope that was opened in first pass */
			    BETA_REDUCE_CLOSE_SCOPE ();
			    /* restore mark of previous scope */
			    mbucket =
			      btor_find_in_ptr_hash_table (cur_scope, real_cur);
			    assert (mbucket);
			  }
		      }
		    /* lambda reduced to some term without e[0] */
		    else
		      {
			assert (!real_cur->beta_mark);
			/* if a lambda is reduced to a constant term and
			 * its parent expects an array, we have to create a
			 * constant lambda expression instead of a constant
			 * term. this can only occur with bounded or full
			 * reduction */
			if ((mode == BETA_RED_FULL || mode == BETA_RED_BOUNDED)
			    && (BTOR_IS_WRITE_NODE (cur_parent)
				|| BTOR_IS_ARRAY_COND_NODE (cur_parent)))
			  {
			    assert (!BTOR_REAL_ADDR_NODE (
				      BTOR_PEEK_STACK (e, 1))->parameterized);
			    param = btor_param_exp (btor,
				      BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))->len,
				      "");
			    result = btor_lambda_exp (btor, param, BTOR_PEEK_STACK (e, 1));
			    btor_release_exp (btor, param);
			  }
			else
			  {
			    result = btor_copy_exp (btor, BTOR_PEEK_STACK (e, 1));
			    result_parameterized = p.start[1];
			  }
		      }
		    break;
		  case BTOR_WRITE_NODE:
		    result =
		      btor_write_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1), BTOR_PEEK_STACK (e, 2));
		    break;
		  case BTOR_BCOND_NODE:
		  case BTOR_ACOND_NODE:
		    result =
		      btor_cond_exp (btor, BTOR_PEEK_STACK (e, 0), BTOR_PEEK_STACK (e, 1), BTOR_PEEK_STACK (e, 2));
		    if (!BTOR_IS_ARRAY_OR_BV_COND_NODE (result))
		      {
			if (BTOR_IS_BV_CONST_NODE (
			      BTOR_REAL_ADDR_NODE (BTOR_PEEK_STACK (e, 0))))
			  {
			    if (result == BTOR_PEEK_STACK (e, 1))
			      result_parameterized = p.start[1];
			    else
			      {
				assert (result == BTOR_PEEK_STACK (e, 2));
				result_parameterized = p.start[2];
			      }
			  }
		      }
		    break;
		  default:
		    /* not reachable */
		    assert (0);
		}

	      for (i = 0; i < real_cur->arity; i++)
		btor_release_exp (btor, BTOR_PEEK_STACK (e, i));
	    }

BETA_REDUCE_PUSH_ARG_STACK:
	  assert (mbucket->data.asInt != 2);
	  mbucket->data.asInt = 2;

	  /* only cache parameterized nodes */
	  if (real_cur->parameterized)
	    {
	      /* store result in current scope results */
	      assert (!btor_find_in_ptr_hash_table (cur_scope_results,
						    real_cur));
	      btor_insert_in_ptr_hash_table (cur_scope_results,
		real_cur)->data.asPtr = btor_copy_exp (btor, result);
	    }

	  /* close scope */
	  if (real_cur == cur_scope_lambda)
	    {
	      BETA_REDUCE_CLOSE_SCOPE ();
#ifndef NDEBUG
	      if (!BTOR_EMPTY_STACK (unassign_stack)
		  && BTOR_TOP_STACK (unassign_stack) == real_cur)
		(void) BTOR_POP_STACK (unassign_stack);
#endif
	      if (btor_param_cur_assignment (real_cur->e[0]))
		btor_unassign_params (btor, real_cur);
	    }

BETA_REDUCE_PUSH_ARG_STACK_WITHOUT_CLOSE_SCOPE:
	  if (BTOR_IS_INVERTED_NODE (cur))
	    result = BTOR_INVERT_NODE (result);

//	  printf ("  result: %s\n", node2string (result));
	  BTOR_PUSH_STACK (mm, arg_stack, result);
	  BTOR_PUSH_STACK (mm, parameterized_stack, result_parameterized);
	}
      else
	{
	  assert (mbucket->data.asInt == 2);
	  assert (cur_scope_results);

	  /* only parameterized nodes are cached */
	  if (real_cur->parameterized)
	    {
	      mbucket =
		btor_find_in_ptr_hash_table (cur_scope_results, real_cur);
	      assert (mbucket);
	      result = btor_copy_exp (btor, (BtorNode *) mbucket->data.asPtr);
	    }
	  else
	    result = btor_copy_exp (btor, real_cur);
	  assert (!BTOR_IS_LAMBDA_NODE (BTOR_REAL_ADDR_NODE (result)));
	  goto BETA_REDUCE_PUSH_ARG_STACK_WITHOUT_CLOSE_SCOPE; 
	}
    }
  assert (cur_scope);
  assert (cur_scope_results);
  assert (!cur_scope_lambda);
  assert (BTOR_EMPTY_STACK (scopes));
  assert (BTOR_EMPTY_STACK (scope_results));
  assert (BTOR_EMPTY_STACK (scope_lambdas));
  assert (BTOR_EMPTY_STACK (unassign_stack));
  assert (BTOR_COUNT_STACK (arg_stack) == 1);
  assert (BTOR_COUNT_STACK (parameterized_stack) == 1);
  result = BTOR_POP_STACK (arg_stack);
  assert (result);

  if (parameterized)
    *parameterized = BTOR_POP_STACK (parameterized_stack);

  /* cleanup */
  btor_delete_ptr_hash_table (cur_scope);
  for (b = cur_scope_results->first; b; b = b->next)
    btor_release_exp (btor, (BtorNode *) b->data.asPtr);
  btor_delete_ptr_hash_table (cur_scope_results);
  BTOR_RELEASE_STACK (mm, scopes);
  BTOR_RELEASE_STACK (mm, scope_results);
  BTOR_RELEASE_STACK (mm, scope_lambdas);
  BTOR_RELEASE_STACK (mm, work_stack);
  BTOR_RELEASE_STACK (mm, arg_stack);
  BTOR_RELEASE_STACK (mm, parameterized_stack);
  BTOR_RELEASE_STACK (mm, e);
  BTOR_RELEASE_STACK (mm, p);
#ifndef NDEBUG
  BTOR_RELEASE_STACK (mm, unassign_stack);
#endif

  if (aux_rewrite_level)
    {
      assert (mode == BETA_RED_CUTOFF);
      assert (!btor->rewrite_level);
      btor->rewrite_level = aux_rewrite_level;
    }

  BTORLOG ("beta_reduce: result %s", node2string (result));
  btor->time.beta += btor_time_stamp () - start;

  return result;
}

static BtorNode *
btor_beta_reduce_partial_aux (Btor * btor, BtorNode * exp,
			      BtorNode ** parameterized,
			      BtorPtrHashTable * cond_sel1,
			      BtorPtrHashTable * cond_sel2)
{
  assert (btor);
  assert (exp);
  assert (!cond_sel1 || cond_sel2);
  assert (!cond_sel2 || cond_sel1);
  BTORLOG ("%s: %s", __FUNCTION__, node2string (exp));

  int i, j, rwl;
  double start;
  const char *eval_res;
  BtorMemMgr *mm;
  BtorNode *cur, *real_cur, *cur_parent, *next, *result, **e, *args;
  BtorNode *parameterized_result, *cur_args;
  BtorNodePtrStack stack, rebuild_stack, arg_stack, args_stack, param_stack;
  BtorPtrHashTable *cache;
  BtorPtrHashBucket *b;
  BtorParamCacheTuple *t0;
  BtorNodeTuple *t1;

  if (!BTOR_REAL_ADDR_NODE (exp)->parameterized
      && !BTOR_IS_LAMBDA_NODE (BTOR_REAL_ADDR_NODE (exp)))
    return btor_copy_exp (btor, exp);

  start = btor_time_stamp ();
  btor->stats.beta_reduce_calls++;

  // FIXME: set rewriting level to 1 for now (performance issues)
  rwl = btor->rewrite_level;
  btor->rewrite_level = 1;

  mm = btor->mm;
  BTOR_INIT_STACK (stack);
  BTOR_INIT_STACK (rebuild_stack);
  BTOR_INIT_STACK (arg_stack);
  BTOR_INIT_STACK (param_stack);
  BTOR_INIT_STACK (args_stack);
  cache = btor_new_ptr_hash_table (mm,
				   (BtorHashPtr) btor_hash_param_cache_tuple,
				   (BtorCmpPtr) btor_compare_param_cache_tuple);

  real_cur = BTOR_REAL_ADDR_NODE (exp);

  /* skip all nested lambdas */
  if (BTOR_IS_LAMBDA_NODE (real_cur))
    exp = BTOR_LAMBDA_GET_BODY (real_cur);

  BTOR_PUSH_STACK (mm, stack, exp);
  BTOR_PUSH_STACK (mm, stack, 0);
  // TODO: intially we do not have args (assigned from outside)

  while (!BTOR_EMPTY_STACK (stack))
    {
      cur_parent = BTOR_POP_STACK (stack);
      cur = BTOR_POP_STACK (stack);
      real_cur = BTOR_REAL_ADDR_NODE (cur);
      assert (BTOR_COUNT_STACK (arg_stack) == BTOR_COUNT_STACK (param_stack));

      if (real_cur->beta_mark == 0)
	{
BETA_REDUCE_PARTIAL_START:
	  /* stop at non-parameterized nodes */
	  if (!real_cur->parameterized)
	    {
	      assert (BTOR_IS_FUN_NODE (real_cur)
		     || BTOR_IS_ARGS_NODE (real_cur)
		     || real_cur->tseitin);
	      BTOR_PUSH_STACK (mm, arg_stack, btor_copy_exp (btor, cur));
	      BTOR_PUSH_STACK (mm, param_stack, real_cur);
	      continue;
	    }
	  /* push assigned argument of parameter on argument stack */
	  else if (BTOR_IS_PARAM_NODE (real_cur))
	    {
	      next = btor_param_cur_assignment (real_cur);
	      assert (next);
	      if (BTOR_IS_INVERTED_NODE (cur))
		next = BTOR_INVERT_NODE (next);
	      BTOR_PUSH_STACK (mm, arg_stack, btor_copy_exp (btor, next));
	      BTOR_PUSH_STACK (mm, param_stack, real_cur);
	      continue;
	    }
	  /* evaluate ite nodes and continue with if or else branch */
	  else if (BTOR_IS_BV_COND_NODE (real_cur))
	    {
	      e = real_cur->e;
	      assert (BTOR_REAL_ADDR_NODE (e[0])->tseitin
		      || BTOR_REAL_ADDR_NODE (e[0])->parameterized
		      || BTOR_IS_BV_CONST_NODE (BTOR_REAL_ADDR_NODE (e[0])));
	      eval_res = btor_eval_exp (btor, e[0]);

	      if (eval_res)
		{
		  if (eval_res[0] == '1')
		    {
		      if (cond_sel1)
			{
			  t0 = btor_new_param_cache_tuple (btor,
				 BTOR_REAL_ADDR_NODE (e[0]));
			  if (!btor_find_in_ptr_hash_table (cond_sel1, t0))
			    btor_insert_in_ptr_hash_table (cond_sel1,
			      t0)->data.asPtr = e[0];
			  else
			    btor_delete_param_cache_tuple (btor, t0);
			}
		      next = e[1];
		    }
		  else
		    {
		      assert (eval_res[0] == '0');
		      if (cond_sel2)
			{
			  t0 = btor_new_param_cache_tuple (btor,
				 BTOR_REAL_ADDR_NODE (e[0]));
			  if (!btor_find_in_ptr_hash_table (cond_sel2, t0))
			    btor_insert_in_ptr_hash_table (cond_sel2,
			      t0)->data.asPtr = e[0];
			  else
			    btor_delete_param_cache_tuple (btor, t0);
			}
		      next = e[2];
		    }
		  assert (next);
		  if (BTOR_IS_INVERTED_NODE (cur))
		    next = BTOR_INVERT_NODE (next);
		  BTOR_PUSH_STACK (mm, stack, next);
		  BTOR_PUSH_STACK (mm, stack, real_cur);
		  btor_freestr (mm, (char *) eval_res);
		  continue;
		}
	    }
	  /* assign params of lambda expression */
	  else if (BTOR_IS_LAMBDA_NODE (real_cur)
		   && BTOR_IS_APPLY_NODE (cur_parent)
		   /* check if we have arguments on the stack */
	           && !BTOR_EMPTY_STACK (arg_stack)
		   /* if it is nested, its parameter is already assigned */
		   && !btor_param_cur_assignment (real_cur->e[0]))
	    {
	      args = BTOR_TOP_STACK (arg_stack);
	      assert (BTOR_IS_ARGS_NODE (args));
	      btor_assign_args (btor, real_cur, args);
	    }

	  real_cur->beta_mark = 1;
	  BTOR_PUSH_STACK (mm, stack, cur);
	  BTOR_PUSH_STACK (mm, stack, cur_parent);

	  for (i = 0; i < real_cur->arity; i++)
	    {
	      BTOR_PUSH_STACK (mm, stack, real_cur->e[i]);
	      BTOR_PUSH_STACK (mm, stack, real_cur);
	    }
	}
      else if (real_cur->beta_mark == 1)
	{
	  assert (real_cur->parameterized);
	  assert (real_cur->arity >= 1);
	  assert (BTOR_COUNT_STACK (arg_stack) >= real_cur->arity);

	  real_cur->beta_mark = 2;
	  arg_stack.top -= real_cur->arity;
	  param_stack.top -= real_cur->arity;
	  e = arg_stack.top;  /* arguments in reverse order */
	  parameterized_result = real_cur;

	  switch (real_cur->kind)
	    {
	      case BTOR_SLICE_NODE:
		result =
		  btor_slice_exp (btor, e[0], real_cur->upper, real_cur->lower);
		btor_release_exp (btor, e[0]);
		break;
	      case BTOR_AND_NODE:
		result = btor_and_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_BEQ_NODE:
	      case BTOR_AEQ_NODE:
		result = btor_eq_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_ADD_NODE:
		result = btor_add_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_MUL_NODE:
		result = btor_mul_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_ULT_NODE:
		result = btor_ult_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_SLL_NODE:
		result = btor_sll_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_SRL_NODE:
		result = btor_srl_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_UDIV_NODE:
		result = btor_udiv_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_UREM_NODE:
		result = btor_urem_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_CONCAT_NODE:
		result = btor_concat_exp (btor, e[1], e[0]);
		btor_release_exp (btor, e[0]);
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_ARGS_NODE:
		for (j = 0; j < real_cur->arity; j++)
		  BTOR_PUSH_STACK (mm, args_stack, e[real_cur->arity - 1 - j]);
		result =
		  btor_args_exp (btor, real_cur->arity, args_stack.start); 
		for (j = 0; j < real_cur->arity; j++)
		  btor_release_exp (btor, args_stack.start[j]);
		BTOR_RESET_STACK (args_stack);
		break;
	      case BTOR_APPLY_NODE:
		if (BTOR_IS_FUN_NODE (BTOR_REAL_ADDR_NODE (e[1])))
		  {
		    result = btor_apply_exp (btor, e[1], e[0]);
		    btor_release_exp (btor, e[1]);
		  }
		else
		  {
		    result = e[1];
		    parameterized_result = param_stack.top[1];
		  }
		btor_release_exp (btor, e[0]);
		break;
	      case BTOR_LAMBDA_NODE:
		/* lambdas are always reduced to some term without e[1] */
		assert (!BTOR_REAL_ADDR_NODE (e[0])->parameterized);
		result = e[0];
		parameterized_result = param_stack.top[0];
		btor_release_exp (btor, e[1]);
		break;
	      case BTOR_BCOND_NODE:
		  result = btor_cond_exp (btor, e[2], e[1], e[0]);
		  btor_release_exp (btor, e[0]);
		  btor_release_exp (btor, e[1]);
		  btor_release_exp (btor, e[2]);
		break;
	      default:
		printf ("%s\n", node2string (real_cur));
		result = 0;
		/* not reachable */
		assert (0);
	    }

	    /* cache rebuilt parameterized node with current arguments */
	    t0 = btor_new_param_cache_tuple (btor, real_cur);
	    assert (!btor_find_in_ptr_hash_table (cache, t0));
	    t1 = new_node_tuple (btor, result, parameterized_result);
	    btor_insert_in_ptr_hash_table (cache, t0)->data.asPtr = t1;

	    /* we still need the assigned argument for caching */
	    if (BTOR_IS_LAMBDA_NODE (real_cur))
		btor_unassign_params (btor, real_cur);

BETA_REDUCE_PARTIAL_PUSH_RESULT:
	    if (BTOR_IS_INVERTED_NODE (cur))
	      result = BTOR_INVERT_NODE (result);

	    BTOR_PUSH_STACK (mm, arg_stack, result);
	    BTOR_PUSH_STACK (mm, param_stack, parameterized_result);
	}
      else
	{
	  assert (real_cur->parameterized);
	  assert (real_cur->beta_mark == 2);
	  if (BTOR_IS_LAMBDA_NODE (real_cur))
	    {
	      assert (BTOR_IS_ARGS_NODE (BTOR_TOP_STACK (arg_stack)));
	      cur_args = BTOR_TOP_STACK (arg_stack);
	      btor_assign_args (btor, real_cur, cur_args);
	      t0 = btor_new_param_cache_tuple (btor, real_cur);
	      btor_unassign_params (btor, real_cur);
	    }
	  else
	    t0 = btor_new_param_cache_tuple (btor, real_cur);

	  b = btor_find_in_ptr_hash_table (cache, t0);
	  btor_delete_param_cache_tuple (btor, t0);
	  /* real_cur not yet cached with current param assignment, rebuild
	   * expression */
	  if (!b)
	    {
	      real_cur->beta_mark = 0;
	      goto BETA_REDUCE_PARTIAL_START;
	    }
	  assert (b);
	  t1 = (BtorNodeTuple *) b->data.asPtr;
	  result = btor_copy_exp (btor, t1->e0);
	  parameterized_result = t1->e1;
	  assert (!BTOR_IS_LAMBDA_NODE (BTOR_REAL_ADDR_NODE (result)));
	  goto BETA_REDUCE_PARTIAL_PUSH_RESULT; 
	}
    }
  assert (BTOR_COUNT_STACK (arg_stack) == 1);
  assert (BTOR_COUNT_STACK (param_stack) == 1);
  result = BTOR_POP_STACK (arg_stack);
  assert (result);

  if (parameterized)
    {
      real_cur = BTOR_POP_STACK (param_stack);
      assert (BTOR_IS_REGULAR_NODE (real_cur));
      *parameterized = real_cur->parameterized ? real_cur : 0;
      BTORLOG ("%s: parameterized %s", __FUNCTION__,
	       node2string (*parameterized));
    }

  /* release cache and reset beta_mark flags */
  for (b = cache->first; b; b = b->next)
    {
      t0 = (BtorParamCacheTuple *) b->key;
      real_cur = t0->exp;
      assert (BTOR_IS_REGULAR_NODE (real_cur));
      real_cur->beta_mark = 0;
      btor_delete_param_cache_tuple (btor, t0);
      delete_node_tuple (btor, (BtorNodeTuple *) b->data.asPtr);
    }

  BTOR_RELEASE_STACK (mm, stack);
  BTOR_RELEASE_STACK (mm, rebuild_stack);
  BTOR_RELEASE_STACK (mm, arg_stack);
  BTOR_RELEASE_STACK (mm, param_stack);
  BTOR_RELEASE_STACK (mm, args_stack);
  btor_delete_ptr_hash_table (cache);
  btor->rewrite_level = rwl;

  BTORLOG ("%s: result %s", __FUNCTION__, node2string (result));
  btor->time.beta += btor_time_stamp () - start;
  return result;
}

BtorNode *
btor_beta_reduce_full (Btor * btor, BtorNode * exp)
{
  BTORLOG ("%s: %s", __FUNCTION__, node2string (exp));
  return btor_beta_reduce (btor, exp, BETA_RED_FULL, 0, 0);
}

BtorNode *
btor_beta_reduce_chains (Btor * btor, BtorNode * exp)
{
  BTORLOG ("%s: %s", __FUNCTION__, node2string (exp));
  return btor_beta_reduce (btor, exp, BETA_RED_LAMBDA_CHAINS, 0, 0);
}

BtorNode *
btor_beta_reduce_bounded (Btor * btor, BtorNode * exp, int bound)
{
  BTORLOG ("%s: %s", __FUNCTION__, node2string (exp));
  return btor_beta_reduce (btor, exp, BETA_RED_BOUNDED, 0, bound);
}

BtorNode *
btor_beta_reduce_partial (Btor * btor, BtorNode * exp,
			  BtorNode ** parameterized)
{
  BTORLOG ("%s: %s", __FUNCTION__, node2string (exp));
  return btor_beta_reduce_partial_aux (btor, exp, parameterized, 0, 0);
}

BtorNode *
btor_beta_reduce_partial_collect (Btor * btor, BtorNode * exp,
				  BtorPtrHashTable * cond_sel1,
				  BtorPtrHashTable * cond_sel2)
{
  BTORLOG ("%s: %s", __FUNCTION__, node2string (exp));
  return btor_beta_reduce_partial_aux (btor, exp, 0, cond_sel1, cond_sel2);
}

BtorNode *
btor_apply_and_reduce (Btor * btor, int argc, BtorNode ** args,
		       BtorNode *lambda)
{
  assert (btor);
  assert (argc >= 0);
  assert (argc < 1 || args);
  assert (lambda);

  int i;
  BtorNode *result, *cur;
  BtorNodePtrStack unassign;
  BtorMemMgr *mm;

  mm = btor->mm;

  BTOR_INIT_STACK (unassign);

  cur = lambda;
  for (i = 0; i < argc; i++)
    {
      assert (BTOR_IS_REGULAR_NODE (cur));
      assert (BTOR_IS_LAMBDA_NODE (cur));
      btor_assign_param (btor, cur, args[i]);
      BTOR_PUSH_STACK (mm, unassign, cur);
      cur = BTOR_REAL_ADDR_NODE (cur->e[1]);
    }

  result = btor_beta_reduce_full (btor, lambda);

  while (!BTOR_EMPTY_STACK (unassign))
    {
      cur = BTOR_POP_STACK (unassign);
      btor_unassign_params (btor, cur);
    }

  BTOR_RELEASE_STACK (mm, unassign);

  return result;
}
