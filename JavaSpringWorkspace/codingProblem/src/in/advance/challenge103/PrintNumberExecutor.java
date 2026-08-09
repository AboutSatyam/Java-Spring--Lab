package in.advance.challenge103;

public class PrintNumberExecutor implements Runnable {

	public static void main(String[] args) {

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("Number is %d\n", i + 1);

		}
	}

}
