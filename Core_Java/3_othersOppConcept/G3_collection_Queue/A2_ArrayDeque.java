package G3_collection_Queue;
import java.util.*;
//java collection is a framework and set of the pre-defined classes,interfaces.
//ArrayQue FIFO example


public class A2_ArrayDeque
{

	public static void main(String[] args) 
	{

		
		ArrayDeque<String> obj=new ArrayDeque<>();
		obj.add("akshay");
		obj.add("lokesh");
		obj.add("yash");
		obj.add("vivek");
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
		
	}

}
