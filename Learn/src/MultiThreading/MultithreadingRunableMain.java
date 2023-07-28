package MultiThreading;

import java.util.Iterator;

public class MultithreadingRunableMain {

	public static void main(String[] args) {

		
		System.out.println("-------------------------------------------------------------------------------------");
		//// using implements Runnable
		for (int i = 0; i < 3; i++) {
			MultiThreadThingRunable Rthing= new MultiThreadThingRunable(i);
			Thread mythread=new Thread(Rthing);
			mythread.start();
		}
	}

}
