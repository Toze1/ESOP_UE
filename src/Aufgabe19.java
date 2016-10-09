import java.util.Scanner;

public class Aufgabe19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Geben Sie einen Wochentag ein: 1. Montag, 2. Dienstag, 3. Mittwoch, 4. Donnerstag, 5. Freitag, 6. Samstag, 7. Sonntag");
        int w = sc.nextInt();

        switch (w) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Kein gültiger Wochentag");

        }

    }
}