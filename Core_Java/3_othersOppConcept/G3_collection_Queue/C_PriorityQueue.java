package G3_collection_Queue;
import java.util.*;
//priority queue used and priority queue heap data structure implement.
//min heap  example and by default priority queue performed min heap operation.


public class C_PriorityQueue
{

	public static void main(String[] args) 
	{
	  Queue<Integer>obj=new PriorityQueue<>();
	  obj.offer(40); //add elements
	  obj.offer(10);
	  obj.offer(30);
	  obj.offer(25);
	  System.out.println(obj);
	  System.out.println(obj.peek());//return head of the queue
	  obj.poll();
	  System.out.println(obj);//remove element
	  
	  
	  
	  
	}

}

