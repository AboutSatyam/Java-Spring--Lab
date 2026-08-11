package oops;

class Demo1 {
	static int a;

	public static void disp() {
		int a = 12;
		System.out.println(a + "parent");
	}

}

class Demo2 extends Demo1 {
	public static void disp() {
		int a = 12;
		System.out.println(a + "child");

	}
}

public class StaticDemo {

	public static void main(String[] args) {

		Demo1 d2 = new Demo2();
		d2.disp();
		Demo2.disp();
		System.out.println("************");
		Demo1.disp();
	}
}
