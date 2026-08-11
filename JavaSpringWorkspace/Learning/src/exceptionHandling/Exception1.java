package exceptionHandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		try {
			System.out.println("Connection Established");

			Scanner scan = new Scanner(System.in);
			System.out.println("enter the value of n");
			int n = scan.nextInt();

			System.out.println("enter the value of d");
			int d = scan.nextInt();

			int res = n / d;

			System.out.println("Te Result is  " + res);
		}

		catch (Exception e) {
			System.out.println("Do not Enter non zero number in denominated");

		}
		System.out.println("Connection Terminated");
	}

}
