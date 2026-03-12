# Java Recursive (Özyineli) Metotlar

## 1. Recursive Metot Nedir?

**Recursive (Özyineli) metot**, kendi kendini çağıran metotlara verilen isimdir.

Yani bir metot çalışırken tekrar **aynı metodu çağırabilir**.

Bu yöntem özellikle:

* Matematiksel problemler
* Ağaç (tree) yapıları
* Faktöriyel hesaplama
* Fibonacci serisi
* Dosya sistemleri

gibi problemlerde çok kullanılır.

---

# 2. Recursion Mantığı

Bir recursive metodun **iki temel kısmı vardır:**

### 1️⃣ Base Case (Temel Durum)

Recursion'un **durmasını sağlayan koşuldur.**
Eğer bu olmazsa program **sonsuz döngüye girer** ve **StackOverflowError** oluşur.

### 2️⃣ Recursive Call

Metodun **kendi kendini tekrar çağırdığı kısımdır.**

---

# 3. Basit Recursion Örneği

```java
public class Example {

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        printNumbers(n - 1);

    }

    public static void main(String[] args) {

        printNumbers(5);

    }
}
```

### Çıktı

```
5
4
3
2
1
```

### Açıklama

Metot her çağrıldığında `n` değeri **1 azalır**.

---

# 4. Faktöriyel Hesaplama (Recursion)

Matematikte faktöriyel:

```
n! = n × (n-1)!
```

Örnek:

```
5! = 5 × 4 × 3 × 2 × 1
```

### Java Kodu

```java
public class Example {

    static int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
}
```

### Çıktı

```
120
```

---

# 5. Recursion Çalışma Mantığı

`factorial(5)` çağrısı şu şekilde çalışır:

```
factorial(5)
5 * factorial(4)

factorial(4)
4 * factorial(3)

factorial(3)
3 * factorial(2)

factorial(2)
2 * factorial(1)

factorial(1)
1
```

Sonuç:

```
5 × 4 × 3 × 2 × 1 = 120
```

---

# 6. Fibonacci Serisi (Recursion)

Fibonacci dizisi:

```
0, 1, 1, 2, 3, 5, 8, 13 ...
```

Formül:

```
F(n) = F(n-1) + F(n-2)
```

### Java Kodu

```java
public class Example {

    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {

        System.out.println(fibonacci(6));

    }
}
```

### Çıktı

```
8
```

---

# 7. Recursion vs Loop

| Özellik       | Recursion                    | Loop                      |
| ------------- | ---------------------------- | ------------------------- |
| Çalışma şekli | Metot kendini çağırır        | Döngü kullanılır          |
| Bellek        | Daha fazla kullanır          | Daha az kullanır          |
| Okunabilirlik | Bazı algoritmalarda daha iyi | Basit işlemlerde daha iyi |

---

# 8. Recursion Kullanım Alanları

Recursion özellikle şu alanlarda kullanılır:

* Tree veri yapıları
* Binary Search
* Dosya sistemi tarama
* Backtracking algoritmaları
* Divide and Conquer algoritmaları

---

# 9. Recursion Kullanırken Dikkat Edilmesi Gerekenler

### 1️⃣ Base Case mutlaka olmalıdır

Aksi halde program:

```
StackOverflowError
```

verir.

### 2️⃣ Problem her çağrıda küçülmelidir

Örneğin:

```
factorial(n-1)
```

---

# 10. Örnek Program

Kullanıcıdan bir sayı alıp faktöriyelini recursive metotla hesaplayan program.

```java
import java.util.Scanner;

public class FactorialExample {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int result = factorial(number);

        System.out.println("Faktöriyel: " + result);

        input.close();
    }
}
```

---

# 11. Alıştırma Soruları

### Soru 1

Recursive metot kullanarak **1'den n'e kadar sayıların toplamını** bulun.

Örnek:

```
n = 5
Sonuç = 15
```

---

### Soru 2

Recursive metot ile **bir sayının basamak sayısını** bulun.

Örnek:

```
12345 → 5
```

---

### Soru 3

Recursive metot kullanarak **bir sayının tersini** bulun.

Örnek:

```
1234 → 4321
```

---

# 12. Özet

Recursive metotlar:

* Kendi kendini çağıran metotlardır
* Base case içerir
* Her çağrıda problem küçülür
* Matematiksel problemlerde çok güçlüdür

Temel yapı:

```java
returnType methodName(parameters) {

    if (baseCondition) {
        return value;
    }

    return methodName(smallerProblem);
}
```

Recursive algoritmalar **algoritma bilgisini geliştirmek için çok önemli bir konudur.**

---
