
import java.util.Scanner;

public class Aufgabe13 {

    static Scanner sc = new Scanner(System.in);


    public static void main (String[] args ) {

        System.out.print("Geben Sie für den Mittelpunkt x ein: ");
        double x = sc.nextDouble();
        System.out.print("Geben Sie für den Mittelpunkt y ein: ");
        double y = sc.nextDouble();
        System.out.print("Geben Sie den Radius ein: ");
        double r = sc.nextDouble();

        System.out.print("Geben Sie für einen beliebigen Punkt p ein: ");
        double p = sc.nextInt();
        System.out.print("Geben Sie für einen beliebigen Punkt q ein: ");
        double q = sc.nextInt();

        double v = ((p - x)*(p - x))+((y - q)+(y - q)); // (p-x)^2 + (q+y)^2 ... dann vergleichen mit r^2  ... wenn < drin, = drauf, > außerhalb

        double rr = r*r;
              if (v < rr )
                  System.out.println("Punkt liegt innerhalb");
              if (v == rr )
                System.out.println("Punkt liegt auf dem Kreis");
              if (v > rr )
                System.out.println("Punkt liegt außerhalb des Kreis");
        }
    }
