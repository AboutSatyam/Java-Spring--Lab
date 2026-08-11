package collectionApi;

import java.util.HashSet;
import java.util.Set;

public class SetKG {

	public static void main(String[] args) {
		Set<String> se = new HashSet<>();
		System.out.println(se.add("Satyam"));
		se.add("Mann");
		System.out.println(se.add("Bhai"));
		System.out.println(se.add("sixfour"));
//Insertion Order Not Maintain
		System.out.println(se);
		se.remove("Mann");
		System.out.println(se);
	}

}
