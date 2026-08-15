package assignment.byTelusko.program12;

import java.util.Scanner;

public class Triangle implements Shape {

	double s1;
	double s2;
	double s3;

	double base;
	double height;

	@Override
	public void Area() {

		double res = 0.5 * (base * height);
		System.out.println("Area Is " + res);
	}

	@Override
	public void Perimeter() {
		double res1 = s1 + s2 + s3;
		System.out.println("Perimeter Is " + res1);
	}

	public static void main(String[] args) {

		System.out.println("Welcome Area And Perimeter Calculator ");
		Scanner input = new Scanner(System.in);

		Triangle rec = new Triangle();

		System.out.println("Enter The Base Of Triangle : ");
		rec.base = input.nextDouble();

		System.out.println("Enter The Height Of Triangle : ");
		rec.height = input.nextDouble();

		rec.Area();

		System.out.println("Enter The Side 1 Of Triangle : ");
		rec.s1 = input.nextDouble();

		System.out.println("Enter The Side 2 Of Triangle : ");
		rec.s2 = input.nextDouble();

		System.out.println("Enter The Side 3 Of Triangle : ");
		rec.s3 = input.nextDouble();

		rec.Area();
		rec.Perimeter();

	}

}
