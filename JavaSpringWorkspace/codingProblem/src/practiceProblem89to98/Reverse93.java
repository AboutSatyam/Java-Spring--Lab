package practiceProblem89to98;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse93 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 55, 4, 97, 5, 45, 46, 4, 6, 8);
		System.out.println(list);
		reverse(list);
		System.out.println(list);

	}

	public static void reverse(List<Integer> list) {
		Collections.reverse(list);// Short Way
		for (int i = 0; i < list.size() / 2; i++) { // Long Way
			SwapArrayList92.swap(list, i, list.size() - 1 - i);
		}
	}
}
