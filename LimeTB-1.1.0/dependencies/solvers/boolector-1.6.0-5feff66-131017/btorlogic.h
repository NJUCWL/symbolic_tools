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

#ifndef BTORLOGIC_H_INCLUDED
#define BTORLOGIC_H_INCLUDED

enum BtorLogic
{
  BTOR_LOGIC_QF_BV = 0,
  BTOR_LOGIC_QF_AUFBV,
};

typedef enum BtorLogic BtorLogic;

#endif

