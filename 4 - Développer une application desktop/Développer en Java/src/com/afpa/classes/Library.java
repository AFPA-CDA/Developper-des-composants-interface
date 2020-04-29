package com.afpa.classes;

import com.afpa.Shared;

import java.util.Scanner;

public class Library {
    private final Scanner scan = new Scanner(System.in);

    public Library() {
        String title = Shared.readString("Veuillez entrer le titre: ");
        String name = Shared.readString("Veuillez entrer le nom: ");
        String firstName = Shared.readString("Veuillez entrer le prénom: ");
        String author = Shared.readString("Veuillez entrer l'auteur: ");
        String isbn = Shared.readString("Veuillez entrer l'ISBN: ");

        Book book = new Book(title, name, firstName, author, Book.Category.Uncategorized, isbn);
        book.generateCode();
        book.show();
    }
}
