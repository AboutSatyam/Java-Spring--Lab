package in.advance.challenge78;

public class Customer {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("501", "Satyam Pandey");
		ba.depositMoney(30000);
		ba.withdrawMoney(5000);
		ba.depositMoney(0);
		ba.withdrawMoney(0);
		ba.depositMoney(-35000);
		System.out.println("Withdrwal Money --> " + ba.withdrawMoney(35000));

	}

}
