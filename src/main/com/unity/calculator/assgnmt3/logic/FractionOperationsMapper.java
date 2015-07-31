package main.com.unity.calculator.assgnmt3.logic;

import main.com.unity.calculator.assgnmt3.fractionmath.*;
import main.com.unity.calculator.assgnmt3.math.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ypolshchykau on 31.07.2015.
 */
public class FractionOperationsMapper {


    private static Map<String, FractionBaseOperation> operations = new HashMap<String, FractionBaseOperation>();

    static {

        operations.put("*", new FractionMultiplication());
        operations.put("+", new FractionAddition());
        operations.put("/", new FractionDivision());
        operations.put("-", new FractionSubtraction());


    }

    public static Map<String, FractionBaseOperation> getOperations() {
        return operations;
    }


}
