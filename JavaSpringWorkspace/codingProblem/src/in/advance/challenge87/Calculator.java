package in.advance.challenge87;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Arthematic Opeartion ");
		System.out.println("Enter The First Number : ");
		int num1 = Scan.nextInt();
		System.out.println("Enter The Second Number : ");
		int num2 = Scan.nextInt();

		try {
			int res1 = num1 / num2;
			System.out.printf("Result is %d", res1);
		} catch (ArithmeticException exception) {
			if (exception.getMessage().equals("/ by zero")) {
				System.out.println("Divide By Zero Occured !!!");
			}
			;

		}
	}

}
