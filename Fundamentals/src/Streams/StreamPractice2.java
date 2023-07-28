package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		// for each practice

		//sequential
		l.stream().forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		//parallel
		l.parallelStream().forEach(System.out::println);

	}

}
