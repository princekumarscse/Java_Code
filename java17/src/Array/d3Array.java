package Array; 

public class d3Array {
	public static void main(String[] args) {
		
		int[][][] array=new int[4][3][2];
		int count=1;
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[0][0].length);
		//System.out.println(array[0][0][0]);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<2;k++) {
					
					//System.out.print(array[i][j][k]   + " ");
					array[i][j][k]=count++;
					if(array[i][j][k]== 14) {
						array[i][j][k]=140;
					}
					if(array[i][j][k]== 15) {
						array[i][j][k]=150;
					}
				}
				
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<2;k++) {
					
					System.out.print(array[i][j][k]   + " ");
					
				}
				System.out.println(" ");
				
			}
			System.out.println(" ");
		}
	}

}
