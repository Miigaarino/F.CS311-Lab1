package test;

public interface Queue<T>
{
		public void add (T element);
		public T dequeue();
		public T first();
		public boolean isEmpty();
		public int size();
		public String toString();
}
