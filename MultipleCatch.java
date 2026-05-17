package assgmnt;

public class MultipleCatch {

    public static void main(String[] args) {

        try {

            int arr[] = new int[5];

            arr[10] = 50;

            int a = 10 / 0;

        } 
        catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception Occurred");

        } 
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception Occurred");

        } 
        catch (Exception e) {

            System.out.println("General Exception Occurred");
        }

        System.out.println("Program ended");
    }
}
