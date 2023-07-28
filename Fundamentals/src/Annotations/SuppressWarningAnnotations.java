

package Annotations;

public class SuppressWarningAnnotations {
	@SuppressWarnings(value={"unused","finally"})
	//remove a,n in below method and see the a, n are throwing the Warnings.
	public static String doing() {
		
		int a=10;
		String n="100";
		return "Doing anotation practice  divide by zero"+ 5/0;
	}
	public static void main(String[] args) {
		System.out.println(SuppressWarningAnnotations.doing());
		
	
	}
}
/*
 * Values Description All It will suppress all warnings. Cast Suppress the
 * warning while casting from a generic type to a nonqualified type or the other
 * way around. Deprecation Ignores when we’re using a deprecated(no longer
 * important) method or type. divzero Suppresses division by zero warning. empty
 * Ignores warning of a statement with an empty body. unchecked It doesn’t check
 * if the data type is Object or primitive. fallthrough Ignores fall-through on
 * switch statements usually (if “break” is missing). hiding It suppresses
 * warnings relative to locals that hide variable serial It makes the compiler
 * shut up about a missing serialVersionUID. finally Avoids warnings relative to
 * finally block that doesn’t return. unused To suppress warnings relative to
 * unused code.
 */


