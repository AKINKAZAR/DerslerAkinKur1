# Değişkenler ve Veri Tipleri (Java)

## Genel Bakış

Değişkenler, programlama dünyasında **geçici bilgileri saklamak** için kullanılan temel yapılardır. Bir programın çalışması sırasında ihtiyaç duyulan veriler değişkenler aracılığıyla bellekte tutulur ve gerekli yerlerde tekrar kullanılır. Bu nedenle değişkenler, programlamanın en temel yapı taşlarından biridir ve tüm programlama dillerinde yer alır.

Bir değişkenin dört temel özelliği vardır:

* **Veri Tipi**: Saklanacak bilginin türünü belirtir.
* **İsim**: Değişkeni program içinde çağırmak için kullanılan benzersiz ad.
* **Değer**: Değişkenin bellekte tuttuğu bilgi.
* **Adres**: İşletim sistemi tarafından bellekte ayrılan konum.

---

## Veri Tipi Kavramı

Veri tipi, bir değişkenin **hangi türde veri saklayacağını** belirler. Bu veriler sayılar, karakterler veya programatik yapılar olabilir.

Java’da veri tipleri iki ana gruba ayrılır:

### 1. İlkel (Primitive) Veri Tipleri

* Java tarafından varsayılan olarak tanımlıdır.
* **Her zaman bir değere sahiptirler.**
* Bellekte kapladıkları alan, veri tipine göre değişir.

### 2. İlkel Olmayan (Non-Primitive) Veri Tipleri

* Programcı tarafından tanımlanabilir.
* **`null` (boş) değer alabilirler.**
* Referans tiptirler ve bellek adresi tutarlar.

---

## Java’da Değişken Tanımlama

Java’da bir değişken şu şekilde tanımlanır:

```
<veri tipi> <değişken ismi> = <değer>;
```

Önce veri tipi, ardından değişkenin adı yazılır. İstenirse aynı satırda değer atanabilir.

### Örnekler

```java
int number;
// number isminde, int veri tipinde bir değişken tanımlandı
```

Aynı veri tipine sahip birden fazla değişken tek satırda tanımlanabilir:

```java
int a, b, c;
// int veri tipinde üç değişken tanımlandı
```

Değişken tanımlandıktan sonra değer ataması yapılabilir:

```java
double pi;
pi = 3.14;
```

Tanımlama ve atama işlemi tek satırda da yapılabilir:

```java
double pi = 3.14;
```

Aynı satırda birden fazla değişkene değer atamak mümkündür:

```java
int a = 1, b = 2;
```

---

## Değişken Kuralları

* Aynı isimde **ikinci bir değişken tanımlanamaz**.
* Bir değişkenin değeri sonradan **değiştirilebilir**.

### Hatalı Kullanım

```java
int a = 5;
int a = 1; // HATA: a değişkeni zaten tanımlı
```

### Doğru Kullanım

```java
boolean a = true;
a = false; // Değer değiştirildi
```

---

## Java’daki İlkel (Primitive) Veri Tipleri

### Tam Sayılar

* `byte`
* `short`
* `int`
* `long`

### Ondalıklı Sayılar

* `float`
* `double`

### Karakterler

* `char`

### Mantıksal Değerler

* `boolean`

---

## Özet

* Değişkenler, veriyi geçici olarak bellekte tutar.
* Java’da veri tipleri **primitive** ve **non-primitive** olarak ayrılır.
* Doğru veri tipi seçimi, hem performans hem de kod kalitesi açısından kritiktir.
* Değişken isimleri benzersiz olmalı ve anlamlı seçilmelidir.

Bu bilgiler, Java programlamaya sağlam bir temel atmak için zorunludur.

# Java Tam Sayı (Integer) Veri Tipleri

Bu doküman, Java programlama dilinde **tam sayıları temsil eden temel veri tiplerini** açık ve net bir şekilde özetler. Amaç; hangi veri tipinin, hangi durumda tercih edilmesi gerektiğini doğru şekilde kavratmaktır.

---

