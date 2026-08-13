package lambdaExpression;

import java.util.Scanner;

public class EvenLambda {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter The Number To Find The Square : ");
		int num = input.nextInt();

		Even res = n -> (n % 2 == 0 ? 1 : 0);

		if (res.check(num) == 1) {
			System.out.println("Even NO");
		}

		else {
			System.out.println("NOT A EVEN");
		}

	}
}