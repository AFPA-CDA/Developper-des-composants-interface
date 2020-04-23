package com.afpa.operator;

import com.afpa.Shared;
import java.time.LocalTime;

public class Seconds {
    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Seconds (V1.1, 23/04/2020) ****");

        // Reads the number of seconds given by the user
        long seconds = Shared.readLong("Veuillez entrer le nombre de secondes: ");

        // Get local time from the seconds given by the user
        LocalTime date = LocalTime.ofSecondOfDay(seconds);

        // Prints the date with the format HH:mm:ss
        System.out.printf("%tT", date);
    }
}
