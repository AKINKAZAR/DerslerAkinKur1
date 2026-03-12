package Ders1.IfElse.Examples.ChineseZodiac8;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int dogumTarihi, zodyak;
        String zodyakAnimal = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Tarihinizi Girin: ");
        dogumTarihi = input.nextInt();

        if (dogumTarihi < 0){
            isError = true;
        }

        zodyak = dogumTarihi % 12;

        if (zodyak == 0) {
            zodyakAnimal = "Maymun";
        } else if (zodyak == 1) {
            zodyakAnimal = "Horaz";
        } else if (zodyak == 2) {
            zodyakAnimal = "Köpek";
        } else if (zodyak == 3) {
            zodyakAnimal = "Domuz";
        } else if (zodyak == 4) {
            zodyakAnimal = "Fare";
        } else if (zodyak == 5) {
            zodyakAnimal = "Öküz";
        } else if (zodyak == 6) {
            zodyakAnimal = "Kaplan";
        } else if (zodyak == 7) {
            zodyakAnimal = "Tavşan";
        } else if (zodyak == 8) {
            zodyakAnimal = "Ejderha";
        } else if (zodyak == 9) {
            zodyakAnimal = "Yılan";
        } else if (zodyak == 10) {
            zodyakAnimal = "At";
        } else if (zodyak == 11) {
            zodyakAnimal = "Koyun";
        }

        if (isError){
            System.out.println("Hatalı Doğum Tarihi Giriş Yaptınız!!!");
        } else {
            System.out.println("Cin zodyak Hayvanınız: " + zodyakAnimal);
        }

    }
}
