package com.afpa.operator;

import com.afpa.Shared;

public class Ascii {
    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** ASCII (V1.1, 23/04/2020) ****");

        // Reads the int given by the user and cast it to a char
        char code = (char) Shared.readInt("Veuillez entrer L'Unicode en décmial: ");

        // Prints the result to the user
        System.out.printf("Caractère: %c", code);
    }
}