package AbstractClasses;

public abstract class Parent {

	int age;

	public Parent(int age) {
		this.age = age;
	}
	
	abstract void carrer();
	abstract void income();
	
	 static void helloStatic()
	{
		System.out.println("Hello i am static method");
	}
	
	void normal()
	{
		System.out.println("I am normal method");
	}
	
	
}
