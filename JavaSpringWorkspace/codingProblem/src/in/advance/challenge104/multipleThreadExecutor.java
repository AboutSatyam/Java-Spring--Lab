package in.advance.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multipleThreadExecutor {
	{
		try (ExecutorService service = Executors.newFixedThreadPool(3)) {

			for (int i = 0; i < 10; i++) {
				SleepTask task = new SleepTask();
				service.submit(task);

			}
			if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
				System.out.println("EMERENCY OFF!!");
				service.shutdownNow();

			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
