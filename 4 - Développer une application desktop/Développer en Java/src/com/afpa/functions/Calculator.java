package com.afpa.functions;

import com.afpa.Shared;

public class Calculator {
    /**
     * A simple calculator function
     *
     * @param a        The first number
     * @param b        The second number
     * @param operator The operator to use
     * @return The calculated input
     * @throws ArithmeticException If denominator is zero or operator is unknown
     */
    public static double calculate(double a, double b, char operator) throws ArithmeticException {
        if (b == 0) {
            // Makes sure we can't divide by 0
            throw new ArithmeticException("Le dénominateur ne peut pas être zéro.");
        }

        switch (operator) {
            case 42:
                return multiply(a, b);
            case 43:
                return add(a, b);
            case 45:
                return substract(a, b);
            case 47:
                return divide(a, b);
            default:
                throw new ArithmeticException("L'opérateur demandé n'existe pas ou n'est pas supporté.");
        }
    }

    /**
     * Returns the sum of 2 numbers
     *
     * @param a The first number
     * @param b The second number
     * @return The sum of the two number
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Returns the product of 2 numbers
     *
     * @param a The first number
     * @param b The second number
     * @return The product of the two number
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Returns the substraction of 2 numbers
     *
     * @param a The first number
     * @param b The second number
     * @return The substraction of the two number
     */
    public static double substract(double a, double b) {
        return a - b;
    }

    /**
     * Returns the division of 2 numbers
     *
     * @param a The first number
     * @param b The second number
     * @return The division of the two number
     */
    public static double divide(double a, double b) {
        return a / b;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Calculator (V1.1, 22/04/2020) ****");

        // Gets the user inputs
        double a = Shared.readDouble("Veuillez entrer le premier nombre: ");
        double b = Shared.readDouble("Veuillez entrer le second nombre: ");
        String operator = Shared.readString("Veuillez entrer un opérateur: ");

        // Get the operator char instead of string
        char operatorChar = operator.charAt(0);

        try {
            // Calculates the result based on the user inputs
            double result = calculate(a, b, operatorChar);

            // Prints the result to the user
            System.out.printf("%.2f %c %.2f = %.2f", a, operatorChar, b, result);
        } catch (ArithmeticException e) {
            // Prints the error and exits the program if an ArithmeticException has been raised
            e.printStackTrace();
        }
    }
}
