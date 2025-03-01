package weekly_problems;

public class Q6 {
	public static int equilibriumPoint(int[] arr) {
		int n=arr.length;
		
		
		
		for(int i=0; i<n;i++) {
			//left sum
			int leftSum=0;
			for(int j=0; j<i; j++) {
				leftSum=leftSum+arr[j];
			}
			int rightSum=0;
			for(int k=i+1;k<n;k++) {
				rightSum=rightSum+arr[k];
			}
			if(leftSum == rightSum)
				return i+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		//int[] array= {1, 3, 5, 2, 2};
		//int array[] = {1};
		int array[]= {1,2,3};
		
		System.out.println(equilibriumPoint(array));
	}

}
