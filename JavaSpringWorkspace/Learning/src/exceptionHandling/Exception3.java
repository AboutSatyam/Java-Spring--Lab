package exceptionHandling;

class demo {
	public int disp() throws InterruptedException {
		System.out.println("**********");
		return 0;
	}

	{
		try {
			System.out.println("Disp method of demo");
			// return 10;
		}

		finally {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			;
			System.out.println("Finally Block");

		}

	}

}

public class Exception3 {

	public static void main(String[] args) throws InterruptedException {
		demo a = new demo();
		// a.disp();
		System.out.println(a.disp());
	}

}
