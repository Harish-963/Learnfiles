package StaticExamples;

public class Innerclasses {
	static class a{
		String name;

		public a(String name) {
			this.name = name;
		}
	}
	
	//with innerclass reference..
	/*public static void main(String[] args) {
		Innerclasses in=new Innerclasses();
		a hari=in.new a("harish");
		a hars=in.new a("Harsha");
		
		System.out.println(hari.name);
		System.out.println(hars.name);
	}*/
	
	//static class a
	public static void main(String[] args) {
		a hari=new a("harish");
		a hars=new a("Harsha");
		
		System.out.println(hari.name);
		System.out.println(hars.name);
	}
}

