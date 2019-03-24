package mateacademytesttask.calculator;

import mateacademytesttask.numbercreation.OperatorCreator;
import mateacademytesttask.numbercreation.IntegerCreator;

public class ArabicCalculator {

    public static void arabicCalculationStarter(){
        System.out.println("Enter any number:");
        int a = IntegerCreator.createNumber();
        String operator = OperatorCreator.createOperator();
        System.out.println("Enter any number:");
        int b = IntegerCreator.createNumber();

        System.out.println("Result: " +Calculate.calculate(a, b, operator));
    }
}
