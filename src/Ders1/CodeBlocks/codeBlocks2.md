# Java'da Kod Blokları (Code Blocks)

Java’da kod blokları `{ }` süslü parantezleri arasında tanımlanır.  
Kod blokları:

- Programın akışını kontrol eder.
- Değişkenlerin yaşam süresini (scope) belirler.
- Method, koşul ve döngü yapılarının temelini oluşturur.

---

# 1️⃣ Basit (Standalone) Kod Bloğu

Tek başına tanımlanabilen bir bloktur.

```java
{
    System.out.println("Bu bağımsız bir kod bloğudur.");
}
```

Gerçek projelerde genellikle method veya kontrol yapıları içinde kullanılır.

---

# 2️⃣ Method Bloğu

Java’da en temel blok türüdür.

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
    }

}
```

`main` metodunun içi bir kod bloğudur.  
Program çalıştığında ilk çalışan blok burasıdır.

---

# 3️⃣ If Bloğu

Koşula bağlı çalışan bloktur.

```java
public class Main {

    public static void main(String[] args) {

        int sayi = 10;

        if (sayi > 5) {
            System.out.println("Sayı 5'ten büyüktür.");
        }

    }
}
```

Koşul doğruysa `{ }` içindeki kod çalışır.

---

# 4️⃣ For Döngüsü Bloğu

Tekrarlı işlemler için kullanılır.

```java
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("i değeri: " + i);
        }

    }
}
```

Döngü koşulu sağlandığı sürece blok tekrar çalışır.

---

# 5️⃣ Scope (Değişken Kapsamı)

Bir blok içinde tanımlanan değişken sadece o blok içinde geçerlidir.

```java
public class Main {

    public static void main(String[] args) {

        if (true) {
            int x = 100;
            System.out.println(x); // Çalışır
        }

        // System.out.println(x); // HATA! x burada geçerli değil

    }
}
```

Blok kapanınca değişkenin yaşam süresi biter.

---

# 6️⃣ Static Blok

Sınıf yüklendiği anda bir kez çalışır.  
Genellikle başlangıç ayarları için kullanılır.

```java
public class Main {

    static {
        System.out.println("Static blok çalıştı.");
    }

    public static void main(String[] args) {
        System.out.println("Main metodu çalıştı.");
    }
}
```

Çalışma sırası:
1. Static blok
2. main metodu

---



# 7️⃣ Nested (İç İçe) Kod Bloğu

Bir blok başka bir blok içinde olabilir.

```java
public class Main {

    public static void main(String[] args) {

        int sayi = 10;

        if (sayi > 0) {

            if (sayi < 20) {
                System.out.println("Sayı 0 ile 20 arasında.");
            }

        }

    }
}
```

Bloklar iç içe olabilir ve her biri kendi scope alanına sahiptir.

---

# 🔎 Özet

Java’da kod blokları:

- `{ }` ile oluşturulur.
- Scope (kapsam) belirler.
- Method, if, for, while gibi yapılarda kullanılır.
- Static ve instance bloklar farklı çalışma zamanına sahiptir.
- Blok kapanınca içindeki değişkenlerin yaşam süresi sona erer.

Temel kural nettir:

> Süslü parantez açıldıysa yeni bir scope başlar.  
> Parantez kapandıysa o scope sona erer.