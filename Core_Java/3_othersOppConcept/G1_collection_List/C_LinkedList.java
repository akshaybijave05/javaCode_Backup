package G1_collection_List;

//java collection is a framework and set of the pre-defined classes,interfaces.
//create linked list & linkedList from adding a data element doubly linked list form stored the data.
//Linked List(class) example
import java.util.*;

public class C_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("akshay"); // linked list add elements
		obj.add("roshan");
		obj.add("sandip");// narmaly last position add element
		System.out.println(obj);
		obj.remove();// remove elements
		System.out.println(obj);
		obj.addFirst("rupesh");// first position add element.
		System.out.println(obj);
		obj.addLast("sonone"); // last position add element.
		System.out.println(obj);
		obj.add(1, "kartike"); // selected position add elssssement.
		System.out.println(obj);
		// obj.remove(); //remove always first element
		obj.removeFirst();// first position remove
		obj.removeLast();// last position remove
		obj.remove(1);// specific position remove element
		System.out.println(obj);

	}

}
