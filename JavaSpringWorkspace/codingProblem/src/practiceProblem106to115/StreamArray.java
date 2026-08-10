package practiceProblem106to115;

import java.util.List;

public class StreamArray {

	public static void main(String[] args) {

		List<String> names = List.of("Satyam", "Bhai", "64");
		names.stream().forEach(name -> System.out.println(name));

	}

}
