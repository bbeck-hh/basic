public class Arrays {
    public static void main(String[] args) {

        System.out.println("********* bo adder() addiere 2 Zahlen aus einem Array***********");
        adder();

        System.out.println("********* bo printNumbers() Gebe alle Zahlen aus die im Array sind ***********");
        int[] numbersA = {5, 10, 4, 7, 11};
        printNumbers(numbersA);

    }

    public static void adder() {
        // Erstelle ein Array mit dem Namen "numbers"
        int[] numbers = {5, 10, 4, 7, 11};
        int summe = numbers[0] + numbers[1];
        System.out.println("Ergebnis: " + summe);
    }

    public static void printNumbers(int[] numbersA) {
        System.out.println("********* bo for Loop ***********");

        System.out.println("Das Array hat eine Länge von : " + numbersA.length);
        for (int i = 0; i < numbersA.length; i++){
            System.out.println(i + " Zahl im Array: " + numbersA[i]);
        }

        System.out.println("********* bo foreach Loop ***********");

        int[] numbersB = {15, 20, 44};
        // foreach
        for (int numElement : numbersB ) {
            System.out.println(numElement + " Geht auch");
        }

    }
}
