package com.afpa.control.conditions;

import com.afpa.Shared;

import java.time.LocalDate;

public class Age {
    /**
     * Check the given age
     *
     * @param birthYear The year or birth
     * @return A string that says if you are underaged or nor
     */
    public static String checkAge(int birthYear) {
        // Gets the current year
        int currentYear = LocalDate.now().getYear();

        if ((currentYear - birthYear) < 18) {
            return "Vous êtes mineur";
        } else {
            return "Vous êtes majeur";
        }
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Age (V1.1, 22/04/2020) ****");

        // Gets the year of birth from the user input
        int year = Shared.readInt("Veuillez entrer votre année de naissance: ");

        // Prints the result to the user
        System.out.println(checkAge(year));
    }
}