## 1. `byte`
- **Bit uzunluğu:** 8 bit
- **Değer aralığı:** `-128` ile `127`
- **Kullanım amacı:** Çok küçük aralıklardaki sayılar ve bellek optimizasyonu
- **Anahtar sözcük:** `byte`

---

## 2. `short`
- **Bit uzunluğu:** 16 bit
- **Değer aralığı:** `-32.768` ile `32.767`
- **Kullanım amacı:** `byte` yetersiz kaldığında, ancak `int` kullanmaya gerek olmayan durumlar
- **Anahtar sözcük:** `short`

---

## 3. `int`
- **Bit uzunluğu:** 32 bit
- **Değer aralığı:** `-2.147.483.648` ile `2.147.483.647`
- **Kullanım amacı:** Java’da **varsayılan ve en yaygın kullanılan** tam sayı veri tipi
- **Tercih sebebi:** Performans ve bellek kullanımı açısından dengelidir
- **Anahtar sözcük:** `int`

---

## 4. `long`
- **Bit uzunluğu:** 64 bit
- **Değer aralığı:**  
  `-9.223.372.036.854.775.808` ile  
  `9.223.372.036.854.775.807`
- **Kullanım amacı:** `int` sınırlarını aşan büyük sayılar
- **Anahtar sözcük:** `long`

> ⚠️ `long` değişkenlere değer atanırken sayı sonuna **`L`** eklenmesi önerilir.

---

## Örnek Kullanım

```java
public class Main {
    public static void main(String[] args) {
        byte a = 120;
        short b = 1_000;
        int c = 100_000;
        long d = 10_000_000L;
    }
}
```

# Java Ondalıklı (Floating-Point) Veri Tipleri

Bu doküman, Java’da **ondalıklı (küsuratlı) sayıları temsil etmek için kullanılan** `float` ve `double` veri tiplerini net, karşılaştırmalı ve doğru kullanım odağıyla açıklar.

---

## 1. `float`
- **Bit uzunluğu:** 32 bit
- **Değer aralığı:**  
  `1.4 × 10⁻⁴⁵` ile `3.4 × 10³⁸`
- **Hassasiyet:** Yaklaşık 6–7 basamak
- **Kullanım amacı:**
    - Daha az bellek tüketimi
    - Performansın kritik olduğu basit hesaplamalar
- **Önemli kural:**  
  `float` türünde bir değer atanırken **sonuna `f` veya `F` eklenmelidir**
- **Anahtar sözcük:** `float`

> Not: `float` değişkenine tam sayı atansa bile Java bunu **ondalıklı (örneğin 1.0)** olarak değerlendirir.

---

## 2. `double`
- **Bit uzunluğu:** 64 bit
- **Değer aralığı:**  
  `4.9 × 10⁻³²⁴` ile `1.8 × 10³⁰⁸`
- **Hassasiyet:** Yaklaşık 15–16 basamak
- **Kullanım amacı:**
    - Yüksek doğruluk gerektiren matematiksel işlemler
    - Bilimsel ve mühendislik hesaplamaları
- **Java’daki varsayılan ondalık veri tipi**
- **Anahtar sözcük:** `double`

---

## Hangisi Tercih Edilmeli?

Bu seçim **senaryoya bağlıdır**. Aşağıdaki kurallar yol göstericidir:

- **`double` tercih et:**
    - Hassas matematiksel işlemler yapıyorsan
    - `sin`, `cos`, `sqrt` gibi matematik fonksiyonları kullanıyorsan
    - Finansal veya bilimsel hesaplamalarda doğruluk öncelikliyse

- **`float` tercih et:**
    - Bellek ve hız kritikse
    - Çok büyük veri setleriyle çalışıyorsan
    - Hassasiyet ikinci plandaysa

> Gerçek fark performansta **milisaniye seviyesindedir**, ancak doğruluk farkı ciddi sonuçlar doğurabilir.

---

## Java Matematik Kütüphanesi Gerçeği

