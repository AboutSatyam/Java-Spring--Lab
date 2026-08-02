package practiceProblem61to70;

import java.util.Scanner;
import practiceProblem41to50.ArrayUtility;

public class OccurenceForEach64 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Concurren Finder");

		int[] numArray = ArrayUtility.inputArray();

		System.out.print("Enter The Number You Want To Find: ");
		int No = Scan.nextInt();

		int Concurren = noOfConcurren(numArray, No);

		System.out.println("Your Element Found " + Concurren + " Time(s) In Array");

		Scan.close();
	}

	public static int noOfConcurren(int[] numArray, int num) {

		int occ = 0;

		for (int No : numArray) {
			if (No == num) { //No Which lement we have to Find
				occ++;
			}
		}

		return occ;
	}
}