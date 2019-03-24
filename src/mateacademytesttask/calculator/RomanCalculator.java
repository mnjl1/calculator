package mateacademytesttask.calculator;

import mateacademytesttask.numbercreation.OperatorCreator;
import mateacademytesttask.numbercreation.RomanCreator;

public class RomanCalculator {

    public static void calculateRoman(){
        System.out.println("Enter Roman from I to X");
        int a = RomanCreator.romanNumberConverter();
        String operator = OperatorCreator.createOperator();
        System.out.println("Enter Roman from I to X");
        int b = RomanCreator.romanNumberConverter();

        System.out.println("Result: " +Calculate.calculate(a, b, operator));
    }
}
