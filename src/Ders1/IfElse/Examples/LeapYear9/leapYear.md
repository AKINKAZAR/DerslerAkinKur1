# Artık YIl Hesaplama
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

## Artık Yıl Nedir?

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

## Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

## Örneğin 
1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.

Senaryo

Yıl Giriniz : 2020

2020 bir artık yıldır !

---
---
--
--
--
--
--
--
--


```java
package IfElseAndSwitchCase;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, condition1, condition2, condition3;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        condition1 = year % 4;
        condition2 = year % 100;
        condition3 = year % 400;

        if (condition1 == 0) {
            if (condition2 == 0) {
                if (condition3 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıl değildir!");
                }
            } else {
                System.out.println(year + " bir artık yıldır!");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
```
