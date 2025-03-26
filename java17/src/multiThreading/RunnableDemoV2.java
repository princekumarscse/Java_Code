package multiThreading;

public class RunnableDemoV2 {
public static void main(String[] args) {
//	public interface Runnable
	//public abstract void run();
	Runnable evenThread=()->{for(int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}};
	Runnable oddThread=()->{for(int i=1;i<=10;i++) {
		if(i%2!=0) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}};
	Thread t1=new Thread(oddThread, "OddThreadV1");
	Thread t2=new Thread(evenThread, "EvenThreadV1");
	t1.start();
	t2.start();
}
}
