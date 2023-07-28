package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 13, 19, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		// Collect and Collector..

		Stream<Integer> streamInt = l.stream();

//		streamInt.forEach(System.out::println);
		
		//convert back to list
		List<Integer> tolist = streamInt.collect(Collectors.toList());
		
		System.out.println(tolist);
		
		
		Set<Integer> toset = l.stream().collect(Collectors.toSet());
		
		System.out.println(toset);
		
		//tostring..
		String tostring = l.stream().map(n->String.valueOf(n)).collect(Collectors.joining(",","Elements are: ","."));
		
		System.out.println(tostring);
		
		//need to learn more..

	}

}
