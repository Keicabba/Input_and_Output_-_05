package it.figuccia;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);// create a new Scanner

        // task 1:
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // read the integer number input from user

        // task 2:
        System.out.printf("Your age is: %d", age);

        input.close(); // close the scanner (do not read anymore the user input)

    }
}