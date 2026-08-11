package oops;

class Aeroplane // extends Object
{
	void flying() {
		System.out.println("Plane is flying");
	}

	void landing() {
		System.out.println("Plane is landing");
	}
}

class Cargoplane extends Aeroplane {

}

class Passagener extends Aeroplane {

	void flying() {
		System.out.println("Flying at Maximum Height");
	}

	void takeoff() {
		System.out.println("Plane Is  Ready To Take ofF");
	}

}
//class Alienplane extends Passagener
//{
//	
//}

public class Inheritances2 {
	public static void main(String[] args) {
		Cargoplane C1 = new Cargoplane();
		C1.flying();
		C1.landing();
		System.out.println("-------------------");
		Aeroplane P1 = new Passagener(); // UpCasting
		P1.flying();
		P1.landing();
		// P1.flying();
		((Passagener) P1).takeoff(); // DownCasting
		System.out.println("-------------------");
	}
}
