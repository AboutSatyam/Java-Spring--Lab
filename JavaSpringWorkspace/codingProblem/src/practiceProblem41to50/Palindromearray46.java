package practiceProblem41to50;

import java.util.Scanner;

public class Palindromearray46 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Palindrome Checker \n");
		int[] numArray = ArrayUtility.inputArray();
		boolean ispalin = isPalindrome(numArray);

		if (ispalin) {
			System.out.println("Here Given Array Is Palindrome ");
		} else {
			System.out.println("Here Given Array Is NOT a Palindrome ");
		}
	}

	public static boolean isPalindrome(int[] numArray) {
		int i = 0;

		while (i < numArray.length / 2) {

			if (numArray[i] != numArray[numArray.length - 1 - i]) {
				return false;
			}
			i++;

		}

		return true;

	}

}
