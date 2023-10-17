package G1_collection_List;

//java collection is a framework and set of the pre-defined classes,interfaces.
//Stack(class) LIFO example
import java.util.*;
public class D_Stack
{

	public static void main(String[] args)
	{
		Stack<String> obj=new Stack<>();
		obj.push("akshay");//push() means add element
		obj.push("rahul");
		obj.push("sachin");
		obj.push("akash");
		System.out.println(obj);
		System.out.println(obj.peek());//top position element in the stack 
		obj.pop();      //pop() means delete elements but last element
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		
		
	}

}
