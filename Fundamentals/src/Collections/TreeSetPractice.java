package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> names = new TreeSet<>();
		
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
		
		System.out.println(names.descendingSet());
		
		//There are many methods for us.. Get the documentation for exact usage of the particular method when required
		
		
	}

}
