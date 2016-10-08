
import java.util.Scanner;

public class Aufgabe17 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Geben Sie das Jahr ein: ");
        int j = sc.nextInt();

        if((j%4 == 0) && (j%100 != 0) || (j%400 == 0)) {   //Schaltjahr ist dann, wenn das Jahr durch 4 oder 400 teilbar ist.
            System.out.println(j+" ist ein Schaltjahr.");} //Kein Schaltjahr, wenn Jahreszahl durch 100 teilbar ist
        else                                               // bei allen Jahren die auf 00 enden wird verzichtet) AUSNAHMEN 1600,2000,2400 --> sind Schaltjahre
            System.out.println(j+" ist kein Schaltjahr.");}


        }

