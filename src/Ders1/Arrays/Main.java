package Ders1.Arrays;

public class Main {
    public static void main(String[] args) {
/*

        int number = 5;
        int number2 = 10;
        int number3 = 15;

*/
/*
        int[] numbers = new int[3];
*//*


        int numbers[] = {5, 10, 15};
        System.out.println(numbers[2]);
        System.out.println("-*----------*-");

        //Normal For Döngüsü
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/

        //Foreach
      /*  for(int i: numbers) {
            System.out.println(numbers[i]);
        }*/

       /* System.out.println("*--------------*");

        int sayilar[] = {10, 20, 30, 40};

        int sum = 0;

        for (int sayi: sayilar){
            sum += sayi;
        }

        System.out.println("Toplam: " + sum);
*/

/*  En Büyük sayıyı bulma
        int numbers[] = {5, 12, 8, 20, 3};
        int max = numbers[0];
        for (int num : numbers){
            if (num > max) {
                max = num;
            }
        }
        System.out.println("En Büyük " + max);
*/


       /* String names[] = {"Ali", "Ayşe", "Mehmet"};

        for (String name : names) {
            System.out.println(name);
        }*/

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(matrix[1][2]); // 2


    }
}
