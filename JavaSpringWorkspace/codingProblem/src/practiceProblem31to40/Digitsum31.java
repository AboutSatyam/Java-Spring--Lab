package practiceProblem31to40;

import java.util.Scanner;

public class Digitsum31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome To Digitsum Calculator  ");
		System.out.print(" Enter The Number : ");
		int num = input.nextInt();
		int sum = digitSum(num);
		System.out.println("Sum of digit is : " + sum);
		input.close();
	}

	public static int digitSum(int num) {

		{
			int sum = 0;

			while (num > 0) {
				sum += (num % 10);
				num /= 10;

			}
			return sum;

			
		}

	}
}
