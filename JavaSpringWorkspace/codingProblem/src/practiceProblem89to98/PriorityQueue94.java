package practiceProblem89to98;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue94 {

	public static void main(String[] args) {

		PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {

			@Override
			public int compare(Student student, Student t1) {
				return student.getGrade() - t1.getGrade();
				// return 0;
			}

		});
		queue.offer(new Student("Satyam", 'B'));
		queue.offer(new Student("Roshan", 'A'));
		queue.offer(new Student("Rohan", 'C'));
		queue.offer(new Student("Rishi", 'F'));
		queue.offer(new Student("SRanni", 'D'));
		queue.offer(new Student("Sunny", 'A'));

		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

	private static class Student {
		private final String name;
		private final char grade;

		public Student(String name, char grade) {
			super();
			this.name = name;
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public char getGrade() {
			return grade;
		}

		@Override
		public String toString() {

			return name + ": " + grade;
		}

	}

}
