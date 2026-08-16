package assignment.byTelusko.program15;

import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {

	HashMap<String, Contact> hm = new HashMap<>();

	void addContact() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = input.next();

		System.out.println("Enter Your Contact No : ");
		String phone = input.next();

		System.out.println("Enter Your Email : ");
		String email = input.next();

		Contact con = new Contact(name, phone, email);

		hm.put(name, con);

		System.out.println("Contact Added Successfully\n");
	}

	void getContact() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Contact Name : ");
		String name = input.next();

		if (hm.containsKey(name)) {

			Contact con = hm.get(name);

			System.out.println("Name : " + con.name);
			System.out.println("Phone : " + con.phone);
			System.out.println("Email : " + con.email + "\n");

		} else {

			System.out.println("Contact Not Found !!!\n");
		}
	}

	void removeContact() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Contact Name : ");
		String name = input.next();

		if (hm.containsKey(name)) {

			hm.remove(name);

			System.out.println("Contact Removed Successfully\n");

		} else {

			System.out.println("Contact Not Found !!!\n");
		}
	}

	public static void main(String[] args) {

		ContactManager cm = new ContactManager();

		cm.addContact();
		cm.getContact();
		cm.removeContact();
		cm.getContact();

	}

}