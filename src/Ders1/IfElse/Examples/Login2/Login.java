package Ders1.IfElse.Examples.Login2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String kullaniciAdi;
        int sifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifre: ");
        sifre = input.nextInt();

        if (kullaniciAdi.equals("akinathor") && sifre == 123456){
            System.out.println("Giriş İşlemi Başarıyla Sonuçlandı");
        } else {
            System.out.println("Kullanıcı Adı veya Şifre Hatalı.... Tekrar Deneyiniz!!1");

        }
    }
}
