package LambdaFunctions;

public class MainLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=9,d=6;
		
		ImplementsLambdainterface impLI=(a,b) -> {
			System.out.println("My Value : "+(a+b));
			return (a+b);}; 
		
		ImplementsLambdainterface impLI1=(a,b) -> a+b; 
		
		System.out.println(impLI.sum(c, d));
		
		System.out.println(impLI1.sum(c, d));
	}

}
