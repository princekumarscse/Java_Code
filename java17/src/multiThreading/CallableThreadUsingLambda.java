package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadUsingLambda {
public static void main(String[] args) throws Exception {
	//public interface Callable<V>
	// V call() throws Exception;
	Callable<Integer> callableThread=()->{
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	};
	ExecutorService service = Executors.newFixedThreadPool(1);
	Future<Integer> future = service.submit(callableThread);
	System.out.println(future.get());
	service.shutdown();
}
}
