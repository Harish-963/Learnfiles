package com.list.learn;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first arraylist
		List<String> arr= new ArrayList<String>();
		arr.add("Harish");
		arr.add(1,"Sai");
		System.out.println(arr);
		// or ArrayList<String> arr= new ArrayList<String>();
		
		//2nd array list
		ArrayList<String> arr2= new ArrayList<String>();
		arr2.add("Uma");
		arr2.add(1,"Revi");
		System.out.println(arr2);
		
		//adding the arr 2 to arr..
		arr.addAll(arr2);
		System.out.println(arr);
		
		//get element element..
		System.out.println(arr.get(0));
		
		//remove the element
		arr.remove(1);
		System.out.println(arr);
		
		//remove element with values
		arr.remove("Revi");
		System.out.println(arr);
	
		//contains..
		System.out.println(arr.contains("Uma"));
		
		//size()
		System.out.println(arr.size());
	
		//set..
		arr.set(1, "UmaUpma");
		System.out.println(arr);

		
		//Iterator..
		java.util.Iterator<String> iter = arr.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		//clear
		arr.clear();
		System.out.println(arr);
		
	}

}
