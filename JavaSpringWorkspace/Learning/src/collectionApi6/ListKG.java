package collectionApi6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListKG {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(19);
		li.add(133);
		li.add(899);
		li.add(13);
		li.add(98);
		li.add(549);
		li.add(-5);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);

	}

}
