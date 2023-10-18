package D_string;

/*string is a pre-defined class in java but we can also use as a datatype.
strings are the sequence of characters and its index starts from 0.*/

public class A_String {

	public static void main(String[] args) {

		String a1 = "akshay";
		String a2 = "AKSHAY";
		String a3 = new String("akshay");
		
		
		// string simple oprations.
		System.out.println(a1.toLowerCase());
		System.out.println(a1.toUpperCase());
		System.out.println(a2.toLowerCase());
		System.out.println(a2.toUpperCase());
		System.out.println(a3);

		if (a1 == a3) // string values same but var name diff.so check var. name this condition
		{
			System.out.println("a1 and a3 both are same");
		} else {
			System.out.println("a1 and a3 are not same");
		}

		if (a1.equals(a3)) // string values same but var name diff.so check var. values this condition
		{
			System.out.println("a1 and a3 both are same");
		} else {
			System.out.println("a1 and a3 are not same");
		}

	}

}
