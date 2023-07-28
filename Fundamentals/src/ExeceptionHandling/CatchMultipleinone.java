package ExeceptionHandling;

public class CatchMultipleinone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {1,2,3};
		
		try
		{
			System.out.println(i[2]/0);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
			System.err.println("Common exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
