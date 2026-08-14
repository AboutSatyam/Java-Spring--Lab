package assignment.byTelusko.program5;

import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {

		System.out.println("Welcome TO Guesser Game ");
		int Attempt = 50;
		int i = 1;
		boolean won = false;

		Scanner input = new Scanner(System.in);
		int Guessed = random();
		while (i <= Attempt) {
			System.out.println(Guessed);
			System.out.println("Guess The No : \n");
			int uGuess = input.nextInt();

			if (uGuess == Guessed) {
				System.out.println("You Won The Game !! You Guess Correctly !! \n");
				won = true;
				break;
			} else if (uGuess > Guessed) {
				System.out.println("Guess Lowerr \n");
			} else if (uGuess < Guessed) {
				System.out.println("Guess Higherr \n");

			}

			i++;
		}
		if (won != true) {
			System.out.println("Game Over!!! You used all attempts");
			System.out.println("Guessed Number Was !!  " + Guessed);
		}
	}

	public static int random() {

		int res = (int) ((Math.random() * 100) + 1);

		return res;

	}

}
