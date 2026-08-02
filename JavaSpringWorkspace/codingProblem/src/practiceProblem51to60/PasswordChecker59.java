package practiceProblem51to60;

import java.util.Scanner;

public class PasswordChecker59 {

	public static void main(String[] args) {
		// Using Do Loop
		Scanner Scan = new Scanner(System.in);
		System.out.println(" Welcome To Password Set");
		String Password;
		boolean isVaild;

		do {
			System.out.print("Plz Enter Your Password : ");
			Password = Scan.next();
		} while (!isVaildPass(Password));
		System.out.println("Thanks For Entering Your Password ");
	}

	public static boolean isVaildPass(String Password) {
		return Password.length() > 6;

	}
}
