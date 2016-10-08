/**
 * Created by Leitn on 08.10.2016.
 */

import java.util.Scanner;

public class Aufgabe8 {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        // Aufgabe 1:
        System.out.println("Aufgabe 1: Geben Sie einen String ein: ");
        String Uni = sc.nextLine();
        System.out.println(Uni);

        // Aufgabe 2:
        System.out.println("Aufgabe 2: Geben Sie eine Note ein: ");
        int s = sc.nextInt();
        System.out.println("Aufgabe 2: Hoffentlich ist die Note nicht "+s);

        // Aufgabe 3:
        System.out.println("Aufgabe 3: Geben Sie den ersten Teil eines Satzes ein: "); //BUG?
        String Di = sc.nextLine();
        System.out.println("Aufgabe 3/2: Geben Sie den zweiten Teil eines Satzes ein: ");//BUG?
        String Ez = sc.nextLine();
        String zusammen;
        zusammen = Di + Ez;
        System.out.println("Aufgabe 3: "+zusammen);


        // Aufgabe 4: sc.nextLine(); sc.nextByte(); sc.nextBoolean; sc.nextshort; sc.nextDouble(); sc.nextfloat etc.
        byte eins = 32; //byte, short, int oder long möglich (uU auch double und float möglich)
        float zwei = 6.24f; //Unter Umständen auch double möglich
        double drei = 1.968;
        double vier = 1.00e+3f; // 10^3 (10 hoch 3) == 1000
        double fuenf = 1.00e-3; // 10^-3 ... also 0.001
        short sechs = 1624; // short, int, long, float, double möglich
        String sieben = "1000";
        String acht = "A";
        char neun = '9';
        boolean zehn = false;
        char elf = '\n'; // \n == new line
        String zwoelf = "\n"; //String "\n" wird ebenfalls als New Line erkannt!
        short dreizehn = 0xA5; // == 165, Es geht auch int, long, float, double
        char vierzehn = '\u0065'; // == ASCII code für e (Small letter e)
        short fuenfzehn = -25874; // int, long, float, double auch möglich

        System.out.println("Aufgabe 4: "+"\n"+"eins: "+eins+" ||| zwei: "+zwei+ " ||| drei: "+drei+ " ||| vier: "+vier+ " ||| fuenf: "+fuenf+ " ||| sechs: "+sechs+ " ||| sieben: "+sieben+ " ||| acht: "+acht+ " ||| neun: "+neun+ " ||| zehn: "+zehn+ " ||| elf: "+elf+ " ||| zwoelf: "+zwoelf+ " ||| dreizehn: "+dreizehn+ " ||| vierzehn: "+vierzehn+ " ||| fuenfzehn: "+fuenfzehn);

        // Aufgabe 5:
        System.out.println("Aufgabe 5+6: Geben Sie den Wert X für die Funktion ein: ");
        int x = sc.nextInt();
        System.out.println("Aufgabe 5+6: Geben Sie den Wert Y für die Funktion ein: ");
        int y = sc.nextInt();
        int z = 2*x+(y*y);
        System.out.println("Aufgabe 5: "+z);

        // Aufgabe 6:
        int w = 2*y+(y*y); // 2*y+(y+y²) Angabenfehler?
        System.out.println("Aufgabe 6: "+"Das Ergebnis von 2*y+y² ist "+w+". || " + "Das Ergebnis von 2*x+y²="+z+".");

        // Aufgabe 7:

        System.out.println("Geben Sie einen Radius ein: ");
        double radius = sc.nextInt();
        double pi = java.lang.Math.PI;

        double fläche = pi * (radius*radius);   // Kreis Mathematik: Flächeninhalt = Pi * Radius^2
        double umfang = 2 * pi * radius;        // Kreis Mathematik: Umfang=2 * Pi * Radius
        double durchmesser = 2 * radius;        // Kreis Mathematik: Durchmesser =2 * Radius

        System.out.println("Aufgabe 7: Die Fläche des Kreises ist: "+fläche+". Der Umfang des Kreises ist: "+umfang+(". Der Durchmesser des Kreises ist: "+durchmesser));


    }

}
