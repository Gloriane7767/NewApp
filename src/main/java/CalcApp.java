//package com.gloriane; // Defines the package.

import java.util.Scanner; // Imports Scanner to get user input.

public class CalcApp { // Class name must match the filename.
    public static void main(String[] args) { // Entry point of the program.
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for input.
        // Get user input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculation using switch
        double result = 0; // Declare and initialize result

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) { // Prevent division by zero.
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close(); // Close scanner before exiting.
                    return; // Exit program early.
                }
                break;
            default:
                System.out.println("Invalid operator. Please restart the program.");
                scanner.close(); // Close scanner before exiting.
                return; // Exit program early.
        }

            // Display result
            System.out.println("Result: " + result);

            scanner.close(); // Close scanner after use.
            System.out.println("Calculator Closed.");
        }
    }



