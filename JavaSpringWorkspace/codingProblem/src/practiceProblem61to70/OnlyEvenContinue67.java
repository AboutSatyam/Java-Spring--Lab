package practiceProblem61to70;

import java.util.Scanner;

public class OnlyEvenContinue67 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Even Number Displayer -->");

		System.out.print("Enter The Number Till You Have To Print: ");
		int till = Scan.nextInt();

		for (int i = 1; i <= till; i++) {

			if (i % 2 == 1) {
				continue; // Skip odd numbers
			}

			System.out.println(i);
		}

		
	}
}