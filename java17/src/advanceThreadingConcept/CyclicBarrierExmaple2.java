package advanceThreadingConcept;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  CyclicBarrierExmaple2{
public static void main(String[] args) throws Exception  {
	Runnable action=()->{
		System.out.println("car started");
		
	};
	
	CyclicBarrier car=new CyclicBarrier(4,action);

Runnable passenger=()->{
	System.out.println(Thread.currentThread().getName()+" reached");
	try {
		car.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (BrokenBarrierException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
};
ExecutorService service = Executors.newFixedThreadPool(10);

	for(int i=1;i<=4;i++) {
		service.submit(passenger);
	}
	Thread.sleep(5000);
car.reset();
for (int i = 1; i <= 4; i++) {
    service.submit(passenger);
}
service.shutdown();
}
}
