# Java Switch-Case Yapısı

Bu doküman, Java'da kullanılan `switch-case` kontrol yapısını kapsamlı ve sistematik şekilde açıklamak amacıyla hazırlanmıştır.

---

## 1️⃣ Switch-Case Nedir?

`switch-case`, bir değişkenin aldığı sabit değerlere göre farklı kod bloklarının çalıştırılmasını sağlayan kontrol yapısıdır. Özellikle çoklu eşitlik kontrollerinde uzun `if-else if` zincirlerine alternatif olarak kullanılır.

---

## 2️⃣ Temel Sözdizimi

```java
switch (degisken) {
    case deger1:
        // Çalışacak kod bloğu
        break;

    case deger2:
        // Çalışacak kod bloğu
        break;

    default:
        // Hiçbir case eşleşmezse çalışır
}
```

---

## 3️⃣ Çalışma Mantığı

1. `switch` ifadesi içindeki değişken değerlendirilir.
2. Değer, uygun `case` ile karşılaştırılır.
3. Eşleşme sağlanırsa ilgili kod bloğu çalışır.
4. `break` ifadesi ile switch bloğundan çıkılır.
5. Hiçbir eşleşme olmazsa `default` bloğu çalışır.

---

## 4️⃣ Break Kullanımının Önemi

`break` ifadesi kullanılmazsa, eşleşen case'ten sonraki diğer case blokları da çalışır. Bu duruma **fall-through** denir.

### Örnek (Break Olmadan)

```java
int gun = 1;

switch (gun) {
    case 1:
        System.out.println("Pazartesi");
    case 2:
        System.out.println("Salı");
}
```

Çıktı:

```
Pazartesi
Salı
```

Sebep: `break` olmadığı için bir sonraki case de çalışmıştır.

---

## 5️⃣ Standart Örnek

```java
int sayi = 2;

switch (sayi) {
    case 1:
        System.out.println("Bir");
        break;
    case 2:
        System.out.println("İki");
        break;
    default:
        System.out.println("Tanımsız");
}
```

---

## 6️⃣ Modern Switch (Java 14+)

Java 14 ve sonrasında daha sade bir kullanım mümkündür:

```java
int gun = 2;

switch (gun) {
    case 1 -> System.out.println("Pazartesi");
    case 2 -> System.out.println("Salı");
    default -> System.out.println("Tanımsız");
}
```

Bu kullanımda:

* `break` gerekmez
* Fall-through oluşmaz
* Daha temiz ve güvenli bir yapı sunar

---

## 7️⃣ Hangi Veri Tipleriyle Kullanılır?

`switch` aşağıdaki veri tipleriyle kullanılabilir:

* byte
* short
* int
* char
* String
* enum

`boolean`, `float` ve `double` ile kullanılamaz.

---

## 8️⃣ If-Else ve Switch Karşılaştırması

| Durum                           | Tercih  |
| ------------------------------- | ------- |
| Aralık kontrolü (x > 10)        | if-else |
| Sabit eşitlik kontrolü (x == 1) | switch  |
| Çok sayıda sabit seçenek        | switch  |

---

## 9️⃣ Gerçek Hayat Örneği

```java
int yolculukTipi = 2;

switch (yolculukTipi) {
    case 1:
        System.out.println("Tek Yön");
        break;
    case 2:
        System.out.println("Gidiş-Dönüş");
        break;
    default:
        System.out.println("Geçersiz seçim");
}
```

Bu yapı özellikle menü seçimlerinde ve sabit seçenekli kullanıcı girdilerinde profesyonel bir çözüm sunar.

---

## 🔎 Sonuç

* `switch-case` sabit değerlere göre karar verir.
* `break` ifadesi kontrol akışı için kritik öneme sahiptir.
* Çoklu seçeneklerde kodun okunabilirliğini artırır.
* Modern Java sürümlerinde `->` kullanımı tavsiye edilir.

Bu doküman, Java'da switch-case yapısını temel ve ileri düzey kavramlarıyla açıklamak amacıyla hazırlanmıştır.
