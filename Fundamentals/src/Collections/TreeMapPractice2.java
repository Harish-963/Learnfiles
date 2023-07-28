package Collections;

import java.util.Map;
import java.util.TreeMap;

class BooksT {    
int id;    
String name,author,publisher;    
int quantity;    
public BooksT(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class TreeMapPractice2 {    
public static void main(String[] args) {    
    //Creating map of BooksTs    
    Map<Integer,BooksT> map=new TreeMap<Integer,BooksT>();    
    //Creating BooksTs    
    BooksT b1=new BooksT(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    BooksT b2=new BooksT(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    BooksT b3=new BooksT(103,"Operating System","Galvin","Wiley",6);    
    //Adding BooksTs to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, BooksT> entry:map.entrySet()){    
        int key=entry.getKey();  
        BooksT b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}    