package practiceProblem106to115;

import java.util.List;

public class FilterOdd {

	public static void main(String[] args)

	{
		List<Integer> num = List.of(10, 1, 2, 16, 14, 54, 69, 5, 4, 89, 16, 25);
		num.stream()
		      .filter(prin -> prin % 2 == 1)
		          .forEach(prin -> System.out.println(prin));
	}

}
