package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> names = new LinkedHashSet<>();
		
		names.add("Dam");
		names.add("Chinu");
		names.add("Pavan");
		names.add("Harish");
		names.add("bargav");
		names.add("bairava");
		System.out.println(names);
	
		names.remove("bargav");
		System.out.println(names);
		
		System.out.println(names.contains("Chinu"));
		
		System.out.println(names.isEmpty());
		
		
	}

}
