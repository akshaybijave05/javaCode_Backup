package G4_Map_interface;

import java.util.*;
//Hashtable demo

public class B_HashTable {

	public static void main(String[] args) {
		
		// Hashtable obj=new Hashtable(); default capacity is 11&load factor is 0.75
		Hashtable<Integer, String> obj = new Hashtable<>();
		
		obj.put(101, "akshay");
		obj.put(10, "parii");
		obj.put(102, "pratiksha");
		obj.put(103, "sana");
		obj.put(104, "rupesh");
		System.out.println(obj);
		System.out.println(obj.get(101));
		// obj.remove(101);
		System.out.println(obj.remove(101));
		System.out.println(obj);
		
		System.out.println("====================================================");
		System.out.println(obj.containsKey(102));
		System.out.println(obj.containsValue("parii"));
		System.out.println(obj.isEmpty());
		
		System.out.println("==============================================");
		System.out.println(obj.keySet());
		System.out.println(obj.values());
		
		System.out.println("=====================================");
		for (int k : obj.keySet()) {
			System.out.println(k + obj.get(k));
		}

	}

}
