package collections.day5;

public class Program {
	public static void testAddAtEitherEnds(List l1) {
		l1.addAtEnd(1);
		l1.addAtFront(5);
		l1.addAtFront(10);
		l1.addAtEnd(2);
		l1.print();
		l1.printBackwards();
	}

	public static void testAddAtPosition(List l1) {
		l1.addAtPosition(0, 10);
		l1.addAtPosition(0, 5);
		l1.addAtPosition(1, 20);
		l1.addAtPosition(1, 15);
		l1.addAtPosition(2, 30);
		l1.print();
		l1.printBackwards();
	}

	public static void main(String[] args) {
//		testAddAtPosition(new SinglyList());
		
		SinglyList l1 = new SinglyList();
		
		l1.addAtPosition(0, 10);
		l1.addAtPosition(0, 5);
		l1.addAtPosition(1, 20);
		l1.addAtPosition(1, 15);
		l1.addAtPosition(2, 30);
		System.out.println("before");
		l1.print();
		l1.delete(10);
		System.out.println("After");
	
		

		l1.print();

		
	
		
		
		
		
	}

}

