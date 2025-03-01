package Array;

public class ZeroCountInArray {
	public static void main(String[] args) {
		
	
		int[] array= {1,0,0,0,1,1,1,0,1,0,0,1,0};
		int n=array.length;
		int countOne=0;
		int countZero=0;
		
		for(int i=0;i<n;i++) 
		{
			if(array[i]==1) {
				countOne++;
			}
			if(array[i] == 0)
				countZero++;			
		}
		System.out.println("Total One is :"+ countOne);
		System.out.println("Total Zero is :" +countZero);
		
//		for(int i=0;i<n; i++) {
//			if(array[i]<countZero) {
//				System.out.print(0);
//				
//			}
//			if(array[i] > countZero && array[i] <countOne) {
//				System.out.println(1);
//			}
//			
//		}
//		for(int i=0; i<countZero; i++) {
//			System.out.print(0);
//		}
		for(int j=countZero; j< countOne; j++) {
			System.out.println(1);
		}
		
	}//main function
}


