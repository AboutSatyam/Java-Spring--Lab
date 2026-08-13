package assignment.byTelusko.program2;

public class Car {

	String make;
	String model;
	int year;

	public static void main(String[] args) {

		System.out.println("Car Showroom ");
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
