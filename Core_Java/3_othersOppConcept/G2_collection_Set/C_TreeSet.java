package G2_collection_Set;

//tree set _all elements sorted formed presented operation i means sorting of elements and 
//remove 

import java.util.*;

public class C_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> obj = new TreeSet<>();
		
		obj.add(10);
		obj.add(5);
		obj.add(15);
		obj.add(1);
		obj.add(10);// duplicates are not allowed
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		System.out.println(obj.contains(21));// checked elements present or not
		System.out.println(obj.isEmpty());// checked empty or not
		System.out.println(obj.size());
		obj.clear();
		System.out.println(obj);

	}

}
