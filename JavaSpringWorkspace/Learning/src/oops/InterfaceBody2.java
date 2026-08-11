package oops;

interface demo {

	void dhow();

	default void disp() {
		System.out.println("************");
	}
}

class demo1 implements demo {

	public void dhow() {
		System.out.println("**&&&&&&&****");

	}
}

public class InterfaceBody2 {

	public static void main(String[] args) {
		demo1 d = new demo1();
		d.disp();
		d.dhow();
	}

}
