package oops;

class Alien {
	static {
		System.out.println("SB1");
	}
	static {
		System.out.println("SB2");
	}

	{
		System.out.println("NSB1");
	}
	{
		System.out.println("NSB2");
	}
}

public class StaticKeywordAdvance {

	public static void main(String[] args) {

		Alien al1 = new Alien();
		Alien al2 = new Alien();
		// Alien al3 = new Alien();

	}

}
