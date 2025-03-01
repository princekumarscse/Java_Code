package weekly_problems;

public class Q7 {
	public static void maxAdj(int[] arr ) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int max=0;
			if(arr[i]> arr[i+1] ) {
				max=arr[i];
			}else {
				max=arr[i+1];
			}
			System.out.println("Max of ( "+arr[i]+ " ,"+arr[i+1]+") : " + max);
		}
	}
	public static void main(String[] args) {
		//int[] array={1,2,2,3,4,5};
		int[] array = {5,5};
		maxAdj(array);
	}

}
