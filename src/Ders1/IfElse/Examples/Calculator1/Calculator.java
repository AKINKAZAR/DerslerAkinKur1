package Ders1.IfElse.Examples.Calculator1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int sayi1, sayi2;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Gir: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı Gir: ");
        sayi2 = input.nextInt();

        System.out.println("1 - Toplama\n2 - Çıkarma \n3 - Çarpma \n4 - Bölme \n5 - Mod Alma");
        System.out.print("Seçimini Gir: ");
        secim = input.nextInt();

        if (secim == 1) {
            System.out.println("Toplam : " + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("Çıkarma : " + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("Çarpma : " + (sayi1 * sayi2));
        } else if (secim == 4) {
            if (sayi2 != 0) {
                System.out.println("Bölme : " + (sayi1 / sayi2));
            } else {
                System.out.println("Bir Sayı 0'a Bölünemez");
            }
        } else if (secim == 5) {
            System.out.println("Mod : " + (sayi1 % sayi2));
        } else {
            System.out.println("Hatalı Tuşlama Yaptınız, Tekrar Deneyiniz!!!!");
        }
    }
}
