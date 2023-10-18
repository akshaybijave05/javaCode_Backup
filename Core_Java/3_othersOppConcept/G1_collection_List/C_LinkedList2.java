package G1_collection_List;

import java.util.LinkedList;

//java collection is a framework and set of the pre-defined classes,interfaces.
//doubly linked list form stored the data
//Linked List by using for each loop because one var hold the multiple values

public class C_LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("akshay");
		obj.add("akash");
		obj.add("kartike");
		System.out.println(obj);

		for (String str : obj) // a var. hold multiple values so used for each loop
		{
			System.out.println(str);
		}
	}

}