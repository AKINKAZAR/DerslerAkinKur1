# Uçak Bileti Fiyatı Hesaplama (Java)

Bu program, mesafe, yaş ve yolculuk tipine göre uçak bileti fiyatını hesaplamaktadır.

---

## 🎯 Problem Tanımı

Kullanıcıdan aşağıdaki bilgiler alınacaktır:

* Mesafe (KM)
* Yaş
* Yolculuk Tipi (1 => Tek Yön, 2 => Gidiş-Dönüş)

### 💰 Temel Kural

* Km başına ücret: **0.10 TL**
* Normal Tutar = Mesafe × 0.10

---

## 📌 İndirim Kuralları

### 🎂 Yaş İndirimi

* 12 yaş altı → %50 indirim
* 12 - 24 yaş arası → %10 indirim
* 65 yaş üstü → %30 indirim

### ✈ Yolculuk Tipi İndirimi

* Gidiş-Dönüş (2) → %20 indirim uygulanır.
* Gidiş-Dönüş seçilmişse toplam tutar 2 ile çarpılır.

---

## ⚠ Geçerlilik Kontrolü

Aşağıdaki durumlarda program hata vermelidir:

* Mesafe ≤ 0
* Yaş ≤ 0
* Yolculuk tipi 1 veya 2 dışında bir değer

Bu durumda çıktı:

```
Hatalı Veri Girdiniz !
```

---

# 🧪 Senaryolar

## ✅ Senaryo 1

Girdi:

```
Mesafe: 1500
Yaş: 20
Tip: 2
```

Çıktı:

```
Toplam Tutar = 216 TL
```

---

## ❌ Senaryo 2

Girdi:

```
Mesafe: -500
Yaş: 1
Tip: 77
```

Çıktı:

```
Hatalı Veri Girdiniz !
```

---

## ✅ Senaryo 3

Girdi:

```
Mesafe: 200
Yaş: 35
Tip: 1
```

Çıktı:

```
Toplam Tutar = 20.0 TL
```

---


## 💻 Java Kod Çözümü

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mesafe, yas, toplamTutar, yasIndirimi = 0;
        int yolculukTipi;

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        // Veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {

            // Normal tutar
            toplamTutar = mesafe * 0.10;

            // Yaş indirimi hesaplama
            if (yas < 12) {
                yasIndirimi = toplamTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = toplamTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = toplamTutar * 0.30;
            }

            toplamTutar -= yasIndirimi;

            // Gidiş-Dönüş indirimi
            if (yolculukTipi == 2) {
                toplamTutar -= toplamTutar * 0.20;
                toplamTutar *= 2;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}
```

---

