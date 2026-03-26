# Java Metotlarında Local Değişkenler (Local Variables)

## 1. Local Değişken Nedir?

**Local değişken**, bir metodun veya kod bloğunun içinde tanımlanan ve **sadece o blok içinde kullanılabilen değişkenlerdir.**

Başka bir deyişle:

* Metodun içinde oluşturulur
* Sadece o metodun içinde erişilebilir
* Metot çalışmayı bitirdiğinde bellekten silinir

Bu nedenle **geçici veri tutmak için kullanılır.**

---

# 2. Local Değişkenin Temel Özellikleri

Local değişkenlerin önemli özellikleri:

* Sadece tanımlandığı **metot veya blok içinde geçerlidir**
* **Default değeri yoktur**
* Kullanılmadan önce **değer atanmalıdır**
* Metot tamamlandığında **bellekten silinir**

---

# 3. Basit Local Değişken Örneği

```java
public class Example {

    static void printNumber() {

        int number = 10; // local değişken
        System.out.println(number);

    }

    public static void main(String[] args) {

        printNumber();

    }
}
```

### Açıklama

```java
int number = 10;
```

Bu değişken:

* `printNumber()` metodunun içinde tanımlanmıştır
* Sadece bu metodun içinde kullanılabilir

---

# 4. Local Değişkenin Kapsamı (Scope)

Local değişkenler **tanımlandıkları blok içinde geçerlidir.**

```java
public class Example {

    static void test() {

        int x = 5;

        if (x > 0) {

            int y = 10; // sadece bu blok içinde geçerli
            System.out.println(y);

        }

        System.out.println(x);

    }

}
```

### Önemli Nokta

`y` değişkeni **if bloğunun dışında kullanılamaz.**

Aşağıdaki kullanım hata verir:

```java
System.out.println(y);
```

Çünkü `y` değişkeni o scope dışında değildir.

---

# 5. Local Değişkenlerin Default Değeri Yoktur

Local değişkenlere **değer atamadan kullanamazsınız.**

Yanlış kullanım:

```java
public class Example {

    public static void main(String[] args) {

        int number;

        System.out.println(number); // hata verir

    }
}
```

Hata nedeni:

Java local değişkenlere **otomatik değer atamaz.**

Doğru kullanım:

```java
int number = 0;
```

---

# 6. Metot Parametreleri de Local Değişkendir

Metot parametreleri de **local değişken olarak kabul edilir.**

```java
public class Example {

    static void greet(String name) {

        System.out.println("Merhaba " + name);

    }

    public static void main(String[] args) {

        greet("Ahmet");

    }
}
```

### Açıklama

`name` parametresi:

* Metot içinde kullanılabilir
* Metot bitince yok olur

---

# 7. Local Değişkenlerin Bellekteki Yaşam Süresi

Local değişkenler **stack memory** içinde tutulur.

Yaşam döngüsü:

1. Metot çağrılır
2. Local değişken oluşturulur
3. Metot çalışır
4. Metot bittiğinde değişken silinir

Bu nedenle local değişkenler **geçici veriler için idealdir.**

---

# 8. Local Değişken Örneği (Toplama Programı)

```java
import java.util.Scanner;

public class Example {

    static int sum(int a, int b) {

        int result = a + b; // local değişken
        return result;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        int x = input.nextInt();

        System.out.print("İkinci sayı: ");
        int y = input.nextInt();

        int total = sum(x, y);

        System.out.println("Toplam: " + total);

        input.close();
    }
}
```

### Local Değişkenler

| Değişken | Bulunduğu Yer |
| -------- | ------------- |
| result   | sum metodu    |
| x        | main metodu   |
| y        | main metodu   |
| total    | main metodu   |

Her biri **sadece kendi metodunda geçerlidir.**

---
