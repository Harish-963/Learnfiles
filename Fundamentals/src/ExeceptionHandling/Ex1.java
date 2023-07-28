package ExeceptionHandling;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		long j;
		i = 8;
		j = 0;

		//arithmeticExeceptionwithoutHandling_byzero(i, j);
		arithmeticExeceptionWithHandling_byzero(i, j);

	}

	public static void arithmeticExeceptionwithoutHandling_byzero(int i, long j) {
		long k = (i / j);
		System.out.println(k);
	}

	public static void arithmeticExeceptionWithHandling_byzero(int i,long j)
	{
		try
		{long k=i/j;
		System.out.println(k);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Can't divide number with zero");
		}
		catch(ArrayIndexOutOfBoundsException aioe)
		{
			System.out.println(aioe);
		}
		catch(StringIndexOutOfBoundsException sioe)
		{
			System.out.println(sioe);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Done");
		}
	}

}
