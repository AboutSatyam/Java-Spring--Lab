package oops;

import java.util.Scanner;

class Farmer {

	float pa;
	float td;
	static float roi;
	float si;

	static {
		roi = 12.5f;
	}

	void acceptinput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Loan Amount You Want");
		pa = scan.nextFloat();

		System.out.println("Enter a Year within you can repay actual amount");
		td = scan.nextFloat();

		// roi = 2.5f;
	}

	void compute() {
		si = (pa * td * roi) / 100.0f;
	}

	void disp() {
		System.out.println("Hello your Simple Interest is :" + si);
	}
}

public class StaticFarmer {

	public static void main(String[] args) {

		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();

		System.out.println("Farmer 1");
		f1.acceptinput();
		f1.compute();
		f1.disp();

		System.out.println("Farmer 2");
		f1.acceptinput();
		f1.compute();
		f1.disp();

		System.out.println("Farmer 3");
		f1.acceptinput();
		f1.compute();
		f1.disp();

	}

}
