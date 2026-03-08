package Ders1.IfElse.Examples.Grade3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        int matematikNot, fizikNot, türkceNot, kimyaNot, muzikNot;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Gir: ");
        matematikNot = input.nextInt();

        System.out.print("Fizik Notunu Gir: ");
        fizikNot = input.nextInt();

        System.out.print("Türkçe Notunu Gir: ");
        türkceNot = input.nextInt();

        System.out.print("Kimya Notunu Gir: ");
        kimyaNot = input.nextInt();

        System.out.print("Müzik Notunu Gir: ");
        muzikNot = input.nextInt();

        if (matematikNot >= 0 && matematikNot <= 100) {
            toplam += matematikNot;
        }

        if (fizikNot >= 0 && fizikNot <= 100) {
            toplam += fizikNot;
        }

        if (türkceNot >= 0 && türkceNot <= 100) {
            toplam += türkceNot;
        }

        if (kimyaNot >= 0 && kimyaNot <= 100) {
            toplam += kimyaNot;
        }

        if (muzikNot >= 0 && muzikNot <= 100) {
            toplam += muzikNot;
        }

        System.out.println("Derslerin ortalama puanı: " + (toplam / 5));

        if ((toplam / 5) < 60) {
            System.out.println("Sen Kaldın Kardeşş, sen Kaldınnn...");
        } else {
            System.out.println("Hadi Yine iyisin, Geçtinn....!!1");
        }
    }

}
