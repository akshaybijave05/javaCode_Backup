//check string is palindrome or not
public class PalindromeString 
{

	public static void main(String[] args) 
	{
	 String name="madam";
	 String reverse="";
	 
	 for(int i=name.length()-1;i>=0;i--)
	 {
		reverse=reverse+name.charAt(i);
	 }
     if(name.equals(reverse))
     {
    	System.out.println("String is palindrome");
     }
     else
      {
    	System.out.println("string is not palindrome");
      }
	 }
}
