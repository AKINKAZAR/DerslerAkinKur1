package Ders1.Loops.While.Examples.Factorial3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int number, tempNumber;
        int toplam = 1;


        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Gir: ");
        number = input.nextInt();

        tempNumber = number;
        while (1 <= tempNumber) {

            toplam *= tempNumber;
            tempNumber--;

        }
        System.out.println(number + "! = " + toplam);

    }

}
