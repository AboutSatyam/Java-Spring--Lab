
package assignment.byTelusko.program19;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MenuManager {

	HashMap<String, Double> menu = new HashMap<>();

	void addDish() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter The Dish Name : ");
		String name = input.next();

		System.out.println("Enter The Dish Price : ");
		double price = input.nextDouble();

		menu.put(name, price);

		System.out.println("Dish Added Successfully\n");
	}

	void displayMenu() {

		for (Map.Entry<String, Double> entry : menu.entrySet()) {

			System.out.println("Dish Name : " + entry.getKey());
			System.out.println("Price : " + entry.getValue() + "\n");

		}
	}

	void updateMenu() {

		System.out.println("Enter The Dish Name Again :");

		Scanner input = new Scanner(System.in);
		String name = input.next();

		if (menu.containsKey(name)) {

			System.out.println("Enter The New Price : ");
			Double price = input.nextDouble();

			menu.put(name, price);

			System.out.println("Price Updated Successfully\n");

		} else {

			System.out.println("NAME NOT FOUND !!!\n");
		}
	}

	void removeMenu() {

		System.out.println("Enter The Dish Name To remove  :");

		Scanner input = new Scanner(System.in);
		String name = input.next();

		if (menu.containsKey(name)) {

			menu.remove(name);

			System.out.println("Dish Removed Successfully\n");

		} else {

			System.out.println("Dish NOT FOUND !!!\n");
		}
	input.close();
	}
	

	public static void main(String[] args) {

		MenuManager mm = new MenuManager();

		mm.addDish();
		mm.displayMenu();

		mm.updateMenu();
		mm.displayMenu();

		mm.removeMenu();
		mm.displayMenu();

	}
}
