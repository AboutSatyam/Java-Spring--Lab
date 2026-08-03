package in.advance.challenge81;

public class HashCodeTestCase {
	public static void main(String[] args) {
		Person person1 = new Person("Satyam", 20, "501F");
		Person person2 = new Person("Satyam", 20, "501F");
		// if (person1 == person2) // Not Equal
		if (person1.equals(person2)) // Now Equal After Writing The ---> equal override () in person class .

		{
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
