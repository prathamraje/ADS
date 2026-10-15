package collections.binarysearchtree;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BinarySearchTree bst = new BinarySearchTree();

		int choice = 0;

		do {
			System.out.println("1. Insert Element ");
			System.out.println("2. Display Tree ");
			System.out.println("3. Search Element ");
			System.out.println("4. Height of Tree ");
			System.out.println("5. Smallest element form Tree ");
			System.out.println("6. highest element form Tree");
			System.out.println("7. Delete element using inorder predecessor ");
			System.out.println("8. Exit ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Element to insert");
				int Ins = sc.nextInt();
				bst.insert(Ins);

				break;
			case 2:
				bst.printUsingInorder();
				break;
			case 3:
				System.out.println("enter element to search");
				int ele = sc.nextInt();
				if (bst.search(ele)) {
					System.out.println("Element is Found");
				} else {
					System.out.println("Element not Found");
				}

				break;
			case 4:
				System.out.println(bst.printHeight());
				break;
			case 5:
				System.out.println(bst.printSmallest());
				break;
			case 6:
				System.out.println(bst.printHighest());
			case 7:
				System.out.println("enter element to Delete");
				int data = sc.nextInt();
				System.out.println(bst.delete(data));

				break;
			case 8:
				break;
			default:
				System.out.println("wrong choice");
			}

		} while (choice != 8);

	}

}
