package Ders1.Loops.While.Examples.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, tempNumber, loopCount = 0;
        int modNumber, sum = 0 ;

        System.out.print("Bir Sayı Gir: ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0){
            tempNumber /= 10;
            loopCount++;
        }

        tempNumber = number;

        while (tempNumber != 0){
            modNumber = tempNumber % 10;
            sum += Math.pow(modNumber, loopCount);
            tempNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " Bir Armstrong Sayısıdır.....");
        } else {
            System.out.println(number + " Bir Armstrong Sayısı Değildir!!!!!!!!");
        }

    }
}
