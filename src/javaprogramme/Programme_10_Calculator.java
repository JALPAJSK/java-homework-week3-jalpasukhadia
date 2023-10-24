package javaprogramme;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol(+, -,/, *)
   find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Programme_10_Calculator {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Input the arithmetic symbol
            System.out.print("Enter the arithmetic symbol (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            double result;

            // Perform the arithmetic operation based on the symbol
            if (symbol == '+') {
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            } else if (symbol == '-') {
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            } else if (symbol == '*') {
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            } else if (symbol == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } else {
                System.out.println("Invalid symbol. Please use +, -, *, or /.");
            }

            scanner.close();
        }
    }


