package ques.Daily;

import java.util.Scanner;
import java.util.Stack;

public class ParenthsisBalancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the parenthsis string: ");
			String s = sc.next();
			if (checkBalance(s))
				System.out.println(s + " is a balanced");
			else
				System.out.println(s + " is not balanced");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean checkBalance(String s) {
		char c;
		Stack<Character> stack_par = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);

			if (c == '}') {
				if (stack_par.peek() == '{')
					stack_par.pop();
				else
					return false;
			} else if (c == ')') {
				if (stack_par.peek() == '(')
					stack_par.pop();
				else
					return false;
			} else if (c == ']') {
				if (stack_par.peek() == '[')
					stack_par.pop();
				else
					return false;
			} else {
				if (c == '{' || c == '(' || c == '[')
					stack_par.push(c);
			}
		}
		if (stack_par.size() == 0)
			return true;
		else
			return false;
	}

}
