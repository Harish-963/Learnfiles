package Recursions;

public class NumbersExampleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		if(i==6)
		{
			System.out.println(i);
			return;
		}
		System.out.println(i);
		print(i+1);
		
	}

}
