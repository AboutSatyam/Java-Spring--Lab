
package in.advance.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multipleThreadExecutor {

	public static void main(String[] args) {

		try (ExecutorService service = Executors.newFixedThreadPool(10)) {

			for (int i = 0; i < 10; i++) {
				SleepTask task = new SleepTask();
				service.submit(task);
			}

			service.shutdown();

			if (!service.awaitTermination(15, TimeUnit.SECONDS)) {

				System.out.println("EMERGENCY OFF!!");
				service.shutdownNow();
			}

		} catch (InterruptedException e) {

			System.out.println("Main thread interrupted.");

			Thread.currentThread().interrupt();
		}
	}
}
