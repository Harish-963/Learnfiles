package Collections;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add
		Vector<String> v1 = new Vector<>();
		// add
		v1.add("Sai");
		v1.add("Ramu");
		// add at specified location
		v1.add(0, "Jeevan");

		Vector<String> v2 = new Vector<>();
		v2.add("ramesh");
		v2.add("suresh");
		// adding one to another
		v1.addAll(v2);
		// adding one to another at specified index..
		v2.addAll(0, v1);

		Vector<String> v3 = new Vector<>();
		v3.add("suresh");
		v3.add("ramesh");

		// geting index..
		System.out.println(v1.get(0));

//		//remove the element
//		System.out.println(v2.remove(0));
//		//remove by object
//		System.out.println(v2.remove("suresh"));
//		
//		//removeall
//		System.out.println(v1.removeAll(v2));

		// clearing the entire list
//		v1.clear();

		System.out.println(v2.containsAll(v1));
		
		//updation of elements..
		System.out.println(v3.set(0, "Harish"));
		
		//geting index..
		System.out.println("index of :"+ v2.indexOf("ramesh"));
		System.out.println("index of :"+ v2.lastIndexOf("ramesh",6));
		
		//retain all
		System.out.println(v1.retainAll(v3));
		
		System.out.println(v1);
		System.out.println("Size:" + v1.size());
		System.out.println("Capacity:" + v1.capacity());

		System.out.println(v2);
		System.out.println("Size:" + v2.size());
		System.out.println("Capacity:" + v2.capacity());
		
		System.out.println(v3);
		System.out.println("Size:" + v3.size());
		System.out.println("Capacity:" + v3.capacity());
	}

}
