package assignment.byTelusko.program16;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

	void displayList(List<?> list) {

		for (Object obj : list) {
			System.out.println(obj);

		}
	}

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		List<Double> l3 = new ArrayList<>();

		WildcardDemo wd = new WildcardDemo();

		l1.add(10);
		l1.add(20);

		l2.add("Satyam");
		l2.add("Java");

		l3.add(10.5);
		l3.add(20.5);

		wd.displayList(l1);
		wd.displayList(l2);
		wd.displayList(l3);

	}

}
