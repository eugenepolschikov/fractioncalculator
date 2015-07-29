package main.com.unity.calculator.assgnmt3;


import main.com.unity.calculator.assgnmt3.logic.Calculator;
import main.com.unity.calculator.assgnmt3.logic.InputData;

/**
 * Runner class-
 * other classes' instances creation
 * and test calculator logic
 *
 */
public class Runner
{
    public static void main( String[] args )
    {

        InputData dataForCalculation= new InputData();

        dataForCalculation.numbersAndOperationInput();

        Calculator calculation= new Calculator();

        calculation.calculate(dataForCalculation.getLeftNumber(),dataForCalculation.getRightNumber(),
                dataForCalculation.getOperation());

        calculation.printAnswer();
    }
}
