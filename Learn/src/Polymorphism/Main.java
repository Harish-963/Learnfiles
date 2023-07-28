package Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes shape=new Shapes();
		Shapes square=new Square();
		Shapes circle = new Circle();
		Shapes triangle=new Triangle();
		
		shape.area();
		square.area();
		circle.area();
		triangle.area();
		
	}

}
