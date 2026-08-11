package oops;


import java.util.Scanner;

class Guesser {
	int guessNumber;

	int guessTheNumber() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser,Guess The unique Number:");
		guessNumber = scan.nextInt();
		return guessNumber;
	}
}

class Player {
	int guessNumber;

	int guessTheNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player ! , guess the number:");

		guessNumber = scan.nextInt();
		return guessNumber;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessTheNumber();
	}

	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromP1 = p1.guessTheNumber();
		numFromP2 = p2.guessTheNumber();
		numFromP3 = p3.guessTheNumber();
	} 

	void campare() {

		if (numFromGuesser == numFromP1) {

			if (numFromGuesser == numFromP1 && numFromGuesser == numFromP2) {
				System.out.println("All Player Guess correct thino campiane");
			} else if (numFromGuesser == numFromP2) {
				System.out.println("Player 1 & Player 2 Both Wonn The Game");
			} else if (numFromGuesser == numFromP3) {
				System.out.println("Player 1 & Player 3 Both Wonn The Game");
			} else {
				System.out.println("Player 1 won The Game");
			}
		}

		else if (numFromGuesser == numFromP2) {

			if (numFromGuesser == numFromP2 && numFromGuesser == numFromP3) {
				System.out.println("Player 2 && Player 3 Both Wo The Game ");
			} else if (numFromGuesser == numFromP3) {
				System.out.println("Player 2 & Player 3 Both Wonn The Game");
			} else {
				System.out.println("Player 2 won The Game");
			}

		}

		else if (numFromGuesser == numFromP3) {
			System.out.println("Player 3 Won The Game");
		}

		else {
			System.out.println("None of the Player won Game Lose!!");
		}
	}

}

public class GueseerGame  {
	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.campare();

	}
}
