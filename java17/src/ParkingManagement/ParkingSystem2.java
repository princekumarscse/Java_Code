package ParkingManagement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ParkingSystem2 {

Semaphore car=new Semaphore(10);//10 cars can be parked at max
Runnable entry=()->{

	System.out.println(Thread.currentThread().getName()+" trying to get parking");
			try {
				car.acquire();//If parking is available car will aquire it
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" started parking");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" parked, available slots:"+car.availablePermits());
			car.release(); //Car will moved out of the parking
			
			System.out.println(Thread.currentThread().getName()+" moved out of parking, available slots:"+car.availablePermits());
			
};

public static void main(String[] args) {
	ExecutorService service = Executors.newFixedThreadPool(20);
	ParkingSystem2 p=new ParkingSystem2();
	for(int i=1;i<=20;i++) {
		
		service.submit(p.entry);
	}
	service.shutdown();
}
}
