# Java static Anahtar Kelimesi

## 1. static Nedir?

`static`, bir değişkenin veya metodun **tüm nesneler tarafından ortak kullanılmasını** sağlar.

Yani:

* Normal değişken → **her nesneye özel**
* static değişken → **tüm nesneler için ortak**

---

# 2. static Değişken (Class Variable)

## Örnek

```java
class Student {

    String name;
    static String school = "ABC Üniversitesi";

}
```

### Kullanım

```java
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ahmet";
        s2.name = "Ayşe";

        System.out.println(s1.school);
        System.out.println(s2.school);

    }
}
```

### Çıktı

```
ABC Üniversitesi
ABC Üniversitesi
```

### Açıklama

* `school` tüm öğrenciler için **ortak**
* Tek bir kopya vardır

---

# 3. static Metot

`static` metotlar **nesne oluşturmadan çağrılabilir.**

## Örnek

```java
class MathUtils {

    static int square(int x) {
        return x * x;
    }

}
```

### Kullanım

```java
public class Main {
    public static void main(String[] args) {

        int result = MathUtils.square(5);
        System.out.println(result);

    }
}
```

### Çıktı

```
25
```

---

# 4. static Olmayan Metot vs static Metot

| Özellik           | static             | non-static      |
| ----------------- | ------------------ | --------------- |
| Nesne gerekir mi? | ❌ Hayır            | ✅ Evet          |
| Kime ait?         | Class              | Object          |
| Çağırma           | ClassName.method() | object.method() |

---

# 5. static Blok

Program başlarken çalışan özel bloktur.

```java
class Example {

    static {
        System.out.println("Program başladı");
    }

}
```

---

# 6. static Anahtar Kelimesinin Kullanım Alanları

* Ortak veri paylaşımı (örn: okul adı)
* Yardımcı metotlar (utility methods)
* Matematik işlemleri
* Sabitler (`static final`)

---

# 7. static final (Sabitler)

```java
class Config {

    static final double PI = 3.14;

}
```

Kullanım:

```java
System.out.println(Config.PI);
```

---

# 8. Önemli Kurallar

### 1️⃣ static metot içinde non-static değişken kullanamazsın

```java
class Test {

    int x = 10;

    static void print() {
        // System.out.println(x); ❌ HATA
    }
}
```

Çözüm:

```java
Test t = new Test();
System.out.println(t.x);
```

---

### 2️⃣ static metot içinde sadece static olanlar direkt kullanılır

---

# 9. Gerçek Hayat Mantığı

Düşün:

* Öğrenci adı → kişiye özel → normal değişken
* Okul adı → herkeste aynı → static değişken

---

# 10. Örnek Uygulama

```java
class Counter {

    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Toplam nesne: " + count);
    }

}

public class Main {
    public static void main(String[] args) {

        new Counter();
        new Counter();
        new Counter();

        Counter.showCount();

    }
}
```

### Çıktı

```
Toplam nesne: 3
```

---

# 11. Özet

`static`:

* Class’a aittir
* Tüm nesneler ortak kullanır
* Nesne oluşturmadan erişilir

Temel kullanım:

```java
ClassName.staticVariable
ClassName.staticMethod()
```

---

# 12. Kritik Nokta

👉 `static`, **hafıza yönetimi ve performans için çok önemlidir.**

Yanlış kullanırsan:

* Global değişken gibi davranır
* Kod karmaşık hale gelir

Doğru kullanırsan:

* Temiz ve performanslı kod yazarsın

---
