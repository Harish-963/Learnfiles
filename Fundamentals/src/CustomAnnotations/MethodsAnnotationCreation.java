package CustomAnnotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodsAnnotationCreation {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Cat mycat = new Cat("leone");

		for (Method method : mycat.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(RunImmediately.class)) {
				RunImmediately rn = method.getAnnotation(RunImmediately.class);
				for (int i = 0; i < rn.count(); i++) {
					method.invoke(mycat);
				}
			}
		}
		
		
		//get string 
		for(Field field:mycat.getClass().getDeclaredFields())
		{
			if(field.isAnnotationPresent(ImportantStrings.class))
			{
				Object objectvalue = field.get(mycat);
				if(objectvalue instanceof String stringvalue)
				{
					System.out.println(stringvalue);
				}
			}
		}

	}

}
