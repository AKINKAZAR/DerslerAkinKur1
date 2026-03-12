
# While Döngüsü

`while` döngüsü, Java’nın temel kontrol yapılarından biridir ve **bir koşul doğru olduğu sürece** aynı kod bloğunu tekrar tekrar çalıştırmak için kullanılır. Özellikle bir işlemin **kaç kez tekrar edeceğinin önceden bilinmediği** durumlarda tercih edilir.

---

## While Döngüsünün Çalışma Mantığı

`while` döngüsünde akış şu şekildedir:

1. Koşul kontrol edilir.
2. Koşul **true** ise döngü gövdesi çalıştırılır.
3. Döngü sonunda koşul tekrar kontrol edilir.
4. Koşul **false** olduğunda döngü sona erer.

Koşul en başta kontrol edildiği için, koşul başlangıçta false ise döngü **hiç çalışmayabilir**.

---

## Sözdizimi (Syntax)

```java
while (kosul) {
    // kod bloğu
}
```

* `kosul` mutlaka **boolean** bir ifade olmalıdır.
* Koşul true olduğu sürece döngü devam eder.
* Koşul false olduğunda döngü sonlanır.

Eğer döngü içerisinde çalışacak kod **tek satırdan oluşuyorsa**, süslü parantez kullanımı zorunlu değildir. Ancak okunabilirlik ve hata riskini azaltmak için **her zaman blok kullanılması önerilir**.

---

## Basit While Döngüsü Örneği

```java
int i = 1;

while (i <= 5) {
    System.out.print(i + ",");
    i++;
}
```

### Çıktı

```
1,2,3,4,5,
```

Bu örnekte:

* `i` değeri 1’den başlar.
* `i <= 5` koşulu sağlandığı sürece döngü çalışır.
* Her döngü sonunda `i` bir artırılır.

---

## Boş Gövdeli While Döngüsü

Döngülerin her zaman bir gövdeye sahip olması gerekmez. Bazı özel algoritmalarda, işlem doğrudan koşul ifadesi içerisinde yapılabilir.

```java
int left = 100, right = 200;

while (++left < --right);

System.out.println("100 ile 200'ün ortası: " + left);
```

### Çıktı

```
100 ile 200'ün ortası: 150
```

Bu örnekte:

* `left` artırılırken `right` azaltılır.
* İki değer eşitlendiğinde döngü sona erer.
* Döngü gövdesi boş olmasına rağmen algoritma amacına ulaşır.

> **Uyarı:** Bu kullanım ileri seviye bir tekniktir. Yanlış kullanıldığında kodun anlaşılmasını zorlaştırabilir.

---

## While Döngüsünün Tercih Edildiği Durumlar

`while` döngüsü, tekrar sayısının **kullanıcı davranışına veya dış bir koşula bağlı olduğu** senaryolarda oldukça etkilidir.

### Örnek: Şifre Doğrulama

```java
Scanner scanner = new Scanner(System.in);

String customerPassword = "12345";
boolean passwordSuccessful = false;

while (!passwordSuccessful) {
    System.out.println("Hesap şifrenizi giriniz:");
    String typedPassword = scanner.next();

    if (customerPassword.equals(typedPassword)) {
        passwordSuccessful = true;
        System.out.println("Sisteme başarılı giriş yaptınız!");
    }
}
```

Bu örnekte:

* Kullanıcının kaç kez hatalı giriş yapacağı bilinmez.
* Doğru şifre girilene kadar döngü devam eder.
* Koşul sağlandığında döngü kontrollü şekilde sonlanır.

---

## While Döngüsü Kullanırken Dikkat Edilmesi Gerekenler

* Döngü koşulu mutlaka bir noktada **false** olmalıdır.
* Aksi takdirde program **sonsuz döngüye** girer.
* Döngü içerisinde koşulu etkileyen değişkenler doğru şekilde güncellenmelidir.

---

## Özet

`while` döngüsü, kontrolün tamamen koşula bağlı olduğu durumlarda güçlü ve esnek bir çözümdür. Doğru kurgulandığında kullanıcı etkileşimleri, veri okuma işlemleri ve belirsiz tekrar sayıları için ideal bir yapı sunar.

**Not:** Döngü kullanımı, algoritmanın doğruluğunu doğrudan etkiler. Bu nedenle koşul tanımı ve güncellemeler dikkatle yapılmalıdır.

---

---

# Do-While Döngüsü

