package assignment.byTelusko.program10;

import java.util.Scanner;

public class Rectriangle extends Shape {

	double l;
	double b;

	@Override
	void Area() {

		double res = l * b;
		System.out.println("Area Is " + res);
	}

	@Override
	void Perimeter() {
		double res1 = 2 * (l + b);
		System.out.println("Perimeter Is " + res1);
	}

	public static void main(String[] args) {

		System.out.println("Welcome Area And Perimeter Calculator ");
		Scanner input = new Scanner(System.in);

		Rectriangle rec = new Rectriangle();

		System.out.println("Enter The Length Of Rectriangle : ");
		rec.l = input.nextDouble();

		System.out.println("Enter The Breadth Of Rectriangle : ");
		rec.b = input.nextDouble();

		rec.Area();
		rec.Perimeter();

	}

}
