package multiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadTest {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	CallableThread adderThread=new CallableThread();
	ExecutorService service = Executors.newFixedThreadPool(1);
	Future<Integer> future = service.submit(adderThread);
	System.out.println(future.get());
	service.shutdown();
	
}
}
