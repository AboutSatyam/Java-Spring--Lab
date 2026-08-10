package in.advance.challenge114;

import java.util.List;

public class TestingSorting {

	public static void main(String[] args) {

		List<Empolyee> emp = List.of(new Empolyee("Satyam", 100), new Empolyee("Hello", 500),
				new Empolyee("World", 105), new Empolyee("Demon", 156));

		emp.stream().sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
				.forEach(System.out::println);

	}

}
