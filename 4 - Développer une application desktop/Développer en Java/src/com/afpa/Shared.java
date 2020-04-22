package com.afpa;

import java.util.Scanner;

public class Shared {
    /**
     * Reads a double from the command line
     * @param message The message to print
     * @return The double given by the user
     */
    public static double readDouble(String message) {
        // Prints the instruction to the user
        System.out.println(message);
        // Creates a new Scanner with the system input
        Scanner scan = new Scanner(System.in);
        // Returns the radius
        return scan.nextDouble();
    }
}
