package AbstractClasses;

public final class Son extends Parent{

	public Son(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	//@Override
	void normal()
	{
		System.out.println("I am normal method in son");
	}
	
	@Override
	void carrer() {
		// TODO Auto-generated method stub
		System.out.println("I am Engineer");
		
	}

	@Override
	void income() {
		// TODO Auto-generated method stub
		System.out.println("I get an income of 1 cr");
		
	}

}
