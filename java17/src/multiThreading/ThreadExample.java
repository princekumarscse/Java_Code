package multiThreading;
//Q1)how many ways you can create thread
//Approach 1
//ans)Step1:By extending Thread class
     // Step2:override run method and write your bussiness logic
//Q2)How can you start a thread
//ans)Step1:Create an object of your thread(ThreadExample)
//    Step2:call start method
//Approach 2
//By implementing Runnable Interface
//step 2:override run method
public class ThreadExample extends Thread{
public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("child thread");
		
	}
}
}
