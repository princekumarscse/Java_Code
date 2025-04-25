package deadLockConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * 
 */
public class Intersection {
private Object roadA=new Object();
private Object roadB=new Object();
public void takeRoadA() {
	synchronized (roadA) {
		System.out.println("road A is locked by Thread "+Thread.currentThread().getName());
		synchronized (roadB) {
			System.out.println("Train is passing through road A");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}
	public void takeRoadB() {
		synchronized (roadA) {
			System.out.println("road A is locked by Thread "+Thread.currentThread().getName());
			synchronized (roadB) {
				System.out.println("Train is passing through road B");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		Intersection intersection=new Intersection();
		Runnable trainA=()->{
			while(true) {
				intersection.takeRoadA();	
			}
			
		};
		Runnable trainB=()->{
			while(true) {
				intersection.takeRoadB();
			}
			
		};
		service.submit(trainA);
		service.submit(trainB);
	}
}
