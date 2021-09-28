package introPrograms;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StackOperations<Integer> stackOperations = new StackOperations<Integer>();
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter 1 to add items in Stack\nEnter 2 to display\nEnter 3 to remove data\n"
				+ "Enter 4 to check stack is empty\nEnter 5 to print last element\nEnter 6 to exit\nEnter choice: ");
			int ch = scanner.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter number: ");
				int number = scanner.nextInt();
				stackOperations.push(number);
				break;
				
			case 2:
				stackOperations.display();
				break;
				
			case 3:
				System.out.println("data removed: "+stackOperations.pop());
				break;
				
			case 4:
				System.out.println(stackOperations.IsEmpty());
				break;
				
			case 5:
				System.out.println("Last element in stack: "+stackOperations.peek());
				break;
				
			case 6:
				scanner.close();
				exit = true;
				break;
				
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
