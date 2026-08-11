package oops;

class Parent {

	int i = 10;

	void disp() {
		System.out.println("Parent disp");
	}
}

class child extends Parent {

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

public class SuperOverridden {

	public static void main(String[] args) {

		child p1 = new child();
		p1.alpha();

	}

}
