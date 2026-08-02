package practiceProblem61to70;

import java.util.Scanner;

public class MaxForEach63 {

	public static void main(String[] args) {

		System.out.println("Welcome To Maximum & Minimum Element Element Finder");
		Scanner Scan = new Scanner(System.in);
		int[] numArray = ArrayUtility.inputArray();
		int Maxi = max(numArray);

		System.out.println("The Maximum Element In Array IS " + Maxi);

	}

	public static int max(int[] numArray) {

		if (numArray.length == 0) {
			return Integer.MIN_VALUE;
		}

		int max = numArray[0];

		for (int num : numArray) {
			if (max < num) { // We not using [] beacuse it Storing the Element . not the Position
				max = num;
			}
		}

		return max;
	}
}
