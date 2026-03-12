# Java Metotları (Methods)

## 1. Metot Nedir?

Java'da **metot (method)**, belirli bir işi yapmak için yazılmış **kod bloklarıdır**.
Programı küçük parçalara bölerek daha **düzenli, okunabilir ve tekrar kullanılabilir** hale getirir.

Metotların temel amacı:

* Kod tekrarını önlemek
* Programı modüler hale getirmek
* Okunabilirliği artırmak
* Bakımı kolaylaştırmak

Örneğin bir programda aynı işlemi 10 kez yazmak yerine **bir metot yazıp çağırmak** daha doğru bir yaklaşımdır.

---

# 2. Java'da Metot Yapısı

Bir metodun genel yapısı aşağıdaki gibidir:

```java
returnType methodName(parameters) {
    // yapılacak işlemler
}
```

### Bölümler

| Bölüm      | Açıklama                          |
| ---------- | --------------------------------- |
| returnType | Metodun geri döndürdüğü veri tipi |
| methodName | Metodun adı                       |
| parameters | Metoda gönderilen değerler        |
| body       | Metodun yaptığı işlemler          |

---

# 3. Basit Bir Metot Örneği

```java
public class Example {

    static void hello() {
        System.out.println("Merhaba Java");
    }

    public static void main(String[] args) {

        hello();

    }
}
```

### Çıktı

```
Merhaba Java
```

### Açıklama

* `hello()` metodu oluşturuldu
* `main()` metodunun içinde çağrıldı
* `void` olduğu için **değer döndürmez**

---

# 4. Parametre Alan Metot

Metotlar **dışarıdan veri alabilir**.

```java
public class Example {

    static void greet(String name) {
        System.out.println("Merhaba " + name);
    }

    public static void main(String[] args) {

        greet("Ahmet");
        greet("Ayşe");

    }
}
```

### Çıktı

```
Merhaba Ahmet
Merhaba Ayşe
```

### Açıklama

`String name` → metoda gönderilen parametredir.

---

# 5. Değer Döndüren Metot

Metotlar bir sonuç **geri döndürebilir**.

```java
public class Example {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = sum(5, 10);
        System.out.println(result);

    }
}
```

### Çıktı

```
15
```

### Açıklama

* `int` → metodun döndürdüğü veri tipi
* `return` → sonucu geri gönderir

---

# 6. Metot Çağırma (Method Call)

Bir metodu kullanmak için **çağırmak gerekir**.

```java
methodName();
```

Örnek:

```java
hello();
sum(5,10);
```

---

# 7. Parametre ve Argüman Farkı

| Kavram    | Açıklama                           |
| --------- | ---------------------------------- |
| Parametre | Metot tanımındaki değişken         |
| Argüman   | Metot çağrılırken gönderilen değer |

Örnek:

```java
sum(int a, int b)
```

`a` ve `b` → **parametre**

```java
sum(5,10)
```

`5` ve `10` → **argüman**

---

# 8. Void Metot

`void` metotlar **geri değer döndürmez**.

```java
static void printMessage() {
    System.out.println("Hello");
}
```

Kullanım:

```java
printMessage();
```

---

# 9. Return Kullanan Metot

Bir metot **sonuç üretip geri gönderiyorsa** `return` kullanılır.

```java
static int square(int number) {
    return number * number;
}
```

Kullanım:

```java
int result = square(4);
```

Sonuç:

```
16
```

---

# 10. Birden Fazla Parametre Alan Metot

```java
static int multiply(int a, int b, int c) {
    return a * b * c;
}
```

Kullanım:

```java
int result = multiply(2,3,4);
```

Çıktı:

```
24
```

---

# 11. Metotların Avantajları

Java'da metot kullanmanın avantajları:

* Kod tekrarını azaltır
* Programı daha düzenli yapar
* Hataları bulmayı kolaylaştırır
* Yeniden kullanılabilir kod sağlar

---

# 12. Örnek Uygulama

Kullanıcıdan iki sayı alıp **toplamını bulan metot**.

```java
import java.util.Scanner;

public class Example {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int a = input.nextInt();

        System.out.print("İkinci sayı: ");
        int b = input.nextInt();

        int result = sum(a, b);

        System.out.println("Toplam: " + result);

        input.close();
    }
}
```

---

# 13. Küçük Alıştırmalar

Aşağıdaki metotları yazmayı deneyin:

1️⃣ Bir sayının **karesini** döndüren metot
2️⃣ İki sayının **büyük olanını** döndüren metot
3️⃣ Bir sayının **tek mi çift mi olduğunu** kontrol eden metot
4️⃣ Üç sayının **ortalamasını** döndüren metot

---

# 14. Özet

Java'da metotlar:

* Kod tekrarını önler
* Programı modüler hale getirir
* Parametre alabilir
* Değer döndürebilir

Temel yapı:

```java
returnType methodName(parameters) {
    // işlemler
}
```

---

# 15. Bilmeniz Gereken Ana Kavramlar

Java metotlarıyla ilgili önemli kavramlar:

* Method Declaration
* Method Call
* Parameters
* Arguments
* Return Type
* Void Methods
* Static Methods
* Method Overloading

Bu kavramlar **Java OOP öğrenmeden önce mutlaka iyi anlaşılmalıdır.**

---
