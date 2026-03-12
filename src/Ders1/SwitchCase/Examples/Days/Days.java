package Ders1.SwitchCase.Examples.Days;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        int gun;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("1 - 7 arası bir gün girin: ");
        gun = input.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");

                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                isError = true;
        }

        if (isError){
            System.out.println("Hatalı Giriş");
        }
    }
}
