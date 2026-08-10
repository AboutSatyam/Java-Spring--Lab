package practiceProblem106to115;

import java.util.function.BinaryOperator;

public class LamdaMultiple {

	public static void main(String[] args) {

		BinaryOperator<Integer> multi = (a, b) -> a * b;
		int res = multi.apply(4, 5);

		System.out.println(res);
	}

}
