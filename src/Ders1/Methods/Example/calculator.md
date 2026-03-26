# Java Metotlar ile Örnek Uygulama

## 🎯 Senaryo: Basit Hesap Makinesi

Bu örnekte metotların nasıl kullanıldığını **gerçek bir senaryo üzerinden** öğreneceksin.

Amaç:

* Metot tanımlama
* Parametre kullanımı
* Return (geri dönüş) kullanımı
* Metotları birlikte kullanma

---

# 1. Sistem Tasarımı

Bir hesap makinesi oluşturacağız.

Metotlar:

* toplama (add)
* çıkarma (subtract)
* çarpma (multiply)
* bölme (divide)

---

# 2. Java Kodu

```java id="n6l1gx"
public class Calculator {

    // Toplama metodu
    static int add(int a, int b) {
        return a + b;
    }

    // Çıkarma metodu
    static int subtract(int a, int b) {
        return a - b;
    }

    // Çarpma metodu
    static int multiply(int a, int b) {
        return a * b;
    }

    // Bölme metodu
    static double divide(double a, double b) {

        if (b == 0) {
            System.out.println("0'a bölme hatası!");
            return 0;
        }

        return a / b;
    }

    public static void main(String[] args) {

        int sum = add(10, 5);
        int sub = subtract(10, 5);
        int mul = multiply(10, 5);
        double div = divide(10, 5);

        System.out.println("Toplama: " + sum);
        System.out.println("Çıkarma: " + sub);
        System.out.println("Çarpma: " + mul);
        System.out.println("Bölme: " + div);

    }
}
```

---

# 3. Çıktı

```id="4v5k7z"
Toplama: 15
Çıkarma: 5
Çarpma: 50
Bölme: 2.0
```

---

# 4. Kodun Analizi

### Metot Tanımı

```java id="v1l8pw"
static int add(int a, int b)
```

* `int` → geri dönüş tipi
* `add` → metot adı
* `(int a, int b)` → parametreler

---

### Metot Çağırma

```java id="k3n2ls"
int sum = add(10, 5);
```

* 10 ve 5 → argüman
* sonuç → `sum` değişkenine atanır

---

### Bölme Metodu (Kontrollü)

```java id="l0m9zn"
if (b == 0)
```

* Hata kontrolü yapılır
* Programın çökmesi engellenir

---

# 5. Void Metot Örneği

```java id="x8y2pq"
static void printMessage() {
    System.out.println("Merhaba");
}
```

Kullanım:

```java id="p0q4az"
printMessage();
```

---
