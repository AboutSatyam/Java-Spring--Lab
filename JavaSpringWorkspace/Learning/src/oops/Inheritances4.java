package oops;

class alpha {

	int a, b;

	public alpha() {
		a = 10;
		b = 20;

		System.out.println("aplha class zero para");
		System.out.println("***********************");
	}

	public alpha(int a, int b) {

		this.a = a;
		this.b = b;
		System.out.println(" aplha 1 para");
		System.out.println("***********************");
	}

//	public void disp() {
//
//		System.out.println("a" + a);
//		System.out.println("b" + b);
//	}

}

class beta extends alpha {

	int x, y;

	public beta() {
		this(2, 2);
		int x = 88;
		int y = 99;

		System.out.println("beta class ");
		System.out.println("***********************");
	}

	public beta(int x, int y) {
		super(44, 43);
		this.x = x;
		this.y = y;
		System.out.println("beta 1 para");
		System.out.println("***********************");

	}

	public void disp() {
		System.out.println("***********************");
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("x" + x);
		System.out.println("y" + y);
	}

}

public class Inheritances4 {

	public static void main(String[] args) {
		beta a2 = new beta();
		beta a1 = new beta(10, 20);

		a1.disp();
		a2.disp();

	}

}
