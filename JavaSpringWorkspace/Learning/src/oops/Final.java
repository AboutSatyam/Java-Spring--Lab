package oops;

class Parentt {

	int i = 10;

	void disp() {
		System.out.println("Parent disp");
	}
}

class childd extends Parentt {

	int i = 100;

	void alpha() {
		System.out.println("alpha");
		System.out.println(i);

		System.out.println(super.i);
		super.disp();

	}

	void disp() {
		System.out.println("child disp");

	}
}

public class Final {

	public static void main(String[] args) {

		childd p1 = new childd();
		p1.alpha();

	}

}
