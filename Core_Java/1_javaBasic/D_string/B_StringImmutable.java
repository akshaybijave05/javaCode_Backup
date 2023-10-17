package D_string;


//why strings are immutable in java?


public class B_StringImmutable
{

	public static void main(String[] args)
	{

          //declare the two variables and assign the same value to them.
		
		String s1="akshay"; //immutable means cant change
		String s2="akshay";
		String s3="akshay";
		System.out.println(s1);
		s1.concat("bijave");//new String add existing string but cant add new string 
		System.out.println(s1);

		
/*you have to see that same value and 3 different variables.
Java creates objects and stores the heap.
In here it has 3 variables. But java creates one object. 
All the 3 variables are pointed to this object.
one time create memory and cant create others memory location all var.
point to the same memory location*/
 
	
		
	}

}
