# Java'da if - else Yapısı (Detaylı Anlatım)

## 1️⃣ if - else Nedir?

`if - else` yapısı, programın **karar mekanizmasıdır**.  
Belirli bir koşulun doğru (true) veya yanlış (false) olmasına göre farklı kod blokları çalıştırılır.

Java’da tüm karar yapıları **boolean (true / false)** değer üretir.

---

## 2️⃣ Temel if Yapısı

### Sözdizimi (Syntax)

```java
if (koşul) {
    // koşul true ise çalışır
}
```

### Örnek

```java
public class Main {

    public static void main(String[] args) {

        int sayi = 10;

        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyüktür.");
        }

    }
}
```

👉 Koşul doğruysa blok çalışır.  
👉 Koşul yanlışsa hiçbir şey çalışmaz.

---

## 3️⃣ if - else Yapısı

Eğer koşul yanlışsa başka bir blok çalıştırmak için `else` kullanılır.

### Sözdizimi

```java
if (koşul) {
    // true ise
} else {
    // false ise
}
```

### Örnek

```java
public class Main {

    public static void main(String[] args) {

        int sayi = 3;

        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyük.");
        } else {
            System.out.println("Sayı 5'ten büyük değil.");
        }

    }
}
```

👉 Sadece **bir blok** çalışır.  
İkisi aynı anda çalışmaz.

---

## 4️⃣ if - else if - else Zinciri

Birden fazla koşul kontrol edilecekse `else if` kullanılır.

### Sözdizimi

```java
if (koşul1) {
    
} else if (koşul2) {
    
} else {
    
}
```

### Örnek: Not Hesaplama

```java
public class Main {

    public static void main(String[] args) {

        int not = 75;

        if (not >= 90) {
            System.out.println("AA");
        } else if (not >= 80) {
            System.out.println("BA");
        } else if (not >= 70) {
            System.out.println("BB");
        } else if (not >= 60) {
            System.out.println("CB");
        } else {
            System.out.println("Kaldı");
        }

    }
}
```

👉 Koşullar yukarıdan aşağıya doğru kontrol edilir.  
👉 İlk doğru olan blok çalışır, diğerleri atlanır.

---

## 5️⃣ Karşılaştırma Operatörleri

| Operatör | Anlamı |
|----------|--------|
| `==` | Eşit mi? |
| `!=` | Eşit değil mi? |
| `>` | Büyük mü? |
| `<` | Küçük mü? |
| `>=` | Büyük eşit mi? |
| `<=` | Küçük eşit mi? |

---

## 6️⃣ Mantıksal Operatörler

Birden fazla koşulu birleştirmek için kullanılır.

| Operatör | Anlamı |
|----------|--------|
| `&&` | VE |
| `||` | VEYA |
| `!` | Değil |

### Örnek

```java
int yas = 25;
boolean ehliyet = true;

if (yas >= 18 && ehliyet) {
    System.out.println("Araç kullanabilir.");
}
```

Her iki koşul da doğru olmalıdır.

---

## 7️⃣ Nested (İç İçe) if

Bir if bloğu içinde başka bir if olabilir.

```java
int sayi = 15;

if (sayi > 0) {

    if (sayi % 3 == 0) {
        System.out.println("Pozitif ve 3'e bölünüyor.");
    }

}
```

👉 İç blok sadece dış blok doğruysa çalışır.

---

## 8️⃣ Tek Satırlık if Kullanımı

Eğer blok tek satırsa süslü parantez zorunlu değildir.

```java
if (10 > 5)
    System.out.println("Doğru");
```

⚠️ Profesyonel projelerde `{ }` kullanmak her zaman daha güvenlidir.

---

## 9️⃣ Sık Yapılan Hatalar

### ❌ `=` ile `==` karıştırmak

Yanlış:

```java
if (x = 5)
```

Doğru:

```java
if (x == 5)
```

---

### ❌ Koşulun boolean olmaması

Yanlış:

```java
if (5)
```

Java’da koşul mutlaka boolean olmalıdır.

---

## 🔟 Çalışma Mantığı (Flow)

1. Koşul değerlendirilir.
2. Sonuç true veya false olur.
3. Uygun blok çalıştırılır.
4. Diğer bloklar atlanır.
5. Program kaldığı yerden devam eder.

---

# 🎯 Özet

- `if` karar verir.
- `else` alternatif üretir.
- `else if` çoklu senaryoyu yönetir.
- Koşullar boolean üretir.
- İlk doğru koşul çalışır.
- Kod yukarıdan aşağıya akar.

---

# 📌 Profesyonel Tavsiye

- Koşulları sade tut.
- Gereksiz nested yapıdan kaçın.
- Karmaşık karar yapılarında metotlara böl.
- Okunabilirlik performanstan önce gelir.

Karar yapıları temiz yazılmazsa proje karmaşıklaşır.  
Temiz yazılırsa kontrol tamamen sende olur.