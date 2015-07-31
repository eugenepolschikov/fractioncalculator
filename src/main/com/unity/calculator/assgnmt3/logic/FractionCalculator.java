package main.com.unity.calculator.assgnmt3.logic;

import main.com.unity.calculator.assgnmt3.fractionmath.FractionBaseOperation;
import main.com.unity.calculator.assgnmt3.fractionmath.FractionReduce;
import main.com.unity.calculator.assgnmt3.fractionmath.MyFraction;
import main.com.unity.calculator.assgnmt3.math.BinaryOperation;
import org.apache.commons.math3.fraction.Fraction;

/**
 * Created by ypolshchykau on 31.07.2015.
 */
public class FractionCalculator {
    private Fraction answer;

    public void calculate(MyFraction left, MyFraction right, String operation) {
        FractionBaseOperation op = FractionOperationsMapper.getOperations().get(operation);
        if (op != null) {
            answer = op.resultFor(left, right);
        } else {
            throw new RuntimeException("Error: Unknown operator");
        }

        answer =FractionReduce.fractionReduce(answer.getNumerator(),answer.getDenominator());

    }

    public void printAnswer() {
        System.out.println("answer= " + answer.toString());
    }

}
