package deadLockConcept;
//4 necessary conditon for deadlock
//1)Mutual Exclusion
//The resources has to be allocated to only 1 process/Thread or it is freely available.
//There should be 1 to 1 relationship between resource and Process/Thread
//2)No preemption
//it is not allowed to forcfuly preempt the resource from the process/Thread 
//once resource is allocated(1 by 1 execution)
//3)hold and wait
//The process/Thread is holding the resource and waiting on some other resource simultaneously.
//4)Circular wait
//Process/Threads are circulerly waiting on each other for resources
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Student1 have pen and want paper to write whereas student 2 have paper and want pen to write
//they cant take it forcefuly and both dont want to give their resource hence will wait for 
//each other till infinte and program will never terminate this is called deadlock
public class DeadLockCondition {
Object pen=new Object();
Object paper=new Object();
Runnable student1=()->{
	synchronized (pen) {
		System.out.println(Thread.currentThread().getName()+":Student1 got pen and now waitng for paper");
	synchronized (paper) {
		System.out.println(Thread.currentThread().getName()+":Student1 got paper and started writing");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
};
//Runnable student2=()->{
//	synchronized (paper) {
//		System.out.println(Thread.currentThread().getName()+":Student2 got paper and now waitng for pen");
//	synchronized (pen) {
//		System.out.println(Thread.currentThread().getName()+":Student2 got pen and started writing");
//	try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
//	}
//};

//To remove deadlock in circular wait
//change ordering of resource
Runnable student2=()->{
	synchronized (pen) {
		System.out.println(Thread.currentThread().getName()+":Student2 got pen and now waitng for paper");
	synchronized (paper) {
		System.out.println(Thread.currentThread().getName()+":Student2 got paper and started writing");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
};
public static void main(String[] args) {
	ExecutorService service = Executors.newFixedThreadPool(2);
	DeadLockCondition dc=new DeadLockCondition();
	service.submit(dc.student1);
	service.submit(dc.student2);
	service.shutdown();
}
}
