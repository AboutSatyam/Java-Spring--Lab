package practiceProblem41to50;

import java.util.Scanner;

public class reverseArray45 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Array Reverse  : \n");

		int[] numArray = ArrayUtility.inputArray();

		reverseArr(numArray);
		System.out.println("Your reversed array is");
		ArrayUtility.displayArray(numArray);
	}

	public static void reverseArr(int[] arr) {
		int i = 0;
		while (i < arr.length / 2) {
			int swap = arr[i];
			arr[i] = arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = swap;
			i++;
		}
	}
}