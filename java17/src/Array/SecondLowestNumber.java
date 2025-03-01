package Array;

public class SecondLowestNumber {
	public static void main(String[] args) {
		
		int[] array = { 1, 5, 4, 85,50, 80, 10, 90, 30,110 };
		
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] < min) {
				secondMin= min;
				min= array[i];
			}
			else if(array[i] < secondMin && array[i] > min)
				{
					secondMin =array[i];
				}
		}
		System.out.println("Lowest Number : "+ min);
		System.out.println("second Lowest :"+ secondMin);

	}//main

}
