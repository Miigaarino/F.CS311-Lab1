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
<<<<<<< HEAD

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
 
=======
	
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
	
>>>>>>> branch 'master' of https://github.com/Miigaarino/F.CS311-Lab1.git
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
