package in.advance.challenge85;

public class Calculator {

//	public int add(int first, int second) {
//		return first + second;
//	}

	public int add(int first, int second, int third) {
		return first + second + third;
	}

	public double add(double first, double second) {
		return first + second;
	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		System.out.println(cal.add(1, 6));
		System.out.println(cal.add(1, 6, 7));
		System.out.println(cal.add(1.0, 6.7));
	}

}
