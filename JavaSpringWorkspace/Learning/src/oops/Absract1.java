package oops;

abstract class Animal12 {
	public abstract void eat();

	public void running() {

	};
}

class Tiger12 extends Animal12 {
	public void eat() {
		System.out.println("Tiger hunts and eat..");

	}

	public void running() {
		System.out.println("Tiger runs faster than elepant.....");
	}

}

class Monkey12 extends Animal12 {
	public void eat() {
		System.out.println("Monkey steals and eat");
	}

	public void running() {
		System.out.println("Monkey jumps.....");
	}

}

class Deer12 extends Animal12 {
	public void eat() {
		System.out.println("Deer grazes and eat");
	}

	public void running() {
		System.out.println("Deer runs faster.....");
	}

}

//class Forest
//{
//	public void permit(Animal2 ref)
//	{
//		ref.eat();
//		ref.running();
//		
//	}
//	
//}
public class Absract1 {

	public static void main(String[] args) {
		Tiger2 t = new Tiger2();
//		t.eat();
//		t.running();

		Animal2 ref;

		ref = t;

		ref.eat();
		ref.running();
//		
		Monkey2 m = new Monkey2();
//		m.eat();
//		m.running();
		ref = m;

		ref.eat();
		ref.running();

		Deer2 d = new Deer2();
//		d.eat();
//		d.running();
		ref = d;

		ref.eat();
		ref.running();

//		Forest f=new Forest();
//		f.permit(t);
//		f.permit(m);
//		f.permit(d);

	}

}
