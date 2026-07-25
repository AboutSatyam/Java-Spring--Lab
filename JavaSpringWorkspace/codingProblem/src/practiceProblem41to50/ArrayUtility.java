package practiceProblem41to50;

import java.util.Scanner;

public class ArrayUtility {

	public static int[] inputArray() {
		System.out.println("Enter Your Elements: ");

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		int i = 0;
		while (i < size) {
			System.out.println("Plz Enter Element no " + (i + 1) + ": ");
			i++;
		}
		return nums;

	}
}
