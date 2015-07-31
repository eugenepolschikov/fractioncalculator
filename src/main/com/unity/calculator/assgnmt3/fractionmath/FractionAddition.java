package main.com.unity.calculator.assgnmt3.fractionmath;

import org.apache.commons.math3.fraction.Fraction;
/**
 * Created by ypolshchykau on 31.07.2015.
 */
public class FractionAddition extends  FractionBaseOperation {
    public  Fraction resultFor(MyFraction left, MyFraction right){
        Fraction a=left.getNewFraction();
        Fraction b=right.getNewFraction();
        Fraction result = a.add(b);
        return  result;
    }
}
