package test;

public class ArrayQueue implements Queue {

	int front;         
	int rear;           		
	Object [] queue;
	
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
