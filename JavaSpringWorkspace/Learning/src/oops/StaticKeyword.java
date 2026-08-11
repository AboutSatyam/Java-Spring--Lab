package oops;

class demoo {
	static int a, b, c;

	int x, y, z;

	static {
		System.out.println("static Method");

		a = 10;
		b = 12;
		c = 13;

	}

	static void disp() {

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

	}

	{
		x = 111;
		y = 112;
		z = 113;
		System.out.println("java initization block");
	}

	demoo() {
		System.out.println("constructor");
	}

	void disp2() {

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}

public class StaticKeyword {

	static int a;

//	static {
//		a = 10;
//		System.out.println("a is =" + a);
//		System.out.println("Staic block main class method");
//		System.out.println("***********************************");
//	}

	public static void main(String[] args) {
		// demo d1 = new demo();
		// In static object is not needed .
		// we can call method using class name.

		demoo.disp();// object independent for static
		demoo d2 = new demoo();
		d2.disp2();

	}

}
