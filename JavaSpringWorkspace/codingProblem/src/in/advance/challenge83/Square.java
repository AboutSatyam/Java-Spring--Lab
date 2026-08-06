package in.advance.challenge83;

public class Square extends Shape {

	private final double sideInCms;

	public double getSideInCms() {
		return sideInCms;
	}

	public Square(double sideInCms) {
		super();
		this.sideInCms = sideInCms;
	}

	@Override
	public double calculateArea() {

		return Math.pow(sideInCms, 2);
	}

}