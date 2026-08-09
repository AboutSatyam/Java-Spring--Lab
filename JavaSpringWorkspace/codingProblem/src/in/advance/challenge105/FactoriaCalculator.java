package in.advance.challenge105;

import java.util.concurrent.Callable;

public class FactoriaCalculator<V> implements Callable<Integer> {

	private final int number;

	public FactoriaCalculator(int number) {
		super();
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {

		Thread.sleep(3000);
		if (number <= 1) {
			return 1;

		}

		int result = 1;
		for (int i = 2; i <= number; i++) {

			result *= i;

		}

		return result;
	}

}
