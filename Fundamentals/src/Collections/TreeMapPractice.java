package Collections;

import java.util.*;

public class TreeMapPractice {
	 public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		   	  map.put(103,"Rahul");  
		   	  map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		        
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
		      
		      map.remove(102);      
		      System.out.println("After invoking remove() method");  
		      for(Map.Entry m:map.entrySet())  
		      {  
		          System.out.println(m.getKey()+" "+m.getValue());      
		      }  
		      
		      
		      //navigable map methods
		      map.put(102,"Ravi");  
		      //Maintains descending order  
		      System.out.println("descendingMap: "+map.descendingMap());  
		      //Returns key-value pairs whose keys are less than or equal to the specified key.  
		      System.out.println("headMap: "+map.headMap(102,true));  
		      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
		      System.out.println("tailMap: "+map.tailMap(102,true));  
		      //Returns key-value pairs exists in between the specified key.  
		      System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
		      
		      
		      //sorted map methods
		      //Returns key-value pairs whose keys are less than the specified key.  
		      System.out.println("headMap: "+map.headMap(102));  
		      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
		      System.out.println("tailMap: "+map.tailMap(102));  
		      //Returns key-value pairs exists in between the specified key.  
		      System.out.println("subMap: "+map.subMap(100, 102));    
		      
		      //others
		      System.out.println(map.ceilingKey(101));
		      System.out.println(map.ceilingKey(104));
		      
		      System.out.println(map.firstEntry());
		      System.out.println(map.floorEntry(101));
		      System.out.println(map.pollLastEntry());
		      System.out.println(map);
		      
	 }
}
