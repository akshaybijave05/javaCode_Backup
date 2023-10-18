package G2_collection_Set;

//hashSet example
import java.util.*;

public class A_Hash_set2 {

	public static void main(String[] args) {
		
		HashSet<Double> nms = new HashSet<>();
		
		nms.add(14.14);
		nms.add(12.222);// order not preserved
		nms.add(34.1234);
		nms.add((2354.234));
		nms.add(99.99);
		nms.add(99.99);// dublicate value not allowed
		System.out.println(nms);

		
		// treeset used _basically tree set element dedefault sorted
		System.out.println("tree Set_________________________________________");
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		System.out.println(tset);// order sorted
	}

}
