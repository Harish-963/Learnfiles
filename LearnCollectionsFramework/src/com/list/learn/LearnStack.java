package com.list.learn;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		//push
		stack.push("harish");
		stack.push("Sarish");
		stack.push("ganesh");
		stack.push("chandu");
		System.out.println(stack);
		
		//peek
		System.out.println(stack.peek());
		
		//pop
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		//print
		System.out.println(stack.toString());
	}

}
