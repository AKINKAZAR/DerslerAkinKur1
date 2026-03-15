package Ders1.Loops.For.Examples.PowCalculate;

import java.util.Scanner;

public class PowCalculate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, exponent;
        int result = 1;

        System.out.print("Alt Değeri Gir: ");
        base = input.nextInt();

        System.out.print("Üst Değeri Gir: ");
        exponent = input.nextInt();

        // 4^5  ----> 4 x 4 x 4 x 4 x 4
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);

    }
}
