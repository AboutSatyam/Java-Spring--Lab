package in.advance.challenge83;

public class TestCase {

	public static void main(String[] args) {

		// Shape s1 = new Shape(); We Cannot Create The object Of Abstract Class

		Circle c1 = new Circle(5);
		Square s1 = new Square(10.3);
		double sq = s1.calculateArea();
		double cir = c1.calculateArea();

		System.out.printf("The Area Of Square Is %f", sq);
		System.out.printf("The Area Of Circle Is %f", sq);
	}

}
