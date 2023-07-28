

package Annotations;

public class DeprecatedAnnotation {
	@Deprecated(forRemoval = true,since = "1.8")
	public static void doing() {
		System.out.println("Doing anotation practice");
	}
	
	public static void main(String[] args) {
		DeprecatedAnnotation.doing();
		
		//above we can see the doing is striked of because it is not recommeded to use..
	}
}




