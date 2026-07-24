package practiceProblem31to40;

import java.util.Scanner;

public class Armstrong37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome Armstrong Method");

		System.out.print("Enter Your Number : ");
		int num = scan.nextInt();

		boolean isArmstrong = isArmstrong(num);

		if (isArmstrong) {
			System.out.println("Your Number is an Armstrong Number");
		} else {
			System.out.println("Your Number is not an Armstrong Number");
		}

		scan.close();
	}

	public static boolean isArmstrong(int num) {

		int CopyNum = num;

		int digits = noOfDigit(num);
		int finalNumber = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			finalNumber += pow(lastDigit, digits);
			num /= 10;
		}

		return finalNumber == CopyNum;
	}

	public static int pow(int num1, int num2) {

		int result = 1;

		int i = 0;
		while (i < num2) {
			result *= num1;
			i++;
		}

		return result;
	}

	public static int noOfDigit(int num) {

		int digits = 0;

		while (num > 0) {
			digits++;
			num /= 10;
		}

		return digits;
	}
}