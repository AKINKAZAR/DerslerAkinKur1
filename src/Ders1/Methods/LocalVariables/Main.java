package Ders1.Methods.LocalVariables;

public class Main {
    public static void main(String[] args) {

        int abc = 10;
        printNumber();

        abc = printNumber();
        System.out.println(abc);

        if (abc >= 14) {
            int b = 7;
            System.out.println(b);
        }
    }

    static int printNumber() {

        int number = 10; // local değişken
        System.out.println(number);
        return number;
    }

}
