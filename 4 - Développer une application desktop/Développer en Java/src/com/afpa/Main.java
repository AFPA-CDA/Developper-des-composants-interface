package com.afpa;

import com.afpa.syntax.*;
import com.afpa.operator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates the header string
        String header = new StringBuilder()
                .append("---------- Syntaxe ----------\n")
                .append("1: Circle\n")
                .append("2: Swap\n")
                .append("---------- Opérateurs ----------\n")
                .append("3: Adder\n")
                .append("4: Divider\n")
                .append("5: Temperature\n")
                .append("6: Average\n")
                .append("7: Seconds\n")
                .append("8: ASCII\n")
                .append("---------- Control structures ----------\n")
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
            case 3:
                Adder.exec();
                System.exit(0);
            case 4:
                Divider.exec();
                System.exit(0);
            case 5:
                Temperature.exec();
                System.exit(0);
            case 6:
                Average.exec();
                System.exit(0);
            case 7:
                Seconds.exec();
                System.exit(0);
            case 8:
                Ascii.exec();
                System.exit(0);
            default:
                System.out.println("L'exercice demandé n'existe pas.");
                System.exit(1);
        }
    }
}
