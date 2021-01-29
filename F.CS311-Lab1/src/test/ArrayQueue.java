package test;

public class ArrayQueue implements Queue {

	int front;         
	int rear;           		
	Object [] queue;
	
	public ArrayQueue(int initialCapacity)
	{
      if (initialCapacity < 1)
	      throw new IllegalArgumentException
	           ("initialCapacity must be >= 1");
      queue = new Object [initialCapacity + 1];
	      // default front = rear = 0
	}
	
	public ArrayQueue()
	{// use default capacity of 10
		this(10);
	}
	
	public Object remove()
	   {
	      if (isEmpty())
	         return null;
	      front = (front + 1) % queue.length;
	      Object frontElement = queue[front];
	      queue[front] = null; 
	      return frontElement;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
