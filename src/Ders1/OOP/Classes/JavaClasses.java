package Ders1.OOP.Classes;

import java.util.Scanner;

public class JavaClasses {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.name = "Ahmet";
        s2.name = "Ayşe";

        System.out.println(s1.school);
        System.out.println(s2.school);

        Student.square(10);


    }
}
