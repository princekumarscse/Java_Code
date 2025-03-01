package stack;

public class MyStack {
	private int[] arr;
	private int top=-1;
	private int size;
	
	
	public MyStack(){
		arr=new int[5];
	}
	
	public void push(int data) {
		if(size == arr.length) {
			System.out.println("stack overflow | stack is full");
			return;
		}
		arr[size]=data;
		size++;
		top++;
		
	}
	public int pop() {
		if(size == 0) {
			System.out.println("stack is underflow   stack is empty");
			return -1;
		}
		int temp =arr[top];
		size--;
		top--;
		return temp;
		
	}
	public int peek() {
		if (size == 0) {
			System.out.println("stack is underflow | stack is empty");
			return -1;
		}
		return arr[top];
	}
	
	public void print() {
		//for(int i=0; i< size; i++) {
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return top == -1;
			
	}

}
