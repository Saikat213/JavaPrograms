package introPrograms;

class QueueNode<E> {
	E data;
	Node<E> nextAddress;

	public QueueNode(E item) {
		data = item;
		nextAddress = null;
	}
}

public class QueueOperations<E> implements IQueue<E> {
	Node<E> head;

	public void enqueue(E item) {
		Node<E> queue = new Node<E>(item);

		if (head == null)
			head = queue;
		else {
			Node<E> temp = head;
			while (temp.nextAddress != null)
				temp = temp.nextAddress;
			temp.nextAddress = queue;
		}
	}
	
	public E dequeue() {
		Node<E> temp = head;
		head = head.nextAddress;
		return temp.data;
	}

	public boolean IsEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public int size() {
		Node<E> temp = head;
		int count = 0;
		while (temp.nextAddress != null) {
			count++;
			temp = temp.nextAddress;
		}
		return ++count;
	}

	public void display() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextAddress;
		}
	}

}
