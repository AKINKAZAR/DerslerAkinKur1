package Ders1.OOP.Classes.StudentTeacherExample;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java" , "Akın Hoca");

        Student student1 = new Student("Mustafa" , 33,  course1);

        student1.showStudent();

    }
}
