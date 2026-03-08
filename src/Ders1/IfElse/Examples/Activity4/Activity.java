package Ders1.IfElse.Examples.Activity4;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {

        int derece;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Kaç Derece: ");
        derece = input.nextInt();

        if (derece < 5 && derece > -25) {
            System.out.println("Sen Kayak Yap, Hava Çok Soğuk..");
        } else if (derece >= 5 && derece <= 15) {
            System.out.println("Lotr filmi gelmiş, izlemeye git");
        } else if (derece > 15 && derece < 25) {
            System.out.println("Piknik Zamanıııı");
        } else if (derece >= 25 && derece <= 52){
            System.out.println("Yüzmeye git");
        } else {
            System.out.println("Hatalı Tuşlama yaptın...!!!!!");
        }

    }
}
