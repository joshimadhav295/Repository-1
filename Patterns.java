package assgmnt;

public class Patterns {

	    // Pattern 1
	    static void pattern1() {

	        System.out.println("Pattern 1:");

	        for (int i = 1; i <= 5; i++) {

	            for (int j = 1; j <= i; j++) {

	                System.out.print(j);
	            }

	            System.out.println();
	        }
	    }

	    // Pattern 2
	    static void pattern2() {

	        System.out.println("\nPattern 2:");

	        int i = 1;

	        while (i <= 5) {

	            int j = 1;

	            while (j <= i) {

	                System.out.print(j);
	                j++;
	            }

	            System.out.println();
	            i++;
	        }
	    }

	    // Pattern 3
	    static void pattern3() {

	        System.out.println("\nPattern 3:");

	        for (int i = 1; i <= 5; i++) {

	            for (int j = 1; j <= i; j++) {

	                if ((i + j) % 2 == 0) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }

	            System.out.println();
	        }
	    }

	    // Pattern 4
	    static void pattern4() {

	        System.out.println("\nPattern 4:");

	        for (int i = 1; i <= 4; i++) {

	            for (int j = 1; j <= i; j++) {

	                System.out.print(i + " ");
	            }

	            System.out.println();
	        }
	    }

	    // Pattern 5
	    static void pattern5() {

	        System.out.println("\nPattern 5:");

	        int rows[] = {1, 3, 5, 3, 1};

	        for (int i = 0; i < rows.length; i++) {

	            for (int j = 1; j <= rows[i]; j++) {

	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }

	    // Main Method
	    public static void main(String[] args) {

	        pattern1();
	        pattern2();
	        pattern3();
	        pattern4();
	        pattern5();
	    }
	}