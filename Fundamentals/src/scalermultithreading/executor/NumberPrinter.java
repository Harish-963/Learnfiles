package scalermultithreading.executor;

public class NumberPrinter implements Runnable{
	private int number;
	
	
	public NumberPrinter(int number) {
		super();
		this.number = number;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(number+" "+Thread.currentThread().getName());
	}
	

}
