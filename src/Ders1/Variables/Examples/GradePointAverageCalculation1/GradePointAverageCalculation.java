package Ders1.Variables.Examples.GradePointAverageCalculation1;

import java.util.Scanner;

public class GradePointAverageCalculation {
    public static void main(String[] args) {

        double matematik, fizik, kimya, türkce, tarih, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu gir: ");
        matematik = input.nextDouble();

        System.out.print("Fizik notunu gir: ");
        fizik = input.nextDouble();

        System.out.print("Kimya notunu gir: ");
        kimya = input.nextDouble();

        System.out.print("Türkce notunu gir: ");
        türkce = input.nextDouble();

        System.out.print("tarih notunu gir: ");
        tarih = input.nextDouble();

        System.out.print("Muzik notunu gir: ");
        muzik = input.nextDouble();

        ortalama = (matematik + fizik + kimya + türkce + tarih + muzik) / 6;
        System.out.println("Not ortalamanız: " + ortalama);
    }
}
