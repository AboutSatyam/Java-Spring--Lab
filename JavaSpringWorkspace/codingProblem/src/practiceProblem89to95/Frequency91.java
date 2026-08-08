package practiceProblem89to95;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency91 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 6, 6, 49, 6, 49, 6, 45, 56, 99, 4, 4, 4, 2, 2, 3, 4, 6, 48, 5, 48, 19,
				3, 45, 2, 62, 8);

		System.out.println(Collections.frequency(list, 4));
		System.out.println(Collections.frequency(list, 8));
		System.out.println(Collections.frequency(list, 8888));
		System.out.println(Collections.frequency(list, 2));
		

	}

}
