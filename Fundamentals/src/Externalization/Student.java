package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Student implements Externalizable {
	private static final long serialVersionUID = 99L;
	int age;
	String name;
	Double weight;
	int roll_no;
	int marks;

	public Student() {
	}

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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(age);
		out.writeObject(name);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		age = in.readInt();
		name = (String) in.readObject();

	}

}
