package assignment.byTelusko.program7;

public class ConOver {

	String name;
	double price;
	int quantity;

	public ConOver(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public ConOver(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public ConOver(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public ConOver(double price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}

	public static void main(String[] args) {

		ConOver cr = new ConOver(50000, 5);
		System.out.println(cr.price);
		ConOver cr1 = new ConOver("Satyam", 5);
		System.out.println(cr1.name);

		ConOver cr2 = new ConOver("Satyam bro", 2);
		System.out.println(cr2.quantity);

		ConOver cr3 = new ConOver("HEllo WOrld", 25000, 5);
		System.out.println(cr3.name);

	}

}
