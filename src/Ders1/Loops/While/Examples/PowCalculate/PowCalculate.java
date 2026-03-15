package Ders1.Loops.While.Examples.PowCalculate;

import java.util.Scanner;

public class PowCalculate {
    public static void main(String[] args) {

        int alt, ust;

        Scanner input = new Scanner(System.in);

        System.out.print("Alt Değerini Gir: ");
        alt = input.nextInt();

        System.out.print("Üst Değerini Gir: ");
        ust = input.nextInt();

        int toplam = 1;

        // 4^5  ----> 4 x 4 x 4 x 4 x 4
        int i = 1;
        while (i <= ust) {

            toplam *= alt;
            i++;
        }
        System.out.println(alt + " üzeri " + ust + " = " + toplam);

    }
}
