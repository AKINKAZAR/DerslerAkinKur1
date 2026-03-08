# Java Karşılaştırma Operatörleri

Java’da **Karşılaştırma Operatörleri (Comparison Operators)**, iki değişkenin birbiriyle olan ilişkisini değerlendirmek için kullanılır. Bu operatörler bir ifadenin **doğru (true)** ya da **yanlış (false)** olup olmadığını belirler ve sonuç olarak **boolean** değer üretir.

Temel amaç; bir değerin diğerinden **büyük**, **küçük**, **eşit** ya da **eşit değil** olup olmadığını net biçimde tespit etmektir.  
Önemli bir nokta: Java’da **eşitlik kontrolü için `=` değil `==` operatörü kullanılır.** `=` yalnızca atama yapar.

---

## Java Karşılaştırma Operatörleri Listesi

| Operatör | Açıklama | Örnek |
|--------|----------|-------|
| `==` | Eşittir | `x == y` |
| `!=` | Eşit değildir | `x != y` |
| `>` | Büyüktür | `x > y` |
| `<` | Küçüktür | `x < y` |
| `>=` | Büyük veya eşittir | `x >= y` |
| `<=` | Küçük veya eşittir | `x <= y` |

---

## Örnek Değişken Tanımları

Karşılaştırma örneklerini daha net anlayabilmek için aşağıdaki değişkenleri kullanalım:

```java
int A = 10;
int B = 20;
int C = 10;
int D = 40;
```

Bu noktadan sonra, matematiksel ifadeleri cümleye çevirerek sonuçlarını değerlendireceğiz.

## == (Eşitlik Operatörü
```java
(A == B); // (10 eşittir 20) → Yanlış → false
(A == C); // (10 eşittir 10) → Doğru → true
(C == D); // (10 eşittir 40) → Yanlış → false
```

## != (Eşit Değil Operatörü)
```java
(A != D); // (10 eşit değildir 40) → Doğru → true
(A != C); // (10 eşit değildir 10) → Yanlış → false
(C != B); // (10 eşit değildir 20) → Doğru → true
```

## (  > Büyüktür Operatörü)
```java
(A > D); // (10 büyüktür 40) → Yanlış → false
(D > C); // (40 büyüktür 10) → Doğru → true
(C > B); // (10 büyüktür 20) → Yanlış → false
```

## ( >= Büyük veya Eşittir Operatörü)
```java
(A >= D); // (10 ≥ 40) → Yanlış → false
(A >= C); // (10 ≥ 10) → Doğru → true
(C >= B); // (10 ≥ 20) → Yanlış → false
```
## ( < (Küçüktür Operatörü)
```java
(A < D); // (10 küçüktür 40) → Doğru → true
(D < C); // (40 küçüktür 10) → Yanlış → false
(C < B); // (10 küçüktür 20) → Doğru → true

```

## ( <= Küçük veya Eşittir Operatörü)
```java
(A <= D); // (10 ≤ 40) → Doğru → true
(A <= C); // (10 ≤ 10) → Doğru → true
(C <= B); // (10 ≤ 20) → Doğru → true
```

## Örnek Kod

```java
public class ComparisonOperators {
    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;

        // == Operatörü
        System.out.println(A == B);
        System.out.println(A == C);
        System.out.println(C == D);

        // != Operatörü
        System.out.println(A != D);
        System.out.println(A != C);
        System.out.println(C != B);

        // > Operatörü
        System.out.println(A > D);
        System.out.println(D > C);
        System.out.println(C > B);

        // >= Operatörü
        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(C >= B);

        // < Operatörü
        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);

        // <= Operatörü
        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);
    }
}

```

# Mantıksal Operatörler

Java'da Mantıksal Operatörler, değişkenler veya ifadeler arasındaki mantıksal ilişkileri kontrol etmek için kullanılır. Türkçedeki bağlaçlar gibi düşünülebilirler. Bu operatörler, işlem sonucunda **true** veya **false** değerini döndürür ve genellikle boolean tipindeki değişkenlerle kullanılır.

---

## Java'da Mantıksal Operatörler

### `&&` (VE / AND)
Her iki ifade doğruysa **true** döner.

**Örnek:**

