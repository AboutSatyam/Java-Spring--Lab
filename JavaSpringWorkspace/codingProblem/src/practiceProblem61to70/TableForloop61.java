package practiceProblem61to70;

import java.util.Scanner;

public class TableForloop61 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.println("Welcome To Multiplication table  Calculator  ");
		System.out.print(" Enter The Number : ");
		int Num = Scan.nextInt();
		int i = 0;

		for (i = 1; i <= 10; i++) {
			int res = Num * i;
			System.out.println(Num + " X " + i + "= " + res);
		}
	}

}
