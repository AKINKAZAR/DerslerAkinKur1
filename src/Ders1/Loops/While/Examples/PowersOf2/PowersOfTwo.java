package Ders1.Loops.While.Examples.PowersOf2;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Gir: ");
        number = input.nextInt();

        int i = 1;

        while (i <= number) {

            System.out.println(i);
            i *= 2;

        }

    }
}
