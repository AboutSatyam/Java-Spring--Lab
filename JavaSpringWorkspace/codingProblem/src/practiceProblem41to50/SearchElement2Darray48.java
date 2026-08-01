package practiceProblem41to50;

import java.util.Scanner;

public class SearchElement2Darray48 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To 2D Array SEARCHER\n");
		int[][] numArray = ArrayUtility.input2DArray();
		System.out.println("Now You Have to Enter Which Element You Want To Search : ");
		int num = Scan.nextInt();
		boolean isFound = Search(numArray, num);

		if (isFound) {
			System.out.println(" Your Element Was Found ");
		} else {
			System.out.println(" Your Element Was Not Found ");
		}
	}

	public static boolean Search(int[][] numArray, int num) {
		int i = 0;
		while (i < numArray.length) {
			int j = 0;
			while (j < numArray[i].length) {
				if (numArray[i][j] == num) {
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}
}
