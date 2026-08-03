package practiceProblem61to70;

//70. Define a Student class with fields like name and age, and use toString to print student details.

public class StudentToString70 {

	// public static void main(String[] args) {

	String name;
	int age;
	String rollno;
	String wing;

	public StudentToString70(String name, int age, String rollno, String wing) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.wing = wing;
	}

	@Override
	public String toString() {

		return "Student details :{ name:" + name + " ,age:" + age + ", roll no: " + rollno + " ,wing:" + wing + "}";

	}

	public static void main(String[] args) {
		StudentToString70 stu = new StudentToString70("Satyam", 20, "021", "A"); // 20 is age define in int --> no ""
		System.out.println(stu);
	}

}
