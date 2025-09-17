package Array;        
   
public class MaxElement {   
      
	public static void main(String[] args) { 
 
		int[] array= {170,5,4,50,80,10,90,30};        
		     
		int max=array[0];        
		int min=array[0];         
		
		for(int i=0; i<array.length ;i++) {
		 	
			if(max < array[i]) {
				max=array[i];  
			}  
			if(min > array[i])
			{
				min= array[i];
			}
			
		}
		System.out.println("Max : "+ max);
		System.out.println("Min : "+ min);
		
		

		
		
	}

}
