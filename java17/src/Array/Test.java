package Array;

public class Test {
	public static void main(String[] args) {
		
		Student[] array= {
				new Student(610, "Rahul", "Galgotias"),
				new Student(101, "Vineet", "Galgotias"),
				new Student(410, "Somil", "Patliputra"),
				new Student(20, "Nitesh", "Patna"),
				new Student(310, "Amit", "Galgotias"),
				
				
		}; 	 
		int n= array.length;
		//rollNumbre & Name shorting..
		
		//Shorting by Roll Number
		for(int k=0;k<n-1; k++ ) {
			for(int l=0;l<n-1; l++) {
				
				if( array[l].rollNumber > array[l+1].rollNumber) {
					 
					int temp=array[l].rollNumber;
					
					array[l].rollNumber=array[l+1].rollNumber;
					array[l+1].rollNumber= temp;	
				}
			}
		}
		
		// Shorting by Name
		
		
		
		
		for(int i=0; i< array.length; i++)
		{
			//System.out.println(array[i].rollNumber +" "+array[i].name + " " + array[i].college);
			//System.out.println(array[i].toString());
			System.out.println(array[i].rollNumber);
		}
		
	}

}
