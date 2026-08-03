package practiceProblem71to80;

import java.util.Scanner;
//72. Calculate the area and circumference of a circle for a given radius using Math.PI.

public class AreaMath72 {

	double radiusInMm;

	public AreaMath72(double radiusInMm) {
		super();
		this.radiusInMm = radiusInMm;
	}

	public double getCircumferecs() {
		// t radiusInMn;
		return 2 * radiusInMm * Math.PI;

	}

	public double getArea() {
		// t radiusInMn;
		return Math.PI * Math.pow(radiusInMm, 2);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle Props : Radius : " + radiusInMm + ", Circumference : " + getCircumferecs() + ", Area : "
				+ getArea();
	}// With the Help to To tring any oone call above method then we do no have
	// delcared in main methpd individually only to string call on main

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);

		System.out.print("Enter The RadiusInMM Only :");
		double radius = Scan.nextDouble();

		AreaMath72 Circle = new AreaMath72(radius);
		System.out.println(Circle);
	}

}
