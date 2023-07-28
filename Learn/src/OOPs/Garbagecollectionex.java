package OOPs;

public class Garbagecollectionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		for(int i=0;i<1000000000;i++)
		{
			a=new A("harish");
		}
	}

}

class A
{
	String name;
	public A(String name)
	{ 
		this.name=name;
	}

	@Override
	protected void finalize() throws Throwable{
		System.out.println("Object destroyed");
	}
}
