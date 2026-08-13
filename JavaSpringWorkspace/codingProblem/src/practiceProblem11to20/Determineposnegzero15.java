package practiceProblem11to20;

import java.util.Scanner;

public class Determineposnegzero15 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To ArthematicOperator ");
		System.out.println(" Enter The Number : ");

		double V = Scan.nextDouble();
		{
			if (V > 0) {
				System.out.println("Its A Postive Number : ");
			}

			else if (V < 0) {
				System.out.println("Its A Negative Number : ");
			}

			else {
				System.out.println("Its A Zero ");
			}
		}
	}

}
