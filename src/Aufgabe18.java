/**
 * Created by Leitn on 08.10.2016.
 */
import java.util.Scanner;

public class Aufgabe18 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Geben Sie einen Geldbetrag ein! In ganzen 5er Schritten: ");
        int n = sc.nextInt();
        int h = 0;
        int fuf = 0;
        int zwa = 0;
        int zeh = 0;
        int fue = 0;

        if (n%5 == 0) {

            while (n >= 100) {

                n = n-100;
                h = h+1;

            }
            while (n >= 50) {

                n = n-50;
                fuf = fuf+1;

            }
            while (n >= 20) {

                n = n-20;
                zwa = zwa+1;

            }
            while (n >= 10) {

                n = n-10;
                zeh = zeh+1;

            }

            while (n >= 5) {

                n = n-5;
                fue = fue+1;

            }

            System.out.println("Sie erhalten "+h+ " x100er und "+fuf+" x50er "+zwa+" x20er "+zeh+" x10er "+fue+" x5er.");
            }


        else System.out.println("Geben Sie einen anderen Betrag ein!");

    }
}