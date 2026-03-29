package Ders1.OOP.Classes.Cars;

public class Main {
    public static void main(String[] args) {

        Car akin = new Car("A440", 1256);
        Car akin2 = new Car("A440");
        System.out.println("Arabanın Markası: " + akin.brand + " Hızı: " + akin.speed );
        System.out.println("Arabanın Markası: " + akin2.brand + " Hızı: " + akin2.speed );


     /* Car renault = new Car();
      System.out.println(renault.brand + " ve " + renault.speed);
      Car renault2 = new Car();
      Car renault3 = new Car();
*/
     /*   Car bmw = new Car();
        Car audi = new Car();
        Car a = new Car();

        bmw.brand = "A580";
        bmw.speed = 180;
        System.out.println(bmw.brand);
        System.out.println(bmw.speed);

        bmw.start();
        System.out.println("---------");
        System.out.println(audi.speed);
        System.out.println(a.speed);*/
    }
}
