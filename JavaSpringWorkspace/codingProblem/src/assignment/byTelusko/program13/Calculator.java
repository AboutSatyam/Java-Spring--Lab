package assignment.byTelusko.program13;

import java.util.Scanner;

public class Calculator {

	void divide() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter The First No : ");
		int num1 = input.nextInt();

		System.out.println("Enter The Second No : ");
		int num2 = input.nextInt();

		try {
			int res = num1 / num2;
			System.out.println("The Division of Given No " + res);
		}

		catch (ArithmeticException e) {

		}

	}

	public static void main(String[] args) {

		System.out.println("Welcome To Divide Calculator ");
		Calculator cl = new Calculator();
		cl.divide();

	}

}
