# Java'da Kullanıcıdan Veri Alma

Java programlarında kullanıcı etkileşimi sağlamak için **Scanner** sınıfı kullanılır. Scanner, klavye üzerinden girilen verileri okumaya yarar ve `java.util` paketi içerisinde yer alır. Bu nedenle kullanılmadan önce mutlaka projeye dahil edilmelidir.

```java
import java.util.Scanner;
```

Bu ifade, Java dosyasının en üst satırlarında bulunmalıdır.

---

## Scanner Nesnesi Oluşturma

Kullanıcıdan veri alabilmek için Scanner sınıfından bir nesne üretilir. Bu nesne, `System.in` parametresi ile klavye girdilerini okumak üzere yapılandırılır.

```java
Scanner input = new Scanner(System.in);
```

Bu aşamadan sonra Scanner nesnesi aracılığıyla farklı veri tiplerinde girişler alınabilir.

---

## Tam Sayı (int) Veri Alma Örneği

Aşağıdaki örnekte kullanıcıdan iki adet tam sayı alınmakta ve ekrana yazdırılmaktadır.

```java
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();

        System.out.print("B sayısını giriniz: ");
        b = input.nextInt();

        System.out.println("A Sayısı: " + a);
        System.out.println("B Sayısı: " + b);
    }
}
```

Bu yapı, konsol tabanlı uygulamalarda en sık kullanılan veri alma yöntemlerinden biridir.

---

## Veri Tiplerine Göre Scanner Metotları

Scanner sınıfı, farklı veri türleri için özel metotlar sağlar. Her veri tipi için doğru metodun kullanılması zorunludur.

| Veri Tipi | Kullanılan Metot |
| --------- | ---------------- |
| String    | nextLine()       |
| int       | nextInt()        |
| double    | nextDouble()     |
| float     | nextFloat()      |
| long      | nextLong()       |
| boolean   | nextBoolean()    |

---

## String, int ve double Veri Alma Örneği

```java
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Ad Soyad giriniz: ");
        String adSoyad = inp.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        int yas = inp.nextInt();

        System.out.print("Maaşınızı giriniz: ");
        double maas = inp.nextDouble();

        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Maaş: " + maas);
    }
}
```

---

## Önemli Notlar

* Scanner sınıfı mutlaka `import` edilmelidir
* Veri tipine uygun metot kullanılmazsa çalışma zamanı hatası oluşur
* `nextLine()` kullanımı, diğer metotlardan sonra dikkat gerektirir
* Konsol uygulamalarının temelini kullanıcı girdileri oluşturur

---

# Not Ortalaması Hesaplayan Program

Bu proje, Java programlama dili kullanılarak öğrencinin ders notlarını kullanıcıdan alır, not ortalamasını hesaplar ve sonucu ekrana yazdırır.

---

## Problem Tanımı

Program, aşağıdaki derslerin sınav notlarını kullanıcıdan alır:

* Matematik
* Fizik
* Kimya
* Türkçe
* Tarih
* Müzik

Girilen notlara göre aritmetik ortalama hesaplanır ve kullanıcıya gösterilir.

Aynı program içerisinde **koşullu ifade** kullanılarak öğrencinin durumu belirlenmelidir:

* Ortalama **60'tan büyükse** → **"Sınıfı Geçti"**
* Ortalama **60'tan küçük veya eşitse** → **"Sınıfta Kaldı"**

Bu kontrol **Ternary Operator** kullanılarak yapılmalıdır.

---

## Java Uygulaması

```java
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        matematik = input.nextInt();
        fizik = input.nextInt();
        kimya = input.nextInt();
        turkce = input.nextInt();
        tarih = input.nextInt();
        muzik = input.nextInt();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        System.out.println("Not Ortalaması: " + ortalama);

        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}
```

---

## Ternary Operator Yapısı

```java
koşul ? doğruysa : yanlışsa;
```

