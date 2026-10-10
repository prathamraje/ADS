package collections.queue;

public class Program {

	public static void main(String[] args) {

		CircularQueue<Integer> circularqueue = new CircularQueue<>(10);
		
		circularqueue.enqueue(10);
		
		circularqueue.enqueue(20);
		circularqueue.display();
		System.out.println(circularqueue.size());
		circularqueue.dequeue();
		circularqueue.dequeue();
		circularqueue.display();
		
		System.out.println(circularqueue.isEmpty());
		
		circularqueue.size();

	}

}
