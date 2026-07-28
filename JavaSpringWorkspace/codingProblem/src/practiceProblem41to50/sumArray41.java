package practiceProblem41to50;

import java.lang.reflect.Array;
import java.util.Scanner;

public class sumArray41 {

	public static void main(String[] args) {
		System.out.println("Welcome to Array Sum and Avg Calculator");

		int[] numArray = ArrayUtility.inputArray();
		long sum = sum(numArray);
		double avg = avg(numArray);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}

	public static long sum(int[] numArray) {
		long sum = 0;
		int i = 0;
		while (i < numArray.length) {
			sum += numArray[i];
			i++;
		}

		return sum;
	}

	public static double avg(int[] numArray) {
		long sum = sum(numArray);
		return (float) sum / numArray.length;
		// return 0;
	}

}
