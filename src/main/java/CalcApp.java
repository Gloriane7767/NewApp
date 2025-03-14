package com.gloriane; // Defines the package.

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