Java’daki matematiksel fonksiyonların tamamı (`Math.sin`, `Math.cos`, vb.)  
**`double` türünde değer döndürür.**  
Bu nedenle profesyonel projelerde varsayılan tercih **`double`** olmalıdır.

---

## Örnek Kullanım

```java
public class Main {
    public static void main(String[] args) {

        float number1 = 3.14F;
        float number2 = 3.14f;

        double number3 = 3.14;
    }
}
```

# Java Karakter ve Mantıksal Veri Tipleri

Bu doküman, Java’da **metin yapılarının temelini oluşturan** `char` ve **karar mekanizmalarının vazgeçilmezi olan** `boolean` veri tiplerini net, teknik ve doğru bir çerçevede açıklar.

---

## 1. `char`
- **Kullanım amacı:** Tek bir karakter saklamak
- **Bit uzunluğu:** 16 bit
- **Karakter seti:** Unicode
- **Değer aralığı:** `\u0000` ile `\uFFFF`
- **Anahtar sözcük:** `char`

### Temel Özellikler
- Java’da karakterler **tek tırnak (`' '`)** içinde tanımlanır.
- Birden fazla `char` birleşerek **`String` sınıfını** oluşturur.
- Java, evrensel kullanım hedefiyle tasarlandığı için **Unicode karakter setini** kullanır.
- Unicode sayesinde yalnızca Latin alfabesi değil, **tüm dünya dilleri ve semboller** desteklenir.

> Önemli: Java’daki `char`, C/C++ gibi dillere kıyasla **2 kat daha fazla alan** kullanır. Bunun nedeni Unicode desteğidir.

---

## 2. `boolean`
- **Kullanım amacı:** Mantıksal durumları temsil etmek
- **Alabileceği değerler:** `true` veya `false`
- **Anahtar sözcük:** `boolean`

### Temel Özellikler
- Karar yapılarının merkezindedir.
- En yaygın kullanım alanları:
    - `if / else` blokları
    - `while`, `for`, `do-while` döngüleri
    - Karşılaştırma ve kontrol mekanizmaları
- Java’da `boolean`, **sayısal değerlerle (0 / 1)** temsil edilmez.

> Net kural: Java’da `true` ≠ `1`, `false` ≠ `0`.

---

## Örnek Kullanım

```java
public class Main {
    public static void main(String[] args) {

        char letter = 'u';

        boolean logic1 = true;
        boolean logic2 = false;
    }
}
```

# Java String Sınıfı

Bu doküman, Java’da **metinsel verilerin yönetimi ve işlenmesi için kullanılan** `String` sınıfını temel kavramlarıyla birlikte açıklar.

---

## String Nedir?

`String`, Java’da metin (text) verileri saklamak ve işlemek için kullanılan bir **sınıftır**.  
`java.lang` paketinde yer aldığı için **otomatik olarak erişilebilir**, ayrıca import edilmesine gerek yoktur.

Java’da tek karakterler `char` ile tutulur. Ancak gerçek uygulamalarda metinler tek karakterden oluşmaz.  
Bu noktada `String` devreye girer.

> Basit tanım:  
> **`char` → tek karakter**  
> **`String` → karakterlerin birleşimi (kelime, cümle, metin)**

---

## Neden `String` Kullanılır?

- Kelime ve cümle saklamak için idealdir
- Okunabilir ve güvenlidir
- Metin işlemleri için zengin metodlara sahiptir
- `char[]` kullanımına göre daha pratiktir

Bu nedenle Java’da **metinsel ifadeler için standart tercih `String` sınıfıdır.**

---

## Temel Özellikler

- `String` bir **sınıftır**, ilkel (primitive) veri tipi değildir.
- Değerler **çift tırnak (`" "`)** içinde tanımlanır.
- Unicode tabanlıdır, tüm dilleri destekler.
- Değeri değiştirilemez (**immutable**) yapıdadır.

> İmmutable olma özelliği, güvenlik ve performans açısından kritik bir tasarım tercihidir.

---

## Örnek Kullanım

```java
public class Main {
    public static void main(String[] args) {

        String words = "Hello World";
    }
}
```