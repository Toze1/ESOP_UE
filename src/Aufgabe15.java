import java.util.Scanner;

public class Aufgabe15 {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Geben Sie die Punkte ein");
        int p = sc.nextInt();

            if (p>=0 &&p<=200){
                System.out.println("Nicht genügend");}
            if (p>200 && p<=250) {
                System.out.println("Genügend");}
            if (p>250 && p<=300){
                System.out.println("Befriedigend");}
            if (p>300 && p<=350){
                System.out.println("Gut");}
            if (p>350 && p<=400){
                System.out.println("Sehr Gut");}
            if (p<0 || p>400)
                System.out.println("Da ist wohl was schief gegangen");

        }
}