Bu yapı, basit karar mekanizmalarında `if-else` kullanımına alternatif olarak tercih edilir.

---

# Vergi Tutarı Hesaplayan Program

Bu program, Java dili kullanılarak kullanıcıdan alınan para değerine göre **vergi tutarını** ve **vergili fiyatı** hesaplar ve ekrana yazdırır.

---

## Problem Tanımı

Kullanıcıdan bir para değeri (TL) alınacaktır. Girilen tutara göre:

* Vergi oranı belirlenecek
* Vergi tutarı hesaplanacak
* Vergili toplam tutar ekrana yazdırılacaktır

---

## Vergi Kuralları

* Girilen tutar **0 – 1000 TL (dahil)** arasında ise → **Vergi Oranı %18**
* Girilen tutar **1000 TL'den büyük** ise → **Vergi Oranı %8**

---

## Örnek

* Vergisiz Fiyat: `10 TL`
* Vergili Fiyat: `11.8 TL`
* Vergi Tutarı: `1.8 TL`

---

## Java Uygulaması

```java
import java.util.Scanner;

public class VergiHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tutar, vergiOrani, vergiTutari, vergiliFiyat;

        System.out.print("Tutarı giriniz: ");
        tutar = input.nextDouble();

        vergiOrani = (tutar > 0 && tutar <= 1000) ? 0.18 : 0.08;

        vergiTutari = tutar * vergiOrani;
        vergiliFiyat = tutar + vergiTutari;

        System.out.println("Vergisiz Tutar: " + tutar);
        System.out.println("Vergi Oranı: " + vergiOrani);
        System.out.println("Vergi Tutarı: " + vergiTutari);
        System.out.println("Vergili Tutar: " + vergiliFiyat);
    }
}
```

---

## Kullanılan Yapılar

* `Scanner` (kullanıcıdan veri almak için)
* Aritmetik işlemler
* **Ternary Operator** (`? :`) ile koşullu vergi oranı belirleme

---

# Üçgende Hipotenüs ve Alan Hesaplama Programı

Bu program, Java dili kullanılarak kullanıcıdan alınan kenar uzunlukları ile **dik üçgenin hipotenüsünü** ve **herhangi bir üçgenin alanını** hesaplamayı amaçlar.

---

## Problem Tanımı

Program iki aşamadan oluşmaktadır:

1. Kullanıcıdan bir dik üçgenin **iki dik kenar uzunluğu** alınır ve hipotenüs değeri hesaplanır.
2. Kullanıcıdan **üç kenar uzunluğu** girilen bir üçgenin alanı hesaplanır.

Bu sayede hem Pisagor teoremi hem de üçgen alan hesaplama mantığı birlikte uygulanmış olur.

---

## Hipotenüs Hesaplama

Dik üçgende hipotenüs, Pisagor teoremi kullanılarak hesaplanır:

```
h² = a² + b²
```

---

## Üçgen Alanı Hesaplama (Heron Formülü)

Üç kenarı bilinen bir üçgenin alanı **Heron Formülü** ile hesaplanır.

### Formüller

```
Üçgenin çevresi = 2u
u = (a + b + c) / 2

Alan² = u × (u − a) × (u − b) × (u − c)
```

Alan değeri, bulunan sonucun karekökü alınarak elde edilir.

---

## Java Uygulaması

```java
import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Dik üçgen hipotenüs hesaplama
        double a, b, hipotenus;

        System.out.print("Birinci dik kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci dik kenarı giriniz: ");
        b = input.nextDouble();

        hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        // Üçgen alan hesaplama
        double x, y, z, u, alan;

        System.out.print("Birinci kenarı giriniz: ");
        x = input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        y = input.nextDouble();

        System.out.print("Üçüncü kenarı giriniz: ");
        z = input.nextDouble();

        u = (x + y + z) / 2;
        alan = Math.sqrt(u * (u - x) * (u - y) * (u - z));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
```
