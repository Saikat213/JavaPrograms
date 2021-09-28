package introPrograms;

class Node<E> {
	E data;
	Node<E> nextAddress;
	
	public Node(E item) {
		data = item;
		nextAddress = null;
	}
}

public class StackOperations<E> implements IStack<E>{
	Node<E> head;
	
		public void push(E item) {
		Node<E> stack = new Node<E>(item);
		
		if (head == null)
			head = stack;
		else {
			Node<E> temp = head;
			while (temp.nextAddress != null)
				temp = temp.nextAddress;
			temp.nextAddress = stack;
		}
	}
	
	public E pop() {
		Node<E> prev = head, temp = prev.nextAddress;
		
		while(temp.nextAddress != null) {
			prev = temp;
			temp = temp.nextAddress;
		}
		prev.nextAddress = null;
		return temp.data;
	}
	
	public E peek() {
		Node<E> temp = head;
		
		while(temp.nextAddress != null) 
			temp = temp.nextAddress;
		return temp.data;
	}
	
	public boolean IsEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	public int size() {
		Node<E> temp = head;
		int count = 0;
		while(temp.nextAddress != null) {
			count++;
			temp = temp.nextAddress;
		}
		return count++;
	}
	
	public void display() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.nextAddress;
		}
	}
}
