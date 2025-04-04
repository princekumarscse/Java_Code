package multiThreading;

import java.util.concurrent.Callable;

public class CallableThreadUsingLambda {
public static void main(String[] args) throws Exception {
	//public interface Callable<V>
	// V call() throws Exception;
	Callable<Integer> callableThread=()->{
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	};
	
}
}
