package in.advance.challenge79;

public class TesyEmpolyee {

	public static void main(String[] args) {

		Empolyee ep = new Empolyee("Satyam", 20, 2000000);
		System.out.println(ep.getEmpolyeeDetails());
		ep.setAge(21);
		ep.getEmpolyeeDetails();
		System.out.println(ep.getEmpolyeeDetails());

		ep.setSalary(3000000);
		System.out.println(ep.getEmpolyeeDetails());
		ep.setName("Bro");

		System.out.println(ep.getEmpolyeeDetails());

	}

}
