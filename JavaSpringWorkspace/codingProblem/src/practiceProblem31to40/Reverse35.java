package practiceProblem31to40;

import java.util.Scanner;

public class Reverse35 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome Digit Revered Method ");
		System.out.println("Enter The Number : ");
		int num = Scan.nextInt();

		int re = Reverse(num);
		System.out.println("Reverse Is : " + re);
	}

	public static int Reverse(int num) {
		int S = 0;

		while (num > 0) {
			int digit = (num % 10);
			// S *=10 + digit; // correct but working like where to you bracket
			S = S * 10 + digit;
			num /= 10;

		}
		return S;

	}

}
