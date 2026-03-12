package Ders1.SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {

        int gun = 1;

       /* switch (gun) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            default -> System.out.println("Akın kazar");
        }*/

        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            default:
                System.out.println("Akın ");
        }
    }
}
