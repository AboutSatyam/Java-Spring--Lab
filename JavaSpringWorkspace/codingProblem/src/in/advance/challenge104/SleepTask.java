package in.advance.challenge104;

public class SleepTask implements Runnable {

	@Override
	public void run() {

		Thread current = Thread.currentThread();
		System.out.printf("Started Current Thread Name %s\n", current.getName());
		try {
			Thread.sleep(getRandom() * 1000);
		} catch (InterruptedException e) {
			System.out.println("Task interrupted: " + Thread.currentThread().getName());

			Thread.currentThread().interrupt();
			return;
		}

		System.out.printf("Ended Thread Name %s\n", current.getName());

	}

	private int getRandom() {

		double random = Math.random() * 5 + 1;

		return (int) random;

	}
}
