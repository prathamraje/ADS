package collections.linkedlist;

public class SinglyLinkedList implements LinkedList {
	
	//node class
	private class Node{
		int data;
		Node next;	
	}
	private Node head;
	
	//constructor
	public SinglyLinkedList() {
		head = null;
	}

	@Override
	public void addFront(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = head;
		head = newNode;
		
	}

	@Override
	public void addEnd(int element) {
		Node newNode = new Node();
		newNode.data = element;
		
		if(head == null ) {
			head = newNode;
			newNode.next=  null;
			return;
		}
		Node temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	@Override
	public int deleteFront() {
		//for empty list
		if(head == null) return 0;
		
		int result = head.data;
		//
		if(head.next == null) {
			head = null;
			return result;
		}
		Node temp = head;
		head = head.next;
		temp.next= null;
		
		return result;
		
	}

	@Override
	public int deleteEnd() {
		//for empty list
		if(head == null) return 0;
		
		//for single node
		if(head.next==null) {
			head = null;
		}
		
		Node current = head;
	
		while(current.next.next != null) {
			current = current.next;
		}
		
		int result = current.data;
		current.next = null;

		return result;
	}

	@Override
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}

}
