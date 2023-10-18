package G4_Map_interface;

import java.util.*;

//HashMap example
public class A_HashMap2 {

	public static void main(String[] args) {
		
		// HashMap obj=new HashMap(); different data type allowed
		HashMap<Integer, String> obj = new HashMap<>();
		
		obj.put(5, "akshay"); // add elements
		obj.put(6, "parii");
		obj.put(7, "pratiksha");
		obj.put(1, "pratiksha");
		obj.put(8, "sana");
		obj.put(9, "rupesh");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.get(5));// get key value
		System.out.println(obj.remove(1));// remove key and value
		System.out.println(obj);
		System.out.println(obj.containsKey(5));
		System.out.println(obj.containsKey(1));
		System.out.println(obj.containsValue("parii"));
		System.out.println(obj.isEmpty());
		System.out.println(obj);
		System.out.println(obj.keySet());// return all the key as set
		System.out.println(obj.values());// return all the value as collection
		System.out.println(obj.entrySet());// return all the entries as set
		obj.clear();
		System.out.println(obj);

	}

}
