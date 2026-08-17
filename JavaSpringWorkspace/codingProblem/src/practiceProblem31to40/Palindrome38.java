package practiceProblem31to40;

import java.util.Scanner;

public class Palindrome38 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome Palindrome Calculator ");
		System.out.println("Enter The Number : ");
		int num = Scan.nextInt();
//
//		int re = Reverse(num);
//		System.out.println("Reverse Is : " + re);

		boolean isPalindrome = isPalindrome(num);
		if (isPalindrome) {
			System.out.println("Your Number is Palindrome nO");
		} else {
			System.out.println("Your Number is Not a Palindrome no");
		}
	}

	public static boolean isPalindrome(int num) {

		int Reverse = Reverse(num);
		return num == Reverse; // we only write this line because we have to check user number and its rerverse
								// number is same or not

		// return num == Reverse(num); //This is same as above 2 line but is Shortfrom.
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
