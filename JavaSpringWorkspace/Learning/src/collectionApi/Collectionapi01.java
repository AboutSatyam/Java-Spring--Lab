package collectionApi;

import java.util.ArrayList;

public class Collectionapi01 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(34);
		al.addAll(al);
		al.addFirst(al);
		al.add("gggggg");

		System.out.println(al);
	}

}
