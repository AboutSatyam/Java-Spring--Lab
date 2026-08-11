package oops;

class Student {

	int id;
	String Name;
	String City;

	static int count;
	{
		count++;
	}

	Student() {
		System.out.println("Zero para");
	}

	Student(int id, String Name, String city) {
		this.id = id;
		this.Name = Name;
		this.City = City;

	}
}

public class StaticVsObject {

	public static void main(String[] args) {

		Student St1 = new Student(44, "Satyam", "Thane");
		System.out.println(Student.count);
		Student St2 = new Student(45, "Shivam", "Thane");
		System.out.println(Student.count);

		Student St3 = new Student(46, "Sundaram", "Thane");
		System.out.println(Student.count);

	}

}
