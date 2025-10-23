package Array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] array = { 170, 5, 4, 85,50, 80, 10, 90, 30,110 };
		
//		int max = array[0]; 
//		int secondMax = array[0];
		
		int max =0;
		int secondMax =0;

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				secondMax= max;
				max = array[i];
			}
			else if(secondMax < array[i] && array[i] < max)
			{
				
				secondMax = array[i];
			}
				

		}
		
//		for(int j=0 ; j< array.length; j++) {
//			
//			if(secondMax < array[j] && array[j]< max) {
//				secondMax = array[j];
//				
//			}
//		}
		System.out.println("max :"+ max);
		System.out.println("Second Max :" + secondMax);
		

	}

}
