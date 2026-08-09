
package in.advance.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class multipleThreadExecutor {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            // Submit 10 tasks
            for (int i = 0; i < 10; i++) {
                service.submit(new SleepTask());
            }

            // Stop accepting new tasks
            service.shutdown();

            // Wait for tasks to finish
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {

                System.out.println("EMERGENCY OFF!!");

                // Forcefully interrupt running tasks
                service.shutdownNow();
            }

        } catch (InterruptedException e) {

            System.out.println("Main thread interrupted.");

            Thread.currentThread().interrupt();
        }
    }
}

