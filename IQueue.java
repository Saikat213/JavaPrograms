package introPrograms;

public interface IQueue<E> {
	void enqueue(E data);
	E dequeue();
	boolean IsEmpty();
	int size();
}
