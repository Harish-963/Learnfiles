package scalermultithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; ++i 	) {
			NumberPrinter np = new NumberPrinter(i);
//			Thread thread = new Thread(np);
//			thread.start();
			es.execute(np);
		}
	}

}
