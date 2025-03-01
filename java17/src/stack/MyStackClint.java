package stack;

public class MyStackClint {
	public static void main(String[] args) {
		MyStack mst =new MyStack();
		mst.push(10);
		mst.push(20);
		mst.push(30);
		mst.push(40);
		mst.push(50);
		//mst.push(60);
		mst.print();
		mst.pop();
		System.out.println("--------Afetr POP------------");
		mst.print();
		
		System.out.println(" peek : "+mst.peek());
		//mst.print();
		
//		mst.pop();
//		System.out.println("--------Afetr POP------------");
//		mst.print();
//		
//		mst.pop();
//		System.out.println("--------Afetr POP------------");
//		mst.print();
//		
//		mst.pop();
//		System.out.println("--------Afetr POP------------");
//		mst.print();
	}
}
