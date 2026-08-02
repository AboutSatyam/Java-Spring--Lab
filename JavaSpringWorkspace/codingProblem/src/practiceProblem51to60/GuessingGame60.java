package practiceProblem51to60;

import java.util.Scanner;

public class GuessingGame60 {

	public static void main(String[] args) {
		// Using Do Loop
		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Number Guessing Game ");
		int Guesser;
		int user;
		boolean isVaild;

		System.out.print("Sliently Enter The Number You Want Guess From Guesser : ");
		user = Scan.nextInt();
		System.out.println("");

		do {
			System.out.print("Guess The Number : ");
			Guesser = Scan.nextInt();
		} while (!isVaildPass(Guesser, user));
		System.out.println("Yepp You Guess The Correct Number");
	}

	public static boolean isVaildPass(int Guesser, int user) {
		return Guesser == user;

	}

}
