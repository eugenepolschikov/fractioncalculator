package main.com.unity.calculator.assgnmt3.fractionmath;

import org.apache.commons.math3.fraction.Fraction;

/**
 * Created by ypolshchykau on 31.07.2015.
 * this class normalizes the representation of the fraction:
 * method normalizeFraction divides numenator and denominetor by the common divisor
 * if one exists
 */
public class FractionReduce {
    private static Fraction reduced;
    public static Fraction fractionReduce(int numenator, int denominator){
        reduced=  Fraction.getReducedFraction( numenator, denominator);
        return reduced;
    }
}
