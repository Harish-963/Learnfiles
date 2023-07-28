package Accesscontrol2;

import Accesscontrol1.A;

public class B extends A{
	public B(int num, String name) {
		super(num, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		B a= new B(67,"hari");
		System.out.println(a.name+"\t"+a.getNum());
	}
	
}
