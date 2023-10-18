package G2_collection_Set;
//hashSet-order not preserved and duplicates values not allowed

//hash set example

import java.util.*;

public class A_Hash_set {

	public static void main(String[] args) {
		
		HashSet<Integer> obj = new HashSet<>();// type safe collection
		
		obj.add(20);
		obj.add(10);
		obj.add(55);
		obj.add(5);
		System.out.println(obj);
		obj.remove(55);// duplicates are not allowed
		System.out.println(obj);
		System.out.println(obj.contains(10));
		System.out.println(obj.isEmpty());// checked values present in the hashSet
		System.out.println(obj.size());
		System.out.println(obj);
		obj.clear();
		System.out.println(obj);

	}

}
