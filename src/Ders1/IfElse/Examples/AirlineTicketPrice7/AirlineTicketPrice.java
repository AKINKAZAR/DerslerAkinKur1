package Ders1.IfElse.Examples.AirlineTicketPrice7;

import java.util.Scanner;

public class AirlineTicketPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int distanceKm, passangerAge, tripType;
        double perKm = 0.10, totalPrice, discountPrice, discountTypePrice;
        double discountUnder12 = 0.50, discountBetween12To24 = 0.10, discountOver65 = 0.30, discountTripType = 0.20;
        boolean isError = false;

        System.out.print("Mesafeyi km türünden girin: ");
        distanceKm = input.nextInt();

        System.out.print("Yaşınızı girin: ");
        passangerAge = input.nextInt();

        System.out.print("1 => Tek Yön \n2 => Gidiş - Dönüş\nYolculuk tipini girin:");
        tripType = input.nextInt();

        totalPrice = distanceKm * perKm;
        System.out.println(totalPrice);

        if (distanceKm > 0 && passangerAge >= 0) {
            if (tripType == 1 || tripType == 2) {
                if (passangerAge < 12) {
                    discountPrice = totalPrice * discountUnder12;
                    totalPrice -= discountPrice;
                    //totalPrice = totalPrice - discountPrice   //Üst satır ile aynı 
                } else if (passangerAge <= 24) {
                    discountPrice = totalPrice * discountBetween12To24;
                    totalPrice -= discountPrice;
                } else if (passangerAge > 65) {
                    discountPrice = totalPrice * discountOver65;
                    totalPrice -= discountPrice;
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (tripType == 2){

            discountTypePrice = totalPrice * discountTripType;
            totalPrice -= discountTypePrice;
            totalPrice *= 2;
        }

        if (isError){
            System.out.println("Hatalı Veri Girişi Tespit Edildi!!!!!");
        } else {
            System.out.println("Toplam Tutar = " + totalPrice + " TL");
        }



    }
}
