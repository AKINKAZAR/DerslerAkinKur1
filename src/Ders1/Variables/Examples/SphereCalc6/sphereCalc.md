# Dairenin Alanını ve Çevresini Hesaplayan Program

## 🎯 Soru

Java ile yarıçapını kullanıcıdan aldığınız dairenin:

- Alanını
- Çevresini

hesaplayan programı yazınız.

---

## 📌 Formüller

Alan = π * r * r

Çevre = 2 * π * r

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

public class DaireHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        double r = input.nextDouble();

        double pi = 3.141592653589793;

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        input.close();
    }
}
```

---

## 🔎 Açıklama

- Kullanıcıdan yarıçap değeri alınır.
- π sabiti manuel olarak tanımlanmıştır.
- Alan ve çevre formülleri uygulanmıştır.
- `double` kullanılmıştır çünkü sonuç ondalıklı olabilir.

---

## 🎯 Örnek Çalışma

Giriş:
```
r = 5
```

Çıktı:
```
Dairenin Alanı: 78.53981633974483
Dairenin Çevresi: 31.41592653589793
```

---

## ⚠️ Profesyonel Not

Gerçek projelerde:

```java
double pi = Math.PI;
```

kullanmak daha doğrudur.

Ancak temel mantığı görmek için sabit değer tanımlamak yeterlidir.