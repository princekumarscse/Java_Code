package synchronization;
//the program under execution is called process
public class SynchronizationConcept {
public void m1() {
	System.out.println("m1 method");
}
public synchronized void m2() {
	System.out.println("m2 method");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public synchronized void m3() {
	System.out.println("m3 method");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static synchronized void m4() {
	System.out.println("m4 method");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static synchronized void m5() {
	System.out.println("m5 method");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void m6() {
	System.out.println("m6 method");
}
}
