package practiceProblem41to50;

import java.util.Scanner;

public class Deletespecifyarray44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome To Delete The Element From Specify Position : ");

		int[] numArray = ArrayUtility.inputArray();

		System.out.print("Now, Enter The Number You Want To Delete : ");
		int del = input.nextInt();

		int[] newArray = deleteNo(numArray, del);

		System.out.println("Here Is Your New Array:");
		displayArray(newArray);
	}

	public static int[] deleteNo(int[] numArray, int del) {

		int occ = ConcurrenArray41.noOfConcurren(numArray, del);

		if (occ == 0) {
			return numArray;
		}

		int newSize = numArray.length - occ;
		int[] newArr = new int[newSize];

		int i = 0;
		int j = 0;

		while (i < numArray.length) {

			if (numArray[i] != del) {
				newArr[j] = numArray[i];
				j++;
			}

			i++;
		}

		return newArr;
	}

	public static void displayArray(int[] numArray) {

		int i = 0;

		while (i < numArray.length) {
			System.out.print(numArray[i] + " ");
			i++;
		}

		System.out.println();
	}
}