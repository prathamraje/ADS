package collections.binarytree;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();  
		int choice = 0;
		
		do {
			
			System.out.println("1. Insert Element ");
			System.out.println("2. Disply Tree");
			System.out.println("3. Count No of Elements ");
			System.out.println("4. Prints leaf nodes");
			System.out.println("5. Search Element");
			
			System.out.println("Enter Your Choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter element to insert: ");
                int element = sc.nextInt();
              tree.insertElement(element, sc);
               break;
			case 2:
				System.out.println("1. Print using Preorder");
				System.out.println("2. Print using Inorder ");
				System.out.println("3. Print using Postorder");
				int input = sc.nextInt();
				if(input == 1) {
					tree.printUsingPreorder(tree.root);
               	}else if(input == 2) {
               		tree.printUsingInorder(tree.root);
               	}else {
               		tree.printUsingPostorder(tree.root);
               	}
				break;
			
			case 3:{
				int count = tree.CountNodes(tree.root);
				System.out.println("Count "+count);
			}
				break;
				
			case 4:{
				int count = tree.CountLeafNodes(tree.root);
				System.out.println("Leaf Node count "+count);
			}
				
				break;
			case 5:{
				System.out.println("Enter the value to count ");
				int value = sc.nextInt();
				int count = tree.CountNodesWithValue(tree.root, value);
				System.out.println("count " + count);
				
			}
				break;
			
			
			}
			
		}while(choice!=5);
		
		
	}

}
