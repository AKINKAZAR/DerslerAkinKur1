package Ders1.Variables.Examples.SphereCalc6;

import java.util.Scanner;

public class SphereCalc {
    public static void main(String[] args) {

        double alan, cevre , r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Çember yarıçap bilgisini girin: ");
        r = input.nextDouble();

        alan = pi * r * r;

        cevre = 2 * pi * r;

        System.out.printf("Alan: " + "%.2f",alan);
        System.out.println();
        System.out.printf("Çevre: " + "%.2f",cevre);

    }

}
