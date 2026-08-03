package practiceProblem61to70;

import java.util.Scanner;
//69. Create a program using recursion to check if a string is a Palindrome using recursion.

public class PalindromeRecursion69 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Palindrome by Recursion  Displayer -->");

		System.out.println("Enter Your Command For Checking: ");
		String User = Scan.next();
		System.out.println("Your String Is :" + ((isPalin(User) ? "Palindrome" : "Not a Palindrome")));

	}

	public static boolean isPalin(String User) {
		if (User.length() <= 1) {
			return true; // Single Char Always A Palindrome
		}
		int lastPos = User.length() - 1;
		if (User.charAt(0) != User.charAt(lastPos)) {
			return false;
		}
		String newStr = User.substring(1, lastPos);// if We Do Not Write This 2 line they do not check midle char
													// --> "abcca"
		return isPalin(newStr); // Recursive call

	}
}
