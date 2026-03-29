package Ders1.Methods.Overloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        double b;

        System.out.println(2 + 5);
        System.out.println("Akin");
        System.out.println("c");
        System.out.println(10.3);

        sum(5, 7);
        sum(5, 10.0);
        sum(10.0, 5);
        sum(6, 3, 17);
    }


    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    static void sum(int a, double b) {
        System.out.println(a + b);
    }

    static void sum(double a, int b) {
        System.out.println(a + b);
    }

    static int sum(int a, int b, int c) {
        return a + b;
    }
}
