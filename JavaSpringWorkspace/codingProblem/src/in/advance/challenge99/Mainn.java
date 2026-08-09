package in.advance.challenge99;

public class Mainn {

	public static void main(String[] args) {
		HelloThread t1 = new HelloThread(1);
		HelloThread t2 = new HelloThread(2);

		t1.run();
		t2.start();// It Will Not Create New Thread --> It Will Executed In MAin thread Only.....
		t2.run();

	}

}
