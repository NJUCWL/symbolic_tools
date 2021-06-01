#include "../../boolector.h"
#include <stdlib.h>
#include <stdio.h>
#include <assert.h>

#define BV2_EXAMPLE_NUM_BITS 8

/* We try to show the following theorem:
 * v1 > 0 & v2 > 0  =>  v1 + v2 > 0
 *
 * The theorem is valid if v1 and v2 are naturals, but not if they
 * are two's complement bit-vectors as addition can overflow.
 */

int
main (void)
{
  Btor *btor;
  BtorNode *v1, *v2, *add, *zero, *vars_sgt_zero, *impl;
  BtorNode *v1_sgt_zero, *v2_sgt_zero, *add_sgt_zero, *formula;
  char *assignments[10];
  int result, i;

  btor = boolector_new ();
  boolector_enable_model_gen (btor);

  v1 = boolector_var (btor, BV2_EXAMPLE_NUM_BITS, NULL);
  v2 = boolector_var (btor, BV2_EXAMPLE_NUM_BITS, NULL);
  zero = boolector_zero (btor, BV2_EXAMPLE_NUM_BITS);

  v1_sgt_zero = boolector_sgt (btor, v1, zero);
  v2_sgt_zero = boolector_sgt (btor, v2, zero);
  vars_sgt_zero = boolector_and (btor, v1_sgt_zero, v2_sgt_zero);

  add = boolector_add (btor, v1, v2);
  add_sgt_zero = boolector_sgt (btor, add, zero);

  impl = boolector_implies (btor, vars_sgt_zero, add_sgt_zero);

  /* We negate the formula and try to show that the negation is unsatisfiable */
  formula = boolector_not (btor, impl);

  /* We assert the formula and call Boolector */
  boolector_assert (btor, formula);
  result = boolector_sat (btor);
  if (result == BOOLECTOR_SAT)
    printf ("Instance is satisfiable");
  else
    abort ();

  /* The formula is not valid, we have found a counter-example.
   * Now, we are able to obtain assignments to arbitrary expressions */
  i = 0;
  assignments[i++] = boolector_bv_assignment (btor, zero);
  assignments[i++] = boolector_bv_assignment (btor, v1);
  assignments[i++] = boolector_bv_assignment (btor, v2);
  assignments[i++] = boolector_bv_assignment (btor, add);
  assignments[i++] = boolector_bv_assignment (btor, v1_sgt_zero);
  assignments[i++] = boolector_bv_assignment (btor, v2_sgt_zero);
  assignments[i++] = boolector_bv_assignment (btor, vars_sgt_zero);
  assignments[i++] = boolector_bv_assignment (btor, add_sgt_zero);
  assignments[i++] = boolector_bv_assignment (btor, impl);
  assignments[i++] = boolector_bv_assignment (btor, formula);

  i = 0;
  printf ("Assignment to 0: %s\n", assignments[i++]);
  printf ("Assignment to v1: %s\n", assignments[i++]);
  printf ("Assignment to v2: %s\n", assignments[i++]);
  printf ("Assignment to v1 + v2: %s\n", assignments[i++]);
  printf ("Assignment to v1 > 0: %s\n", assignments[i++]);
  printf ("Assignment to v2 > 0: %s\n", assignments[i++]);
  printf ("Assignment to v1 > 0 & v2 > 0: %s\n", assignments[i++]);
  printf ("Assignment to v1 + v2 > 0: %s\n", assignments[i++]);
  printf ("Assignment to v1 > 0 & v2 > 0  => v1 + v2 > 0: %s\n",
	  assignments[i++]);
  printf ("Assignment to !(v1 > 0 & v2 > 0  => v1 + v2 > 0): %s\n",
	  assignments[i++]);
  for (i = 0; i < 10; i++)
    boolector_free_bv_assignment (btor, assignments[i]);

  /* cleanup */
  boolector_release (btor, zero);
  boolector_release (btor, v1);
  boolector_release (btor, v2);
  boolector_release (btor, add);
  boolector_release (btor, impl);
  boolector_release (btor, formula);
  boolector_release (btor, v1_sgt_zero);
  boolector_release (btor, v2_sgt_zero);
  boolector_release (btor, vars_sgt_zero);
  boolector_release (btor, add_sgt_zero);
  assert (boolector_get_refs (btor) == 0);
  boolector_delete (btor);
  return 0;
}
