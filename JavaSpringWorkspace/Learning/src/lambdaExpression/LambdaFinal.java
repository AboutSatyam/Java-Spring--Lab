package lambdaExpression;

import java.util.Scanner;

public class LambdaFinal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter The Number To Find The Square : ");
		int Num = input.nextInt();

		Square res = n -> n * n;

		System.out.println("Square is : " + res.Calculate(Num));
	}
}