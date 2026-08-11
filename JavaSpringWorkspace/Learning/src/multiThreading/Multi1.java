package multiThreading;

public class Multi1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Application Started");

		Thread thread = Thread.currentThread();

		System.out.println(thread.getName());

		System.out.println(thread.getPriority());

		Thread.sleep(5000);
		thread.setName("23 Feb");
		thread.setPriority(7);
		System.out.println("Application Ended ");
	}

}
