package G3_collection_Queue;
import java.util.*;
//priority queue used and priority queue heap data structure implement.
//min heap to max heap operaction converted


public class C2_PriorityQueue

{

	public static void main(String[] args) 
	{
	  Queue<Integer>obj=new PriorityQueue<>(Comparator.reverseOrder());
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
