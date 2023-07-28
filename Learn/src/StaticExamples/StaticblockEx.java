package StaticExamples;

public class StaticblockEx {

	
	static int a=10;
	 static int b;
	 
	 static
	 {
		 System.out.println(" i am inside static block..");
		 b=a*5;
	 }
	
	public static void main(String[] args) {
		StaticblockEx sb=new StaticblockEx();
		
		System.out.println(a+"\t"+b);
		
		StaticblockEx.b+=5;
		
		System.out.println(a+"\t"+b);
		
		System.out.println(StaticblockEx.a+"\t"+StaticblockEx.b);
	}

}
