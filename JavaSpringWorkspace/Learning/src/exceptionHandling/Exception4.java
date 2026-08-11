package exceptionHandling;

import java.util.Scanner;

class underAgeException extends Exception {
	public underAgeException(String msg) {
		super(msg);
	}

}

class overAgeException extends Exception {
	public overAgeException(String msg) {
		super(msg);
	}

}

class applicant {
	int age;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly Enter Your Age");

		age = scan.nextInt();

	}

	public void verify() throws underAgeException, overAgeException
	// | overAgeException e //wrong synta
	{
		if (age >= 18 && age <= 60) {
			System.out.println("You are Eglible fot next process");

		}

		else if (age < 18) {
			// System.out.println("oops! seems like you are kid not teenage");

			underAgeException uae = new underAgeException("oops! seems like you are kid not teenage");
			System.out.println(uae.getMessage());
			throw uae;

		} else if (age >= 60 && age <= 100) {
			// System.out.println("yupp! you are old . rest at home .play with kid");
			overAgeException oae = new overAgeException("yupp! you are old . rest at home .play with kid");
			System.out.println(oae.getMessage());
			throw oae;

		}

		else if (age >= 100) {

			System.out.println("Heyy! You are God ???");

		}
	}

}

class RTO {

	public void initiate() {
		applicant ap = new applicant();

//	ap.input(); // error because try and catch is not using

		ap.input();

		try {
			ap.input();
			ap.verify();

		} catch (underAgeException e) {

			e.printStackTrace();
		} catch (overAgeException e) {

			System.out.println("Try Again");
			try {
				ap.input();
				ap.verify();
			} catch (underAgeException e1) {

				e.printStackTrace();
			} catch (overAgeException e1) {

				System.out.println("You Are Blocked Try Again After 24Hr");
			}
		}
	}
}

public class Exception4 {

	public static void main(String[] args) throws underAgeException, overAgeException {
		applicant ap = new applicant();
		ap.input();
		ap.verify();

		RTO rto = new RTO();
		rto.initiate();

	}

}
