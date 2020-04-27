package com.afpa.structures;

import com.afpa.Shared;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Remove {
    public static void removeName(ArrayList<String> array, String name) {
        // Uses array stream to make the names lowercase
        array = array.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(ArrayList::new));

        // Check for every element in the array
        for (int i = 0; i < array.size(); i++) {
            // If the name is found
            if (array.get(i).equals(name.toLowerCase())) {
                // Removes the name from the array list
                array.remove(i);
            }
        }

        // Prints the result to the user
        System.out.printf("Resultat: %s\n", array.toString());
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Corentin");
        names.add("Camille");
        names.add("Valentin");
        names.add("Arnaud");
        names.add("Germain");
        names.add("Serhat");

        // Prints the header
        System.out.println("**** Remove Array (V1.1, 24/04/2020) ****");

        // Prints the name list to the user
        System.out.printf("Liste des prénoms: %s\n", names.toString());

        // Reads the int from the user
        String name = Shared.readString("Veuillez entrer le prénom que vous souhaitez retirer: ");

        // Executes the function used to remove a name from the array list
        removeName(names, name);
    }
}
