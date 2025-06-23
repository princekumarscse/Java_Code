package Array;

public class ReverseArray {

	public static void reverse(int[] a,int n ) {
		int left=0; 
		int right=n-1;
		
		while(left <= right) {
			
			int temp=a[left];
			a[left]=a[right];
			a[right]=a[left];
			left++;
			right--;
		}
		//print
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void extreamPrint(int[] arr,int n) {
		
		int left=0;
		int right=n-1;
		while(left <= right) {
			if(left == right) {
				System.out.println(arr[left]);
			}
			else {
			System.out.print(arr[left]+" ");
			System.out.print(arr[right]+" ");
			}
			left++;
			right--;
		}
	}
	

	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60,70,80,90};
		int n=array.length;
		 //reverse(array,n);
		 extreamPrint(array,n);
		
		
	}

}
