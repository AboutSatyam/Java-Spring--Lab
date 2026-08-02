package practiceProblem51to60;

import java.util.Scanner;

public class OddEvenTernary54 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);// ctrl + shift+ O shortcut;;

		System.out.println("Welcome To Even Odd Checker");
		System.out.print("Enter The  Number : ");
		int num = Scan.nextInt();
		boolean check = OE(num);
		if (check == true) {
			System.out.println(" Given Number is EVEN");
		} else {
			System.out.println(" Given Number is ODD");
		}
	}

	public static boolean OE(int num) {

		return num % 2 == 0 ? true : false;

	}

}
