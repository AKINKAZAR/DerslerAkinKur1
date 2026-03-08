package Ders1.Variables.Examples.SpherePiece7;

import java.util.Scanner;

public class SpherePiece {
    public static void main(String[] args) {

        double pi = 3.14, radius, area, circumference, sliceRadius, sliceArea;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin: ");
        radius = input.nextDouble();

        System.out.print("Daire Diliminin Açısını girin: ");
        sliceRadius = input.nextDouble();

        area = pi * Math.pow(radius,2);
        circumference = 2 * pi * radius;

        sliceArea = (area * sliceRadius) / 360;

        System.out.println("Dairenin çevresi: " + circumference);
        System.out.println("Dairenin alanı: " + area);
        System.out.println("Dairenin diliminin alanı: " + sliceArea);

    }
}
