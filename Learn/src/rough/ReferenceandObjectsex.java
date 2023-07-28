package rough;

public class ReferenceandObjectsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pp=new Person();
		Student ss = new Student();
		Person ps=new Student();
		
		pp.printing();
		
		ps.printing();
		
	}

}
	class Person
	{
		String name;
		int age;
		String address;
		
		public void printing()
		{
			System.out.println("in person");
		}
	}
	
	class Student extends Person
	{
		int marks;
		int rollnumber;
		@Override
		public void printing()
		{
			System.out.println("in student");
		}
	}

