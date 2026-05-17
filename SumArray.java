package assgmnt;

public class SumArray {

    public static void main(String[] args) {

        int arr[] = {23, 55, 90, 444, 5890};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
