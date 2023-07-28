package com.list.learn;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<String> queue = new LinkedList<String>();
		
		//add
		queue.offer("harish");
		queue.offer("Sai");
		queue.offer("ramu"); 
		queue.offer("Sam");
		
		//
		System.out.println(queue);
		
		//peek
		System.out.println(queue.peek());
		
		//poll 
		System.out.println(queue.poll());
		
		//isempty
		System.out.println(queue.isEmpty());
		
		//print
		System.out.println(queue);

	}

}
