/*
 * Copyright (C) 2015, United States Government, as represented by the 
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 * 
 * The PSYCO: A Predicate-based Symbolic Compositional Reasoning environment 
 * platform is licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. You may obtain a 
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0. 
 * 
 * Unless required by applicable law or agreed to in writing, software distributed 
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 */
package gov.nasa.jpf.jdart.bytecode;

import gov.nasa.jpf.constraints.expressions.CastExpression;
import gov.nasa.jpf.constraints.types.BuiltinTypes;
import gov.nasa.jpf.jdart.ConcolicInstructionFactory;
import gov.nasa.jpf.jdart.ConcolicUtil;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;


/**
 * Convert float to long
 * ..., value => ..., result
 */
public class F2L extends gov.nasa.jpf.jvm.bytecode.F2L {

  @Override
  public Instruction execute (ThreadInfo ti) {
    StackFrame sf = ti.getTopFrame();
    
    if(sf.getOperandAttr() == null) {
      return super.execute(ti); 
    }
    
    ConcolicUtil.Pair<Float> val = ConcolicUtil.popFloat(sf);
    
    float f = val.conc;
    CastExpression<Float,Long> cast = CastExpression.create(
            val.symb, BuiltinTypes.SINT64);
    
    ConcolicUtil.Pair<Long> result = new ConcolicUtil.Pair<Long>( (long) f, cast);
    ConcolicUtil.pushLong(result, sf);
    
    if (ConcolicInstructionFactory.DEBUG) ConcolicInstructionFactory.logger.finest("Execute F2L: " + result);
    return getNext(ti);    
  }
}
