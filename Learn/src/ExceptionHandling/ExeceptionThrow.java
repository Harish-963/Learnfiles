package ExceptionHandling;

public class ExeceptionThrow {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String name="Harish";
		try {
		length(name);
		}catch(NullPointerException npe)
		{
			System.out.println(npe.toString());
			throw npe;
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally code excecuted");
		}
		System.out.println("Done");
	}
	
	
	
	private static <T> int length(T name){
		return ((String) name).length();
		//throw new  NullPointerException("this is null");
		
	}

}
