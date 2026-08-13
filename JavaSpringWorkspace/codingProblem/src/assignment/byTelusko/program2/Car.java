package assignment.byTelusko.program2;

public class Car {

	String make;
	String model;
	int year;

	void disp() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Car ShowRoom: \n");

		Car cr = new Car();
		cr.setMake("Toyota");
		cr.setModel("XR");
		cr.setYear(2018);
		cr.disp();

		System.out.println(" ");

		Car cr1 = new Car();
		cr1.setMake("BMW");
		cr1.setModel("X7");
		cr1.setYear(2021);
		cr1.disp();

	}

}
