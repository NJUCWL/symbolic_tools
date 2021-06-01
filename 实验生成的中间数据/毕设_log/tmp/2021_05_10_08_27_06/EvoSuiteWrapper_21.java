import static tardis.compile.path_condition_distance.DistanceBySimilarityWithPathCondition.distance;

import static java.lang.Double.*;
import static java.lang.Math.*;

import tardis.compile.path_condition_distance.*;
import tardis.logging.Level;
import tardis.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvoSuiteWrapper_21 {
    private static final double SMALL_DISTANCE = 1;
    private static final double BIG_DISTANCE = 1E300;


    private final HashMap<Long, String> constants = new HashMap<>();
    private final ClassLoader classLoader;

    public EvoSuiteWrapper_21(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public double test0(org.apache.bcel.generic.InstructionList V0) throws Exception {
        //generated for state [0]
        final ArrayList<ClauseSimilarityHandler> pathConditionHandler = new ArrayList<>();
        ValueCalculator valueCalculator;

        final HashMap<String, Object> candidateObjects = new HashMap<>();
        candidateObjects.put("{ROOT}:this", V0);
        double d = distance(pathConditionHandler, candidateObjects, this.constants, this.classLoader);
        if (d == 0.0d)
            System.out.println("test0 0 distance");
        return d;
    }
}
