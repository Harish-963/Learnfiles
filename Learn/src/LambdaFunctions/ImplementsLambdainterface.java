package LambdaFunctions;

//Lambda expression function used only when the interface contains one abstract method and that is called @FunctionalInterface
//If interface contains more than one abstract method then the abstract methods should be implemented by the class and then in main method we need to create an object for the implemented class and we can call the methods 
@FunctionalInterface
public interface ImplementsLambdainterface {

	int sum(int a, int b);
}
