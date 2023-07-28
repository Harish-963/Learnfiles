package MultiThreading;

// using extends Thread class
public class MultiThreadThing extends Thread{

	private int threadNumber;
	public MultiThreadThing(int threadNumber) {
		this.threadNumber=threadNumber;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i + " from thread " +threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

	
}
