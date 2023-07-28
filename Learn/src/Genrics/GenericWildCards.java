package Genrics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCards {

	// wildsCards are represented by "?".
	// we use wild cards when we don't know what type of thing is used..
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("har");
		// it will not work as List<someType> is not a subclass of List<Objects> .. below
		// once uncomment and try
//		 PrintingU(list);

		// it will work as it is using wildcards
		PrintingUs(list);
		
		//it will only work for numbers like integer, float , double ,long ,short and etc .. as it is extending the Number class..
		
		
		PrintingUss(list);
		
		
	}

	private static void PrintingU(List<Object> listing) {
		System.out.println(listing);
	}

	// using wild cards
	private static void PrintingUs(List<?> listing) {
		System.out.println(listing);
	}

	// using wild cards which only allow the numbers..
	private static void PrintingUss(List<? extends Number> listing) {
		System.out.println(listing);
		
	}
}
