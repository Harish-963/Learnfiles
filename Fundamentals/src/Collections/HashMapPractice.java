package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		//adding
		hmap.put("Harish", 10);
		hmap.put("Sai", 20);
		hmap.put("Harsha", 200);
		
		System.out.println(hmap);
		
		hmap.forEach((t,u)-> System.out.println("Key: "+t+", Value: "+u));
		
		BiConsumer<Object, Object> ii = new Impebiconsumer();
		hmap.forEach(ii);
		
		
		hmap.putIfAbsent("Harika", 500);
		System.out.println(hmap);
		
		//adding duplicate key with different value..
		
		hmap.put("Harish", 9);
		System.out.println(hmap);
		
		//putall
		
		 HashMap<String,Integer> map=new HashMap<String,Integer>();  
	      map.put("Ravi",104);  
	      map.putAll(hmap);  
	      System.out.println("After invoking putAll() method "); 
	      
	      for(Map.Entry m:map.entrySet()) {
	    	  System.out.println("Key: "+m.getKey()+"   Value: "+m.getValue());
	      }
	      
	      //replace..
	      
	      //having key
	      map.replace("Harish", 99);
	      System.out.println(map);
	      
	      //Not Having Key..
	      map.replace("Somesh", 85);
	      System.out.println(map);
	      
	      //replace with old and new value method.. different old value..
	      map.replace("Sai", 21, 23);
	      
	      System.out.println(map);
	      
	      //replace with old and new value method.. same old value..
	      map.replace("Sai", 20, 23);
	      
	      System.out.println(map);
	      
	      //get
	      System.out.println(map.get("Sai"));
	      
	      //get or default..
	      System.out.println(map.getOrDefault("Ramu", 10));
	      
	      
	      //remove..
	      //key based remove
	      map.remove("Sai");
	      System.out.println(map);
	      
	      //Key value based remove
	      map.remove("Harika", 500);
	      System.out.println(map);
	      
	      //Key value based remove with non existing value
	      map.remove("Ravi", 500);
	      System.out.println(map);
	      
	      //replace all//
	      
	      map.replaceAll((t, u) -> 9999);
	      
	      System.out.println(map);
	      
	      
	      
		
		
	}
	

}

class Impebiconsumer implements BiConsumer<Object, Object>{

	@Override
	public void accept(Object t, Object u) {
		// TODO Auto-generated method stub
		System.out.println("Using class impl -> Key: "+t+", Value: "+u);
		
	}
	
}
