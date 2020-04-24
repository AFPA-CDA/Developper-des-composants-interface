package com.afpa.control.loops;

import com.afpa.Shared;

public class Age {
    /**
     * Executes the code properly
     */
    public static void exec() {
        int age;
        int belowTwenty = 0;
        int betweenTwentyAndForty = 0;
        int aboveForty = 0;

        // Prints the header
        System.out.println("**** Age (V1.1, 24/04/2020) ****");

        // While the user don't give 100
        do {
            // Gets the user inputs
            age = Shared.readInt("Veuillez entrer un age [100 pour arrêter]: ");

            // Increments variables based on the age
            if (age < 20) belowTwenty++;
            if (age > 40) aboveForty++;
            if (age >= 20 && age <= 40) betweenTwentyAndForty++;
        } while (age != 100);

        // Adds the centenary
        aboveForty++;

        // Prints the result to the user
        System.out.printf("-20 ans: %d\n", belowTwenty);
        System.out.printf("+40 ans: %d\n", aboveForty);
        System.out.printf("+20 ans & -40 ans: %d\n", betweenTwentyAndForty);
    }
}
