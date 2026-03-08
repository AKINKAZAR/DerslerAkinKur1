package Ders1.IfElse.Examples.ZodiacSign6;

import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {

        int ay, gun;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Sayı Olarak Girin: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz Günü Sayı Olarak Girin: ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    burc = "Oğlak Burcu";
                } else {
                    burc = "Kova Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 29) {
                if (gun <= 19) {
                    burc = "Kova Burcu";
                } else {
                    burc = "Balık Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    burc = "Balık Burcu";
                } else {
                    burc = "Koç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 20) {
                    burc = "Koç Burcu";
                } else {
                    burc = "Boğa Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    burc = "Boğa Burcu";
                } else {
                    burc = "İkizler Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "ikizler Burcu";
                } else {
                    burc = "Yengeç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "Yengeç Burcu";
                } else {
                    burc = "Aslan Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "Aslan Burcu";
                } else {
                    burc = "Başak Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "Başak Burcu";
                } else {
                    burc = "Terazi Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 22) {
                    burc = "Terazi Burcu";
                } else {
                    burc = "Akrep Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    burc = "Akrep Burcu";
                } else {
                    burc = "Yay Burcu";
                }
            } else {
                isError = true;
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun <= 21) {
                    burc = "Yay Burcu";
                } else {
                    burc = "Oğlak Burcu";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız!!!!");
        } else {
            System.out.println(ay + " - " + gun + " : " + burc);
        }
    }
}
