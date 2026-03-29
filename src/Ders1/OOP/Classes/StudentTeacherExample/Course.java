package Ders1.OOP.Classes.StudentTeacherExample;

public class Course {

    String courseName;
    String teacher;

    Course(String courseName, String teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    void showCourse() {
        System.out.println("Ders: " + courseName + " - Öğretmen: " + teacher);
    }
}
