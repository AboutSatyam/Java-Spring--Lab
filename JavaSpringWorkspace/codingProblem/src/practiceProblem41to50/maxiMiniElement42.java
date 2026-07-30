package practiceProblem41to50;

import java.util.Scanner;

public class maxiMiniElement42 {

	public static void main(String[] args) {

		System.out.println("Welcome To Maximum & Minimum Element Element Finder");
		Scanner Scan = new Scanner(System.in);
		int[] numArray = ArrayUtility.inputArray();
		int Maxi = max(numArray);
		int Mini = min(numArray);

		System.out.println("The Maximum Element In Array IS " + Maxi);
		System.out.println("Andd !");
		System.out.println("The MiniMum Element In Array IS " + Mini);

	}

	public static int max(int[] numArray) {

		if (numArray.length == 0) {
			return Integer.MIN_VALUE;
		}

		int max = numArray[0];
		int i = 1;

		while (i < numArray.length) {
			if (max < numArray[i]) {
				max = numArray[i];
			}
			i++;
		}

		return max;
	}

	public static int min(int[] numArray) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		while (i < numArray.length) {
			if (min > numArray[i]) {
				min = numArray[i];

			}
			i++;
		}

		return min;
	}
}
