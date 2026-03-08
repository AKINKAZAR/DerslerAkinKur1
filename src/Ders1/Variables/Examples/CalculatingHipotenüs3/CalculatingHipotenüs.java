package Ders1.Variables.Examples.CalculatingHipotenüs3;

import java.util.Scanner;

public class CalculatingHipotenüs {
    public static void main(String[] args) {

        double a, b, hipotenüs;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu gir: ");
        a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu gir: ");
        b = input.nextDouble();

        hipotenüs = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs uzunluğu: " + hipotenüs);

        System.out.printf( "%.2f", hipotenüs);
    }
}
