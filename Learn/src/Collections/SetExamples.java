package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(30);
		s.add(98);
		s.add(80);
		s.add(99);
		s.add(80); // Duplicate

		System.out.println("Set elements : " + s);
		System.out.print("Iterating set elements : ");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.println("Size of Set is : " + s.size());
		System.out.println("Set contains element : " + s.contains(30));
		System.out.println("Set is empty : " + s.isEmpty());

		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(30);
		ts.add(98);
		ts.add(80);
		ts.add(99);
		ts.add(80); // Duplicate

		// while printing element it will be there in sorted list.. even if you are
		// entering in unsorted way..
		System.out.println("Set elements : " + ts);
		System.out.print("Iterating set elements : ");
		Iterator iti = ts.iterator();
		while (iti.hasNext()) {
			System.out.print(iti.next() + " ");
		}
		System.out.println();

		System.out.println("Size of Set is : " + ts.size());
		System.out.println("Set contains element : " + ts.contains(30));
		System.out.println("Set is empty : " + ts.isEmpty());
	}

}
