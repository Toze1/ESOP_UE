import java.util.Scanner;

public class Aufgabe14 {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Geben Sie a ein: ");
        double a = sc.nextDouble();
        System.out.println("Geben Sie b ein: ");
        double b = sc.nextDouble();
        System.out.println("Geben Sie c ein: ");
        double c = sc.nextDouble();
        System.out.println("Geben Sie y ein: ");
        double y = sc.nextDouble();

        //To Solve y = ax² + bx + c // z.b d> 0; 4, 6, -4 ... x1 = 0.5, x2 = -2
        //To Solve y = ax² + bx + c // z.b d< 0; 5, 8, 9 ... Keine Lösung
        //To Solve y = ax² + bx + c // z.b.d=0; 1,-4,4 ... eine Lösung (2)

        System.out.println("Die zu lösende Gleichung lautet:\n" + a + "x² "+"+ "+ b + "x "+"+ "+ c +"= "+y+" // Minus "+y);
        c = c-y;
        System.out.println("Die zu lösende Gleichung lautet:\n" + a + "x² "+"+ "+ b + "x "+"+ "+ c +"= "+"0");


        double d = ((b * b) - (4 * (a * c)));

        if (d>0)  {
            double x1 = ((-b)+ Math.sqrt((b*b)-(4*a*c)))/(2*a);
            double x2 = ((-b)- Math.sqrt((b*b)-(4*a*c)))/(2*a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2); }

        else if (d == 0) {

            double x3 = (-b) / (2*a);
            System.out.println("x1 = " + x3);}
        else
            System.out.println("Es existiert keine Lösung");



    }
}

