package practiceProblem41to50;

import java.util.Scanner;

public class SortedArrayChecker43 {

	public static void main(String[] args) {

		System.out.println("Welcome To Sorted Array Checker : ");
		Scanner Scan = new Scanner(System.in);
		int[] numArray = ArrayUtility.inputArray();
		boolean isdec = isDecresing(numArray);
		boolean isinc = isIncresing(numArray);

		if (isdec || isinc) {
			System.out.println("This is a Sorted Array");
		} else {
			System.out.println("This is not a Sorted Array");
		}
	}

	public static boolean isDecresing(int[] numArray) {
		int i = 1;
		while (i < numArray.length) {

			if (numArray[i] > numArray[i - 1]) {

				return false;
			}
			i++;
		}

		return true;
	}

	public static boolean isIncresing(int[] numArray) {
		int i = 1;
		while (i < numArray.length) {

			if (numArray[i] < numArray[i - 1]) {

				return false;
			}

			i++;
		}
		return true;
	}
}
