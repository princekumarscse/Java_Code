package lockConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer {
	ReentrantLock lock=new ReentrantLock();
	Condition condition=lock.newCondition();
public void produce() {
	lock.lock();
	try {
		System.out.println(Thread.currentThread().getName()+" Producing an item");
		condition.wait();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}finally {
		lock.unlock();
	}
	System.out.println(Thread.currentThread().getName()+" Producing an item again");
}
public void consume() {
	lock.lock();
	try {
		Thread.sleep(2000);
	System.out.println(Thread.currentThread().getName()+" consuming an item");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		lock.unlock();
	}
	condition.signal();
	condition.signalAll();
}
public static void main(String[] args) {
	ProducerConsumer pc=new ProducerConsumer();
	ExecutorService service = Executors.newFixedThreadPool(2);
	Runnable producer=()->{
		pc.produce();
	};
	Runnable consumer=()->{
		pc.consume();
	};
	service.submit(producer);
	service.submit(consumer);
	service.shutdown();
}
}