```java
int x = 5;
boolean sonuc = x < 10 && x < 25; // true
```

## || (VEYA / OR)

İfadelerden en az biri doğruysa true döner.

```java
int x = 5;
boolean sonuc = x < 10 || x < 3; // true
```

## ! (TERS / NOT)

İfadenin sonucunu tersine çevirir.

```java
int x = 5;
boolean sonuc = !(x < 5); // true, çünkü x < 5 false ve terslenince true olur
```

## ? : (Ternary / Koşul Operatörü)

Tek satırda koşul kontrolü yapmak için kullanılır. if-else yapısının kısa halidir.

Kullanım Şekli:

```java
(koşul) ? doğruysa : yanlışsa;
```

Örnek:
```java
public class Test {
    public static void main(String args[]) {
        int a = 10;
        int b;

        b = (a == 1) ? 20 : 30;
        System.out.println("b değeri: " + b); // 30

        b = (a == 10) ? 20 : 30;
        System.out.println("b değeri: " + b); // 20
    }
}
```

Açıklama:
- b = (a == 1) ? 20 : 30; → a 1 değil, bu nedenle b 30 olur.
- b = (a == 10) ? 20 : 30; → a 10, bu nedenle b 20 olur.

---

# Boolean Operatör Soruları ve Cevapları (Java)

Bu doküman, mantıksal operatörler (`&&`, `||`, `!`) ile ilgili örnek soruların adım adım çözümlerini içermektedir.

---

## ✅ Soru 1

```java
int a = 10;
int b = 5;

boolean sonuc = (a > b) && (b < 3);
```

* (10 > 5) → true
* (5 < 3) → false

**true && false = false**

✔ **sonuc = false**

---

## ✅ Soru 2

```java
int x = -2;
int y = 4;

boolean sonuc = (x < 0) || (y < 0);
```

* (-2 < 0) → true
* (4 < 0) → false

**true || false = true**

✔ **sonuc = true**

---

## ✅ Soru 3

```java
int m = 7;
int n = 7;

boolean sonuc = (m == n) && !(m < 5);
```

* (7 == 7) → true
* (7 < 5) → false
* !(false) → true

**true && true = true**

✔ **sonuc = true**

---

## ✅ Soru 4

```java
int k = 3;
int t = 8;

boolean sonuc = (k * 2 == t) || (t - k > 10);
```

* (3 * 2 == 8) → 6 == 8 → false
* (8 - 3 > 10) → 5 > 10 → false

**false || false = false**

✔ **sonuc = false**

---

## ✅ Soru 5

```java
int p = 12;
int r = 6;

boolean sonuc = (p / 2 == r) && (p % 5 == 2);
```

* (12 / 2 == 6) → 6 == 6 → true
* (12 % 5 == 2) → 2 == 2 → true

**true && true = true**

✔ **sonuc = true**

---

## ✅ Soru 6

```java
int a = 0;
int b = -1;

boolean sonuc = !(a == 0) || (b < 0);
```

* (0 == 0) → true
* !(true) → false
* (-1 < 0) → true

**false || true = true**

✔ **sonuc = true**

---

## ✅ Soru 7

```java
int x = 15;
int y = 3;

boolean sonuc = (x > 10) && (y != 3);
```

* (15 > 10) → true
* (3 != 3) → false

**true && false = false**

✔ **sonuc = false**

---

## ✅ Soru 8

```java
int s = 9;
int z = 2;

boolean sonuc = (s % z == 1) && (s / z == 4);
```

* (9 % 2 == 1) → 1 == 1 → true
* (9 / 2 == 4) → 4 == 4 → true (integer division)

**true && true = true**

✔ **sonuc = true**

---

## ✅ Soru 9

```java
int a = 5;
int b = 10;

boolean sonuc = (a * b > 40) && (b - a < 3);
```

* (5 * 10 > 40) → 50 > 40 → true
* (10 - 5 < 3) → 5 < 3 → false

**true && false = false**

✔ **sonuc = false**

---

## ✅ Soru 10

```java
int x = 8;
int y = 4;

boolean sonuc = (x >= y * 2) || !(y == 4);
```

* (8 >= 8) → true
* (4 == 4) → true
* !(true) → false

**true || false = true**

✔ **sonuc = true**
