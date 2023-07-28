package AbstractClasses;

public class Daughter extends Parent{

	public Daughter(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void carrer() {
		// TODO Auto-generated method stub
		System.out.println("I am Doctor");
	}

	@Override
	void income() {
		// TODO Auto-generated method stub
		System.out.println("I get an income of 3 cr");
	}

}
