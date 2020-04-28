package com.afpa.classes;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSort {
    private final Scanner scan = new Scanner(System.in);
    private final int length;
    private final int[] numbers;

    public NumberSort(int length) {
        this.length = length;
        this.numbers = new int[length];
    }

    public void input() {
        for (int i = 0; i < this.length; i++) {
            System.out.printf("[%d] Veuillez entrer un nombre: ", i + 1);
            this.numbers[i] = this.scan.nextInt();
        }
    }

    public void show() {
        for (int i = 0; i < this.length; i++) {
            System.out.printf("[%d] : %d\n", i, this.numbers[i]);
        }
    }

    public void sort() {
        Arrays.sort(this.numbers);
    }
}
