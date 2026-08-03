package practiceProblem61to70;

import java.util.Scanner;

public class FibonRecursion68 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Fibonannic Series Displayer -->");

		System.out.print("Enter The How Much You Have To Print InSeries : ");
		long till = Scan.nextLong();

		for (long i = 1; i <= till; i++) {
			System.out.println(isFibo(i) + " ");
		}
	}

	public static long isFibo(long Position) {
		// System.out.print("."); // By This We Can See Hoe Much Time Method Id Calling
		// --> SHOCKK!!!
		if (Position == 1) {
			return 0;
		}
		if (Position == 2) {
			return 1;
		}
		return isFibo(Position - 1) + isFibo(Position - 2); // The method calls itself twice.--> recursion hai lala

	}

}
