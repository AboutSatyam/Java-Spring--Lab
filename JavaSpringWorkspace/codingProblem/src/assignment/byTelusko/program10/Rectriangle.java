package assignment.byTelusko.program10;

import java.util.Scanner;

public class Rectriangle extends Shape {

	@Override
	void Area() {

	}

	@Override
	void Perimeter() {

	}

	public static void main(String[] args) {

		System.out.println("Welcome Area And Perimeter Calculator ");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter The Length Of Rectriangle : ");
		double l = input.nextDouble();

		System.out.println("Enter The Breadth Of Rectriangle : ");
		double b = input.nextDouble();

	}

}
