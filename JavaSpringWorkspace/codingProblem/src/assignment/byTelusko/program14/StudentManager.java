package assignment.byTelusko.program14;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {

	HashMap<Integer, Student> hm = new HashMap<>();

	void addStudent() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Student ID : ");
		int id = input.nextInt();

		System.out.println("Enter Your Student Name: ");
		String name = input.next();

		System.out.println("Enter Your Student Age : ");
		int age = input.nextInt();

		System.out.println("Enter Your Student Grade : ");
		String grade = input.next();

		Student student = new Student(name, age, grade);

		hm.put(id, student);
		System.out.println("Student Added Successfully");

	}

	void displayStudent() {

	}

	void updateStudent() {

	}

	void removeStudent() {

	}

}
