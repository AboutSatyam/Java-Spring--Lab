package practiceProblem61to70;

import java.util.Scanner;

import practiceProblem41to50.ArrayUtility;

public class SkipNegContinue66 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome To Adding Positive No & Skip Negative No -->");
		int[] numArray = ArrayUtility.inputArray();

		int sum = 0;
		for (int num : numArray) {
			if (num < 0) {
				continue; // It means Skip this number
			}

			sum += num;
		}
		System.out.println(" Sum of All Postive No Is :" + sum);
	}

}
