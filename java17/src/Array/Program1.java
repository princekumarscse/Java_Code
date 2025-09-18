package Array;  
 
public class Program1 {  
	public static void print(String s ,int c) { 
		 
		if(c<=0) { 
			return ;   
			}  
		System.out.println(s);   
		c--;
		print(s,c);
	} 
	public static void main(String[] args) {
		//Q1 
		//int[] arr = {1,2,3,4,5,6,7,8,9};
		//Q2 short the elements in ascending order.
		//int[] array= {70,5,4,50,80,10,90,30};
		//Q3find the second largest number.Refer Q2
		//Q4 Find the max element 
		//Q5 Find the min element
		//Q6 Short the elements in descending.
		int n=5;
		print("Prince",n);
		
		
		
	}

}
