package MultiThreading;

public class ImplementsRunnable implements Runnable {

	@Override
	public synchronized void run() {
		// Count numbers from 1 to 10..
		for (int i = 1; i <= 10; i++)

		{
			System.out.println("Thread 2 ---- " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
