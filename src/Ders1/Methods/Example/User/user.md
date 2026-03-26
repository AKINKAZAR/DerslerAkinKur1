# Java Metotlar - Gelişmiş Örnek (Kullanıcı İşlemleri Sistemi)

## 🎯 Senaryo: Kullanıcı İşlemleri

Bu örnekte:

* Bir kullanıcının yaşı kontrol edilecek
* Şifre doğrulama yapılacak
* Ortalama hesaplanacak

👉 Amaç: Metotları **farklı amaçlarla birlikte kullanmak**

---

# 1. Java Kodu

```java id="8h2k3f"
public class UserSystem {

    // Yaş kontrolü
    static boolean isAdult(int age) {
        return age >= 18;
    }

    // Şifre kontrolü
    static boolean checkPassword(String password) {
        return password.length() >= 8;
    }

    // Ortalama hesaplama
    static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // Kullanıcı bilgilerini yazdırma
    static void showUserInfo(String name, int age) {

        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);

        if (isAdult(age)) {
            System.out.println("Reşit");
        } else {
            System.out.println("Reşit değil");
        }
    }

    public static void main(String[] args) {

        showUserInfo("Ahmet", 20);

        boolean passwordOk = checkPassword("12345678");
        System.out.println("Şifre geçerli mi: " + passwordOk);

        double avg = calculateAverage(70, 80, 90);
        System.out.println("Ortalama: " + avg);

    }
}
```

---

# 2. Çıktı

```id="3k7n2d"
İsim: Ahmet
Yaş: 20
Reşit
Şifre geçerli mi: true
Ortalama: 80.0
```

---

# 3. Kodun Analizi

## ✔ Boolean Döndüren Metot

```java id="t5p9z1"
static boolean isAdult(int age)
```

* true / false döndürür
* kontrol işlemleri için idealdir

---

## ✔ String İşleyen Metot

```java id="y8r4k2"
static boolean checkPassword(String password)
```

* String üzerinde işlem yapılır
* gerçek hayatta çok kullanılır

---

## ✔ Matematiksel Metot

```java id="p6m2c8"
static double calculateAverage(int a, int b, int c)
```

* Hesaplama yapar
* sonuç döndürür

---

## ✔ Metot İçinde Metot Kullanımı

```java id="v9x3k7"
if (isAdult(age))
```

👉 Çok kritik nokta:

* Bir metot başka metodu çağırabilir
* Bu gerçek projelerde sürekli yapılır

