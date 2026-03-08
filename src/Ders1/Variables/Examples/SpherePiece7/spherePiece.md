# Daire Diliminin Alanını Hesaplayan Program

## 🎯 Soru

Yarıçapı **r**, merkez açısının ölçüsü **α (derece cinsinden)** olan daire diliminin alanını hesaplayan Java programını yazınız.

π sayısını **3.14** alınız.

---

## 📌 Formül

Alan = (π * r² * α) / 360

---

## ✅ Çözüm Kodu

```java
import java.util.Scanner;

public class DaireDilimi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        double r = input.nextDouble();

        System.out.print("Merkez açıyı (derece cinsinden) giriniz: ");
        double alpha = input.nextDouble();

        double pi = 3.14;

        double alan = (pi * (r * r) * alpha) / 360;

        System.out.println("Daire diliminin alanı: " + alan);

        input.close();
    }
}
```

---

## 🔎 Açıklama

- Kullanıcıdan yarıçap ve merkez açı alınır.
- π değeri sabit olarak **3.14** tanımlanmıştır.
- Formül doğrudan uygulanmıştır.
- `double` kullanılmıştır çünkü sonuç ondalıklı olabilir.

---

## 🎯 Örnek

Giriş:
```
r = 10
alpha = 90
```

Hesaplama:
```
Alan = (3.14 * 100 * 90) / 360
Alan = 78.5
```

Çıktı:
```
Daire diliminin alanı: 78.5
```

---

## ⚠️ Profesyonel Not

- α değeri 0–360 arasında olmalıdır.
- Negatif yarıçap girilmemelidir.
- Gerçek projelerde giriş doğrulaması yapılmalıdır.