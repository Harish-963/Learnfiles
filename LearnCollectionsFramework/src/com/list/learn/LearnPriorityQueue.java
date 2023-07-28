package com.list.learn;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//need to learn more obut this....
		
		//for asscending
		Queue<Integer> queue = new PriorityQueue<>();
		
		//add
		queue.offer(34);
		queue.offer(21);
		queue.offer(12);
		queue.offer(64);
		
		//
		System.out.println(queue);
		
		//peek
		System.out.println(queue.peek());
		
		//poll
		System.out.println(queue.poll());
		
		//print
		System.out.println(queue);
		
		
		//Sysout
		System.out.println("/********************************************/");
		
		//assending order.
		Queue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		pq1.offer(22);
		pq1.offer(98);
		pq1.offer(52);
		pq1.offer(74);
		pq1.offer(22);
		pq1.offer(98);
		pq1.offer(52);
		pq1.offer(74);
		pq1.offer(22);
		pq1.offer(98);
		pq1.offer(52);
		pq1.offer(74);
		
		System.out.println(pq1);
		while(!pq1.isEmpty())
		{
			System.out.println(pq1.poll());
		}
	}

}
