package assignment.byTelusko.program1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Welcome To Calculator : ");

		double num1;
		double num2;

		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter The First Number :");

		num1 = Scan.nextDouble();

		System.out.println("Enter The Second Number :");

		num2 = Scan.nextDouble();

		int res = 0;
		switch (res) {
		case 1:
			System.out.println("Addition is : " + num1 + num2);
		case 2:
			System.out.println("Substraction is : " + (num1 - num2));
		case 3:
			System.out.println("Addition is : " + (num1 * num2));
		case 4:
			System.out.println("Addition is : " + (num1 / num2));

		}

	}

}
