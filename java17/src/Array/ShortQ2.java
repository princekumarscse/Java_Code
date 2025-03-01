package Array;

public class ShortQ2 extends Program1 {
	public static void main(String[] args) {
		
		int[] array= {100,90,80,70,60,50,40,30,20,10};
		
		int n= array.length;
		//90 80 70 60 50 40 30 20 10 100 
		//80 70 60 50 40 30 20 10 90 100 
		//70 60 50 40 30 20 10 80 90 100 
		//60 50 40 30 20 10 70 80 90 100  
		//50 40 30 20 10 60 70 80 90 100  
		//40 30 20 10 50 60 70 80 90 100  
		//30 20 10 40 50 60 70 80 90 100 
		//20 10 30 40 50 60 70 80 90 100 
		//10 20 30 40 50 60 70 80 90 100 
		//10 20 30 40 50 60 70 80 90 100 
		
		for(int i=0; i<n-1 ; i++)
		{
			for(int j=0 ; j<n-1; j++)
			{
				 if(array[j] > array[j+1])
				 {
					 int temp= array[j];
					 array[j]= array[j+1];
					 array[j+1] = temp;
				 }
			}
		}
		
		for(int i=0; i<array.length ; i++ ) {
			System.out.print( array[i] +" ");
		}
	}

}
