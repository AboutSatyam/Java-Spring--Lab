package practiceProblem89to98;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomCamparator90 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Fish", "Birds", "Tiger", "Bear");

		System.out.println(list + "  Before Sorting");

		sortInDecsending(list);

		System.out.println(list + "  After Sorting");
	}

	public static void sortInDecsending(List<String> str) {
		Collections.sort(str);
		Collections.sort(str, new Comparator<String>() {

			@Override
			public int compare(String s, String t1) {

				if (s.equals(t1)) {
					return 0;

				} else if (s.charAt(0) < t1.charAt(0)) {
					return 1;

				} else {
					return -1;
				}
			}
		});

	}

}
