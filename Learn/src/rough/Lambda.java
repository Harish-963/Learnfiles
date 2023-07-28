package rough;

public class Lambda  implements as{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c=5.98,d=9.02;
		as oref=(a,b) -> a+b;
			
			System.out.println(oref.pp(c, d));
			
			Lambda lan=new Lambda();
			System.out.println(lan.pp(9, 8));
			
			as.rai();
			
	}

	@Override
	public double pp(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

interface as{
		 double pp(double a,double b);
		 
		 static void rai()
		 {
			 System.out.println("hi");
			 
		 }
		 
		 
		 
		 
}

