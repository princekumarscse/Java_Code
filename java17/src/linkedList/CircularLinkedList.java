package linkedList;

public class CircularLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	
		class Node{
			
		private int data;
		private Node next;
		
		
		public Node(int data, Node next ){
			super();
			this.data=data;
			this.next=next;	
		}
	}//class Node has end.
		
		public void add(int data) {
			Node node =new Node(data,null);
			if( head== null) {
				head= node;
				tail=node;
				tail.next=head;
				size++;
			}
				else {
					tail.next=node;
					tail=node;
					tail.next= head;
					size++;			
				}
			}
		public void delete(int pos,int data) {
			Node temp= head;
			
			 
		}
		
		
		public void print() {
			Node temp =head;
			while(temp!=tail){
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
		public boolean isCircularLinkedList() {
			return head == tail.next;
		}

}
