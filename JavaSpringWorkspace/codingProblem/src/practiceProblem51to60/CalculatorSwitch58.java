package practiceProblem51to60;

import java.util.Scanner;

public class CalculatorSwitch58 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);// ctrl + shift+ O shortcut;;

		System.out.println("Welcome To Artematic Calculator -->");
		System.out.print("Enter The 1st Number : ");
		double num1 = Scan.nextDouble();
		System.out.print("Enter The 2st Number : ");
		double num2 = Scan.nextDouble();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("1. Addition\n" + "2.Subtraction\n" + "3.Multiplication\n" + "4.Division\n");
		System.out.println(" ");
		System.out.print("Enter The Which Operation You Want To Perform : ");
		int oper = Scan.nextInt();
		// double res;
		switch (oper) {
		case 1:
			double res = num1 + num2;
			System.out.println("");
			System.out.println(" Addition Of Given Number Is " + res);
			break;

		case 2:
			double res1 = num1 - num2;
			System.out.println("");
			System.out.println(" Subtraction Of Given Number Is " + res1);
			break;

		case 3:
			double res2 = num1 * num2;
			System.out.println("");
			System.out.println(" Multiplication Of Given Number Is " + res2);
			break;

		case 4:
			double res3 = num1 / num2;
			System.out.println("");
			System.out.println(" Division Of Given Number Is " + res3);
			break;

		default:
			System.out.println("");
			System.out.println(" None Of The Case Match Enter A Vaild Input ");

		}
	}

}
