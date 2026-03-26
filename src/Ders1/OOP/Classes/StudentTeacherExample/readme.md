# Java 2 Sınıf ile Örnek (Class İlişkisi)

## 🎯 Senaryo: Öğrenci ve Ders Sistemi

Bu örnekte **iki farklı sınıfın birlikte nasıl çalıştığını** göreceksin.

Amaç:

* Class → Class ilişkisi kurmak
* Nesneleri başka sınıflarda kullanmak
* Gerçek hayat modelleme yapmak

---

# 1. Sistem Tasarımı

2 sınıf olacak:

### 1️⃣ Student (Öğrenci)

* name (isim)
* age (yaş)
* course (aldığı ders)

---

### 2️⃣ Course (Ders)

* courseName (ders adı)
* teacher (öğretmen)

---

# 2. Course Sınıfı

```java id="c1u2x9"
class Course {

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
```

---

# 3. Student Sınıfı

```java id="3l9q0r"
class Student {

    String name;
    int age;
    Course course; // başka bir sınıfı kullanıyoruz

    Student(String name, int age, Course course) {
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
```

---

# 4. Main Sınıfı

```java id="z6v8dn"
public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java", "Ali Hoca");

        Student student1 = new Student("Ahmet", 21, course1);

        student1.showStudent();

    }
}
```

---

# 5. Çıktı

```id="tn6k8n"
İsim: Ahmet
Yaş: 21
Ders: Java - Öğretmen: Ali Hoca
```

---

# 6. Kodun Mantığı

### 1. Course nesnesi oluşturuldu

```java id="9h2l4v"
Course course1 = new Course("Java", "Ali Hoca");
```

---

### 2. Student nesnesi oluşturuldu

```java id="5k2c9m"
Student student1 = new Student("Ahmet", 21, course1);
```

👉 Dikkat:
Student içinde **Course nesnesi tutuluyor**

---

### 3. Metot çağrıldı

```java id="o2v3pl"
student1.showStudent();
```

---

# 7. Bu Örnek Neyi Öğretiyor?

Bu yapı:

* Bir sınıfın içinde başka bir sınıf kullanmayı (**HAS-A ilişkisi**) öğretir
* Gerçek hayattaki nesneler arası ilişkiyi modellemeyi sağlar

👉 Student HAS-A Course
(Öğrencinin bir dersi var)


Bu örnekte:

* 2 farklı class kullandık
* Bir class içinde başka class kullandık
* Nesneler arası ilişki kurduk

Temel kullanım:

```java id="x3l9pa"
ClassA objA = new ClassA();
ClassB objB = new ClassB(objA);
```

---
