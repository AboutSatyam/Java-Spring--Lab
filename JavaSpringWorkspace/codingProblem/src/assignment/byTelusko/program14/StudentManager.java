package assignment.byTelusko.program14;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {

	HashMap<Integer, Student> hm = new HashMap<>();

	void addStudent() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Student ID : ");
		int ID = input.nextInt();

		System.out.println("Enter Your Student Name: ");
		String Name = input.next();

		System.out.println("Enter Your Student Age : ");
		int Age = input.nextInt();

		System.out.println("Enter Your Student Grade : ");
		String Grade = input.next();

		System.out.println("Student Added Successfully");

	}

	void displayStudent() {

	}

	void updateStudent() {

	}

	void removeStudent() {

	}

}
