package Ders1.Loops.While.Examples.SumOddNumbers1;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {

        int number;
        int tekSayilarinToplami = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi Sayıya Kadar Tek Sayıların Toplamını İstiyorsun: ");
        number = input.nextInt();

        int i = 1;

        while (i <= number){

            if (i % 2 == 1){
                tekSayilarinToplami += i;
            }
            i++;
        }
        System.out.println("Verdiğiniz " + number + " Sayısına kadar olan tek sayıların toplamı: " + tekSayilarinToplami);
    }
}
