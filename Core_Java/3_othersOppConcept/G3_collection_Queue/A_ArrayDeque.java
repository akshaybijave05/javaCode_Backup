package G3_collection_Queue;

import java.util.*;
//array deque is two sides element enter and delete. means LIFo and FIFOc operation performed 

public class A_ArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> obj = new ArrayDeque();
		
		obj.offer(30);
		obj.offer(10);
		System.out.println(obj);
		obj.offerFirst(20);
		obj.offerLast(50);
		System.out.println(obj);

		
		// peek operation means head of the queue
		System.out.println(obj.peek());
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());

		
		// poll operation means delete elements
		System.out.println(obj);
		obj.poll();
		System.out.println(obj);
		obj.pollFirst();
		System.out.println(obj);
		obj.pollLast();
		System.out.println(obj);

	}

}
