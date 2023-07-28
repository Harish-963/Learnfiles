package MultiThreading;

import java.util.Iterator;

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for  using extends Thread class
		
		for (int j = 0; j < 3; j++) {
			MultiThreadThing Thing=new MultiThreadThing(j);
			Thing.start();
		}
		

	}

}
