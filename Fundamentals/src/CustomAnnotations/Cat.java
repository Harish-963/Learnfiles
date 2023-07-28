package CustomAnnotations;

@VeryImportant
public class Cat {
	@ImportantStrings
	String name;
	int age;

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@RunImmediately()
	public void meow() {
		System.out.println("Meow!!");
	}

	public void eat() {
		System.out.println("Munch!");
	}

}
