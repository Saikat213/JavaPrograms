package introPrograms;

public class LinkedListOperations {
	int data;
	LinkedListOperations address;

	public LinkedListOperations() {
	}

	public LinkedListOperations(int item) {
		data = item;
		address = null;
	}

	LinkedListOperations head;

	void addNode(int item) {
		LinkedListOperations linkedList = new LinkedListOperations(item);
		if (head == null)
			head = linkedList;
		else {
			LinkedListOperations temp = head;
			while (temp.address != null)
				temp = temp.address;
			temp.address = linkedList;
		}
	}

	void removeNode(int item) {
		LinkedListOperations prev = head, temp = prev.address;
		if (prev.data == item) {
			if (prev.address == null)
				head = null;
			else
				head = head.address;
		}
		while (temp != null) {
			if (temp.data == item) {
				prev.address = temp.address;
				break;
			} else {
				prev = temp;
				temp = temp.address;
			}
		}
	}

	LinkedListOperations searchNode(int item) {
		LinkedListOperations temp = head;
		while (temp != null) {
			if (temp.data == item)
				return temp;
			else
				temp = temp.address;
		}
		System.out.println("Data not found");
		return null;
	}

	void insertNode(int item, int insertAfter) {
		LinkedListOperations temp = searchNode(insertAfter);
		LinkedListOperations linkedList = new LinkedListOperations(item);
		linkedList.address = temp.address;
		temp.address = linkedList;
	}

	void display() {
		LinkedListOperations temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.address;
		}
	}
}
