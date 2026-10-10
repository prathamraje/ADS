package collections.queue;

public interface Queue<T> {
	
	public void enqueue(T element);
	public T dequeue();
	public boolean isFull();
	public boolean isEmpty();
	
	public int size();
	void display();

}
