package G3_collection_Queue;

import java.util.*;
//link list in queue interface
//performed a fifo  operation

public class B_LinkedList {

	public static void main(String[] args) {
		
		Queue<Integer> obj = new LinkedList();
		
		obj.offer(20); // add element in queue
		obj.offer(40);
		obj.offer(60);
		System.out.println(obj);
		System.out.println(obj.peek());// peek() is return head of the queue.
		obj.poll();// remove element in queue
		System.out.println(obj);

	}

}
