package oops;

class Additioncalc {

	int add(int n1, int n2) {
		return (n1 + n2);
	}

	double add(int n1, double n2) {
		return (n1 + n2);
	}

	double add(double n1, int n2) {
		return (n1 + n2);
	}

	double add(double n1, double n2) {
		return (n1 + n2);
	}

	double add(double n1, int n2, int n3) {
		return (n1 + n2 + n3);
	}

}

public class MethodAddCalc {

	public static void main(String[] args) {

		int x = 10;
		int y = 11;
		int z = 13;

		Additioncalc Calc = new Additioncalc();

//		Calc.add(n1+n2);
//		Calc.add(n1+n2+n3);
//		
		System.out.println(Calc.add(x, y));
		System.out.println(Calc.add(x, y, z));

	}

}