package com.afpa;

import com.afpa.control.conditions.*;
import com.afpa.syntax.*;
import com.afpa.operator.*;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // Gets the Menu Header
            String header = header();

            // Prints the header string
            System.out.println(header);
            System.out.println("Entrez le numéro de l'exercice que vous voulez tester.");

            // While the user don't give a valid integer
            while (!scan.hasNextInt()) {
                // Prints an error message
                System.out.println("Vous devez donner un nombre positif.");
                // Finds and returns the next scan input
                scan.next();
            }

            // Gets the user input to choose the exercise
            int choice = scan.nextInt();

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> Circle.exec();
                case 2 -> Swap.exec();
                case 3 -> Adder.exec();
                case 4 -> Divider.exec();
                case 5 -> Temperature.exec();
                case 6 -> Average.exec();
                case 7 -> Seconds.exec();
                case 8 -> Ascii.exec();
                case 9 -> Even.exec();
                case 10 -> Age.exec();
                case 11 -> Calculator.exec();
                case 12 -> Discount.exec();
                default -> System.out.println("L'exercice demandé n'existe pas.");
            }
        }
    }

    public static String header() {
        return new StringBuilder()
                .append("\n")
                .append("0: Exit\n")
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
                .append("\t---------- Conditions ----------\n")
                .append("\t9: Even\n")
                .append("\t10: Age\n")
                .append("\t11: Calculator\n")
                .append("\t12: Discount\n")
                .toString();
    }
}
