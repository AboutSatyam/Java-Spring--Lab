package in.advance.challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestingFact {

	public static void main(String[] args) {

		try (ExecutorService service = Executors.newFixedThreadPool(10)) {

			List<Future<Integer>> list = new ArrayList<>();

			for (int i = 0; i < 10; i++) {

				FactoriaCalculator task = new FactoriaCalculator(i);

				Future<Integer> future = service.submit(task);

				list.add(future);
			}

			for (Future<Integer> future : list) {

				System.out.printf("Result IS : %d%n", future.get());

			}

			service.shutdown();

			if (service.awaitTermination(10, TimeUnit.SECONDS)) {
				System.out.println("I AM DONE ... FOR TODAY");
			}

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}