package multiThreading;

public class RunnableDemo {
public static void main(String[] args) {
	EvenThread1 evenThread1=new EvenThread1();
	OddThread1 oddThread1=new OddThread1();
	Thread t1=new Thread(oddThread1, "OddThread1");
	Thread t2=new Thread(evenThread1, "EvenThread1");
	t1.start();
	t2.start();
}
}
