package assgmnt;

public class TryCatchDemo {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;

            System.out.println(a);

        } catch (ArithmeticException e) {

            System.out.println("Exception handled: " + e);
        }

        System.out.println("Program continues...");
    }
}
