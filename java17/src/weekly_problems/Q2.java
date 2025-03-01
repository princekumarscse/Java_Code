package weekly_problems;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int[] array=new int[6];
		System.out.println(array.length);
		 Scanner sc = new Scanner(System.in);
		 
		for(int i=0;i<array.length-1;i++) {
			//int num =sc.nextInt();
			System.out.print("Enter Elements "+  (i+1) +" :" );
			array[i] =sc.nextInt();
		}
		
		
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
			
		}
		for(int k=0;k<array.length;k++) {
			if(array[k]==0) {
				array[k]=90;
			}
		}

		
	System.out.println(array.length);
//		System.out.println(array[4]);
	for(int j=0;j<array.length;j++) {
		System.out.println(array[j]);
		
	}
		
		
	}

}
