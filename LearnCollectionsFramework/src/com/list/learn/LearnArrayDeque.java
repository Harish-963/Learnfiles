package com.list.learn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LearnArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> arrdeq = new ArrayDeque<>();
		
		//offer means add
		arrdeq.offer(2);
		
		arrdeq.offerFirst(9);
		
		arrdeq.offerLast(23);
		
		System.out.println(arrdeq);
		System.out.println("Count of elements: "+arrdeq.size());
		
		
		//peek
		System.out.println("peek "+ arrdeq.peek());
		System.out.println("peek first "+ arrdeq.peekFirst());
		System.out.println("peek last "+ arrdeq.peekLast());
		System.out.println("Count of elements: "+arrdeq.size());
		
		//poll..
		System.out.println("poll "+ arrdeq.poll());
		System.out.println("poll first "+ arrdeq.pollFirst());
		System.out.println("poll last "+ arrdeq.pollLast());
		
		System.out.println("Count of elements: "+arrdeq.size());
	}

}
