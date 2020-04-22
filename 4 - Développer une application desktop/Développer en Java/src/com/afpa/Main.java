package com.afpa;

import com.afpa.syntax.Circle;

public class Main {

    public static void main(String[] args) {
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 22/04/2020) ****");

        double r = Circle.radius();
        double a = Circle.area(r);
        double c = Circle.circumference(r);

        Circle.show(a, c);
    }
}
