package Ders1.IfElse.Examples.LeapYear9;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, condition1, condition2, condition3;

        System.out.print("Yıl Girin: ");
        year = input.nextInt();

        condition1 = year % 4;
        condition2 = year % 100;
        condition3 = year % 400;

        /*if (condition1 == 0) {
            if (condition2 == 0) {
                if (condition3 == 0) {
                    System.out.println(year + " bir artık yıldır.");
                } else {
                    System.out.println(year + " bir artık yıl değil!!!!.");
                }
            } else {
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değil!!!!.");
        }*/

        // 2. yöntem.
        if (condition1 == 0 && condition2 != 0 || condition3 == 0){
            System.out.println("artık yıl");
        } else {
            System.out.println("Artık yıl değildir.");
        }

    }
}
