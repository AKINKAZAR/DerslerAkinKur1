package Ders1.Loops.For.Examples.SumOddNumbers;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {

        int number;
        int tekSayilarinToplami = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi Sayıya Kadar Tek" +
                " Sayıların Toplamını İstiyorsun: ");

        number = input.nextInt();

        for (int i = 1; i <= number; i++){

        }

        System.out.println("Verdiğiniz " + number
                + " Sayısına kadar olan tek sayıların toplamı: "
                + tekSayilarinToplami);

    }
}
