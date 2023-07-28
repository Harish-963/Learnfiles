package Collections;

import java.util.*;

class NavigableSetTest {
	public static void main(String arg[]) {
		NavigableSet<Float> ns = new TreeSet<Float>();
		ns.add(10.0f);
		ns.add(10.1f);
		ns.add(10.2f);
		ns.add(10.3f);
		ns.add(10.4f);
		ns.add(10.5f);

		System.out.println("Navigable Set elements : " + ns);
		System.out.print("Iterating Navigable set elements : ");
		Iterator it = ns.descendingIterator(); // Descending Iterator
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.println("Higher or equal element : " + ns.ceiling(10f));
		System.out.println("The Descending Set : " + ns.descendingSet());
		System.out.println("Lower or equal element : " + ns.floor(10.3f));
		System.out.println("Headset elements : " + ns.headSet(10.3f, false));
		System.out.println("Higher element : " + ns.higher(10.3f));
		System.out.println("Lower element : " + ns.lower(10.3f));
		System.out.println("Deletes lowest element : " + ns.pollFirst());
		System.out.println("Deletes highest element : " + ns.pollLast());
	}
}