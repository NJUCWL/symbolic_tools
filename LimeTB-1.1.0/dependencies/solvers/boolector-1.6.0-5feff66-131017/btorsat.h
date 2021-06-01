/*  Boolector: Satisfiablity Modulo Theories (SMT) solver.
 *
 *  Copyright (C) 2007-2009 Robert Daniel Brummayer.
 *  Copyright (C) 2007-2012 Armin Biere.
 *
 *  All rights reserved.
 *
 *  This file is part of Boolector.
 *  See COPYING for more information on using this software.
 */

#ifndef BTORSAT_H_INCLUDED
#define BTORSAT_H_INCLUDED

#include "btormem.h"

#include <stdio.h>

/*------------------------------------------------------------------------*/

typedef struct BtorSATMgr BtorSATMgr;

struct BtorSATMgr
{
  void * solver;

  BtorMemMgr *mm;
  const char * name;
  const char * optstr;
  int verbosity;
  int inc_required;
  int used_that_inc_was_not_required;
#ifdef BTOR_USE_LINGELING
  int nofork;
#endif
  FILE * output;

  int satcalls;
  int initialized;
  int clauses;
  int true_lit;
  int maxvar;

  double sat_time;

  struct {

    void (*add) (BtorSATMgr *, int);
    void (*assume) (BtorSATMgr*, int);
    int (*changed) (BtorSATMgr*);
    int (*deref) (BtorSATMgr*, int);
    void (*enable_verbosity)(BtorSATMgr*,int);
    int (*failed) (BtorSATMgr*, int);
    int (*fixed) (BtorSATMgr*, int);
    int (*inc_max_var) (BtorSATMgr*);
    int (*inconsistent) (BtorSATMgr*);
    void *(*init) (BtorSATMgr *);
    void (*melt) (BtorSATMgr*, int);
    int (*repr) (BtorSATMgr*,int);
    void (*reset) (BtorSATMgr*);
    int (*sat) (BtorSATMgr*, int);
    void (*set_output) (BtorSATMgr*,FILE *);
    void (*set_prefix) (BtorSATMgr*,const char *);
    void (*stats) (BtorSATMgr*);
    int (*variables) (BtorSATMgr*);

  } api;
};

/*------------------------------------------------------------------------*/

#define BTOR_MEM_MGR_SAT(SMGR) ((SMGR)->mm)
#define BTOR_GET_SOLVER_SAT(SMGR) ((SMGR)->solver)

/*------------------------------------------------------------------------*/

#define BTOR_SAT 10
#define BTOR_UNSAT 20
#define BTOR_UNKNOWN 0

/*------------------------------------------------------------------------*/

/* Creates new SAT manager.
 * A SAT manager is used by nearly all functions of the SAT layer.
 */
BtorSATMgr *btor_new_sat_mgr (BtorMemMgr * mm);

BtorMemMgr * btor_mem_mgr_sat (BtorSATMgr * smgr);

void * btor_get_solver_sat (BtorSATMgr * smgr);

void btor_msg_sat (BtorSATMgr *, int, const char *, ...);

/* Sets verbosity [-1,3] */
void btor_set_verbosity_sat_mgr (BtorSATMgr * smgr, int verbosity);

/* Returns if the SAT solver has already been initialized */
int btor_is_initialized_sat (BtorSATMgr * smgr);

/* Deletes SAT manager from memory. */
void btor_delete_sat_mgr (BtorSATMgr * smgr);

/* Generates fresh CNF indices.
 * Indices are generated in consecutive order. */
int btor_next_cnf_id_sat_mgr (BtorSATMgr * smgr);

/* Mark old CNF index as not used anymore. */
void btor_release_cnf_id_sat_mgr (BtorSATMgr * smgr, int);

/* Returns the last CNF index that has been generated. */
int btor_get_last_cnf_id_sat_mgr (BtorSATMgr * smgr);

/* Inits the SAT solver. */
void btor_init_sat (BtorSATMgr * smgr);

/* Sets the output file of the SAT solver. */
void btor_set_output_sat (BtorSATMgr * smgr, FILE *output);

/* Enables verbosity mode of SAT solver. */
void btor_enable_verbosity_sat (BtorSATMgr * smgr, int);

/* Prints statistics of SAT solver. */
void btor_print_stats_sat (BtorSATMgr *smgr);

/* Adds literal to the current clause of the SAT solver.
 * 0 terminates the current clause.
 */
void btor_add_sat (BtorSATMgr * smgr, int lit);

/* Adds assumption to SAT solver.
 * Requires that SAT solver supports this.
 */
void btor_assume_sat (BtorSATMgr * smgr, int lit);

/* Checks whether an assumption failed during
 * the last SAT solver call 'btor_sat_sat'.
 */
int btor_failed_sat (BtorSATMgr * smgr, int lit);

/* Solves the SAT instance.
 * limit < 0 -> no limit.
 */
int btor_sat_sat (BtorSATMgr * smgr, int limit);

/* Gets assignment of a literal (in the SAT case).
 * Do not call before calling btor_sat_sat.
 */
int btor_deref_sat (BtorSATMgr * smgr, int lit);

/* Gets equivalence class represenative of a literal
 * or the literal itself if it is in a singleton
 * equivalence, fixed or eliminated.
 * Do not call before calling btor_sat_sat.
 */
int btor_repr_sat (BtorSATMgr * smgr, int lit);

/* Gets assignment of a literal (in the SAT case)
 * similar to 'deref', but only consider top level.
 * Do not call before calling btor_sat_sat.
 */
int btor_fixed_sat (BtorSATMgr * smgr, int lit);

/* Resets the status of the SAT solver. */
void btor_reset_sat (BtorSATMgr * smgr);

/* Determines if assignments have been changed
 * as constraints have been added.
 */
int btor_changed_sat (BtorSATMgr * smgr);

/* Determine wether SAT solver is already inconsistent.
 */
int btor_inconsistent_sat (BtorSATMgr * smgr);

#ifdef BTOR_USE_PICOSAT
/* Enables PicoSAT as SAT preprocessor. */
void btor_enable_picosat_sat (BtorSATMgr * smgr);
#endif

#ifdef BTOR_USE_LINGELING
/* Enables Lingeling as SAT preprocessor. */
int btor_enable_lingeling_sat (BtorSATMgr * smgr,
			       const char * options,
			       int nofork);
#endif

#ifdef BTOR_USE_MINISAT
/* Enables MiniSAT as SAT preprocessor. */
void btor_enable_minisat_sat (BtorSATMgr * smgr);
#endif

/* Only used for debugging purposes at this point */
int btor_provides_incremental_sat (BtorSATMgr * smgr);

#endif
