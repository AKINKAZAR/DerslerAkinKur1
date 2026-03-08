# Kod Blokları (Scope)

Java’da iki süslü parantez **{ }** arasında kalan kod bölümü *kod bloğu (scope)* olarak adlandırılır.

* **{** işareti bir kod bloğunu başlatır.
* **}** işareti başlatılan kod bloğunu sonlandırır.

Kod blokları, programın sınırlarını ve hiyerarşik yapısını belirlemek için kullanılır.

## Değişkenlerin Kapsamı

Bir değişken **yalnızca tanımlandığı kod bloğu içinde geçerlidir**. O bloğun dışına çıkıldığında değişkene erişilemez.

Aynı kod bloğu içerisinde **aynı isimde bir değişken birden fazla kez tanımlanamaz**.

## Örnek Kod

```java
public class JavaPatika {
    // JavaPatika sınıfına ait alan

    public static void main(String[] args) {
        // main metoduna ait alan
        System.out.println("Burası main metoduna ait");
    }
}
```

Bu örnekte:

* `System.out.println("Burası main metoduna ait");` satırı **main metoduna** aittir.
* `public static void main(String[] args) { ... }` bloğu **JavaPatika sınıfına** aittir.

Kod blokları sayesinde iç içe geçmiş yapılar oluşturur ve hangi kodun hangi yapıya ait olduğunu net bir şekilde ifade ederiz.

## Kod Düzeni ve Okunabilirlik

Her yeni kod bloğu bir **tab (girinti)** ile içeri alınmalıdır. Bunun temel amacı kodun okunabilirliğini artırmaktır.

Okunabilirlik, sürdürülebilir ve profesyonel yazılım geliştirmenin temel şartlarından biridir.

## Kötü Kod Örneği

```java
public class JavaPatika {
// JavaPatika sınıfına ait alan  
public static void main(String[] args) {     
// main metoduna ait alan
int a=1,b=2,c=3;
System.out.println("Burası main metoduna ait");
}
}
```

Bu örnekte:

* Girintiler yoktur.
* Kod yapısı belirsizdir.
* Okunabilirlik düşüktür.

## Temiz Kod Örneği

```java
public class JavaPatika {
    // JavaPatika sınıfına ait alan

    public static void main(String[] args) {
        // main metoduna ait alan
        int a = 1, b = 2, c = 3;
        System.out.println("Burası main metoduna ait");
    }
}
```

Bu kullanımda:

* Kod hiyerarşisi nettir.
* Girintiler doğru uygulanmıştır.
* Kod okunabilir ve bakımı kolaydır.

---

**Not:** Temiz ve düzenli kod yazmak sadece estetik değil, aynı zamanda hata oranını düşüren ve ekip çalışmalarını kolaylaştıran kritik bir beceridir.
