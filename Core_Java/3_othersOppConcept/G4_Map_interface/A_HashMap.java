package G4_Map_interface;

//hash_map exapmple
//order not preserved and dupliates not allowed
import java.util.*;

public class A_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> courses = new HashMap<>();// HashMap
		
		
		// adding elements
		courses.put("c", 2000);
		courses.put("cpp", 2500);
		courses.put("python", 3500);
		courses.put("core java", 4000);
		courses.put("core java", 5000);// duplicates not allowed
		System.out.println(courses);
		System.out.println(courses.get("c"));

		
		// traversing
		courses.forEach((key, value) -> {
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
			System.out.println();

		});

	}

}
