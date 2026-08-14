package assignment.byTelusko.program8;

public class Person {

	private String name;
	private int age;
	private int id;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setAge(50);
		System.out.println(p1.getAge());

		p1.setId(21);
		System.out.println(p1.getId());

		p1.setName("Satyam ");
		System.out.println(p1.getName());
	}

}
