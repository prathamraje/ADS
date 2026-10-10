package collections.queue;

import java.util.NoSuchElementException;

public class CircularQueue<T> implements Queue<T> {
	

	 private final Object []arr;
	 private int front;
	 private int rear;
	 private int size;
	
	
	public CircularQueue(int size) {
        if(size <= 0) {
		throw new IllegalArgumentException();
        }
		arr=new Object[size];
		front=0;
		rear=-1;
	    size=0;	
	}
	
     public void enqueue(T element) {
		if (isFull()) {
			throw new IllegalStateException();
		}
		rear = (rear+1)% arr.length;
		arr[rear] = element;
		size++;
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public T dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();

		}
		T element = (T)arr[front];
		arr[front] = null; 
		front = (front + 1) % arr.length;
		size--;
		if(size==0) {
			front=0;
			rear=-1;
			
		}
		return element;
	}

	@Override
	public boolean isFull() {
		return size == arr.length;
	}

	@Override
	public boolean isEmpty() {	
	return  size==0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[(front + i) % arr.length] + " ");
		}
		System.out.println(); 
		
	}
	
	

}
