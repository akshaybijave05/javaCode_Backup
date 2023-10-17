package G1_collection_List;
/*Collection(heart of java)--java collection means is a framework and java collection are the set of the
pre-defined classes & interfaces that help programmer to perform different kind of data structure 
operations  like--sorting,searching,traversing*/
//java collection is a framework and set of the pre-defined classes,interfaces.

import java.util.*; //collection in this package means all classes
public class A_collectionBasic
{

	public static void main(String[] args)
	{
		System.out.println("wlcm to code java collection framework");
	
		//type safe collection_same types of elements are added in collection
		ArrayList<String>name=new ArrayList<>();//safe collection defined
		name.add("akshay");
		name.add("parii");
		name.add("pratiksha");
		name.add("rupesh");
		name.add("sana");
		name.add("sana");//duplicates elements allowed
		//name.add(05);  same type element allowed only
		System.out.println(name);
		//remove
		name.remove("sana");
		name.remove(3);
		System.out.println(name);
		//get method
		System.out.println(name.get(0));
		System.out.println(name.get(1));
		//size
		System.out.println(name.size());
		//check item there or not(string equal method call)
		System.out.println(name.contains("akshay"));
		System.out.println(name.contains("bijacve"));
		//empty or not 
		System.out.println(name.isEmpty());
		//setting value
		name.add(0,"naveen");
		System.out.println(name);//replace element
		name.set(0, "akshaa");//old elemrnt remove 
		System.out.println(name)
;		
		
		//type un-safe collection_different types of elemrnts can be added to collection     
		System.out.println("__________________________________________");
		LinkedList names =new LinkedList<>();//unsafe defined         
		names.add("akshay");
		names.add("parii");
		names.add("pratiksha");
		names.add(12.3);// different types of elements allowed
		System.out.println("\n\n"+names);
		names.clear();
		System.out.println(names);
		
		//other collection all elements add/copy other collection
		System.out.println("___________________________________________");
		Vector<String>vector=new Vector<>();
		vector.addAll(names);
		System.out.println("\n"+vector);

	}

}
