package practiceProblem51to60;

import java.util.Scanner;

public class AbsoluteTernary55 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);// ctrl + shift+ O shortcut;;

		System.out.println("Welcome To Absolute Checker");
		System.out.print("Enter The Number : ");
		int num = Scan.nextInt();
		
		int res=num >= 0 ? num : -num ;
		
		System.out.println("The Absolute Of Given Number is :" + res);
	}

	
	
}
