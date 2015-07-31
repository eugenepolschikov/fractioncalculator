package main.com.unity.calculator.assgnmt3.helpers;

import java.util.regex.Pattern;

/**
 * Created by ypolshchykau on 27.11.2014.
 * class containing validators for double value and for string value as well
 */
public class DataValidator {

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean operationValidator(String str) {


//        final Pattern pattern = Pattern.compile("[A-Za-z\\,\\.\\^\\'\\-\\*/]\\+");
        final Pattern pattern = Pattern.compile(".");

        return pattern.matcher(str).matches();

    }

    public static boolean fractionOperationValidation(String op){
        return  op.matches( "[-+*/]" );
    }


    /**
     * method for analysis of Integer user input
     */
    public static boolean isInteger(String str){
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


}