`do-while` döngüsü, Java’daki kontrol yapılarından biridir ve çalışma mantığı `while` döngüsüne benzer. Temel fark şudur: **koşul sağlanmasa bile döngü gövdesi en az bir kez çalıştırılır**.

Bu özellik, bazı senaryolarda `do-while` döngüsünü vazgeçilmez hâle getirir.

---

## Do-While Döngüsünün Çalışma Mantığı

`do-while` döngüsünde işlem sırası şu şekildedir:

1. Döngü bloğu çalıştırılır.
2. Koşul kontrol edilir.
3. Koşul **true** ise döngü tekrar eder.
4. Koşul **false** ise döngü sona erer.

Bu nedenle `do-while`, **en az bir kez çalışması gereken** kodlar için kullanılır.

---

## Sözdizimi (Syntax)

```java
do {
    // kodlar
} while (kosul);
```

* `kosul` mutlaka **boolean** bir ifade olmalıdır.
* Koşul döngünün **sonunda** kontrol edilir.
* Noktalı virgül (`;`) zorunludur.

---

## Basit Do-While Örneği

```java
int year = 2020;

do {
    System.out.println("Döngü işletiliyor..");
    year++;
} while (year < 2020);
```

### Çıktı

```
Döngü işletiliyor..
```

Bu örnekte:

* `year < 2020` koşulu **başlangıçta false** durumdadır.
* Buna rağmen döngü gövdesi **bir kez çalıştırılmıştır**.

Bu davranış, `do-while` döngüsünün ayırt edici özelliğidir.

---

## Do-While Döngüsünün Kullanıldığı Durumlar

`do-while` döngüsü genellikle aşağıdaki senaryolarda tercih edilir:

* Kullanıcıdan **en az bir kez veri alınması** gerekiyorsa
* Menülerin **ilk kez mutlaka gösterilmesi** isteniyorsa
* Doğrulama işlemlerinde ilk adımın zorunlu olduğu durumlarda

---

## Örnek: Kullanıcıdan Sayı Alma

```java
Scanner scanner = new Scanner(System.in);
int number;

do {
    System.out.print("Pozitif bir sayı giriniz: ");
    number = scanner.nextInt();
} while (number <= 0);
```

Bu örnekte:

* Kullanıcıdan en az bir kez giriş alınır.
* Girilen değer pozitif değilse döngü devam eder.

---

## While ve Do-While Arasındaki Farklar

| Özellik                   | while               | do-while                                 |
| ------------------------- | ------------------- | ---------------------------------------- |
| Koşul kontrolü            | Döngü başında       | Döngü sonunda                            |
| En az bir kez çalışır mı? | Hayır               | Evet                                     |
| Hiç çalışmama ihtimali    | Var                 | Yok                                      |
| Kullanım amacı            | Koşula bağlı tekrar | En az bir kez çalışması gereken işlemler |

---

## Karşılaştırmalı Örnek

### while Döngüsü

```java
int x = 5;

while (x < 3) {
    System.out.println("while çalıştı");
}
```

➡️ Bu kod **hiçbir çıktı üretmez**, çünkü koşul başlangıçta false’tur.

---

### do-while Döngüsü

```java
int x = 5;

do {
    System.out.println("do-while çalıştı");
} while (x < 3);
```

➡️ Bu kodun çıktısı:

```
do-while çalıştı
```

---

## Özet

* `do-while`, koşuldan bağımsız olarak **en az bir kez çalışması gereken** işlemler için idealdir.
* `while` ise yalnızca koşul doğruysa çalışması gereken durumlar için uygundur.
* Doğru döngü türünü seçmek, kodun doğruluğu ve okunabilirliği açısından kritik öneme sahiptir.

**Not:** Döngü koşulları dikkatli tanımlanmazsa sonsuz döngü riski ortaya çıkar. Bu nedenle her döngünün kontrollü bir çıkış noktası olmalıdır.

---

---

# Do-While Döngüsü ile Tek Sayıların Toplamını Hesaplama (Java)

Bu örnek program, kullanıcıdan girilen sayılar arasındaki **pozitif tek sayıların toplamını** hesaplamak amacıyla hazırlanmıştır. Program, `do-while` döngüsünün çalışma mantığını net bir şekilde göstermektedir.

---

## Programın Amacı

* Kullanıcıdan ardışık tam sayılar almak
* Girilen sayı **pozitif olduğu sürece** veri almaya devam etmek
* Girilen sayılardan **tek olanları** toplamak
* Negatif veya sıfır değer girildiğinde döngüyü sonlandırmak

---

## Kullanılan Yapılar

