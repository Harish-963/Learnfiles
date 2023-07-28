package MultiThreading;

public class ExtendingThread extends Thread{
	
@Override
public synchronized void run() {
	//Count numbers from 10 to 1..
	for(int i=10;i>0;i--)
		
	{
		System.out.println("Thread 1 ---- "+ i);
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
