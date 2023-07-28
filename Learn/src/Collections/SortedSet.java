package Collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class SortedSetTest {
	public static void main(String arg[]) {
		SortedSet<Integer> ss = new TreeSet<Integer>();
		ss.add(10);
		ss.add(30);
		ss.add(98);
		ss.add(80);
		ss.add(10); // duplicate value
		ss.add(99);

		System.out.println("SortedSet elements : " + ss);
		System.out.print("Iterating SortedSet elements : ");
		Iterator it = ss.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		System.out.println("Lowest element : " + ss.first());
		System.out.println("Highest element : " + ss.last());
		System.out.println("Lesser than elements : " + ss.headSet(80));
		System.out.println("Higher than or equals elements : " + ss.tailSet(80));
		System.out.println("Range elements : " + ss.subSet(20, 90));

	}
}
