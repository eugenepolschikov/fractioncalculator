package main.com.unity.calculator.assgnmt3.logic;




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

    public double getLeftNumber() {
        return Double.parseDouble(left);
    }

    public double getRightNumber() {
        return Double.parseDouble(right);
    }


    public String getOperation() {
        return operation;
    }


}
