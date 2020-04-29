package com.afpa.classes;

public class Book {
    private final String title;
    private final String name;
    private final String firstName;
    private final String author;
    private final Category category;
    private final String isbn;
    private String code;

    public Book(String title, String name, String firstName, String author, Category category, String isbn) {
        this.title = title;
        this.name = name;
        this.firstName = firstName;
        this.author = author;
        this.category = category;
        this.isbn = isbn;
    }

    enum Category {
        ScienceFiction,
        Philosophy,
        Junior,
        Novel,
        Detective,
        Uncategorized
    }

    public void generateCode() {
        String nameFirstLetters = this.name.substring(0, 2);
        String firstNameFirstLetters = this.firstName.substring(0, 2);
        String isbnLastLetters = this.isbn.substring(this.isbn.length() - 2);

        this.code = String.format("%s%s%s%s", nameFirstLetters, firstNameFirstLetters, this.category, isbnLastLetters);
    }

    public void show() {
        System.out.printf("Titre: %s\n", this.title);
        System.out.printf("Nom: %s\n", this.name);
        System.out.printf("Prénom: %s\n", this.firstName);
        System.out.printf("Auteur: %s\n", this.author);
        System.out.printf("Catégorie: %s\n", this.category);
        System.out.printf("ISBN: %s\n", this.isbn);
        System.out.printf("Code: %s\n", this.code);
    }
}
