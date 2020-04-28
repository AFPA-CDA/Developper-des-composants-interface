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

    public static void vehicule() {
        Bike bike = new Bike();
        System.out.println(bike.run());
    }

    public static void triangle() {
        Triangle triangle = new Triangle(12.5, 21.45);
        System.out.println(triangle.area());
    }

    public static void client() {
        Client firstClient = new Client("Welker", "Paul", "Baker Street", "Londre");
        Client secondClient = new Client();
        Client thirdClient = new Client();
        Client fourthClient = new Client();

        secondClient.setCity("Detroit");
        secondClient.setFirstName("White");
        secondClient.setName("Jack");

        thirdClient.setCity("San Francisco");
        thirdClient.setFirstName("Claypool");
        thirdClient.setName("Les");

        fourthClient.setCity("New York");
        fourthClient.setFirstName("Thunders");
        fourthClient.setName("Johnny");

        System.out.printf("1er Client: \n%s\n", firstClient);
        System.out.printf("2ème Client: \n%s\n", secondClient);
        System.out.printf("3ème Client: \n%s\n", thirdClient);
        System.out.printf("4ème Client: \n%s\n", fourthClient);
    }
}
