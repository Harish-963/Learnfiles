package ExceptionHandling;

public class Exceptions {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		int a=2,b=0;	
		try {
		int c=a/b;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.fillInStackTrace());
			
		}
		finally {
			System.out.println("The end");
		}
		}
	

}
