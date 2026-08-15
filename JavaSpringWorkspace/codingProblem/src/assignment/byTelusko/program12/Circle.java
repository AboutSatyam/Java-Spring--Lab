package assignment.byTelusko.program12;

import java.util.Scanner;

public class Circle implements Shape {
	double r;

	public void Area() {

		double res = Math.PI * Math.pow(r, 2);
		System.out.println("Area Is  " + res);
	}

	@Override
	public void Perimeter() {

		double res1 = 2 * (Math.PI * r);
		System.out.println("Perimeter Is  " + res1);
	}

	public static void main(String[] args) {

		System.out.println("Welcome Area And Perimeter Calculator ");
		Scanner input = new Scanner(System.in);

		Circle cr = new Circle();

		System.out.println("Enter The Radius Of Circle : ");
		cr.r = input.nextDouble();

		cr.Area();
		cr.Perimeter();

	}
}
