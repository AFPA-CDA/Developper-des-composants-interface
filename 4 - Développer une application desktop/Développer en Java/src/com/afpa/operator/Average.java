package com.afpa.operator;

import com.afpa.Shared;

public class Average {
    /**
     * Calculates the average note
     *
     * @param supervised    The supervised note with a coefficient of 3
     * @param interrogation The interrogation note with a coefficient of 2
     * @param work          The work note with a coefficient of 1
     * @return The average note
     */
    public static double calcAverage(double supervised, double interrogation, double work) {
        return ((supervised * 3) + (interrogation * 2) + (work * 1)) / 3;
    }

    /**
     * Prints the results to the user
     *
     * @param supervised    The supervised note with a coefficient of 3
     * @param interrogation The interrogation note with a coefficient of 2
     * @param work          The work note with a coefficient of 1
     */
    public static void show(double supervised, double interrogation, double work) {
        System.out.printf("DS = %1$,.2f\n", supervised);
        System.out.printf("IE = %1$,.2f\n", interrogation);
        System.out.printf("TP = %1$,.2f\n", work);
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Average (V1.1, 23/04/2020) ****");

        // Reads all the notes given by the user
        double supervised = Shared.readDouble("Veuillez entrer la note du devoir surveillé: ");
        double interrogation = Shared.readDouble("Veuillez entrer la note de l'interrogation écrite: ");
        double work = Shared.readDouble("Veuillez entrer la note de travaux pratique: ");

        // Prints the value given by the user
        show(supervised, interrogation, work);

        // Prints the result to the user
        System.out.printf("Moyenne: %.2f", calcAverage(supervised, interrogation, work));
    }
}
