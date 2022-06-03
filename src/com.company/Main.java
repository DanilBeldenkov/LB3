package com.company;

public class Main {

    public static void main (String[]args) {

        System.out.println("Таблица умножени.");

        System.out.println();

        for (int a = 1; a <= 10; a++) {

            for (int b = 1; b<= 10; b++) {

                System.out.println(a+ " * " + b + " = " + a * b);
            }
            System.out.println();
        }
    }
}