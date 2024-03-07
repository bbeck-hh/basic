
public class CalculateNumbers {

    public static void main(String[]args){

        double summe = addNum(60, 20);
        System.out.println("Das Ergebnis der Addition lautet: " + summe);

        double subtract = subtractNum(60, 20);
        System.out.println("Das Ergebnis der Subtraction lautet: " + subtract);

        double makePositiv = makePositiv(-2.60);
        System.out.println("Positive Zahl: " + makePositiv);

        checkIsEven(9);

        checkIfTextPalindrome("Otto");

    }



    public static double addNum(double a, double b) {
        return a + b;
    }

    public static int subtractNum(int a, int b) {
        return a - b;
    }

    public static double makePositiv(double numberToCheck) {
        double positiveNumber = -numberToCheck;

        if (numberToCheck < 0 ) return positiveNumber;
        return numberToCheck;
    }

    public static void checkIsEven(double a) {
        String sentence = "Die Zahl: ";

        if (a % 2 == 1){
            System.out.println( sentence + a*2 + " ist ungerade und verdoppelt sich");
        } else {
            System.out.println( sentence + a + " ist gerade");
        }

    }

    public static boolean checkIfTextPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        if (reversedText.compareToIgnoreCase(text) < 1) {
            System.out.println("The Text is Palindrome");
            return true;
        }
        System.out.println("The Text is not Palindrome Blubb");
        return false;
    }

}