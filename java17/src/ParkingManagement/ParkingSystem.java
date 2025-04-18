package ParkingManagement;
/**
 * Capacity(flexible) but initial Capacity =10
 * Vehicle types(only 4 wheeler)
 * Parking free
 * Entry and Exit(are 2 gates)
 * Exit no restriction
 * Entry restriction(1 by 1 entry+capacity)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParkingSystem {
//1)Create Parking with initial capacity=10
	private List<Integer> parking=new ArrayList<>();
	private static int capacity=5;

//If someone want to park the car
	//since 1 car can enter at a time we will synchronize it
	//1)check if the parking is full
	//2)if true then wait else park your car
	//3)notify other waiting cars too
	//4)until parking exist check step 1
	
	
	Runnable entry=()->{
		while(true) {
			synchronized (parking) {
				while(parking.size()==capacity) {
					try {
						System.out.println("parking is full please wait");
						parking.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				boolean isAdded = parking.add(1);
				System.out.println("car parked in parking "+isAdded+" remaing slots="+(capacity-parking.size()));
				parking.notify();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
//At exit
	//since 1 car can enter at a time we will synchronize it
	//1)check if car is present
	//2)if true then move it out and notify so that other waiting cars would get chance
	Runnable exit=()->{
		while(true) {
			synchronized (parking) {
				while(parking.isEmpty()) {
					try {
						parking.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				Integer slot = parking.remove(0);
				System.out.println("car moved out of parking slot="+slot+" remaing slots="+(capacity-parking.size()));
				parking.notify();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		}
	};
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		ParkingSystem r=new ParkingSystem();
		service.submit(r.entry);
		service.submit(r.exit);
	}
}
