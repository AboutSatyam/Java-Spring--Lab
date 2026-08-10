package practiceProblem106to115;

import java.util.List;

public class OperationMap {

	public static void main(String[] args) {

		List<String> no = List.of("1", "2", "3", "4", "5", "6", "7", "5");
		no.stream().map(Integer::parseInt).map(num -> Math.pow(num, 2)).reduce((a, b) -> a + b)

				.ifPresent(System.out::println);
	}

}
