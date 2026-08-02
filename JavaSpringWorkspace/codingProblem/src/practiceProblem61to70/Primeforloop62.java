package practiceProblem61to70;

import java.util.Scanner;

public class Primeforloop62 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Prime No Calculator  ");
		System.out.print(" Enter The Number : ");
		int Num = Scan.nextInt();

		boolean prime = isPrime(Num);
		if (prime) {
			System.out.println(" ");
			System.out.println("Given No Is Prime");
		} else {
			System.out.println(" ");
			System.out.println("Given No Is Not A Prime ");
		}

	}

	public static boolean isPrime(int Num) {

		if (Num <= 1) {
			return false;
		}

		for (int i = 2; i < Num; i++) { // if onlt i=2 then errror int is equire ..
			if (Num % i == 0) {
				return false;
			}

		}
		return true;
	}
}
