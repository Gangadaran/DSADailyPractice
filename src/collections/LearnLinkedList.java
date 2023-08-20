package collections;

public class LearnLinkedList {
	private Node head;
	private Node tail;

	private int size;
	
	public LearnLinkedList() {
		this.size = 0;
	}
	
	public void inserFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		if (tail == null) {
			tail = head;
		}
		
		size++;

	}
	
	public void insertLast(int value) {
		
		if (tail == null) {
			 inserFirst(value);
			 return;
		}
		Node node = new Node(value);
		
		tail.next = node;
		tail = node;
		size++;
		

	}
	
	
	class Node{
		private int value;
		private Node next;
	   public Node(int val) {
		   this.value = val;
	   }
	   
	   public Node(int val, Node next) {
		   this.value = val;
		   this.next = next;
	   }
	}
	
	
	

}
