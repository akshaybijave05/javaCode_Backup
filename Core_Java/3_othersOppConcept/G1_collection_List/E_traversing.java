package G1_collection_List;

//traverse means element one by one operation performed
import java.util.*;

public class E_traversing {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("akshay");
		names.add("rupesh");
		names.add("meenu");
		names.add("komal");
		System.out.println(names);
		
		
		// for-each loop
		for (String str : names) {
			System.out.println(str + "\t" + str.length());
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());

		}
		System.out.println("_____________________________________");
		// traversing using Iterator_forward traversing
		// names.iterator(); stape1
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}

		System.out.println("_____________________________________");
		// backward traversing_ListIterator
		// names.listIterator(); stape1
		ListIterator<String> Litr = names.listIterator(names.size());
		while (Litr.hasPrevious()) {
			String previous = Litr.previous();
			System.out.println(previous);
		}

		System.out.println("for each method____________________________");
		// for each method
		names.forEach(str -> // basically lambla function
		{
			System.out.println(str);
		});

	}

}
