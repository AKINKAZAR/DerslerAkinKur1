# Kullanıcıdan doğum tarihini alıp Burcunu ekrana yazdıran program. 

* Yalnızca if-else kullanalım
* Yanlış Ay ve Gün Girildiğinde 

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

---
---
---
---
---
---
---
---
---
---

```java
package IfElseAndSwitchCase;

import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int month, day;
        String zodiac = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

  day <= 21) {
                    zodiac = "Oğlak Burcu";
                } else {
                    zodiac = "Kova Burcu";
                }
            } else {
                isError = true;
            }      System.out.print("Doğduğunuz Ayı Sayı olarak Giriniz: ");
            month = input.nextInt();

            System.out.print("Doğduğunuz Günü Sayı olarak Giriniz: ");
            day = input.nextInt();

            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                if (day <= 19) {
                    zodiac = "Kova Burcu";
                } else {
                    zodiac = "Balık Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    zodiac = "Balık Burcu";
                } else {
                    zodiac = "Koç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    zodiac = "Koç Burcu";
                } else {
                    zodiac = "Boğa Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Boğa Burcu";
                } else {
                    zodiac = "İkizler Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "İkizler Burcu";
                } else {
                    zodiac = "Yengeç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Yengeç Burcu";
                } else {
                    zodiac = "Aslan Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Aslan Burcu";
                } else {
                    zodiac = "Başak Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Başak Burcu";
                } else {
                    zodiac = "Terazi Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiac = "Terazi Burcu";
                } else {
                    zodiac = "Akrep Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Akrep Burcu";
                } else {
                    zodiac = "Yay Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiac = "Yay Burcu";
                } else {
                    zodiac = "Oğlak Burcu";
                }
            } else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız.");
        } else {
            System.out.println(month + " " + day + " " + zodiac);
        }
    }
}

```