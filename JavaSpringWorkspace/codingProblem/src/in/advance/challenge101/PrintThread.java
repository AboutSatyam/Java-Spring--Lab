package in.advance.challenge101;

public class PrintThread extends Thread {

	private final int threadNo;

	public PrintThread(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	@Override
	public void run() {

		super.run();

		System.out.printf("%s Thread Starting %d \n", currentThread().getName(), threadNo);

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}

		System.out.printf("%s Thread Ended %d \n", currentThread().getName(), threadNo);

	}

}
