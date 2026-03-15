package Ders1.Loops.For.Examples.PowersOf2;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Gir: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i*=2){
            System.out.println(i);
        }

    }
}
