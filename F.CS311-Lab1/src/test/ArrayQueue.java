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
	   
	}
	
	public ArrayQueue()
	{
		this(10);
	}

	public boolean isEmpty()
    {
		return front == rear;
	}


	public Object getFrontElement()
	{
	    if (isEmpty())
	       return null;
	    else
	       return queue[(front + 1) % queue.length];
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
