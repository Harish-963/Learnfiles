package Collections;

import java.util.*;

class PriorityQueueDemo {
	public static void main(String arg[]) {
		PriorityQueue<Integer> num = new PriorityQueue<Integer>(); // LINE A
		num.offer(1);
		num.offer(5);
		num.offer(2);
		System.out.println(num.size());
		num.offer(9);
		// num.offer(null); LINE B
		for (int i = 0; i < 3; i++) {
			System.out.println(num.peek());
			num.remove();
		}
		
		System.out.println(num.size());

	}
}