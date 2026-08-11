package array;

import java.util.Scanner;

public class ArrayBasic3 {
	// irregular array
	public static void main(String[] args) {
		int i;
		int j;

		int marks[][] = new int[3][];
		marks[0] = new int[4];
		marks[1] = new int[2];
		marks[2] = new int[3];

		int l = marks.length;

		Scanner scan = new Scanner(System.in);
		// System.out.println("Kindly Enter The Student Marks");

		for (i = 0; i < marks.length; i++) {

			for (j = 0; j < marks[i].length; j++) {

				System.out.println("Kindly Enter The Marks of Class " + i + " Student " + j);
				marks[i][j] = scan.nextInt();
			}
		}
		System.out.print("Student Marks Are Stored in an array ");

		for (i = 0; i < marks.length; i++) {
			for (j = 0; j < marks[i].length; j++) {

				{
					System.out.print(marks[i][j] + " ");
				}

			}

			System.out.println("");
		}

	}
}
//for (j = 0; j < marks.length; j++)
