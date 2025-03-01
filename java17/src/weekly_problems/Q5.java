package weekly_problems;

public class Q5 {
public static void main(String[] args) {
	//int[] array= {1,2,3,4,5};
	int array[] = {2,4,6,8,10,12,14,16,18,20};
	int n=array.length;
	
	int rot=3;
	int[] temp=new int[rot];
	
	for(int k=0;k<rot; k++) {
		 temp[k]=array[k];
	}
	for(int i=rot;i<n;i++) {
		//array[i]=array[i+1];
		array[i-rot]=array[i];
		}
	for(int j=0; j< rot;j++) {
		//array[j]= temp[j];
		array[n - rot + j]=temp[j];
	}

	System.out.println("Rotation Array :-");
	for(int a=0;a<array.length;a++) {
		System.out.print(array[a]+" ");
	}
	
}
}
