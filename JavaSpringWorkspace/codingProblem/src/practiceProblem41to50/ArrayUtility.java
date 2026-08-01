package practiceProblem41to50;

import java.util.Scanner;

public class ArrayUtility {

	public static void main(String[] args) {

		System.out.println("Welcome To Array Utility");

		int[] numArray = inputArray();

		System.out.println("Your Array Elements Are:");
		displayArray(numArray);
	}

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

	public static int[][] input2DArray() {
		Scanner Scan = new Scanner(System.in);

		System.out.print("Please enter the number of rows: ");
		int rows = Scan.nextInt();

		System.out.print("Please enter the number of columns: ");
		int columns = Scan.nextInt();

		int[][] numArray = new int[rows][columns];

		int i = 0;
		while (i < rows) {
			int j = 0;
			while (j < columns) {
				System.out.print("Please enter element row:" + (i + 1) + ", column: " + (j + 1) + " :");
				numArray[i][j] = Scan.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
	}

	public static void displayArray(int[] numArray) {
		for (int num : numArray) {
			System.out.print(num + " ");
		}
	}
}