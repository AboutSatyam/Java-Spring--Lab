package in.advance.challenge100;

public class ThreadState extends Thread {

	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(4000);
			System.out.printf("\nFrom Inside Run %s", getState());

		} catch (InterruptedException e) {

			throw new RuntimeException(e);
		}
	}
}
