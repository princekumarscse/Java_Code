package linkedList;

public class CircularLinkedListClient {

	public static void main(String[] args) {

		CircularLinkedList list =new CircularLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.print();
		System.out.println(list.isCircularLinkedList());
	}

}
