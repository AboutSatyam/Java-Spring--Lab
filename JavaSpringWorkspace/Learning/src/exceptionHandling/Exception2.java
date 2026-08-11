package exceptionHandling;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args)

	{

		try {
			System.out.println("Connection Established");
			System.out.println("    ");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Value Of n");
			System.out.println("    ");

			int n = scan.nextInt();

			System.out.println("Enter The Value Of d");
			System.out.println("     ");
			int d = scan.nextInt();

			int res = n / d;

			System.out.println("The Result is  " + res);

			System.out.println("    ");

			System.out.println("Enter a Element for an array");
			int size = scan.nextInt();

			int ar[] = new int[size];

			System.out.println("Enter a value that you want to enter");
			int elem = scan.nextInt();

			System.out.println("Enter a which index you to enter that value");
			int index = scan.nextInt();
			ar[index] = elem;

			System.out.println("Enter Element are :" + ar[index]);

		}

		catch (NegativeArraySizeException e) {

			System.out.println("Array Cannot be Negative");

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Be In Your Limit Array Limit are facing issue");

		}

		catch (Exception e) {
			System.out.println("Do not Enter zero  in denominated");
			System.out.println("**************************");

		}
		System.out.println("Connection Terminated");
		System.out.println("**************************");
	}

}
