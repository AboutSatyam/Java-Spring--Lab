
package assignment.byTelusko.program18;

import java.util.ArrayList;

public class CustomList<T> {

	ArrayList<T> list = new ArrayList<>();

	void add(T element) {
		list.add(element);
	}

	T get(int index) {
		return list.get(index);
	}

	void display() {

		for (T element : list) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		CustomList<Integer> ci = new CustomList<>();

		ci.add(10);
		ci.add(20);
		ci.add(30);

		System.out.println("Integer List : ");
		ci.display();

		System.out.println("Element At Index 1 : " + ci.get(1));

		CustomList<String> cs = new CustomList<>();

		cs.add("Java");
		cs.add("Spring");
		cs.add("41.0");

		System.out.println("\nString List : ");
		cs.display();

		System.out.println("Element At Index 1 : " + cs.get(1));

	}

}
