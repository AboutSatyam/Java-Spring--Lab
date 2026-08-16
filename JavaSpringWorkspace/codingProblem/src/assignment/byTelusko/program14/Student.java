package assignment.byTelusko.program14;

import java.util.HashMap;

public class Student {

	String name;
	String age;
	String grade;

	public Student(String name, String age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	HashMap<Integer, Student> hm = new HashMap<>();

}
