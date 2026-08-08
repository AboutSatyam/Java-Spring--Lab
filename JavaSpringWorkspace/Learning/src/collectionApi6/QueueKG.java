package collectionApi6;

import java.util.*;

public class QueueKG {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		// "<>" Diamond Operator

		// System.out.println(queue.peek());
		queue.add(2006);
		queue.add(26);
		queue.add(06);
		queue.add(2);
		queue.add(36);

		System.out.println(queue.offer(16));
		System.out.println(queue.peek());

	}

}
