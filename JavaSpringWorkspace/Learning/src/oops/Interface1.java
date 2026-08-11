package oops;

interface Calc {
	void add(int a, int b);

	void sub(int a, int b);
}

interface Calcc {
	void add(int x, int y);
// Done 29 May

	void sub(int x, int y);
}

class satyaam implements Calc, Calcc {
	public void add(int a, int b) {
		int res = a * b;
		System.out.println(res);
		System.out.println("***********");
	}

	public void sub(int a, int b) {
		int res = a + b;
		System.out.println(res);

		System.out.println("%%%%%%%%%%%%%%%");
	}
}

public class Interface1 {

	public static void main(String[] args) {

		Calc s1 = new satyaam();
		s1.add(2, 3);
		s1.sub(3, 2);

	}

}
