# Döngü Yapıları

Döngüler, **belirli bir koşul sağlandığı sürece aynı kod bloğunun tekrar tekrar çalıştırılmasını** sağlayan programlama yapılarıdır. Tekrarlayan işlemleri manuel olarak yazmak yerine döngüler kullanılarak daha sade, okunabilir ve sürdürülebilir kodlar oluşturulur.

Java’da toplam **üç adet döngü yapısı** bulunmaktadır:

* `for`
* `while`
* `do-while`

---

## Döngülerin Temel Amacı

Döngü yapıları, kodun belirli bölümlerinin bir koşula bağlı olarak **birden fazla kez çalıştırılmasını** sağlar.

Genel çalışma mantığı şöyledir:

* Bir koşul tanımlanır.
* Koşul **doğru (true)** olduğu sürece döngü çalışmaya devam eder.
* Koşul **yanlış (false)** olduğunda döngü sona erer.

Bu sayede:

* Kod tekrarından kaçınılır.
* Hata yapma riski azalır.
* Kodun bakımı ve okunabilirliği artar.

---

## Döngü Yapılarının Genel Özellikleri

* Döngüler genellikle sayaç (counter) mantığıyla çalışır.
* Sonsuz döngülerden kaçınmak için koşullar dikkatli tanımlanmalıdır.
* Yanlış kurgulanan döngüler performans ve bellek sorunlarına yol açabilir.

---
![img.png![img.png](../../../../../DenemeA1/src/klavuz/img.png)](img.png)


## Java’daki Döngü Türleri

### for Döngüsü

Belirli sayıda tekrar yapılacağı bilinen durumlarda kullanılır.

### while Döngüsü

Koşulun **önce kontrol edilip sonra** döngünün çalıştığı durumlar için uygundur.

### do-while Döngüsü

Koşuldan bağımsız olarak **en az bir kez çalışması gereken** kod bloklarında kullanılır.

---

## Özet

Döngü yapıları, algoritmik düşünmenin temel taşlarından biridir. Doğru döngü türünün seçilmesi, hem performans hem de kod kalitesi açısından kritik öneme sahiptir.

---

**Not:** Döngü kullanırken koşulun mutlaka bir noktada sonlanacağından emin olunmalıdır. Aksi hâlde program sonsuz döngüye girerek çalışamaz duruma gelebilir.
