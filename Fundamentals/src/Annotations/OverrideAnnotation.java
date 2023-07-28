package Annotations;

public class OverrideAnnotation {

	public void doing() {
		System.out.println("Doing anotation practice");
	}
}

class OverrideAnnotationextends extends OverrideAnnotation {
	@Override
	public void doing(int a)
	// above we are getting error because of The method does override or implement a
	// method declared in a
	// supertype.
	//here by using the Override we get the easy development
	{
		System.out.println("Doing anotation practice");
	}
}
