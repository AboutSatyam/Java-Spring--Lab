
package assignment.byTelusko.program17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CompareList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();

		System.out.println("Enter Number Of Elements : ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter Number : ");
			int num = input.nextInt();

			al.add(num);
			ll.add(num);
		}

		System.out.println("Enter Position : ");
		int position = input.nextInt();

		int index = position - 1;

		// ArrayList Retrieve
		long start = System.nanoTime();

		int arrayValue = al.get(index);

		long end = System.nanoTime();

		long arrayRetrieveTime = end - start;

		// LinkedList Retrieve
		start = System.nanoTime();

		int linkedValue = ll.get(index);

		end = System.nanoTime();

		long linkedRetrieveTime = end - start;

		System.out.println("\nArrayList Retrieved Value : " + arrayValue);
		System.out.println("ArrayList Retrieve Time : " + arrayRetrieveTime + " ns");

		System.out.println("LinkedList Retrieved Value : " + linkedValue);
		System.out.println("LinkedList Retrieve Time : " + linkedRetrieveTime + " ns");

		// ArrayList Remove
		start = System.nanoTime();

		al.remove(index);

		end = System.nanoTime();

		long arrayRemoveTime = end - start;

		// LinkedList Remove
		start = System.nanoTime();

		ll.remove(index);

		end = System.nanoTime();

		long linkedRemoveTime = end - start;

		System.out.println("\nArrayList Remove Time : " + arrayRemoveTime + " ns");
		System.out.println("LinkedList Remove Time : " + linkedRemoveTime + " ns");

		// ArrayList Add
		start = System.nanoTime();

		al.add(100);

		end = System.nanoTime();

		long arrayAddTime = end - start;

		// LinkedList Add
		start = System.nanoTime();

		ll.add(100);

		end = System.nanoTime();

		long linkedAddTime = end - start;

		System.out.println("\nArrayList Add Time : " + arrayAddTime + " ns");
		System.out.println("LinkedList Add Time : " + linkedAddTime + " ns");

	}
}