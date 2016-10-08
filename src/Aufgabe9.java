

import java.util.Scanner;

public class Aufgabe9 {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Geben Sie die zurückgelegten km ein: ");
        double km = sc.nextDouble();

        System.out.println("Geben Sie die dafür benötigte Treibstoffmenge ein: ");
        double benzin= sc.nextDouble();

        double verbrauch = (benzin/km)*100;

        System.out.println("Die benötigte Treibstoffmenge für 100km: " +verbrauch +" Liter.");

    }
}
