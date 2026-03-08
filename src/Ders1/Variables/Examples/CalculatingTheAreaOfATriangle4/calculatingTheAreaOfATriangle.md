# 2️⃣ Üç Kenar Uzunluğundan Üçgen Alanı Hesaplama

## 🎯 Soru

Kullanıcıdan üç kenar uzunluğunu (a, b, c) alarak üçgenin alanını hesaplayan programı yazınız.

---

## 📌 Formüller (Heron Formülü)

Çevre = 2u

u = (a + b + c) / 2

Alan² = u × (u − a) × (u − b) × (u − c)

Alan = √[ u × (u − a) × (u − b) × (u − c) ]

---

---
---
---
---
---
---
---
---
---
---
---
---
---
---
---




## ✅ Çözüm Kodu

```java
import java.util.Scanner;

public class UcgenAlan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz: ");
        double a = input.nextDouble();

        System.out.print("2. Kenarı giriniz: ");
        double b = input.nextDouble();

        System.out.print("3. Kenarı giriniz: ");
        double c = input.nextDouble();

        double u = (a + b + c) / 2;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);

        input.close();
    }
}
```