package multiThreading;
/*
 * any fool can write code that machine can understand
 * but a good programer writes code which human can understand
 * and i am a gadhi
 * */
public class ThreadDemo {
public static void main(String[] args) {
	EvenThread evenThread=new EvenThread();
	evenThread.setName("EvenThread");
	OddThread oddThread=new OddThread();
	oddThread.setName("OddThread");
	evenThread.start();
	oddThread.start();
}
}
