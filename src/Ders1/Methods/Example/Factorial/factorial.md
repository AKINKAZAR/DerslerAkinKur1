# Java Metot ile Faktöriyel Hesaplama

## 🎯 Amaç

Bu örnekte:

* Metot kullanarak faktöriyel hesaplama
* for döngüsü kullanımı
* if-else ile kontrol yapma

---

# 1. Faktöriyel Nedir?

Bir sayının faktöriyeli:

```text
n! = n × (n-1) × (n-2) × ... × 1
```

Örnek:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

---

# 2. Java Kodu

```java id="f4k9m2"
import java.util.Scanner;

public class FactorialExample {

    // Faktöriyel hesaplayan metot
    static long factorial(int n) {

        if (n < 0) {
            System.out.println("Negatif sayıların faktöriyeli yoktur!");
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı gir: ");
        int number = input.nextInt();

        long result = factorial(number);

        if (result != -1) {
            System.out.println("Faktöriyel: " + result);
        }
    }
}
```

---

# 3. Örnek Çalışma

```text id="n2k7d8"
Bir sayı gir: 5
Faktöriyel: 120
```

---

# 4. Kodun Analizi

## ✔ Metot Tanımı

```java id="q8p1mx"
static long factorial(int n)
```

* `long` → büyük sayılar için
* `n` → hesaplanacak sayı

---

## ✔ if-else Kontrolü

```java id="w3z7kd"
if (n < 0)
```

* Negatif sayı kontrolü
* Hatalı giriş engellenir

---

## ✔ for Döngüsü

```java id="m6c2vz"
for (int i = 1; i <= n; i++)
```

* 1’den n’e kadar çarpım yapılır

---

## ✔ Metot Çağırma

```java id="x1v9qe"
long result = factorial(number);
```

* Kullanıcıdan alınan değer metoda gönderilir

---

# 5. Alternatif: Recursive (Özyineli) Versiyon

```java id="r5k2pn"
static long factorialRecursive(int n) {

    if (n == 0 || n == 1) {
        return 1;
    }

    return n * factorialRecursive(n - 1);
}
```

---

# 6. Bu Örnek Neyi Öğretiyor?

Bu örnek:

* Metot ile işlem yapmayı
* Döngü kullanmayı
* Kontrol mekanizmasını kurmayı
* Recursive mantığını anlamayı

---

# 7. Geliştirme Önerileri

Bu kodu geliştir:

* while ile tekrar tekrar hesaplama
* Büyük sayılar için BigInteger kullan
* Kullanıcı 0 girene kadar devam et

---

# 8. Alıştırmalar

### Soru 1

```text id="z9k3lm"
Kombinasyon (nCr) hesaplayan metot yaz
```

---

### Soru 2

```text id="y8m2xp"
Girilen sayının faktöriyelini while ile hesapla
```

---

### Soru 3

```text id="x7n1qo"
Recursive metodu detaylı test et
```

---

# 9. Özet

Bu örnekte:

* Metot ile faktöriyel hesapladık
* for döngüsü kullandık
* if ile hata kontrolü yaptık
* recursive alternatif gördük

Temel kullanım:

```java id="t2v6we"
long result = factorial(n);
```

---

Bu örneği rahat yazabiliyorsan:

✔ Döngü mantığını oturtmuşsun
✔ Metot kullanımını anlamışsın
✔ Artık algoritma sorularına hazırsın

---
