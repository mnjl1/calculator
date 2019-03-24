package mateacademytesttask.numbercreation;

import java.util.Scanner;

public class OperatorCreator {
    public static String createOperator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one of your actions: +, -, *, / :");
        boolean isOperator = false;
        String operator = "";

        while (!isOperator) {

                operator = scanner.next();
                if(operator.equalsIgnoreCase("+")
                        || operator.equalsIgnoreCase("-")
                        || operator.equalsIgnoreCase("*")
                        || operator.equalsIgnoreCase("/")){
                    isOperator = true;
                }
                else {
                    System.out.println("Wrong operator type, try again!");
                }
        }

        return operator;
    }
}
