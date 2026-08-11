package lambdaExpression;

abstract class demo {

	abstract void show();
}

public class Lambda1 {
//@FunchionalInterface

	public static void main(String[] args) {

		demo p = new demo() {
			public void show() {
				System.out.println("**********");
			}
		};
		p.show();
	}

}
