package collections.binarysearchtree;

public class BinarySearchTree {

	private BT root;

	public BinarySearchTree() {
		root = null;
	}

	// insert element

	public void insert(int element) {
		BT newNode = new BT(element);

		if (root == null) {
			root = newNode;
			return;
		}

		BT current = root;
		while (current != null) {
			if (current.data == element) {
				return;
			}

			if (current.data > element) {
				if (current.leftChild == null) {
					current.leftChild = newNode;
					return;
				}
				current = current.leftChild;
			}

			if (current.data < element) {
				if (current.rightChild == null) {
					current.rightChild = newNode;
					return;
				}
				current = current.rightChild;
			}
		}
	}

	// Searching
	public boolean search(int element) {
		if (root == null)
			return false;

		BT current = root;
		while (current != null) {
			if (current.data == element) {
				return true;
			}

			if (element < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		return false;
	}

	// print
	public void printUsingInorder(BT root) {
		if (root == null)
			return;

		printUsingInorder(root.leftChild);
		System.out.println(root.data);
		printUsingInorder(root.rightChild);

	}

	public void printUsingInorder() {
		printUsingInorder(root);
	}

	// height of tree
	public int heightTree(BT root) {

		if (root == null)
			return 0;
		int leftheight = heightTree(root.leftChild);
		int rightheight = heightTree(root.rightChild);

		return 1 + Math.max(leftheight, rightheight);
	}

	public int printHeight() {
		return heightTree(root) - 1;
	}

	// smallest element in bst

	public int smallestElement(BT root) {
		if (root == null)
			return 0;

		if (root.leftChild == null)
			return root.data;

		return smallestElement(root.leftChild);
	}

	public int printSmallest() {
		return smallestElement(root);

	}

	// highest element in bst
	public int highestElement(BT root) {

		if (root == null)
			return 0;
		if (root.rightChild == null)
			return root.data;

		return highestElement(root.rightChild);
	}

	public int printHighest() {

		return highestElement(root);
	}
	// Delete Node

	public boolean delete(int element) {
		if (element == deletenode(root, element).data) {
			return true;
		}
		return false;
	}

	public BT deletenode(BT root, int element) {
		if (root == null) {
			return null;
		}

		if (element < root.data) {
			root.leftChild = deletenode(root.leftChild, element);
		} else if (element > root.data) {
			root.rightChild = deletenode(root.rightChild, element);
		} else {

			if (root.leftChild == null) {
				return root.rightChild;
			} else if (root.rightChild == null) {
				return root.leftChild;
			}

			root.data = findMin(root.rightChild);

			root.rightChild = deletenode(root.rightChild, root.data);
		}

		return root;
	}

	// Helper method
	private int findMin(BT root) {
		int minValue = root.data;
		while (root.leftChild != null) {
			minValue = root.leftChild.data;
			root = root.leftChild;
		}
		return minValue;
	}

}
