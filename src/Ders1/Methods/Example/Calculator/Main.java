package Ders1.Methods.Example.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, islem;
        boolean isEnd = true;

        System.out.print("Birinci Sayıyı Gir:");
        number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Gir:");
        number2 = input.nextInt();

        while (isEnd) {
            System.out.println("İşlem Seçiniz: ");
            System.out.println("1- Toplama");
            System.out.println("2- Çıkarma");
            System.out.println("3- Çarpma");
            System.out.println("---------");
            System.out.println("0- Çıkış Yap");

            islem = input.nextInt();
            if (islem == 0) {
                isEnd = false;
                System.out.println("Çıkış Yapıldı!!");
            } else if (islem == 1) {
                System.out.println(add(number1, number2));
            } else if (islem == 2) {
                System.out.println(subtract(number1, number2));
            } else if (islem == 3) {
                System.out.println(multiply(number1, number2));
            } else {
                System.out.println("Hatalı İşlem Tipi Seçimi Yaptınız!!! Tekrar Deneyin.");
            }
        }
    }

    static int add(int number1, int number2) {
        return number1 + number2;
    }

    static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    static int multiply(int number1, int number2) {
        return number1 * number2;


    }

}
