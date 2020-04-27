package com.afpa.functions;

import com.afpa.Shared;

import java.util.ArrayList;

public class Multiply {
    /**
     * Returns the muliplication table of the number
     * @param number THe number to mulitply
     * @return The muliplication table of the number
     */
    public static ArrayList<String> multiply(int number) {
        // Creates a new String array list
        ArrayList<String> result = new ArrayList<>();

        // From 10 to 0
        for (int i = 10; i >= 0; i--) {
            // Formats the result string
            String formatedResult = String.format("%d x %d = %d\n", i, number, i * number);
            // Adds the result string to the array list
            result.add(formatedResult);
        }

        // Returns the result
        return result;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Multiply (V1.1, 27/04/2020) ****");

        // Gets the user inputs
        int number = Shared.readInt("Veuillez entrer le nombre que vous voulez multiplier : ");

        // Executes the multiply function with the user given number
        ArrayList<String> multiplyTable = multiply(number);

        // For each elements in the ArrayString
        for (String i : multiplyTable) {
            // Prints the result
            System.out.print(i);
        }
    }
}
