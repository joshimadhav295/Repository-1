package assgmnt;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class BankAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int balance = 2000;

		System.out.println("Account balance is: " + balance);

		System.out.print("Enter withdraw amount: ");
		int withdraw = sc.nextInt();

		try {

			if (withdraw > balance) {

				int extra = withdraw - balance;

				throw new InsufficientBalanceException(
						"Sorry, insufficient balance, you need more " + extra + " Rs. To perform this transaction.");
			} else {

				balance = balance - withdraw;

				System.out.println("Transaction successful");
				System.out.println("Remaining balance: " + balance);
			}

		} catch (InsufficientBalanceException e) {

			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
