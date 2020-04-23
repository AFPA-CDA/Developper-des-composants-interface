package com.afpa;

import java.util.Scanner;

public class Shared {
    public static Scanner scan = new Scanner(System.in);

    /**
     * Reads a double from the command line
     * @param message The message to print
     * @return The double given by the user
     */
    public static double readDouble(String message) {
        // Prints the instruction to the user
        System.out.println(message);
        // Returns the double
        return scan.nextDouble();
    }

    /**
     * Reads a long from the command line
     * @param message The message to print
     * @return The long given by the user
     */
    public static long readLong(String message) {
        // Prints the instruction to the user
        System.out.println(message);
        // Returns the long
        return scan.nextLong();
    }

    /**
     * Reads an int from the command line
     * @param message The message to print
     * @return The int given by the user
     */
    public static int readInt(String message) {
        // Prints the instruction to the user
        System.out.println(message);
        // Returns the int
        return scan.nextInt();
    }
}
