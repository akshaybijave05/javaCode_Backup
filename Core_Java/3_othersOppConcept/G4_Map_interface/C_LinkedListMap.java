package G4_Map_interface;
import java.util.*;
/*LinkedHashMap demo
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
HashMap all method is used to LinkedHasahMap*/


public class C_LinkedListMap
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String>obj=new LinkedHashMap<>();
		obj.put(101,"akshay");
		obj.put(10,"parii");
		obj.put(102,"rupesh");
		obj.put(103,"sana");
		System.out.println(obj);
		obj.remove(10);
		System.out.println(obj);
		
		

	}

}
