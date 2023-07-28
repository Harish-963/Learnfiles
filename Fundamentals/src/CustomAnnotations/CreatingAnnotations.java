package CustomAnnotations;

public class CreatingAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat mycat = new Cat("Jimmy");
		Dog mydog = new Dog("Tommy");
		
		//for check the annotation is applied to the class 
		
		//for applied cat class
		if(mycat.getClass().isAnnotationPresent(VeryImportant.class)){
			System.out.println("This thing is very important");
		}
		else
		{
			System.out.println("This thing is not very important");
		}
		
		
		//for non applied dog class
		if(mydog.getClass().isAnnotationPresent(VeryImportant.class)){
			System.out.println("This thing is very important");
		}
		else
		{
			System.out.println("This thing is not very important");
		}
	}

}
