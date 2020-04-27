package com.afpa.structures;

import com.afpa.Shared;

import java.util.ArrayList;

public class PreSizedArray {
    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** PreSized Array (V1.1, 24/04/2020) ****");

        // Reads the int from the user
        int arraySize = Shared.readInt("Veuillez entrer la taille du tableau: ");

        // Creates a new empty int array list
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            // Fills the array with the number given by the user
            String askUser = String.format("[%d] Veuillez entrer un nombre :", i + 1);
            array.add(Shared.readInt(askUser));
        }

        // Prints the array to the user
        System.out.println(array);
    }
}
