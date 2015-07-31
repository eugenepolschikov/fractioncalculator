package main.com.unity.calculator.assgnmt3.logic;




import main.com.unity.calculator.assgnmt3.fractionmath.MyFraction;

import java.util.Map;
import java.util.Scanner;


import static main.com.unity.calculator.assgnmt3.helpers.DataValidator.*;

/**
 * Created by ypolshchykau on 27.11.2014.
 */
public class InputData {
    private String left;
    private String right;
    private String operation;

    private String numFirstFraction;
    private String denomFirstFraction;

    private String numSecondFraction;
    private String denomSecondFraction;
    private String fractionOperation;



    /**
     * input data for base calculator
     */
    public void numbersAndOperationInput() {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first number:");
        left = in.nextLine();

        if (!isNumeric(left)) {
            throw new ArithmeticException("illegal double value: " + left);
        }

        System.out.println("enter second number:");
        right = in.nextLine();

        if (!isNumeric(right)) {
            throw new ArithmeticException("illegal double value: " + right);
        }

        System.out.println("enter operation:");
        operation = in.nextLine();

        if (!operationValidator(operation)) {
            throw new IllegalArgumentException("illegal operation value: " + operation);
        }

        in.close();

    }

    /**
     * get left number for base calc
     * @return
     */

    public double getLeftNumber() {
        return Double.parseDouble(left);
    }


    /**
     * get right number for base calc
     * @return
     */

    public double getRightNumber() {
        return Double.parseDouble(right);
    }


    /**
     * get operatoin for base calc
     * @return
     */
    public String getOperation() {
        return operation;
    }


    /**
     * input data for fraction calculation
     */
    public void inputFractionsAndOperationData() {

        Scanner in = new Scanner(System.in);

        System.out.println("enter numerator of the first fraction:");
        numFirstFraction = in.nextLine();

        if (!isInteger(numFirstFraction)) {
            throw new ArithmeticException("illegal integer value: " + numFirstFraction);
        }



        System.out.println("enter denominator of the first fraction:");
        denomFirstFraction = in.nextLine();

        if (!isInteger( denomFirstFraction)) {
            throw new ArithmeticException("illegal integer value: " +  denomFirstFraction);
        }


        System.out.println("enter numerator of the second fraction:");
        numSecondFraction = in.nextLine();

        if (!isInteger(numSecondFraction)) {
            throw new ArithmeticException("illegal integer value: " + numSecondFraction);
        }



        System.out.println("enter denominator of the second fraction:");
        denomSecondFraction = in.nextLine();

        if (!isInteger( denomSecondFraction)) {
            throw new ArithmeticException("illegal integer value: " +  denomSecondFraction);
        }


        System.out.println("enter fraction operation :");
        fractionOperation = in.nextLine();

        if (!fractionOperationValidation(fractionOperation)) {
            throw new IllegalArgumentException("illegal operation value: " + fractionOperation);
        }

        in.close();

    }

    public MyFraction getLeftFraction(){
        return new MyFraction(Integer.parseInt(numFirstFraction), Integer.parseInt(denomFirstFraction));
    }

    public MyFraction getRightFraction(){
        return new MyFraction(Integer.parseInt(numSecondFraction), Integer.parseInt(denomSecondFraction));
    }

    public String getFractionOperation(){
        return fractionOperation;
    }


}
