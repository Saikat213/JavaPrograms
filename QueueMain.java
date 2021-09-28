package introPrograms;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QueueOperations<Integer> queueOperations = new QueueOperations<Integer>();
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter 1 to add items in Queue\nEnter 2 to display\nEnter 3 to remove data\n"
				+ "Enter 4 to check queue is empty\nEnter 5 to get total size\nEnter 6 to exit\nEnter choice: ");
			int ch = scanner.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter number: ");
				int number = scanner.nextInt();
				queueOperations.enqueue(number);
				break;
				
			case 2:
				queueOperations.display();
				break;
				
			case 3:
				System.out.println("data removed: "+queueOperations.dequeue());
				break;
				
			case 4:
				System.out.println(queueOperations.IsEmpty());
				break;
				
			case 5:
				System.out.println("Size of Queue: "+queueOperations.size());
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
