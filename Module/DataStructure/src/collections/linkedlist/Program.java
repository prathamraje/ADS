package collections.linkedlist;

public class Program {

	public static void main(String[] args) {
		SinglyLinkedList singlylist = new SinglyLinkedList();
		
		singlylist.addFront(20);
		singlylist.addFront(40);
		singlylist.display();
		System.out.println();
		
		singlylist.addEnd(50);
		singlylist.addEnd(60);
		singlylist.display();
		System.out.println();
		
		singlylist.deleteFront();
		singlylist.deleteFront();
		singlylist.display();
		System.out.println();
		
		singlylist.deleteEnd();
		singlylist.deleteEnd();
		singlylist.display();
		System.out.println();
		
		singlylist.display();
	}

}
