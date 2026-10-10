package collections.stack;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		FixedSizeStack newStack = new FixedSizeStack(10);
		
		try {
			newStack.push(0);
			newStack.push(3);
			newStack.push(6);
			newStack.push(9);
			newStack.push(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(newStack.toString());

	}

}
