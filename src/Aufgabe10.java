
public class Aufgabe10 {
    public static void main (String[] args) {

        //1
        int a = 10;
        double b = 1.1; //b entweder als double zu deklarieren oder 1.1f
        System.out.println("1. "+(a+b)); // Ausgabe: 11.1 ohne klammer 101.1!

        //2
        int c = 10;
        float d = 1.1f;
        float e = c+d; // int e ... kann nicht als ergegebnis variante dienen, da int + float = float
        System.out.println("2. "+e); // Ausgabe: 11.1

        //3
        int f = 10;
        double g = 1.1;
        int h = f+(int)g; //Geht, da G als int "zurückspezifiziert wurde)
        System.out.println("3. "+h); //Ausgabe: 11.1

        //4
        float i = 0;
        double j = 1.1;
        double k = i+j;
        System.out.println("4. "+k); // Ausgabe: 1.1

        //5
        float l = 0.9f; // L als double oder f dekalieren
        double m = 1.1;
        int n = (int)l+(int)m;
        System.out.println("5. "+n); // Ausgabe: 1

        //6
        float o = 0;
        double p = 1.1;
        int q = (int)p / (int)o; // Divide /0 Error!
        System.out.println("6. "+q); // Keine Ausgabe

        //7
        int r = 45;
        int s = r;
        int t = Integer.MAX_VALUE+1;
        float u = 4.5f; //u entweder als 4.5f oder double dekalrieren
        r = r*r;
        s = ((s*s)/s)%s;   // Die äußerste Klammer ist zuviel (Schon entfernt))
        System.out.println("7. "+"r= "+r+" s= "+s+" t= "+t);

    }
}
