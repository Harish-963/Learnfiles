package AbstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent s=new Son(22);
		
		System.out.println(s.age);
		s.carrer();
		((Son) s).normal();
		s.income();
		Parent.helloStatic();
		
		//Daughter
		Parent d=new Daughter(28);
		System.out.println(d.age);
		d.carrer();
		d.normal();
		d.income();
		Parent.helloStatic();
	}

}
