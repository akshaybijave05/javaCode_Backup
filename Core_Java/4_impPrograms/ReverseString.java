//reverse string 
public class ReverseString {

	public static void main(String[] args) {
		
		String name = "akshay";
		String reverse = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println("original string is_" + name);
		System.out.println("reverse string  is_" + reverse);
	}

}
