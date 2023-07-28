package scalermultithreading;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; ++i 	) {
			NumberPrinter np = new NumberPrinter(i);
			Thread thread = new Thread(np);
			thread.start();
		}
	}

}
