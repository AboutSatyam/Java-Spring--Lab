package in.advance.challenge100;

public class Mainn {

	public static void main(String[] args) throws InterruptedException {

		ThreadState t1 = new ThreadState();

		System.out.printf("\n Create a New Thread %s", t1.getState());

		t1.start();
		t1.join();

		System.out.printf("\nThread Finished %s", t1.getState());

	}

}
