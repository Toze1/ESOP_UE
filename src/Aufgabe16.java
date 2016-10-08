/**
 * Created by Leitn on 08.10.2016.
 */
import java.util.Scanner;

public class Aufgabe16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Geben Sie das Einkommen ein: ");
        double e = sc.nextDouble();
        double s;

        if (e < 0) {
            System.out.println("Sie können nicht negativ verdienen!");
        }

        if (e >= 0 && e <= 5000) {
            System.out.println("Es fallen 10% Steuern an");
            s = e * 0.1;
            e = e - s;
            System.out.println("Sie müssen " + s + " Steuern zahlen und erhalten " + e + " Euro Einkommen.");
        }
        if (e > 5000 && e <= 10000) {
            System.out.println("Es fallen 22% Steuern an");
            s = e * 0.22;
            e = e - s;
            System.out.println("Sie müssen " + s + " Steuern zahlen und erhalten " + e + " Euro Einkommen.");
        }
        if (e > 10000 && e <= 15000) {
            System.out.println("Es fallen 32% Steuern an");
            s = e * 0.32;
            e = e - s;
            System.out.println("Sie müssen " + s + " Steuern zahlen und erhalten " + e + " Euro Einkommen.");
        }
        if (e > 15000) {
            System.out.println("Es fallen 42% Steuern an");
            s = e * 0.42;
            e = e - s;
            System.out.println("Sie müssen " + s + " Steuern zahlen und erhalten " + e + " Euro Einkommen.");
        }

    }
}

