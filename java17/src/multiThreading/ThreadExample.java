package multiThreading;

public class ThreadExample extends Thread{
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("child thread");
		
	}
}
}
