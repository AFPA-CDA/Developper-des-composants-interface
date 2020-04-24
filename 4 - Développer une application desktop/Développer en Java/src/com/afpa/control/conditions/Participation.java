package com.afpa.control.conditions;

import com.afpa.Shared;

public class Participation {
    public static int calcParticipation(String single, int children, int salary) {
        // Declare the participation variable
        int participation;

        if (single.startsWith("y")) {
            participation = 20;
        } else {
            participation = 25;
        }

        // Adds 10% for each children (if any)
        if (children != 0) participation += children * 10;

        // If the salary is less than 1200 it adds 10%
        if (salary < 1200) participation += 10;

        // Makes sure the participation can't exceed 50%
        if (participation > 50) participation = 50;

        return participation;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Participation (V1.1, 24/04/2020) ****");

        // Gets the user inputs
        String single = Shared.readString("Êtes vous célibataire ? [y/n]: ");
        int children = Shared.readInt("Combien avez vous d'enfants ? (0 pour aucun): ");
        int salary = Shared.readInt("Combien gagnez vous par mois ?: ");

        // Calculates the participation
        int participation = calcParticipation(single, children, salary);

        // Prints the result to the user
        System.out.printf("Votre participation s'élève à %d%%", participation);
    }
}
