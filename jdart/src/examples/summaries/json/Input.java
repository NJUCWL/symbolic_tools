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
package summaries.json;

import gov.nasa.jpf.jdart.Symbolic;

/**
 *
 */
public class Input {
  
  public class TotallyPsyco extends RuntimeException {
  
  }
  
  @Symbolic("true")
  private int state = 0;
  
  private int concrete = 1;
  
  public int testConcrete(int p1) {
    if (p1 > concrete) {
      throw new TotallyPsyco();
    } 
    return p1 + 100;
  }
  
  public int testSymbolic(int p1, boolean p2) {
    if (p1 != state) {
      state = p1;
    }
    return p2 ? 1 : 0;
  }
          
          
}
