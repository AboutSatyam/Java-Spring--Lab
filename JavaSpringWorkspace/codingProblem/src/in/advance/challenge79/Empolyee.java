package in.advance.challenge79;

class Empolyee {

	private String name;
	private int age;
	private double salary;

	public Empolyee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	String getEmpolyeeDetails() { // Package Private means "Default"
		return "EmpolyeeDetails : Name:" + name + " ,Age:" + age + " ,Salary: " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
