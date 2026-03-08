# Java – Dik Üçgende Hipotenüs

---

# 1️⃣ Dik Üçgende Hipotenüs Bulan Program

## 🎯 Soru

Kullanıcıdan dik üçgenin iki dik kenar uzunluğunu alıp hipotenüsü hesaplayan Java programını yazınız.

### 📌 Formül (Pisagor Teoremi)

hipotenüs² = a² + b²

hipotenüs = √(a² + b²)

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

public class HipotenusHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1. Dik kenarı giriniz: ");
        double a = input.nextDouble();

        System.out.print("2. Dik kenarı giriniz: ");
        double b = input.nextDouble();

        double hipotenus = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüs: " + hipotenus);

        input.close();
    }
}
```