package introPrograms;

public interface IStack<E> {
	void push(E data);
	E pop();
	E peek();
	boolean IsEmpty();
	int size();
	void display();
}
