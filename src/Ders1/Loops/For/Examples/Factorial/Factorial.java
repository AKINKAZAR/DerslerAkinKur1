package Ders1.Loops.For.Examples.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Gir: ");
        int sayi = input.nextInt();

        int faktoriyel = 1;

        for(int i = 1; i <= sayi; i++){
            faktoriyel = faktoriyel * i;
        }

        System.out.println(sayi +" Faktoriyel = " + faktoriyel);
        System.out.println(sayi +"! = " + faktoriyel);

    }
}
