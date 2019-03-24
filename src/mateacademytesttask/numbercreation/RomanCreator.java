package mateacademytesttask.numbercreation;

import mateacademytesttask.converter.RomanNumericConverter;

import java.util.Scanner;

public class RomanCreator {

    public static int romanNumberConverter() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isRoman = false;

        RomanNumericConverter integerDictionery = new RomanNumericConverter();

        while (!isRoman) {
            String romanNumeric = scanner.nextLine();

                if(integerDictionery.isRomanic(romanNumeric)){
                    number = integerDictionery.convertRomanToInteger(romanNumeric);
                    isRoman = true;
                }
            else {
                    System.out.println("Wrong Roman numeral!");
                }
        }
        return number;
    }
}
