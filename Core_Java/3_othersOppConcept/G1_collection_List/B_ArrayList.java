package G1_collection_List;

//arrray list form stored the data(ArrayList is a class )
//ArrayList example

import java.util.*;

public class B_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>(); // pre-defined class
		
		obj.add("akshay"); // predefined method in arrayList class.
		obj.add("abhijit");
		obj.add("aniket");
		obj.add("chandu");
		System.out.println(obj);
		obj.add(1, "rahul"); // array position add string
		System.out.println(obj);
		obj.remove(1);// array position remove
		obj.remove(String.valueOf("akshay"));// this will remove
		System.out.println(obj);
		obj.set(0, "mr.akshay");// array position replace
		System.out.println(obj);
		System.out.println(obj.get(0));// purticular array position print.
		System.out.println(obj.contains("akshay"));// checke present in the arraylist
		obj.clear();// all array list delete or clear.
		System.out.println(obj);

	}

}
