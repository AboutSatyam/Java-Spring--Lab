package oops;

class Telusko {
	int age;
	int com;

	void disp() {
		age = 110;
		System.out.println("The Telusko Is " + age + " Year Old");
	}
}

class Sir extends Telusko {

}

public class Inheritances1 {

	public static void main(String[] args) {
		Sir A1 = new Sir();
		A1.disp();
	}

}
