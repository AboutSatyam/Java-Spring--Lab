package assignment.byTelusko.program4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Welcome To Palindrome Checker : ");

		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter The String You Want To Check Palindrome : \n");
		String str = Scan.next();

		int i = 0;
		String reverse = "";

		while (str.length() > i) {

			reverse = str.charAt(i) + reverse;

			i++;
		}

		if (str.equals(reverse)) {
			System.out.println(" Palindrome");
		}

		else {
			System.out.println("Not A Palindrome");
		}

	}

}
