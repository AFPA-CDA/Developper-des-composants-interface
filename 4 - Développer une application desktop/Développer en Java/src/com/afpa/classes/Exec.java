package com.afpa.classes;

public class Exec {
    public static void circle() {
        Circle firstCircle = new Circle(10);
        Circle secondCircle = new Circle(45);

        System.out.println("Premier cercle");
        System.out.printf("Aire:  %.2f\n", firstCircle.calculateArea());
        System.out.printf("Circonférence:  %.2f\n", firstCircle.calculateCircumference());

        System.out.println("Second cercle");
        System.out.printf("Aire: %.2f\n", secondCircle.calculateArea());
        System.out.printf("Circonférence: %.2f\n", secondCircle.calculateCircumference());
    }

    public static void numberSort() {
        NumberSort numberSort = new NumberSort(5);

        numberSort.input();
        numberSort.sort();
        numberSort.show();
    }
}
