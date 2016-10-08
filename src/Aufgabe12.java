
import java.util.Scanner;

public class Aufgabe12 { //TODO

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        int nochmal = 0;
        do {
            System.out.println("Geben Sie die erste Variable ein: ");
            double d = sc.nextDouble();
            System.out.println("Geben Sie die zweite Variable ein: ");
            double e = sc.nextDouble();
            System.out.println("Geben Sie die dritte Variable ein: ");
            double f = sc.nextDouble();

            //Sobald 3 Seitenlängen gegeben sind, kann ein Dreieck gebildet werden, mit Ausnahme von 0

            if (d > 0 && e > 0 && f > 0 && (d+e >= f || d+f >= e || e+f >= d)) { // Überprüfung eines möglichen dreiecks


                if (d == e && e == f) {
                    System.out.println("Es handelt sich um ein gleichseitiges Dreieck");
                } // 2,2,2}

                if (d == e || d == f || e == f) {
                    System.out.println("Es handelt sich um ein gleichschenkeliges Dreieck");
                } // z.b. 2,2,4

                if (d * d + e * e == f * f || d * d + f * f == e * e || e * e + f * f == d * d) {
                    System.out.println("Es handelt sich um ein rechtwinkeliges Dreieck");
                }// z.B. 9, 15, 12

                //if ((d > 0 && e > 0 && f > 0) && ((d*d+e*e == f*f || d*d+f*f == e*e || e*e+f*f == d*d) && ((d == e || d == f || e == f) && (d == e && e == f ))))
                System.out.println("Es handelt sich zumindest um ein gültiges Dreieck"); // >0 und alles was NICHT die ersten 3 IFs ist.

            } else
                System.out.println("Es kann kein Dreieck gebildet werden");
            System.out.println("Wollen Sie es erneut versuchen? 1 - JA");
            nochmal = sc.nextInt();
        } while (nochmal == 1);
    }
}