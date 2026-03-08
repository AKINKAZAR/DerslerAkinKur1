package Ders1.Variables.Examples.GroceryStoreProgram9;

import java.util.Scanner;

public class GroceryStoreProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5.00;
        double kacKgArmut, kacKgElma, kacKgDomates, kacKgMuz, kacKgPatlican;
        double toplam;

        System.out.print("Kaç KG armut aldın: ");
        kacKgArmut = input.nextDouble();

        System.out.print("Kaç KG armut aldın: ");
        kacKgElma = input.nextDouble();

        System.out.print("Kaç KG armut aldın: ");
        kacKgDomates = input.nextDouble();

        System.out.print("Kaç KG armut aldın: ");
        kacKgMuz = input.nextDouble();

        System.out.print("Kaç KG armut aldın: ");
        kacKgPatlican = input.nextDouble();

        toplam = (kacKgArmut * armutKg) + (kacKgElma * elmaKg) + (domatesKg * kacKgDomates) + (muzKg * kacKgMuz) + (patlicanKg * kacKgPatlican);
        System.out.println("Toplam giden Param: " + toplam + " TL");


    }
}
