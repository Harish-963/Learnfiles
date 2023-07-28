package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>(Arrays.asList(1,1,2,6,25,96,89,45,63,15,7,26,32,72,64,20,36));
		
//		l.forEach(System.out::println);
		
		//even numbers
//		l.stream().filter(n-> n%2==0).forEach(System.out::println);
		
		//map..
		l.stream().filter(n-> n%2==0).map(n-> n%2==0 && n%4==0).forEach(System.out::println);
		
		
	}

}
