# Java Constructor (Yapıcı Metotlar) - Detaylı Anlatım

## 1. Constructor Nedir?

**Constructor (Yapıcı Metot)**, bir sınıftan nesne oluşturulduğunda **otomatik olarak çalışan özel bir metottur.**

Temel amacı:

* Nesneye **başlangıç değerleri atamak**
* Nesneyi **hazır hale getirmek**

---

# 2. Constructor Özellikleri

Constructor’ların önemli özellikleri:

* Sınıf ile **aynı isimde olur**
* **Geri dönüş tipi yoktur** (void bile yazılmaz)
* Nesne oluşturulurken **otomatik çalışır**
* `new` anahtar kelimesi ile tetiklenir

---

# 3. Basit Constructor Örneği

```java
class Car {

    Car() {
        System.out.println("Constructor çalıştı");
    }

}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

    }
}
```

### Çıktı

```
Constructor çalıştı
```

---

# 4. Default Constructor

Eğer sınıfta **hiç constructor tanımlanmazsa**, Java otomatik olarak **default constructor** oluşturur.

```java
class Car {
}
```

Bu durumda Java arka planda şunu oluşturur:

```java
Car() {
}
```

---

# 5. Parametreli Constructor

Constructor’lar parametre alabilir.

```java
class Car {

    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

}
```

Kullanım:

```java
Car car1 = new Car("BMW", 220);
```

---

# 6. this Anahtar Kelimesi

`this`, mevcut nesneyi temsil eder.

```java
this.brand = brand;
```

### Neden kullanılır?

Parametre ile değişken isimleri aynıysa karışıklığı önler.

---

# 7. Constructor Overloading

Bir sınıfta birden fazla constructor olabilir.

```java
class Car {

    String brand;
    int speed;

    Car() {
        brand = "Bilinmiyor";
    }

    Car(String brand) {
        this.brand = brand;
    }

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

}
```

---

# 8. Constructor Zincirleme (this())

Bir constructor, başka bir constructor’ı çağırabilir.

```java
class Car {

    String brand;
    int speed;

    Car() {
        this("Bilinmiyor", 0);
    }

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

}
```

### Önemli Kural

```java
this(...)
```

her zaman **ilk satırda** olmalıdır.

---

# 9. Constructor vs Metot Farkı

| Özellik  | Constructor     | Metot             |
| -------- | --------------- | ----------------- |
| İsim     | Class ile aynı  | Herhangi bir isim |
| Return   | Yok             | Var               |
| Çağrılma | Otomatik        | Manuel            |
| Amaç     | Nesne oluşturma | İşlem yapma       |

---

# 10. Gerçek Hayat Örneği

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
```

Kullanım:

```java
Student s1 = new Student("Ahmet", 20);
Student s2 = new Student("Ayşe", 22);
```

---

# 11. Constructor ile Nesne Başlatma

```java
class Rectangle {

    int width;
    int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int area() {
        return width * height;
    }

}
```

Kullanım:

```java
Rectangle r = new Rectangle(5, 10);
System.out.println(r.area());
```

---

# 12. Constructor Kullanmanın Avantajları

* Nesne oluştururken **hata riskini azaltır**
* Kod daha **temiz ve düzenli olur**
* Zorunlu alanları **garanti altına alır**
* OOP prensiplerine uygun yapı sağlar

---

# 13. Yaygın Hatalar

### ❌ Return type yazmak

```java
void Car() { } // HATALI
```

---

### ❌ Constructor ismini yanlış yazmak

```java
class Car {
    Car1() { } // HATALI
}
```

---

### ❌ this() yanlış kullanım

```java
Car() {
    System.out.println("Test");
    this("BMW"); // HATALI (ilk satır olmalı)
}
```

---

# 14. Örnek Uygulama

```java
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println(name + " - " + salary);
    }

}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ahmet", 15000);
        Employee e2 = new Employee("Ayşe", 18000);

        e1.showInfo();
        e2.showInfo();

    }
}
```

---

# 15. Alıştırmalar

### Soru 1

`Book` sınıfı oluşturun:

* name
* author
* price

Parametreli constructor yazın.

---

### Soru 2

`Circle` sınıfı oluşturun:

* radius

Constructor ile değer alın ve alan hesaplayan metot yazın.

---

### Soru 3

`User` sınıfı oluşturun:

* username
* password

Constructor ile zorunlu alanları set edin.

---

# 16. Özet

Java’da Constructor:

* Nesne oluşturulurken çalışır
* Class ile aynı isimdedir
* Return type yoktur
* Overloading yapılabilir

Temel kullanım:

```java
ClassName obj = new ClassName(parametreler);
```

Constructor’lar **Java OOP’un en kritik yapı taşlarından biridir.**

---
