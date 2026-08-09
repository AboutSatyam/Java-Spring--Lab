package in.advance.challenge99;

public class HelloThread extends Thread {

	private final int threadNo;

	public HelloThread(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	@Override
	public void run() {

		super.run();

		for (int i = 0; i < 10; i++) {

			System.out.printf("%s Hello From Thread %d \n", currentThread().getName(), threadNo);

		}

	}

}
