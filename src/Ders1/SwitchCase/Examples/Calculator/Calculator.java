package Ders1.SwitchCase.Examples.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int number1, number2, process;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı gir: ");
        number1 = input.nextInt();

        System.out.print("2. Sayıyı gir: ");
        number2 = input.nextInt();

        System.out.println("Yapmak istediğin İşlem İçin Tuşla:");
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        process = input.nextInt();

        switch (process) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                switch (number2){
                    case 0:
                        System.out.println("Bir sayı sıfıra bölünemez.");
                        break;
                    default:
                        result = number1 / number2;

                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız....");
        }

        System.out.println("İşlem sonucu: " + result);

    }
}
