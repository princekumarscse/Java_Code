package weekly_problems;

public class Q4 {
	public static void bubbleSort(int[] arr ) {
		int n=arr.length;
		for(int i=0; i< n-1; i++) {
			for(int j=0; j< n-i-1;j++) {
				if(arr[j]> arr[j+1] ) {
				 int temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
	}
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println(" ");
	}
	public static int mean(int[] arr ) {
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum/arr.length;
	}
	public static int median(int[] arr) {
		int mid =arr.length/2;
		if(arr.length % 2==0) {
			return (arr[mid] + arr[mid-1])/2;
		}else {
			
			return arr[mid];
		}
		
	}
	public static void main(String[] args) {
		//int[] array= {1, 2, 19, 28, 5};
		int[] array={2, 8, 3, 4}; 
		
		//System.out.println(array.length);
		bubbleSort(array);
		print(array);
		int res=mean(array);
		System.out.println(" Mean :"+ res);
		//print(array);
		System.out.println( "Median : " + median(array));
	}

}
