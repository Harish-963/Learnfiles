package MultiThreading;

// using implements Runnable for allowing some class to extends some other class
public class MultiThreadThingRunable implements Runnable{

	private int threadNumber;
	public MultiThreadThingRunable(int threadNumber) {
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
