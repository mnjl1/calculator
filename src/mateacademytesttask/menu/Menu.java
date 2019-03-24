package mateacademytesttask.menu;

import mateacademytesttask.calculator.ArabicCalculator;
import mateacademytesttask.calculator.RomanCalculator;
import mateacademytesttask.numbercreation.IntegerCreator;

public class Menu {

    public void menu() {
        System.out.println("Welcome to Simple Calculator!");
        System.out.println("-----------------------------------");
        System.out.println("Choose numeric format to calculate:");
        System.out.println("1. Arabic numerals");
        System.out.println("2. Roman numerals");

        int choice = 0;

        while (choice == 0) {

            System.out.println("Make your choice:");

            choice = IntegerCreator.createNumber();

        }

        switch (choice) {
            case 1:
                ArabicCalculator.arabicCalculationStarter();
                break;

            case 2:
                RomanCalculator.calculateRoman();
                break;

            default:
                System.out.println("Wrong choice");

        }
    }
}
