# KDV Tutarı Hesaplayan Program

Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV oranını 15% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.5;

KDV tutarı = 1.5;

# Ekstra
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %15 , tutar 1000 TL'den büyük ise KDV oranını %7 olarak KDV tutarı hesaplayan programı yazınız.


--

--

--

--

--

--

--

--

--

--

--

--

--

--

--

--

--




```java
import java.util.Scanner;

public class KDVAmountCalculation {
    public static void main(String[] args) {
        double kdvRate, originalPrice, lastPrice, kdvPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı Giriniz: ");
        originalPrice = input.nextDouble();

        kdvRate = (originalPrice > 0 && originalPrice < 1000) ? 0.18 : 0.08;
        System.out.println(kdvRate);
        kdvPrice = originalPrice * kdvRate;
        lastPrice = originalPrice + kdvPrice;

        System.out.println("KDV'siz Fiyat= " + originalPrice);
        System.out.println("KDV'li Fiyat= " + lastPrice);
        System.out.println("KDV Tutarı= " + kdvPrice);
    }
}
```