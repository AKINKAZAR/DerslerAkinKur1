# Java Temel Operatörler

Java dilinde **operatörler**, değişkenler ve değerler üzerinde işlem yapmamızı sağlayan temel yapı taşlarıdır. Matematiksel hesaplamalardan mantıksal karşılaştırmalara, koşul kontrolünden değer atamaya kadar pek çok işlemi operatörler aracılığıyla gerçekleştiririz.

Bu doküman, Java’da en sık kullanılan operatörleri sade, anlaşılır ve öğrenmeyi kolaylaştıracak şekilde özetlemektedir.

---

## Java’da Operatör Türleri

Java operatörleri genel olarak aşağıdaki başlıklar altında incelenir:

* Atama Operatörleri
* Aritmetik Operatörler
* Karşılaştırma (İlişkisel) Operatörler
* Mantıksal Operatörler
* Koşul (Ternary) Operatörü

---

## Atama Operatörleri

Atama operatörleri, bir değeri değişkene aktarmak için kullanılır.

```java
int a = 10;
```

En temel atama operatörü `=` işaretidir. Bunun yanında birleşik atama operatörleri de mevcuttur:

```java
a += 5;   // a = a + 5
a -= 3;   // a = a - 3
a *= 2;   // a = a * 2
a /= 4;   // a = a / 4
```

---

## Aritmetik Operatörler

Aritmetik operatörler, matematiksel işlemleri Java programları içinde uygulamamızı sağlar.

| Operatör | Açıklama    | Örnek   |
| -------- | ----------- | ------- |
| `+`      | Toplama     | `a + b` |
| `-`      | Çıkarma     | `a - b` |
| `*`      | Çarpma      | `a * b` |
| `/`      | Bölme       | `a / b` |
| `%`      | Mod (kalan) | `a % b` |
| `++`     | 1 artırma   | `a++`   |
| `--`     | 1 azaltma   | `b--`   |

---

## Karşılaştırma (İlişkisel) Operatörler

Karşılaştırma operatörleri iki değerin birbirine göre durumunu kontrol eder ve **boolean** (`true` / `false`) sonuç üretir.

| Operatör | Anlamı          | Örnek    |
| -------- | --------------- | -------- |
| `==`     | Eşittir         | `a == b` |
| `!=`     | Eşit değildir   | `a != b` |
| `>`      | Büyüktür        | `a > b`  |
| `<`      | Küçüktür        | `a < b`  |
| `>=`     | Büyük veya eşit | `a >= b` |
| `<=`     | Küçük veya eşit | `a <= b` |

---

## Mantıksal Operatörler

Mantıksal operatörler, birden fazla koşulu bir arada değerlendirmek için kullanılır.

| Operatör | Açıklama    | Örnek            |
|----------|-------------|------------------|
| `&&`     | Ve (AND)    | `a > 0 && b > 0` |
| `II`     | Veya (OR)    | `a > 0 II b > 0` |
| `!`      | Değil (NOT) | `!(a > b)`       |

---

## Koşul (Ternary) Operatörü

Koşul operatörü, `if-else` yapısının kısa ve pratik bir alternatifidir.

### Sözdizimi

```java
sonuc = (kosul) ? deger1 : deger2;
```

### Örnek

```java
int a = 5;
int b = (a == 1) ? 1 : 0;
```

**Çıktı:**

```text
0
```

Koşul doğruysa `:` işaretinden önceki değer, yanlışsa sonraki değer atanır.

---

## Sonuç

Java operatörleri, programın mantığını kurarken vazgeçilmezdir. Bu operatörleri doğru ve bilinçli kullanmak; daha okunabilir, daha güvenilir ve daha sürdürülebilir kod yazmanın temelidir.

Bu konuyu iyi kavramak, ileri seviye Java geliştirme için sağlam bir temel oluşturur.


## Java Operatörleri – Alıştırma Soruları

1. Aşağıdaki kodun çıktısı nedir?
```java
int a = 10;
int b = 3;
System.out.println(a / b);
```

2. Aşağıdaki ifadelerden hangisi false döner?
```java
int x = 5;
int y = 10;
```
- A) `x < y && y > 0`
- B) `x == 5 || y == 0`
- C) `!(x < y)`
- D) `y >= x && x > 0`

3. Aşağıdaki kod çalıştırıldığında a değişkeninin son değeri kaç olur?
```java
int a = 4;
a += 3;
a *= 2;
```

4. Aşağıdaki ifadelerden hangisi karşılaştırma operatörü içermez?

- A) a == b

- B) a >= b

- C) a += b

- D) a != b

5. Aşağıdaki kodun çıktısı nedir?
```java
int a = 7;
System.out.println(a % 2);
```

6. Aşağıdaki kodda result değişkeninin değeri ne olur?
```java
int x = 3;
int result = (x > 5) ? 10 : 20;
```

7. Aşağıdakilerden hangisi mantıksal operatör değildir?

- A) &&

- B) ||

- C) !

- D) %

8. Aşağıdaki kodun çıktısı nedir?
```java
int a = 5;
System.out.println(a++ + ++a);
```

Aşağıdaki ifadelerden hangisi her zaman true olur?
```java
int a = 10;
```

- A) a > 5 && a < 20

- B) a == 5 || a == 0

- C) a < 0 && a > 0

- D) !(a > 5)

Aşağıdaki kod parçasının ne yaptığını kısaca açıklayınız.
```java
boolean sonuc = (x != y) && (y > 0);
```