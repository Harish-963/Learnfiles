package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[] {1,5,6,7,8};

		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
		a.add(10);
		System.out.println(a);
		
		a.forEach(n -> System.out.println(n));
		
		ArrayList<Integer> b = new ArrayList<>();
		b.add(10);
		System.out.println(a);
		System.out.println(b);
		
		
		ArrayList<Integer> c = new ArrayList<>(200);
		c.add(10);
		System.out.println(c);

		
		//making sycronized using the explicity
		java.util.Collections.synchronizedList(b);
		
		
	}

}
