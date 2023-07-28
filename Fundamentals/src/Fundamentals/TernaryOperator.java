package Fundamentals;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 20, b = 10, c = 30, result;
		 
	        // result holds max of three
	        // numbers
	        result
	            = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
	        System.out.println("Max of three numbers = "
	                           + result);
	}

}
