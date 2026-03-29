package Ders1.OOP.Classes.Cars;

public class Car {

    String brand;
    int speed;

    void start() {
        System.out.println("Start Fonksiyonu Çalıştı");
    }


    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    Car(String brand) {
        this.brand = brand;
    }


  /*  Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }*/

}
