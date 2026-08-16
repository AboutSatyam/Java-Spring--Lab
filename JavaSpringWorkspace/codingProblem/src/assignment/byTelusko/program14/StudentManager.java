
package assignment.byTelusko.program14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {

	HashMap<Integer, Student> hm = new HashMap<>();

	void addStudent() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your Student ID : ");
		int id = input.nextInt();

		System.out.println("Enter Your Student Name : ");
		String name = input.next();

		System.out.println("Enter Your Student Age : ");
		int age = input.nextInt();

		System.out.println("Enter Your Student Grade : ");
		String grade = input.next();

		Student student = new Student(name, age, grade);

		hm.put(id, student);

		System.out.println("Student Added Successfully\n");
	}

	void displayStudent() {

		for (Map.Entry<Integer, Student> entry : hm.entrySet()) {

			System.out.println("Student ID : " + entry.getKey());

			Student student = entry.getValue();

			System.out.println("Name : " + student.name);
			System.out.println("Age : " + student.age);
			System.out.println("Grade : " + student.grade + "\n");
		}
	}

	void updateStudent() {

		System.out.println("Enter Your Student ID :");

		Scanner input = new Scanner(System.in);
		int id = input.nextInt();

		if (hm.containsKey(id)) {

			System.out.println("Enter Your Student Name : ");
			String name = input.next();

			System.out.println("Enter Your Student Age : ");
			int age = input.nextInt();

			System.out.println("Enter Your Student Grade : ");
			String grade = input.next();

			Student student = new Student(name, age, grade);

			hm.put(id, student);

			System.out.println("Student Updated Successfully\n");

		} else {

			System.out.println("ID NOT FOUND !!!\n");
		}
	}

	void removeStudent() {

		System.out.println("Enter Your Student ID :");

		Scanner input = new Scanner(System.in);
		int id = input.nextInt();

		if (hm.containsKey(id)) {

			hm.remove(id);

			System.out.println("Student Removed Successfully\n");

		} else {

			System.out.println("ID NOT FOUND !!!\n");
		}
	}

	public static void main(String[] args) {

		StudentManager sm = new StudentManager();

		sm.addStudent();
		sm.displayStudent();
		sm.updateStudent();
		sm.displayStudent();
		sm.removeStudent();
		sm.displayStudent();

	}

}
