package G2_collection_Set;

//linked hash set 
import java.util.*;

public class B_LinkedHash_Set {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> obj = new LinkedHashSet<>();
		
		obj.add(40);
		obj.add(10);
		obj.add(20);
		System.out.println(obj);
		obj.remove(40);
		System.out.println(obj);
		System.out.println(obj.contains(21));// checkd elements present are not.
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		obj.clear();
		System.out.println(obj);
		
	}

}
