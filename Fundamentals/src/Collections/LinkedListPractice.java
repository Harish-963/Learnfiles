package Collections;

import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add(1, "Y3");
		ll.add("Y4");
		ll.add("Y5");
		ll.add("Y6");
		ll.add("Y6");
		ll.add(null);
		System.out.println(ll);
		
		//remove..
		ll.remove(3);
		System.out.println(ll);
		
		//get
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(2));
		
		//set
		ll.set(0, "S1");
		System.out.println(ll);
	}

}
