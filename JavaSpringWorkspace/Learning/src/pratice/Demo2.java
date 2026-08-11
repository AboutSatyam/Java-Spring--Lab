package pratice;

class hello02 {

	void kack() {

		int cost;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("******");
	}

}

public class Demo2 {

	public static void main(String[] args) {

		hello02 h = new hello02();
		h.kack();

	}

}
