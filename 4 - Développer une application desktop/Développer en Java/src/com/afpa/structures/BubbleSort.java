package com.afpa.structures;

import com.afpa.Shared;

public class BubbleSort {
    /**
     * Sorts an int array using the Bubble sort
     * @param arr The array to sort
     */
    static void bubbleSort(int[] arr) {
        // Store array length
        int n = arr.length;
        // Creates temporary variable
        int temp;

        // For each elements in the array
        for (int i = 0; i < n; i++) {
            // For each elements j next to i
            for (int j = 1; j < (n - i); j++) {
                // If the element is unordered
                if (arr[j - 1] > arr[j]) {
                    // Swaps the elements in the array
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Bubble Sort (V1.1, 24/04/2020) ****");

        // Reads the array size from the user input
        int arraySize = Shared.readInt("Veuillez entrer la taille du tableau: ");

        // Creates an int array using the given arraySize
        int[] t = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            // Fills the array with the number given by the user
            String askUser = String.format("[%d] Veuillez entrer un nombre :", i + 1);
            t[i] = Shared.readInt(askUser);
        }

        System.out.println("Avant: ");

        for (int i : t) {
            System.out.println(i);
        }

        System.out.println("Après: ");

        // Sorts the array using bubble sort
        bubbleSort(t);

        for (int i : t) {
            System.out.println(i);
        }
    }
}
