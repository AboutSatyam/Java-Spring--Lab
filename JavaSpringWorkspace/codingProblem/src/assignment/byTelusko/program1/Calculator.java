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

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		System.out.println("");
		int res = Scan.nextInt();

		switch (res) {
		case 1:
			System.out.println("Addition is : " + (num1 + num2));
			break;
		case 2:
			System.out.println("Substraction is : " + (num1 - num2));
			break;

		case 3:
			System.out.println("Multiplication is : " + (num1 * num2));
			break;

		case 4:
			System.out.println("Division is : " + (num1 / num2));
			break;

		default:
			System.out.println("InVaild Choice ");
		}

	}

}
