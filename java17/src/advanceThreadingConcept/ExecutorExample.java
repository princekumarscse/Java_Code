package advanceThreadingConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
public static void main(String[] args) {
	ExecutorService service = Executors.newFixedThreadPool(2);
	Runnable oddThread=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("I am odd Thread");
		}
	};
	Runnable evenThread=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("I am even Thread");
		}
	};
	service.submit(evenThread);
	service.submit(oddThread);
}
}
