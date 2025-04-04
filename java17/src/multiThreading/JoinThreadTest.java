package multiThreading;
//If there are 2 threads Kartik and Prince, if we call Kartik.join() means Kartik is saying 
//Prince wait till I(Kartik) complete my task.
public class JoinThreadTest {
public static void main(String[] args) throws InterruptedException {
	JoinThread joinThread=new JoinThread();
	joinThread.start();
	joinThread.join();//means join thread will execute its task and main thread will wait
	String name = Thread.currentThread().getName();
	if("main".equalsIgnoreCase(name)) {
		System.out.println("Current thread "+name);
		//Thread.currentThread().join(1000);
		//Thread.sleep(1000);
		for(int i=1;i<=50;i++) {
			System.out.println("I am main thread");
		}
	}
	
	//joinThread.join();
	
}
}
