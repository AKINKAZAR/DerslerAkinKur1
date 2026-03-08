# Java'da Yorum Satırları (Comments)

Java'da yorum satırları, kodun çalışmasını etkilemeden açıklama eklemek için kullanılır. Derleyici yorum satırlarını dikkate almaz. Yorumlar, kodun okunabilirliğini artırmak, dokümantasyon sağlamak ve geliştiriciler arası iletişimi güçlendirmek için kritik öneme sahiptir.

---

## 1️⃣ Tek Satırlı Yorum (Single-Line Comment)

Tek satırlı yorumlar `//` ile başlar.

```java
// Bu bir tek satırlı yorumdur
int sayi = 10; // Değişkene başlangıç değeri atandı
```

🔹 `//` işaretinden sonra yazılan her şey o satırda yorum olarak kabul edilir.
🔹 Genellikle kısa açıklamalar için kullanılır.

---

## 2️⃣ Çok Satırlı Yorum (Multi-Line Comment)

Çok satırlı yorumlar `/*` ile başlar ve `*/` ile biter.

```java
/*
   Bu birden fazla satırdan oluşan
   açıklama bloğudur.
   Kodun belirli bir bölümünü açıklamak için kullanılır.
*/

int toplam = 0;
```

🔹 Birden fazla satır boyunca açıklama yazılabilir.
🔹 Geçici olarak kod bloklarını devre dışı bırakmak için de kullanılabilir.

---

## 3️⃣ JavaDoc Yorumları (Documentation Comments)

JavaDoc yorumları `/**` ile başlar ve `*/` ile biter.

```java
/**
 * Bu metod iki sayıyı toplar.
 * @param a Birinci sayı
 * @param b İkinci sayı
 * @return Toplam sonucu
 */
public int topla(int a, int b) {
    return a + b;
}
```

🔹 API dokümantasyonu üretmek için kullanılır.
🔹 `@param`, `@return`, `@author` gibi etiketler içerebilir.
🔹 Büyük projelerde profesyonel dokümantasyon standardıdır.

---

## Yorum Satırlarının Önemi

* Kodun anlaşılabilirliğini artırır.
* Bakım ve güncelleme süreçlerini kolaylaştırır.
* Takım çalışmasında iletişimi güçlendirir.
* Karmaşık algoritmaların mantığını açıklamak için gereklidir.

Ancak gereksiz ve aşırı yorum kullanımı kod kalitesini düşürebilir. Yorumlar, kodu tekrar etmek için değil, kodun neden yazıldığını açıklamak için kullanılmalıdır.

---
