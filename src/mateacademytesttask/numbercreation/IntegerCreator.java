package mateacademytesttask.numbercreation;

import java.util.Scanner;

public class IntegerCreator {

    public static int createNumber(){

        Scanner scanner = new Scanner(System.in);
        boolean isInteger = false;
        int number = 0;

        while (!isInteger){
            try {
                number = Integer.parseInt(scanner.nextLine());
                isInteger = true;

            }catch (NumberFormatException e){
                System.out.println("Not a number, try again.");
            }
        }
        return number;
    }


}
