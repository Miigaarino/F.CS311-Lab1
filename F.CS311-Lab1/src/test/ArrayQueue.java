package test;

import java.util.Scanner;

public class ArrayQueue<T> implements Queue<T> {

	private final int DEFAULT_CAPACITY = 100;
	   private int tugsgul;
	   private T[] queue; 

	   @SuppressWarnings("unchecked")
	public ArrayQueue()
	   {
	      tugsgul = 0;
	      queue = (T[])(new Object[DEFAULT_CAPACITY]);
	   }

	   @SuppressWarnings("unchecked")
	public ArrayQueue (int initialCapacity)
	   {
	      tugsgul = 0;
	      queue = (T[])(new Object[initialCapacity]);
	   }

	   public void add (T element)
	   {
	      queue[tugsgul] = element;
	      tugsgul++;
	   }

	   public T dequeue()
	   {

	      T result = queue[0];

	      tugsgul--;

	      for (int scan=0; scan < tugsgul; scan++)
	         queue[scan] = queue[scan+1];

	      queue[tugsgul] = null;
	 
	      return result;
	   }
	   
	   public T first()
	   {
	       return queue[0];
	}

	   public boolean isEmpty()
	   {
	       return tugsgul == 0;
	}
	 
	   public int size()
	   {
	          return tugsgul;
	}

	   public String toString()
	   {
	       String result = "";
	       for(int k = 0; k < tugsgul; k++)
	       {
	           result += queue[k] + "\n";
	        }
	       return result; 
	}
 
	public static void main(String[] args) {
		
		ArrayQueue<Integer> q = new ArrayQueue<>();
	      boolean exit = false;
			String garaasAvahUtga;
			
			Scanner scan = new Scanner(System.in);
	        System.out.println("Heden too oruulha bicheed, toonuuda oruulna uu: ");
	        int z = scan.nextInt();
	        for(int x=0;x<z;x++) {
	        	q.add(scan.nextInt());
	        }
	        zaavar();
	        
	        try {
				while(exit == false) {
				
				System.out.print("\nUgugduluu bichne uu!: ");
				garaasAvahUtga = scan.next();
				
				
				
				switch(garaasAvahUtga) {
				case "FirstElement": System.out.println(q.first());
					break;
				case "HoosonEseh": System.out.println(q.isEmpty());
					break;
				case "AddElement":
					System.out.println("Heden too nemhee bicheed, toonuuda oruulna uu: ");
			        int y = scan.nextInt();
			        for(int x=0;x<y;x++) {
			        	q.add(scan.nextInt());
			        }
			        System.out.println("Elementuud amjilttai nemegdlee.");
					break;
				case "SizeHarah": 
					System.out.println("Queue-iin hemjee: ");
					System.out.println(q.size());
					break;
				case "RemoveElement": 
					System.out.println(q.dequeue());
					System.out.println("\nFIFO-iin daguu ehnii  element ustagdlaa.");
					break;
				case "QueueHarah": 
					System.out.println("Odoogiin queue: ");
					System.out.println(q.toString());
					break;
				}
				
			}
			}catch(Exception e) {
				System.out.println(e);
				}
		 
	}
	public static void zaavar() {
		System.out.println("         Zaavar           ");
		System.out.println("    <keywords> : <zaavar>\n");
		System.out.println(" FirstElement  :  ehnii elementiig haruulah");
		System.out.println(" HoosonEseh    :  hooson eshiig harah");
		System.out.println(" AddElement    :  element nemeh");
		System.out.println(" RemoveElement :  ehnii element ustgah");
		System.out.println(" QueueHarah    :  queue harah");
		System.out.println(" SizeHarah     :  queue-iin hemjee harah");
	}
}
