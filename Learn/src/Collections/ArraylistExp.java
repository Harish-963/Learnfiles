package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExp {
	// linked list implementation is similar to array list but the inside
	// implementation is different..
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(12);
		arr.add(465);
		arr.add(0, 989);
		arr.add(125);

		System.out.println(arr);

		System.out.println(arr.contains(125));

		List<Integer> arre = new ArrayList<>();
		arre.add(562);
		arre.add(821);
		arre.add(1265);
		arre.add(25893);

		arr.addAll(arre);

		System.out.println(arre);
		System.out.println(arr);

		ArrayList<Integer> clonedArrayList = new ArrayList<Integer>();
		clonedArrayList = (ArrayList<Integer>) arr.clone();
		System.out.println(clonedArrayList);
		System.out.println(clonedArrayList.containsAll(arre));

		System.out.println(arre.isEmpty());

		// has many more methods to see..

	}

}
