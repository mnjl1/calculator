package mateacademytesttask.calculator;

import mateacademytesttask.numbercreation.IntegerCreator;

public class Calculate {

    public static int calculate(int a, int b, String operator){

        int result = 0;

        if (operator.equalsIgnoreCase("+")){
            result = a + b;
        }

        if (operator.equalsIgnoreCase("-")){
            result = a - b;
        }

        if (operator.equalsIgnoreCase("*")){
            result = a * b;
        }

        if (operator.equalsIgnoreCase("/")){
            if (b != 0){
                result = a / b;
            }
            else {
                System.out.println("Cannot divide on zero! ");
                while (b == 0){
                    b = IntegerCreator.createNumber();
                }

                return a/b;
            }
        }

        return result;
    }
}
