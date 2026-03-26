# Java Method Overloading (Metot Aşırı Yükleme)

## 1. Method Overloading Nedir?

**Method Overloading**, aynı sınıf içinde **aynı isimde birden fazla metot tanımlayabilmektir.**

Ancak bu metotların **parametreleri farklı olmak zorundadır.**

Java bu metotları **parametre sayısına veya parametre tipine bakarak ayırt eder.**

Bu sayede:

* Aynı işlemi yapan metotlar **aynı isim altında toplanabilir**
* Kod daha **okunabilir ve düzenli olur**
* Programlama daha **esnek hale gelir**

---

# 2. Method Overloading Temel Kuralı

Bir metot overload edilebilmesi için aşağıdakilerden **en az biri farklı olmalıdır**:

* Parametre **sayısı**
* Parametre **veri tipi**
* Parametrelerin **sırası (tipleri farklıysa)**

---

# 3. Basit Overloading Örneği

```java
public class Example {

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(5, 10));
        System.out.println(sum(5, 10, 15));

    }
}
```

### Çıktı

```
15
30
```

### Açıklama

Aynı isimde iki metot vardır:

```
sum(int a, int b)
sum(int a, int b, int c)
```

Java parametre sayısına bakarak doğru metodu çağırır.

---

# 4. Parametre Tipi Farklı Olan Overloading

Metotlar aynı sayıda parametre alabilir ancak **tipleri farklı olabilir.**

```java
public class Example {

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(5, 10));
        System.out.println(sum(5.5, 2.3));

    }
}
```

### Çıktı

```
15
7.8
```

---

# 5. Parametre Sırası Farklı Olan Overloading

Eğer parametre tipleri farklıysa sıraları değiştirilebilir.

```java
public class Example {

    static void printInfo(String name, int age) {
        System.out.println(name + " - " + age);
    }

    static void printInfo(int age, String name) {
        System.out.println(age + " - " + name);
    }

    public static void main(String[] args) {

        printInfo("Ahmet", 25);
        printInfo(30, "Mehmet");

    }
}
```

---

# 6. Geçersiz Overloading

Sadece **return type değiştirerek** overloading yapılamaz.

Yanlış kullanım:

```java
int sum(int a, int b) {
    return a + b;
}

double sum(int a, int b) {
    return a + b;
}
```

Bu durumda **derleme hatası oluşur.**

Çünkü parametreler aynıdır.

---

# 7. Gerçek Hayat Örneği

Bir hesap makinesi düşünün.

Aynı **toplama işlemi** farklı sayılarla yapılabilir.

```java
sum(2,3)
sum(2,3,4)
sum(2.5,3.8)
```

Hepsi **toplama işlemi** yapar ama parametreleri farklıdır.

Bu nedenle hepsi aynı isimde olabilir.

---

# 8. Overloading Avantajları

Method Overloading sayesinde:

* Kod daha **okunabilir olur**
* Aynı işlev için farklı isimler kullanmak gerekmez
* Program **daha düzenli ve modüler** olur
* Kullanımı kolay API tasarımı yapılabilir

---

# 9. Java'da Çok Kullanılan Overloading Örneği

Java'nın `println()` metodu da overload edilmiştir.

```java
System.out.println("Hello");
System.out.println(10);
System.out.println(3.14);
System.out.println(true);
```

Hepsi aynı metot ismini kullanır fakat farklı veri tipleri kabul eder.

---

# 10. Örnek Uygulama

Bir hesap makinesi için overload edilmiş metotlar.

```java
public class Calculator {

    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(multiply(2,3));
        System.out.println(multiply(2,3,4));
        System.out.println(multiply(2.5,3.5));

    }
}
```

### Çıktı

```
6
24
8.75
```

---

# 11. Alıştırma Soruları

Aşağıdaki metotları **overloading kullanarak** yazın:

### Soru 1

`area()` isminde metot yazın.

* Kare alanı
* Dikdörtgen alanı
* Üçgen alanı

hesaplayacak şekilde overload edin.

---

### Soru 2

`max()` isminde metot yazın.

* 2 sayı alan
* 3 sayı alan

iki farklı versiyonu olsun.

---

### Soru 3

`print()` isminde metot yazın.

* String yazdıran
* int yazdıran
* double yazdıran

3 farklı overload oluşturun.

---

# 12. Özet

Method Overloading:

* Aynı isimde birden fazla metot yazmaktır
* Parametreler farklı olmalıdır
* Return type tek başına yeterli değildir

Örnek:

```java
sum(int a, int b)
sum(int a, int b, int c)
sum(double a, double b)
```

Java bu metotları **parametrelerine göre ayırt eder.**

---

# 13. Bilmeniz Gereken Kritik Nokta

Method Overloading:

* **Compile Time Polymorphism** olarak bilinir.
* Yani karar **derleme zamanında** verilir.

Bu konu **Java OOP'un temel taşlarından biridir.**

---