* `Scanner` → Klavyeden veri almak için
* `do-while` döngüsü → En az bir kez çalışması gereken döngüler için
* `if` koşulu → Sayının tek olup olmadığını kontrol etmek için
* `% (mod)` operatörü → Sayının tek/çift kontrolünü yapmak için

---

## Kaynak Kod

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n = scan.nextInt();

            if (n % 2 == 1) {
                total += n;
            }
        } while (n > 0);

        System.out.println("Toplam : " + total);
    }
}
```

---

## Kodun Çalışma Mantığı

1. `do-while` döngüsü sayesinde kullanıcıdan **en az bir kez** sayı alınır.
2. Girilen sayı `n` değişkenine atanır.
3. `n % 2 == 1` koşulu ile sayının **tek** olup olmadığı kontrol edilir.
4. Sayı tek ise `total` değişkenine eklenir.
5. `n > 0` koşulu sağlandığı sürece döngü devam eder.
6. Kullanıcı 0 veya negatif bir sayı girdiğinde döngü sona erer.
7. Döngü bittikten sonra tek sayıların toplamı ekrana yazdırılır.

---

## Örnek Çalışma

**Girdi:**

```
Sayı Giriniz : 3
Sayı Giriniz : 4
Sayı Giriniz : 7
Sayı Giriniz : -1
```

**Çıktı:**

```
Toplam : 10
```

---

## Önemli Notlar

* `do-while` döngüsü, koşuldan bağımsız olarak **en az bir kez çalışır**.
* Bu yapı, kullanıcıdan sürekli veri alınması gereken senaryolar için uygundur.
* Programda yalnızca **tek sayılar** toplama dahil edilmiştir; çift sayılar yok sayılır.

---

Bu doküman, Java'da **do-while döngüsü**, **koşul yapıları** ve **mod operatörü** kullanımını pekiştirmek amacıyla hazırlanmıştır.


---

---



## Continue Deyimi

`continue` deyimi, döngü içerisinde belirli bir koşul sağlandığında, o turda kalan kodların çalıştırılmasını engeller ve döngünün bir sonraki adımına geçilmesini sağlar. Döngü tamamen sonlanmaz, yalnızca ilgili tur atlanır.

### Kullanım Mantığı

* Koşul sağlanırsa `continue` çalışır.
* Döngü bloğunun altındaki kodlar çalışmaz.
* Döngü bir sonraki iterasyona geçer.

### Örnek

```java
int i = 0;
while (i < 10) {
    i++;
    if (i == 5) {
        continue;
    }
    System.out.println(i);
}
```

Bu örnekte:

* `i` değişkeni her döngü turunda 1 artırılır.
* `i == 5` koşulu sağlandığında `continue` deyimi çalışır.
* `System.out.println(i);` satırı atlanır.
* Döngü bir sonraki adıma geçer.

Sonuç olarak ekrana **5 sayısı yazdırılmaz**, diğer tüm değerler normal şekilde yazdırılır.

---

## Break Deyimi

`break` deyimi, döngü koşulu sağlanıyor olsa bile döngüyü **anında sonlandırmak** için kullanılır. `break` çalıştığı anda döngü tamamen biter ve kontrol döngü dışındaki ilk satıra geçer.

### Kullanım Mantığı

* Belirli bir koşul gerçekleştiğinde döngü durdurulur.
* Döngünün kalan turları çalıştırılmaz.
* Program akışı döngü dışından devam eder.

### Örnek

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

Bu örnekte:

* Döngü `i = 0` değerinden başlar.
* `i == 5` koşulu sağlandığında `break` deyimi çalışır.
* Döngü tamamen sonlandırılır.

Sonuç olarak ekrana **0, 1, 2, 3 ve 4** değerleri yazdırılır.

---

## Continue ve Break Arasındaki Fark

| Özellik                 | continue | break |
| ----------------------- | -------- | ----- |
| Döngüyü sonlandırır mı? | Hayır    | Evet  |
| Sadece o turu atlar mı? | Evet     | Hayır |
| Döngü devam eder mi?    | Evet     | Hayır |

---

## Özet

* `continue`, döngünün sadece ilgili adımını atlamak için kullanılır.
* `break`, döngüyü tamamen bitirmek için kullanılır.
* Her iki deyim de döngü akışını kontrol etmek açısından güçlü araçlardır ve dikkatli kullanılmalıdır.

Bu dosya, Java'da **continue** ve **break** deyimlerinin kullanımını temel ve anlaşılır şekilde açıklamak amacıyla hazırlanmıştır.


---

---