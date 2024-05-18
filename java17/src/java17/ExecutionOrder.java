package java17;

public class ExecutionOrder {
	// static variable and static block will get memory at class loading time .
	// static variable will initialize with default value first then get updated
	// with provided value . And this activity will perform by JVM.
	// if you want to access members of the class , first makes sure members will be
	// loaded( get memory) .
	// static members (variable , block ) loading(executation) order , "first come
	// first surve"

	// instance variable and block will get memory when object is created .
	// instance variable will initialize with default value first then get updated
	// with provided value . And this activity will perform by Constructor.
	// instance members (variable , block ) loading(executation) order , "first come
	// first surve"

	static {
		System.out.println("Static Block 3");
	}

	public int a = m2();
	public int b;

	public static int c = m3();
	public static int d;

	public int m1() {
		System.out.println("m1 :" + b);
		return 10;
	}

	public int m2() {
		System.out.println("m2 : " + a);

		return 20;
	}

	public static int m3() {
		System.out.println("m3 : " + c);
		return 30;
	}

	public static int m4() {
		System.out.println("m4 : " + d);
		return 40;
	}

	{
		System.out.println("instance Block 1 : " + a);
	}

	{
		System.out.println("instance Block 2 : " + b);

	}

	static {
		System.out.println("Static Block 1 : " + d);

	}
	static {
		System.out.println("Static Block 2 : " + c);

	}

	public ExecutionOrder() {

		System.out.println("consttructor ");
	}

	public static void main(String[] args) {

		ExecutionOrder exe = new ExecutionOrder();
		System.out.println("main method ");
	}

}
