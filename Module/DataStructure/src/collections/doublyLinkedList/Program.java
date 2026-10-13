package collections.doublyLinkedList;


public class Program {
	public static void main(String [] args) {
		DoublyLinkedList al = new DoublyLinkedList();
		al.addAtFront(22);
//		al.delete(22);
		System.out.println("-------------");
		
		al.addAtEnd(44);
		al.addAtFront(10);
		al.addAtFront(10);
		al.addAtEnd(50);
		al.addAtFront(88);
		al.print();
		System.out.println("-------------");
		al.delete(10);
		
		al.print();
		System.out.println(al.search(44));
		System.out.println(al.search(66));

	}

}
