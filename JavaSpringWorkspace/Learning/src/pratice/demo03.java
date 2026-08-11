package pratice;

import java.util.Scanner;

public class demo03 {

	public static void main(String[] args) {
//	
//		int a = 5;
//		int b = a++;
//		System.out.println("a = " + a + ", b = " + b);
//		

		Scanner scan = new Scanner(System.in);

		System.out.print("Input a degree in Fahrenheit: ");

		double fahrenheit = scan.nextDouble();

		double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	}

}
