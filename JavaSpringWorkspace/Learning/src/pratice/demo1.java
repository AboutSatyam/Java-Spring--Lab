package pratice;

class Pratice01 {

	void system() {
		int a, b, c, e;
		a = b = c = e = 10;
		System.out.println("************");
		System.out.println(b);
		// System.out.println("************");
	}
}

public class demo1 extends Pratice01 {

	public static void main(String[] args) {
		int a, b, c, e;
		a = b = c = e = 10;
		System.out.println("************");
		System.out.println(b);
		

//		System.out.println(system);
		// System.out.println("************");
		// System.out.println("************");

		new Pratice01().system();
	}

}
