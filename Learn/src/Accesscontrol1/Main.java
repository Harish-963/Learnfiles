package Accesscontrol1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(89,"hari");
		
	
		System.out.println(a.name +"\t"+ a.getNum());
		a.setNum(99);
		System.out.println(a.name +"\t"+ a.getNum());
	}

}
