package practiceProblem41to50;

import java.util.Scanner;

public class ArrayUtility {

	public static int[] inputArray() {
		System.out.println("Enter Your Elements: ");
//Common For All Array program Because we have to take input from User In Array. 
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
}
