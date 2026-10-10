package collections.stack;


public class FixedSizeStack implements Stack {

	private int[] stackData;
	private int top;

	public FixedSizeStack(int n) {
		stackData = new int[n];
		top = -1;
	}

	// adding new elements in stack
	public void push(int input) {

		if (isFull())
			throw new ArrayIndexOutOfBoundsException();

		top = top + 1;
		stackData[top] = input;

	}

	// removing the top elements
	@Override
	public int pop() {
		if (isEmpty())
			throw new ArrayIndexOutOfBoundsException();

		int result = stackData[top];
		top = top - 1;
		return result;

	}

	// return stack is full or not
	@Override
	public boolean isFull() {
		if (stackData.length - 1 == top)
			return true;

		return false;
	}

	// return stack is empty or not
	@Override
	public boolean isEmpty() {
		if (top==-1)
			return true;

		return false;
	}
	
	
	//returns top elements
	@Override
	public int peek() {
		if(isEmpty()) throw new ArrayIndexOutOfBoundsException() ;
		
		return stackData[top];
	}
	
	
	//prints stacks
	@Override
	public String toString() {
		StringBuffer st = new StringBuffer();
		
		for(int i = top;i>=0;i--) {
			st.append(" " +stackData[i]);
		}
		
		return st.toString();
		
	}

}
