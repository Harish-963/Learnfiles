package Recursions;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=fib(4);
		System.out.println(ans);
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		if(i<2)
		return i;
		
		return fib(i-1)+fib(i-2);
	}

}
