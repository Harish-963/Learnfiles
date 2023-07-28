package MultiThreading;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String args[]) throws InterruptedException {
		/*
		 * System.out.println("I am testing the thread..");
		 * System.out.println(Thread.activeCount());
		 * System.out.println(Thread.currentThread().getThreadGroup().getName());
		 * Thread.currentThread().setName("Main Hai");
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println(Thread.currentThread().getPriority());
		 * System.out.println(Thread.currentThread().getState());
		 */
		
		//creating the instance of 1st thread.. extending thread..
		ExtendingThread thread1 = new ExtendingThread();
		//creating the instance of 2nd thread .. implementing the runnable interface
		ImplementsRunnable ir = new ImplementsRunnable();
		Thread thread2 = new Thread(ir);
		
		//run the threads at the same time simaltaneously.
		System.out.println("-------------------------------------------------------------1st");
		System.out.println(thread1.getName());
		System.out.println(thread1.getState());
		System.out.println(thread1.getPriority());
		System.out.println(thread1.getId());
		System.out.println(thread1.isAlive());
		System.out.println(thread1.isInterrupted());
		System.out.println(thread1.getClass());
		System.out.println(thread1.getContextClassLoader());
		System.out.println(Thread.activeCount());
		
		
		System.out.println("-------------------------------------------------------------2nd");
		System.out.println(thread2.getName());
		System.out.println(thread2.getState());
		System.out.println(thread2.getPriority());
		System.out.println(thread2.getId());
		System.out.println(thread2.isAlive());
		System.out.println(thread2.isInterrupted());
		System.out.println(thread2.getClass());
		System.out.println(thread2.getContextClassLoader());
		System.out.println(Thread.activeCount());
		
		
		thread1.start();
//		thread1.join();
		thread2.start();
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		
		System.out.println("--------------------------------------------------------- After 2 threads starts");
		
		System.out.println("-------------------------------------------------------------1st");
		System.out.println(thread1.getName());
		System.out.println("1 state : "+thread1.getState());
		System.out.println(thread1.getPriority());
		System.out.println(thread1.getId());
		System.out.println(thread1.isAlive());
		System.out.println(thread1.isInterrupted());
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println(thread1.getClass());
		System.out.println(thread1.getContextClassLoader());
		System.out.println(Thread.activeCount());
		
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		
		System.out.println("-------------------------------------------------------------2nd");
		System.out.println(thread2.getName());
		System.out.println("2 state : "+thread2.getState());
		System.out.println(thread2.getPriority());
		System.out.println(thread2.getId());
		System.out.println(thread2.isAlive());
		System.out.println(thread2.isInterrupted());
		
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());	System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		System.out.println(thread2.getClass());
		System.out.println(thread2.getContextClassLoader());
		System.out.println(Thread.activeCount());
		
		Thread.sleep(3000);
		System.out.println("1 state : "+thread1.getState());
		System.out.println("2 state : "+thread2.getState());
		
	}
}
