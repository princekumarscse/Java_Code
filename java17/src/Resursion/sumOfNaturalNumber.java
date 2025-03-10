package Resursion;

public class sumOfNaturalNumber {
	public static void sum(int n) {
	
//		if( n<=0)
//			return 1;
//		return n +sum(n-1);
//		
		if(n==0)
			return  ;
//		System.out.println(n);
//		sum(n-1);
//		System.out.println(n);
		sum(n-1);
		System.out.println(n);
		sum(n-1);
		
			
	}
	public static void main(String[] args) {
		
	//System.out.println(sum(5));
		sum(3);
	}

}
