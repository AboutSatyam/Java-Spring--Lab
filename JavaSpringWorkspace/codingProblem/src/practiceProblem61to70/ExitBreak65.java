package practiceProblem61to70;

import java.util.Scanner;

public class ExitBreak65 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		while (true) {
			System.out.print("Enter Your Command : ");
			String Command = Scan.next();
			// if (Command.equals("exit")) // This Method Only work in lower letter as giver
			// in bracket .
			if (Command.equalsIgnoreCase("exit")) // It Will only Check Given Word is there or not
				break;
		}

		System.out.println(" You Are Sucussfully Exited The Loop");
	}
}
