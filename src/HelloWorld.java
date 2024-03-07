public class HelloWorld {



    public static void main(String[] args) {
        System.out.println("Java is cool!");

        int a = 5;
        int b = 1;

        int sum = a+b;
        System.out.println("Sum: "+sum);

        int difference = a-b;
        System.out.println("Dif: " +difference);

        int product = a*b;
        System.out.println("Prod: "+product);

        int quotient = a/b;
        System.out.println("qout: " +quotient);

        boolean greaterThen = a > b;
        System.out.println("greater then: " + greaterThen);

        boolean lessThen = a < b;
        System.out.println("lesser then: " + lessThen);

        boolean equality = a == b;
        System.out.println("Is equal: " +equality);

        float af = 5.1f;
        float bf = 1.1f;

        System.out.println("float greater then: " + (af>bf));
        System.out.println("float lesser then: " + (af<bf));
        System.out.println("float is equal: " + (af==bf));

        double ad = 5.1;
        double bd = 1.1;

        System.out.println("double greater then: " + (ad>bd));
        System.out.println("double lesser then: " + (ad<bd));
        System.out.println("double is equal: " + (ad==bd));


    }


}
