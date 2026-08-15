package practiceProblem21to30;

import java.util.Scanner;

public class Factotial30 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Factorial Calculator  ");
		System.out.print(" Enter The Number : ");
		int num = Scan.nextInt();
		long multiply = Fact(num);
		System.out.println("Fatcorial of " + num + " is " + multiply);
	}

	public static long Fact(int num) {
		if (num < 2) {
			return 1;
		}
		long multiply = 1;
		int i = 2;
		while (i <= num) {
			multiply *= i;
			i++;

		}
		return multiply;

	}
}