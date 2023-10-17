/*how to find odd and even no.?
if no. is divisible by 2 , we print nu as even. Else we print num is odd.*/
import java.util.Scanner;//input from user at runtime
public class OddEven 
{ 
	public static void main(String[] args)
	{
		System.out.print("enter a value");
		Scanner sc=new Scanner(System.in);
		  //int a=20;	
		int num=sc.nextInt();
		if(num%2==0) //check condition
		{
			System.out.println(num+"_is even number");
		}
		else
		{
			System.out.println(num+"_is odd number");
		}
	}
}
