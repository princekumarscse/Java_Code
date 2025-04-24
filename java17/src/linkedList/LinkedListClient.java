package linkedList;

import linkedList.SinglyLinkedList.Node;

public class LinkedListClient {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addFirst(10);
		list.addLast(60);
		list.addMid(2,250);
		list.addLast(100); 
		 
		list.print();
		System.out.println(" "+ list.size());
		
		list.printReverse();
		
//		list.deleteByData(100);
//		
//		System.out.println("-----------------");
//		list.print();
//		System.out.println(" "+ list.size());

	}

}
