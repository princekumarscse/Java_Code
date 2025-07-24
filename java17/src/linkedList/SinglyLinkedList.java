package linkedList;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	// Node creation    
	class Node{ 
		private int data;
		private Node next;
		public Node prev;
		
		
		 public Node(int data,Node next){
			 super();
			 this.data =data;
			 this.next=next;
			
		}// Node class and its constructor closed;
			
	}
	//add first Node
	 public void addFirst(int data) {
		 Node node= new Node(data,null);
		 node.next=head;
		 head=node;
		 size++;
	 }
	 public void addLast(int data) {
			Node node = new Node(data, null);
			if (head == null) {// first Node
				head = node;
				size++;
			} else {// Second Node onwards
				Node temp = head;
				// for traveling to the node where last node need to be attached
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = node;
				size++;
			}

		}

	 public void addTail(int data) {
		 Node node= new Node(data,null);
		 if(head== null) {
			 // empty all
			 //step1: create node
			 
			 //step2:single hai to head and tail same hoga
			 head=node;
			 tail=head;
			 size++;
			 
		 }else {
			 //step1: create node
			 //Node node=new Node(data,null);
			 //step2:tail node ko attach karo new node se;
			 tail.next=node;
			 //step3:update tail
			 tail=node;
			 size++;
		 }
		 
	 }
	 public void addMid(int position, int data) {
		 Node node= new Node(data,null);
		 Node temp =head;
		 
		 if(position ==  1) {
			 node.next=head;
			 head=node;
			 size++;
			 return ;
			 
		 }
		 for(int i=1; i<position-1; i++) {
			 temp=temp.next;
		 }
		 node.next=temp.next;
		 temp.next=node;
		 size++;
		 
	 }
	 public void delete( int position) {
		 //Node node= new Node(data);
		 Node temp=head;
		 Node prev= null;
		 
		 if(head==null) {
			 return ;
		 }
		 
		 //delete at head
		 if(position==1) {
			 head=temp.next;
			 size--;
			 return ;
		 }
		 for(int i=1; temp !=null && i< position; i++) {
			 prev=temp;
			 temp=temp.next;
			 
			 
			 
		 }
		 prev.next=temp.next;
		 size--;
		 
		 
	 }
	 public void deleteByData( int val) {
		// Node node= new Node(data);
		 Node temp=head;
		 Node prev= null;
		 
		 if(head==null) {
			 return ;
		 }
		 
		 //delete at head
		 if(temp.data == val) {
			 head=temp.next;
			 size--;
			 return ;
		 }
		 while(temp != null) {
			 if(temp.data== val) {
				 //prev=temp;
				 prev.next=temp.next; 
				 size--;
				 return;
			 }
			 prev=temp;
			 temp=temp.next;
			 
		 }
		 
		 
		 
	 }
	 
	 public void print() {
			//System.out.println(head.data);// Node1
			//System.out.println(head.next.data);// Node2
			Node temp =head;
			while(temp!=null) {
				System.out.print( temp.data + " ->");
				temp=temp.next;
			}
	 }
	 public void printReverse() {
		
		 Node temp =head;
		 Node prev=null;
		 temp.next=prev;
		 while (temp != null && temp.next != null) {
		        temp = temp.next;
		    }

		    // Now temp is at the last node, print in reverse order
		    while (temp!= null) {
		        System.out.print(temp.data + " <- ");
		       
		        temp = temp.prev; // Move to the previous node
		    prev =temp;
		    //temp=next;
		    }
		    System.out.println("null");
		 
	 }
	 
	 public int size() {
			return size;
		}
	

	

	

}
