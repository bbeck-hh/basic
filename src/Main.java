public class Main {


    // Sichtbarkeit (static) Rückgabeparameter Methodennamen (Übergabeparameter) { Methodenkörper }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Ganzzahlen
        int age = 33;
        long bigNumber = 100000000000000L;

        //Fließkommazahlen
        float price = 3.99f;
        double scienceNumber = 23.56446584564516;

        //Wahrheitszustände
        boolean isSunny = true;
        boolean isRainy = false;

        //Zeichen
        char firstLetter = 'l';

        //String (Komplexer Datentyp -> Zeichenkette)
        String name = "Max Mustermann";

        //Basic Operators
        /**
         * Mathematischen Operatoren = +, -, *, /, % | Wir bekommen ein Mathematisches Ergebnis (Zahl)
         * Vergleichsoperatoren = ==, != , >, <, >=, <= | Wir bekommen einen Wahrheitswert, also true/false
         * Logische Operatoren = && (Und), || (Oder), ! (Nicht) | Anwendbar auf Wahrheitswerte!
         */
        //Beispiel Operatoren
        int x = 10;
        int y = 5;

        int sum = x+y;
        int difference = x-y;
        int product = x*y;
        int quotient = x/y;
        System.out.println("Die Summe aus " + x + " und " + y + " ist gleich: " +sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);

        boolean isEqual = x==y; //Prüfe auf Gleichheit
        boolean isGreater = x>y; // Größer als prüfen
        boolean logicalAnd = x > 0 && y >0; // Prüft ob beide instanzen true sind
        boolean logicalOr = x > 0 || y < 0; // Prüft ob eine Instanz true ist
        boolean logicalNot = !(x>y);
        boolean logicalNot2 = !(x<y);
        System.out.println(isEqual);
        System.out.println(isGreater);
        System.out.println(logicalAnd);
        System.out.println(logicalOr);
        System.out.println(logicalNot);
        System.out.println(logicalNot2);
    }
}