
## Örnek Soru

Kullanıcıdan 1 ile 7 arasında bir sayı alınız. Girilen sayıya göre haftanın gününü ekrana yazdıran programı `switch-case` kullanarak yazınız.

* 1 → Pazartesi
* 2 → Salı
* 3 → Çarşamba
* 4 → Perşembe
* 5 → Cuma
* 6 → Cumartesi
* 7 → Pazar
* Diğer değerler → "Geçersiz gün"

---

--
--
--
--
--
--
--
--
--
---
--
--
--
---


## Çözüm Kodu

```java
import java.util.Scanner;

public class WeekDayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1-7 arasında bir sayı giriniz: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz gün");
        }

        input.close();
    }
}
```

---
