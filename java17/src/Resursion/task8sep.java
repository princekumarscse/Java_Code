package Resursion;

public class task8sep {
	public static int fun(int n) {
		if(n==0)
			return 0;
		else {
			return 1 + fun(n/2);
			
		}
		
	}
	public static void fun2(int n) {
		if(n==0) {
			return ; 
		}
		fun2(n/2);
		System.out.println(n%2);
	}
	public static void main(String[] args) {
		
		System.out.println(fun(16));
	}

}
