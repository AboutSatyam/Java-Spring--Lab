package assignment.byTelusko.program9;

import java.util.Scanner;

public class SalaryEmpolyee {

	public static void main(String[] args) {

		int hourRate = 100;
		int regularHour = 9;
		double overtimeHour;

		System.out.println("Welcome Daily Wager Calculator ");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter How Much Hour You Worked Today :");
		double hourWorked = input.nextDouble();

		if (hourWorked <= 9) {
			double res = hourWorked * 100;
			System.out.println((int) res);
		} else if (hourWorked > 9 && hourWorked <= 24) {

			double over = hourWorked - 9;

			double res = 9 * 100;

			double sal = (over * 100) * 1.5;
			int total = (int) (res + sal);
			System.out.println(total);
		}

		else {
			System.out.println("Enter A Vaild Working Hourr !!");
		}

	}

}
