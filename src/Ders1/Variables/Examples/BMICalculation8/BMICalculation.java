package Ders1.Variables.Examples.BMICalculation8;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bodyWeight = 185; //--> 185.00
        // int bodyWeight2 = 185;
        double height, vki;

        System.out.print("lütfen boyunuzu girin: ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu girin: ");
        bodyWeight = input.nextDouble();

        vki = bodyWeight / (height * height);
        // vki =  bodyWeight / Math.pow(height, 2);

        System.out.println("vücut Kitle Endeksiniz: " + vki);
    }
}
