package main.com.unity.calculator.assgnmt3.fractionmath;

import org.apache.commons.math3.fraction.Fraction;

/**
 * Created by ypolshchykau on 30.07.2015.
 * class for fraction initialization and baes fraction methods  implementation
 */
public class MyFraction {
    private int numenator;
    private int denomenator;
    private Fraction newFraction;

    public Fraction getNewFraction() {
        return newFraction;
    }


    public MyFraction(int num, int denom) {
        newFraction = new Fraction(num, denom);

    }

    /**
     * Returns the String representing this fraction, ie "num / dem" or just "num" if the denominator is one.
     *
     * @return
     */
    public String toString() {
        return newFraction.toString();
    }

    /**
     * Access the denominator.
     * @return
     */
    public int getDenominator() {
        return newFraction.getDenominator();
    }

    /**
     * Access the numerator.
     * @return
     */
    public int getNumerator() {
        return newFraction.getNumerator();
    }

    /**
     * get inverse fraction to the initialized one
     */
    public Fraction inverse(){
        return new Fraction(newFraction.getDenominator(), newFraction.getNumerator());
    }



}
