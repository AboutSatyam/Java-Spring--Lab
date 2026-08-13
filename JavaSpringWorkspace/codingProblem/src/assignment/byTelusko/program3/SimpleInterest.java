package assignment.byTelusko.program3;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("Welcome To Simple Interest Calculator ");
		Scanner Scan = new Scanner(System.in);
		double principal;
		double interest;
		double timePeriod;

		System.out.println("Enter The Principal Amount : ");
		principal = Scan.nextDouble();

		System.out.println("Enter The Interest Rate : ");
		interest = Scan.nextDouble();

		System.out.println("Enter The TimePeriod: ");
		timePeriod = Scan.nextDouble();

		double res = principal * interest * timePeriod / 100;

		System.out.println("The Simple Interest Is " + res);

	}

}
