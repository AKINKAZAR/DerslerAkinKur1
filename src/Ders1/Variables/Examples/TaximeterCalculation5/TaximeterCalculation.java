package Ders1.Variables.Examples.TaximeterCalculation5;

import java.util.Scanner;

public class TaximeterCalculation {
    public static void main(String[] args) {

        double km, perKm = 2.20;
        int acilisUcreti = 10;
        double toplamUcret;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç KM gidildi:");
        km = input.nextDouble();

        toplamUcret = (km * perKm);
/*
        toplamUcret = toplamUcret + acilisUcreti;
*/
        toplamUcret += acilisUcreti;

        System.out.println("Toplam Ücret: " + toplamUcret);
    }

}
