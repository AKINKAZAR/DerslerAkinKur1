package Ders1.IfElse.Examples.SortNumber5;

import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Gir: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı Gir: ");
        sayi2 = input.nextInt();

        System.out.print("3. Sayıyı Gir: ");
        sayi3 = input.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)) {
            if (sayi2 > sayi3) {
                System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);
            } else {
                System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
            }
        } else if ((sayi2 > sayi1) && (sayi2 > sayi3)) {
            if (sayi1 > sayi3){
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        } else {
            if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }



    }
}
