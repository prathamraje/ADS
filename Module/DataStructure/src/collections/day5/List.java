package collections.day5;

public interface List {
	void addAtFront(int element);
	void addAtEnd(int element);
	int deleteFirstNode();
	void addAtPosition(int position,int element);
	void delete(int element);
	boolean deleteAll(int element);
	boolean search(int element);
	boolean isEmpty();
	void print();
	void printBackwards();
}

