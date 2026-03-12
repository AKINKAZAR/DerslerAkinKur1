# Java Sınıflar (Classes)

## 1. Sınıf (Class) Nedir?

**Sınıf (Class)**, nesnelerin özelliklerini ve davranışlarını tanımlayan bir **şablondur (template)**.

Java’da nesne yönelimli programlamanın (OOP) temelini oluşturur.

Başka bir ifadeyle:

* Class → Tasarım
* Object → Gerçek örnek

Gerçek hayat örneği:

Bir **araba üretim planı** düşünün.

Bu plan:

* renk
* model
* hız
* yakıt

gibi özellikleri tanımlar.

Bu plan **class**, üretilen arabalar ise **object** olur.

---

# 2. Java’da Class Yapısı

Java’da bir sınıf şu şekilde tanımlanır:

```java
class ClassName {

    // değişkenler
    // metotlar

}
```

Örnek:

```java
class Car {

}
```

---

# 3. Class İçindeki Bileşenler

Bir Java sınıfı genellikle şu bileşenlerden oluşur:

### 1. Değişkenler (Variables)

Nesnenin özelliklerini tutar.

### 2. Metotlar (Methods)

Nesnenin davranışlarını tanımlar.

### 3. Constructor

Nesne oluşturulurken çalışan özel metotlardır.

---

# 4. Değişken İçeren Class

```java
class Car {

    String brand;
    int speed;

}
```

### Açıklama

Bu sınıfta iki özellik vardır:

```java
String brand
int speed
```

Bu özellikler nesnenin **durumunu (state)** temsil eder.

---

# 5. Metot İçeren Class

```java
class Car {

    String brand;
    int speed;

    void start() {
        System.out.println("Araba çalıştı");
    }

}
```

### Açıklama

Bu metot nesnenin **davranışını (behavior)** temsil eder.

---

# 6. Class’tan Nesne Oluşturma

Bir sınıftan nesne oluşturmak için **new anahtar kelimesi kullanılır.**

```java
ClassName objectName = new ClassName();
```

Örnek:

```java
Car car1 = new Car();
```

---

# 7. Nesne Özelliklerine Erişim

Bir nesnenin özelliklerine **. operatörü ile erişilir.**

```java
car1.brand = "BMW";
car1.speed = 200;
```

---

# 8. Metot Çağırma

Bir nesnenin metodunu çağırmak için yine **. operatörü kullanılır.**

```java
car1.start();
```

---

# 9. Tam Örnek Program

```java
class Car {

    String brand;
    int speed;

    void start() {
        System.out.println("Araba çalıştı");
    }

}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.speed = 220;

        System.out.println("Marka: " + car1.brand);
        System.out.println("Hız: " + car1.speed);

        car1.start();

    }

}
```

### Çıktı

```
Marka: BMW
Hız: 220
Araba çalıştı
```

---

# 10. Birden Fazla Nesne Oluşturma

Aynı sınıftan birden fazla nesne oluşturabilirsiniz.

```java
Car car1 = new Car();
Car car2 = new Car();
```

Örnek:

```java
car1.brand = "BMW";
car2.brand = "Audi";
```

Her nesne **kendi değerlerini saklar.**

---

# 11. Constructor (Yapıcı Metot)

Constructor, nesne oluşturulurken çalışan özel metotlardır.

```java
class Car {

    String brand;

    Car() {
        System.out.println("Araba oluşturuldu");
    }

}
```

Nesne oluşturulduğunda constructor otomatik çalışır.

```java
Car car1 = new Car();
```

---

# 12. Constructor Parametreli Kullanım

```java
class Car {

    String brand;

    Car(String brandName) {
        brand = brandName;
    }

}
```

Kullanım:

```java
Car car1 = new Car("BMW");
```

---

# 13. Class ve Object İlişkisi

| Kavram   | Açıklama           |
| -------- | ------------------ |
| Class    | Nesnelerin taslağı |
| Object   | Class’ın örneği    |
| Variable | Özellik            |
| Method   | Davranış           |

---

# 14. Gerçek Hayat Örneği

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println("Öğrenci ders çalışıyor");
    }

}
```

Nesne oluşturma:

```java
Student s1 = new Student();
Student s2 = new Student();
```

---

# 15. Örnek Uygulama

```java
class Student {

    String name;
    int grade;

    void showInfo() {
        System.out.println(name + " - " + grade);
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ahmet";
        s1.grade = 90;

        s1.showInfo();

    }

}
```

---

# 16. Class Kullanmanın Avantajları

Sınıflar:

* Kodun düzenli olmasını sağlar
* Programı modüler hale getirir
* Tekrar kullanılabilir kod oluşturur
* Büyük projelerde yönetimi kolaylaştırır

---

# 17. Alıştırma Soruları

### Soru 1

`Book` isminde bir class yazın.

Özellikleri:

```
name
author
price
```

Metot:

```
showInfo()
```

---

### Soru 2

`Rectangle` isminde bir class yazın.

Özellikleri:

```
width
height
```

Metot:

```
area()
```

Alan hesaplasın.

---

### Soru 3

`Employee` isminde bir class yazın.

Özellikleri:

```
name
salary
```

Metot:

```
showEmployee()
```

---

# 18. Özet

Java’da sınıflar:

* Nesnelerin taslağını oluşturur
* Değişkenler ve metotlar içerir
* Nesne yönelimli programlamanın temelidir

Temel kullanım:

```java
ClassName obj = new ClassName();
```

Sınıflar **Java OOP’un temel yapı taşlarından biridir.**

---
