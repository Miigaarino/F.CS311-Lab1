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
 	
	public Object getRearElement()
	   {
	      if (isEmpty())
	         return null;
	      else
	         return queue[rear];
	   }
	
	public void put(Object theElement)
	   {
	      if ((rear + 1) % queue.length == front)
	      {
	         Object [] newQueue = new Object [2 * queue.length];
	         int start = (front + 1) % queue.length;
	         if (start < 2)
	            System.arraycopy(queue, start, newQueue, 0,
	                             queue.length - 1);
	         else
	         {
	            System.arraycopy(queue, start, newQueue, 0,
	                             queue.length - start);
	            System.arraycopy(queue, 0, newQueue,
	                             queue.length - start, rear + 1);
	         }
	         front = newQueue.length - 1;
	         rear = queue.length - 2; 
	         queue = newQueue;
	      }

	      rear = (rear + 1) % queue.length;
	      queue[rear] = theElement;
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
		
		int x;
	      ArrayQueue q = new ArrayQueue(3);
	      // add a few elements
	      q.put(new Integer(1));
	      q.put(new Integer(2));
	      q.put(new Integer(3));
	      q.put(new Integer(4));

	      // remove and add to test wraparound array doubling
	      q.remove();
	      q.remove();
	      q.put(new Integer(5));
	      q.put(new Integer(6));
	      q.put(new Integer(7));
	      q.put(new Integer(8));
	      q.put(new Integer(9));
	      q.put(new Integer(10));
	      q.put(new Integer(11));
	      q.put(new Integer(12));

	      // delete all elements
	      while (!q.isEmpty())
	      {
	         System.out.println("Rear element is " + q.getRearElement());
	         System.out.println("Front element is " + q.getFrontElement());
	         System.out.println("Removed the element " + q.remove());
	      }
		 
	}

}
