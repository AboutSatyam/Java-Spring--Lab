package practiceProblem41to50;

import java.util.Scanner;

public class ArrayUtility {

	public static int[] inputArray() {
		System.out.println("Enter Your No of Elements : ");

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		int i = 0;
		while (i < size) {
			System.out.print("Plz Enter Element no " + (i + 1) + ": ");
			System.out.println("");
			nums[i] = scan.nextInt();
			i++;
		}
		return nums;

	}

	public static void displayArray(int[] numArray) {
		for (int num : numArray) {
			System.out.print(num + " ");
		}
	}
}
