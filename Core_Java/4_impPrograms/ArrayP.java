//r&t 
import java.util.Scanner;
public class ArrayP
{
	public static void main(String[] args)
	{
		int [] a={9,3,12,8};
		System.out.println("enter nth no of position ");
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		if(b<=a.length)
		{
			System.out.println(a[b-1]);
		}
		else
			System.out.println("please valid enter position");
	}
}
