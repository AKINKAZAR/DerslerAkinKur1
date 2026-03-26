package Ders1.Methods.Example.User;

public class Main {
    public static void main(String[] args) {
        showUserInfo("Ahmet", 20);

        boolean passwordOk = checkPassword("12345678");
        System.out.println("Şifre geçerli mi: " + passwordOk);

        double avg = calculateAverage(70, 80, 90);
        System.out.println("Ortalama: " + avg);
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }

    static boolean checkPassword(String password) {
        return password.length() >= 8;
    }

    static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    static void showUserInfo(String name, int age) {

        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);

        if (isAdult(age)) {
            System.out.println("Reşit");
        } else {
            System.out.println("Reşit değil");
        }
    }
}
