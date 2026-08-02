package practiceProblem51to60;

public class Course52 {

	static int maxCapacity = 100;

	String courseName;
	int enrollments;
	String[] enrolledStudents;

	Course52(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrolledStudents = new String[maxCapacity];
	}

	static void setMaxCapacity(int maxCapacity) {
		Course52.maxCapacity = maxCapacity;
	}

	void enroll(String studentName) {
		if (enrollments < maxCapacity) {
			enrolledStudents[enrollments] = studentName;
			enrollments++;
			System.out.println(studentName + " enrolled in " + courseName);
		} else {
			System.out.println("Course is full.");
		}
	}

	void unenroll(String studentName) {
		int index = -1;

		for (int i = 0; i < enrollments; i++) {
			if (enrolledStudents[i].equals(studentName)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println(studentName + " not found in " + courseName);
			return;
		}

		for (int i = index; i < enrollments - 1; i++) {
			enrolledStudents[i] = enrolledStudents[i + 1];
		}

		enrolledStudents[enrollments - 1] = null;
		enrollments--;

		System.out.println(studentName + " unenrolled from " + courseName);
	}

	void displayStudents() {
		System.out.println("\nCourse Name : " + courseName);
		System.out.println("Total Students : " + enrollments);

		if (enrollments == 0) {
			System.out.println("No students enrolled.");
			return;
		}

		for (int i = 0; i < enrollments; i++) {
			System.out.println((i + 1) + ". " + enrolledStudents[i]);
		}
	}

	public static void main(String[] args) {

		Course52 c1 = new Course52("KG Coding");
		Course52 c2 = new Course52("Telusko");

		c1.enroll("Satyam");
		c1.enroll("Rahul");

		c2.enroll("Amit");
		c2.enroll("Rohan");

		c1.displayStudents();
		c2.displayStudents();

		c1.unenroll("Rahul");

		c1.displayStudents();
		c2.displayStudents();
	}
}