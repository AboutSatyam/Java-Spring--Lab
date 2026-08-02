package practiceProblem51to60;

import java.util.Scanner;

public class Minimumternary53 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);// ctrl + shift+ O shortcut;;

		System.out.println("Welcome To MiniMum No Finder -->");
		System.out.print("Enter The 1st Number : ");
		int num1 = Scan.nextInt();
		System.out.print("Enter The 2st Number : ");
		int num2 = Scan.nextInt();

		Minimumternary53 ternary = new Minimumternary53();
		int Min = ternary.min(num1, num2);

		System.out.println(" Your MiniMum ELement IS :" + Min);

		/*
		 * int Min = min(num1, num2);// We cannot Do because We are in static method
		 * beacuse below method does not have static . experiment
		 */
	}

	// public static int min(int num1, int num2) { // Correct
	public int min(int num1, int num2) { // For This WE have to make object of class then we can call it by class name

//		if (num1 < num2) {
//			return num1;
//		} else {
//			return num2;
//		} // Normal below How To use ternary

		return num1 < num2 ? num1 : num2;

	}

}
