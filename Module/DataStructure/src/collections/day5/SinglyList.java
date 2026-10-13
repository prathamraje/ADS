package collections.day5;

public class SinglyList implements List {
	public static class Node {
		public int data;
		public Node next;
	}

	private Node head;
	private Node tail;

	public SinglyList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = head;
		head = newNode;

		if (tail == null) {
			tail = head;
		}
	}

	@Override
	public void addAtEnd(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if (head == null) {
			// TODO: Throw exception.
			return 0;
		}

		Node temp = head;
		head = head.next;

		if (head == null) {
			tail = null;
		}

		return temp.data;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	@Override
	public void addAtPosition(int position, int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			return;
		}

		int i = 0; // To tell us the position of current node.
		Node current = head;
		Node previous = null;
		while (current != null) {
			if (i == position) {
				break;
			}
			i = i + 1;
			previous = current;
			current = current.next;
		}

		if (current == null) {
			return;
		}

		if (previous == null) {
			// if i == 0
			// if position == 0
			// if current == head
			newNode.next = head;
			head = newNode;
			return;
		}

		previous.next = newNode;
		newNode.next = current;
	}

@Override
	public void delete(int element) {
	if(head == null) return;
    if(head.data== element) {
    	head=head.next;
    	return;
    }	
      Node current =head;
     while(current.next != null) {
	  
	  
	  if(current.next.data== element) {
		  
		  current.next=current.next.next;
		  return;
	  }
	  current=current.next;
  }

}

	@Override
    public boolean deleteAll(int element) {
        boolean isDeleted = false;
        

        while (head != null && head.data == element) {
            head = head.next;
            isDeleted = true;
        }
        
      
        if (head == null) {
            return isDeleted;
        }
        
       
        Node current = head.next;
        Node previous = head;
        
        while (current != null) {
            if (current.data == element) {
                previous.next = current.next; 
                isDeleted = true;
            } else {
                previous = current; 
            }
            current = current.next;
        }
        
        return isDeleted;
    }

	@Override
    public boolean search(int element) {
        Node current = head;
        
       
        while (current != null) {
            if (current.data == element) {
                return true; 
            }
            current = current.next;
        }
        
        return false; 
    }

	@Override
	public void printBackwards() {
		// Not supported for Singly Linked List.
		// OR TODO: throw exception like NotSupported.
	}
}

