# Ödev – Vücut Kitle İndeksi (VKİ) Hesaplayan Program

## 🎯 Soru

Java ile kullanıcıdan:

- Boy (metre cinsinden)
- Kilo (kg cinsinden)

değerlerini alarak Vücut Kitle İndeksi’ni hesaplayan programı yazınız.

---

## 📌 Formül

VKİ = Kilo / (Boy * Boy)

---

---

---
---
---
---
---
------
---
------






## ✅ Çözüm Kodu

```java
import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        input.close();
    }
}
```

---

## 🔎 Örnek Çalışma

Giriş:
```
Lütfen boyunuzu (metre cinsinde) giriniz : 1.72
Lütfen kilonuzu giriniz : 105
```

Hesaplama:
```
VKİ = 105 / (1.72 * 1.72)
VKİ = 35.49215792320173
```

Çıktı:
```
Vücut Kitle İndeksiniz : 35.49215792320173
```

---

## ⚠️ Önemli Not

- Boy değeri metre cinsinden girilmelidir (örn: 1.72).
- Virgül yerine nokta kullanılmalıdır.
- `double` kullanılmıştır çünkü sonuç ondalıklı çıkmaktadır.