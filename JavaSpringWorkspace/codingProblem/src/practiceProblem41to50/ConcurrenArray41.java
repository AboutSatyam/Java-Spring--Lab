package practiceProblem41to50;

import java.util.Scanner;

public class ConcurrenArray41 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.println("Welcome To Concurren Finder");
		int[] numArray = ArrayUtility.inputArray();
		System.out.println("Enter The number You Want To Find : ");
		int num = Scan.nextInt();
		int Concurren = noOfConcurren(numArray, num);
		System.out.println(" Your Element Found " + Concurren + " Time in Array ");
	}

	public static int noOfConcurren(int[] numArray, int num) {
		int occ = 0;
		int i = 0;

		while (i < numArray.length) {
			if (numArray[i] == num)

				occ++;

			i++;

		}
		return occ;

	}
}
