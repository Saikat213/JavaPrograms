package introPrograms;

import java.util.Scanner;
public class LinkedMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListOperations linkedListOperations = new LinkedListOperations();
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter 1 to create linkedList\nEnter 2 to display\nEnter 3 to remove data\n"
						+ "Enter 4 to insert new node inbetween\nEnter 5 to exit\nEnter choice: ");
			int ch = scanner.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter number: ");
				int number = scanner.nextInt();
				linkedListOperations.addNode(number);
				break;
				
			case 2:
				linkedListOperations.display();
				break;
				
			case 3:
				System.out.println("Enter data to remove: ");
				int data = scanner.nextInt();
				linkedListOperations.removeNode(data);
				break;
				
			case 4:
				System.out.println("Enter data to insert: ");
				data = scanner.nextInt();
				System.out.println("Enter Position to insert: ");
				int insertAfter = scanner.nextInt();
				linkedListOperations.insertNode(data, insertAfter);
				break;
				
			case 5:
				scanner.close();
				exit = true;
				break;
			}
		}
	}
}
