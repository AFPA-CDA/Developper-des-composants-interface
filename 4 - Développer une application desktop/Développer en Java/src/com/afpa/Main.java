package com.afpa;

import com.afpa.syntax.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates the header string
        String header = new StringBuilder()
                .append("Bienvenue sur mes exercices !\n")
                .append("1: Circle\n")
                .append("2: Swap\n")
                .toString();

        // Prints the header string
        System.out.println(header);
        System.out.println("Entrez le nombre de l'exercice que vous voulez tester.");

        // Creates a Scanner
        Scanner scan = new Scanner(System.in);

        // Gets the user input to choose the exercice
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                Circle.exec();
                System.exit(0);
            case 2:
                Swap.exec();
                System.exit(0);
            default:
                System.out.println("L'exercice demandé n'existe pas.");
                System.exit(1);
        }
    }
}
