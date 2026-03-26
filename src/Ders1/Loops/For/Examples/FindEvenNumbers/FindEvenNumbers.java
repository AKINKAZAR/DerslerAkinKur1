package Ders1.Loops.For.Examples.FindEvenNumbers;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Gir: ");
        int sayi = input.nextInt();

        for (int i = 0; i <= sayi; i+=2){
                System.out.println(i);
        }
    }
}
