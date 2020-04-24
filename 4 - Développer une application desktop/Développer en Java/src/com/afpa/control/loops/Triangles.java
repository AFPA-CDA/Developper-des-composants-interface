package com.afpa.control.loops;

import com.afpa.Shared;

public class Triangles {
    /**
     * Generates a triangle
     *
     * @param lines Number of lines for the triangle
     * @return The generated triangle
     */
    public static String generateTriangle(int lines) {
        // Creates a StringBuilder
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= lines; i++) {
            // Appends the spaces depending on the number of lines
            result.append(" ".repeat(Math.max(0, lines - i)));
            // Appends the star in an odd manner
            result.append("*".repeat(Math.max(0, (i * 2) - 1)));
            // Appends a new line
            result.append(System.lineSeparator());
        }

        // Returns the result as a String
        return result.toString();
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Triangles(V1.1, 24/04/2020) ****");

        // Gets the number of lines
        int lines = Shared.readInt("Combien le lignes: ");

        // Generates the triangle with the given number of lines
        String triangle = generateTriangle(lines);

        // Prints the triangle to the user
        System.out.println(triangle);
    }
}
