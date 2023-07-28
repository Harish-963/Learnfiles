package Collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * empty() boolean The method checks the stack is empty or not. push(E item) E
		 * The method pushes (insert) an element onto the top of the stack. pop() E The
		 * method removes an element from the top of the stack and returns the same
		 * element as the value of that function. peek() E The method looks at the top
		 * element of the stack without removing it. search(Object o) int The method
		 * searches the specified object and returns the position of the object.
		 */
		Stack<String> book = new Stack<>();

		System.out.println("Check empty:" + book.empty());

		book.push("red");
		book.push("blue");
		book.push("black");
		book.push("red");

		System.out.println(book);

		System.out.println(book.peek());

		System.out.println(book.search("red"));

		System.out.println(book.pop());	

		System.out.println(book);

	}

}
