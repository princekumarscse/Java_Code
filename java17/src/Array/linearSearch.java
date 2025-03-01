package Array;

public class linearSearch {
	public static boolean linearSearch(int[] arr,int t,int s ) {
		
		for(int i=0; i<s;i++) {
			if(arr[i]== t) {
				//found
				return true;
				
			}
		}
		//not found 
		return false;
		
		
	}
	public static void main(String[] args) {
		
		int[] arr= {4,8,6,7,5,10,15,1,26};
		int target=25;
		int n=arr.length;
		
		boolean ans= linearSearch(arr,target,n);
		
		if( ans == true ) {
			System.out.println("Target Hit..");
		}
		else {
			System.out.println("Target Miss...");
		}
		
	}

}
