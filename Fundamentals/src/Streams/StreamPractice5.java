package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//flat map..
		
		
		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2));
		
		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(3,4));
		
		ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(5,6));
		
		//adding all list(l1,l2,l3) to list..
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(Arrays.asList(l1,l2,l3));
	
		System.out.println(list);
		
		//make a flat stream ..
		list.stream().flatMap(sl -> sl.stream().map(n -> n+2)).forEach(System.out::println);
		
		
		
	}

}
