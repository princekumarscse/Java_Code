package weekly_problems;

public class Q9 {
	public static void repetitionSolve(int[] arr) {
		int n=arr.length;
		int found=1;
		
		for(int i=0; i<n;i++) {
			if(arr[i] == found) {
				
				System.out.print(found + " ,");
				found++;
			}
//			else
//			{
//				System.out.println(0);
//			}
//			found++;
			 while (i < n && arr[i] == found) {
		            i++;
		        }
		        if (i < n) {
		            System.out.print("0 ");
		        }
			
		}
	}
	public static void main(String[] args) {
		int[] array= {2, 3, 2, 3, 5};
		repetitionSolve(array);
		
	}

}
 