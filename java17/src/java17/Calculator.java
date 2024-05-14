package java17;

public class Calculator {
	 public int addition(int a,int b) {
		return a + b;
	}
	 public int subs(int a, int b)
	 {
		 return a - b;
	 }
	 public int multi(int a, int b)
	 {
		 return a * b;
	 }
	 public int div(int a, int b)
	 {
		 return a / b;
	 }
	 
	 

	public static void main(String[] args) {
		
		Calculator cal =new Calculator();
		
		int ad = cal.addition(4, 5);
		System.out.println("Addition = " +ad );
	}

}
