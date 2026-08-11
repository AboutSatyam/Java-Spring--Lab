package array;

import java.util.Scanner;

public class ArrayBasic2 {

	public static void main(String[] args) { 
		                           //2D Regular array
		int i;
		int j;

		int marks[][] = new int[3][4];

		int l = marks.length;

		Scanner scan = new Scanner(System.in);
		// System.out.println("Kindly Enter The Student Marks");

		for (i = 0; i < marks.length; i++) {

			for (j = 0; j < marks.length; j++) {

				System.out.println("Kindly Enter The Marks of Class " + i + " Student " + j);
				marks[i][j] = scan.nextInt();
			}
		}
		System.out.print("Student Marks Are Stored in an array ");

		for (i = 0; i < marks.length; i++) {
			for (j = 0; j < marks.length; j++) {

				{
					System.out.print(marks[i][j] + "   ");
				}
			}

			System.out.println("");
		}

	}
}
//for (j = 0; j < marks.length; j++)
