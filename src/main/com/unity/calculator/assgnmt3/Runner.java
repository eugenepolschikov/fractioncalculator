package main.com.unity.calculator.assgnmt3;



import main.com.unity.calculator.assgnmt3.logic.FractionCalculator;
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

        dataForCalculation.inputFractionsAndOperationData();
        FractionCalculator fractionCalculator = new FractionCalculator();
        fractionCalculator.calculate(dataForCalculation.getLeftFraction(),dataForCalculation.getRightFraction(),
                dataForCalculation.getFractionOperation());
        fractionCalculator.printAnswer();

    }
}
