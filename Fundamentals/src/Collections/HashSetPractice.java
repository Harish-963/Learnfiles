package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> names = new HashSet<>();
		
		names.add("Dam");
		names.add("Chinu");
		names.add("Pavan");
		names.add("Harish");
		names.add("bargav");
		names.add("bairava");
		
		int i=10;
		while(i>=0) {
		System.out.println(names);
		i--;
		}
		names.remove("bargav");
		System.out.println(names);
		
		System.out.println(names.contains("Chinu"));
		
		System.out.println(names.isEmpty());
		
	}

}
