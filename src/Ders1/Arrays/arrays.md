# Java Diziler (Arrays)

## 1. Dizi (Array) Nedir?

**Dizi (Array)**, aynı veri tipine sahip birden fazla değeri **tek bir değişken altında saklamamızı sağlayan** veri yapısıdır.

Özellikleri:

* Sabit boyutludur
* Aynı tür veri tutar
* İndeks (index) ile erişilir
* İndeksler **0’dan başlar**

---

# 2. Dizi Tanımlama

Java’da dizi şu şekilde tanımlanır:

```java
dataType[] arrayName;
```

Örnek:

```java
int[] numbers;
```

---

# 3. Dizi Oluşturma

```java
int[] numbers = new int[5];
```

Bu dizi:

* 5 elemanlıdır
* İndeksleri: 0,1,2,3,4

---

# 4. Diziye Değer Atama

```java
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
```

---

# 5. Kısa Tanımlama

```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

# 6. Dizi Elemanlarına Erişim

```java
System.out.println(numbers[0]); // 10
```

---

# 7. Dizi Uzunluğu

```java
System.out.println(numbers.length);
```

---

# 8. Döngü ile Dizi Kullanımı

### for döngüsü

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

---

### foreach (enhanced for)

```java
for (int num : numbers) {
    System.out.println(num);
}
```

---

# 9. Örnek Program

```java
public class Example {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
```

---

# 10. Dizi ile Toplam Hesaplama

```java
int[] numbers = {10, 20, 30, 40};

int sum = 0;

for (int num : numbers) {
    sum += num;
}

System.out.println("Toplam: " + sum);
```

---

# 11. En Büyük Sayıyı Bulma

```java
int[] numbers = {5, 12, 8, 20, 3};

int max = numbers[0];

for (int num : numbers) {
    if (num > max) {
        max = num;
    }
}

System.out.println("En büyük: " + max);
```

---

# 12. String Dizisi

```java
String[] names = {"Ali", "Ayşe", "Mehmet"};

for (String name : names) {
    System.out.println(name);
}
```

---

# 13. Çok Boyutlu Diziler (2D Array)

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Erişim:

```java
System.out.println(matrix[0][1]); // 2
```

---

# 14. Çok Boyutlu Dizi Döngüsü

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

# 15. Default Değerler

Java dizilerinde varsayılan değerler:

| Tip     | Default Değer |
| ------- | ------------- |
| int     | 0             |
| double  | 0.0           |
| boolean | false         |
| String  | null          |

---

# 16. Dizi vs List Farkı

| Özellik    | Array      | List             |
| ---------- | ---------- | ---------------- |
| Boyut      | Sabit      | Dinamik          |
| Performans | Daha hızlı | Biraz daha yavaş |
| Kullanım   | Basit      | Esnek            |

---

# 17. Avantajlar

* Hızlı erişim (index ile)
* Basit yapı
* Performanslı

---

# 18. Dezavantajlar

* Boyut sabittir
* Esnek değildir
* Eleman ekleme/silme zor

---

# 19. Alıştırmalar

### Soru 1

Bir dizi oluşturun ve:

* Elemanların toplamını bulun

---

### Soru 2

Bir dizide:

* En küçük sayıyı bulun

---

### Soru 3

Bir dizide:

* Çift sayıları yazdırın

---

### Soru 4

Bir diziyi ters çevirin.

---

# 20. Özet

Java’da diziler:

* Aynı türde verileri saklar
* Sabit boyutludur
* İndeks ile erişilir

Temel kullanım:

```java
int[] arr = {1, 2, 3, 4};
```

Diziler, özellikle algoritma geliştirme ve veri yönetiminde **temel yapı taşlarından biridir.**

---
