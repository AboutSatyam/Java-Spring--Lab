package practiceProblem71to77;

import java.util.Scanner;

//74. Create a number guessing game where the program selects a random number, and the user has to guess it.

public class GuessingGame74 {

	int random;

	public GuessingGame74() {
		random = (int) Math.ceil(Math.random() * 100);
	}

	/**
	 * @param guessNumber Player's guessed number
	 * @return Negative if guess is smaller, Zero if guess is correct, Positive if
	 *         guess is larger.
	 */
	public int guess(int guessNumber) {
		return guessNumber - random;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		GuessingGame74 game = new GuessingGame74();

		System.out.println("Welcome To Guessing Game");
		System.out.println("Guess the Number Between 1 and 100");

		int guess;
		int result;

		do {

			System.out.print("Guess the Number: ");
			guess = scan.nextInt();

			result = game.guess(guess);

			if (result == 0) {
				System.out.println("Congratulations! You guessed correctly.");
			} else if (result < 0) {
				System.out.println("Guess Higher");
			} else {
				System.out.println("Guess Lower");
			}

		} while (result != 0);

		scan.close();
	}
}