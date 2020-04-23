package com.afpa.operator;

import com.afpa.Shared;

public class Temperature {
    /**
     * Converts fahrenheit to celsius
     * @param fahrenheit The temperature in Fahrenheit
     * @return The temperature in Celsius
     */
    public static double celsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Temperature (V1.1, 23/04/2020) ****");

        // Reads the temperature given by the user
        double fahrenheit = Shared.readDouble("Veuillez entrer la température en Fahrenheit: ");

        // Prints the result to the user
        System.out.printf("Température en celsius: %.1f", celsius(fahrenheit));
    }
}
