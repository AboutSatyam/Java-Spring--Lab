package in.advance.challenge77.utils;

import in.advance.challenge77.geometry.Circle;
import in.advance.challenge77.geometry.Rectriangle;

public class Calculator {

	public static void main(String[] args) {

		Circle cir = new Circle(5.5);
		Rectriangle rec = new Rectriangle(10, 5);

		double cirArea = Math.PI * Math.pow(cir.radius, 2);
		double recArea = rec.length * rec.breadth;

		System.out.println("Area of Circle :" + cirArea);
		System.out.println("Area Of Rectriangle" + recArea);

		System.out.printf("Area Of Circle Is: %f, Area Of Rectangle Is: %f", cirArea, recArea);
	}
}
