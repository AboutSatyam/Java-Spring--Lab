package assignment.byTelusko.program5;

import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {

		System.out.println("Welcome TO Guesser Game ");
		int Attempt = 5;
		int i = 1;

//		int Guessed = random();
//		System.out.println(Guessed);

		Scanner input = new Scanner(System.in);
		int Guessed = random();
		while (i <= Attempt) {
			// System.out.println(Guessed);
			System.out.println("Guess The No : ");
			int uGuess = input.nextInt();

			// int Guessed = random();
			if (uGuess == Guessed) {
				System.out.println("You Guess Correctly !!");
				break;
			} else if (uGuess > Guessed) {
				System.out.println("Guess Lowerr");
			} else if (uGuess < Guessed) {
				System.out.println("Guess Higherr");

			}

			i++;
		}
		System.out.println("Game Over!!! You used all attempts");

	}

	public static int random() {

		int res = (int) ((Math.random() * 100) + 1);

		return res;

	}

}
