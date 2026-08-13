package practiceProblem11to20;

import java.util.Scanner;

public class AreaOfTriangle11 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Area Calculator");

		System.out.println("Enter The Height Of The Triangle : ");
		double Height = Scan.nextDouble();

		System.out.println("Enter The Breath Of The Triangle : ");
		double Base = Scan.nextDouble();

		double Area = 0.5 * Height * Base;

		System.out.println(" The Area Of Triangle is :" + Area);

	}

}
