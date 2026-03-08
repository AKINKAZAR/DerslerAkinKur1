package Ders1.Variables.Examples.KDVAmountCalculation2;

import java.util.Scanner;

public class KDVAmountCalculation {
    public static void main(String[] args) {

        double kdvOrani = 0.15, tutar, kdvMiktari, sonTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat bilgisini gir: ");
        tutar = input.nextDouble();

        kdvMiktari = tutar * kdvOrani;
        System.out.println("KDV Miktarı: " + kdvMiktari + " TL");

        sonTutar = tutar + kdvMiktari;
        System.out.println("KDV'li Fiyat: " + sonTutar + " TL");
    }
}
