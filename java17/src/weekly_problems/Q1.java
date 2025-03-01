package weekly_problems;
//Q3 is same to same Q1;

public class Q1 {
	public static void main(String[] args) {
		//int[] array = {2,1,2};
		int[] array= {1,2,3,4,4,5,5};
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				secondMax=max;
				max=array[i];
				
			}
			else if(secondMax < array[i] && array[i] < max){
				secondMax = array[i];
			}
		}
		System.out.println("max is :"+ max);
		System.out.println("secondMax  is :"+ secondMax);
		

}
}
