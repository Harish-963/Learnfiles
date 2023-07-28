package serialization_Deserialization;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 99L;
	int age;
	String name;
	Double weight;
	int roll_no;
	int marks;
	public Student(int age, String name, Double weight, int roll_no, int marks) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.roll_no = roll_no;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", weight=" + weight + ", roll_no=" + roll_no + ", marks="
				+ marks + "]";
	}
	
	
}
