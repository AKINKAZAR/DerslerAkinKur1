package Ders1.Variables.Examples.CalculatingTheAreaOfATriangle4;

import java.util.Scanner;

public class CalculatingTheAreaOfATriangle {
    public static void main(String[] args) {

        double a, b, c;
        double u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("a uzunluğunu gir: ");
        a = input.nextDouble();

        System.out.print("b uzunluğunu gir: ");
        b = input.nextDouble();

        System.out.print("c uzunluğunu gir: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.printf("Alanın değeri: " + "%.2f", alan);

    }

}
