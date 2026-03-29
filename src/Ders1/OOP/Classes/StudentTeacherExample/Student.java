package Ders1.OOP.Classes.StudentTeacherExample;

public class Student {

    String name;
    int age;
    Course course;

    Student(String name, int age, Course course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void showStudent() {
        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);
        course.showCourse(); // diğer sınıfın metodunu çağırıyoruz
    }
}
