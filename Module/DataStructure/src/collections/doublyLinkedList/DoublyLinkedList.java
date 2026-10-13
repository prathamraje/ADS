package collections.doublyLinkedList;

import collections.day5.List;

public class DoublyLinkedList implements List {
	
	class Node {
		int data;
		Node next;
		Node previous;
		
		Node(int element){
			data = element;
			next = null;
			previous = null;	
		}
	}
	
	Node head;
	Node tail;
	
	DoublyLinkedList(){
		head = null;
		tail = null;
	}
	

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}

		newNode.next = head;
		head = newNode;

	}

	@Override
	public void addAtEnd(int element) {
 		Node newNode = new Node(element);
        
 		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;

	}

	@Override
	public int deleteFirstNode() {
		if(head == null )  throw new IllegalStateException("List is Empty");
		Node current = head;
		
		if(head == tail) {
			head = null;
			tail = null;
		}else
		{	
			head = head.next;
			current.next.previous = null;
			current.next = null;
			
		}	
		return current.data;
	}

	//
	@Override
	public void addAtPosition(int position, int element) {
		Node newNode = new Node(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		int i = 0;
		Node current = head;
		while (current != null) {
			if (i == position) {
				break;
			}

			i = i + 1;
			current = current.next;
		}

		if (current == null) {
			return;
		}

		if (current == head) {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
			return;
		}

		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		current.previous = newNode;
	}

	@Override
	public void delete(int element) {
		if(head == null) throw new IllegalStateException("List is Empty");
		Node current = head;
		
		if(head == tail ) {
			head = null;
			tail = null;
			return;
		}
		
		
		while(current != null) {
			if(current.data == element){
				current.previous.next = current.next;
				current.next.previous = current.previous;
				
				current.next = null;
				current.previous = null;
				
				return;
			}
			current= current.next;
		}
		
		

	}

	@Override
	public boolean deleteAll(int element) {
	    if (head == null) {
	        throw new IllegalStateException("List is Empty");
	    }

	    Node current = head;
	    boolean removedAny = false;

	    while (current != null) {
	        if (current.data == element) {
	            Node nextNode = current.next;

	            if (current == head) {
	                head = current.next;
	                if (head != null) {
	                    head.previous = null;
	                }
	            } else {
	                current.previous.next = current.next;
	                if (current.next != null) {
	                    current.next.previous = current.previous;
	                }
	            }

	            if (current == tail) {
	                tail = current.previous;
	            }

	            removedAny = true;
	            current = nextNode;
	        } else {
	            current = current.next;
	        }
	    }

	    return removedAny;
	}


	//to find 
	@Override
	public boolean search(int element) {
		Node current = head;
		
		while(current != null) {
			if(current.data == element) 
				return true;
			
			current = current.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		if(head == null ) throw new IllegalStateException("List is Empty");
		
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}

	}

	@Override
	public void printBackwards() {
		if(tail == null ) throw new IllegalStateException("List is Empty");
		Node current = tail;
		
		while(current != null) {
			System.out.println(current.data + " ");
			current= current.previous;
		}

	}
	

}
