package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		// using anonymous class..
		Function<Integer, Integer> fmap = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * t;
			}
		};

		// map.. for transformation using lambda..
		l.stream().map(n -> n * n).forEach(System.out::print);

		System.out.println("\n---------------------------------------------------");
		// using anonymous class..
		l.stream().map(fmap).forEach(System.out::println);

	}

}
