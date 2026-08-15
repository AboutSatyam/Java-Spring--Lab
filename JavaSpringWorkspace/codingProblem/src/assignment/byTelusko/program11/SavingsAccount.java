package assignment.byTelusko.program11;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {

	Scanner input = new Scanner(System.in);
	double balance = 10000;

	@Override
	void deposit() {
		System.out.println("Enter The Deposit Amount : ");
		double deposit = input.nextDouble();
		balance += deposit;
		System.out.println("Depost Sucessful:  " + deposit);
	}

	@Override
	void withdrawal() {

		System.out.println("Enter The Withdrawal Amount : ");
		double Withdrawal = input.nextDouble();
		if (balance - Withdrawal >= 1000) {

			balance -= Withdrawal;
			System.out.println("Withdrawal Sucessful : " + Withdrawal);
		} else {
			System.out.println("Minimum Balance Hit !!");
			System.out.println("Minimum Balance Required: 1000");
		}
	}

	@Override
	void displayBalance() {

		System.out.println("Your Current Balance Is : " + balance);

	}

}
