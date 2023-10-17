package A_simpleProgram;


import java.util.Scanner;


public class G_NestedIfElse {

	public static void main(String[] args) {
		System.out.println("enter any 3 values");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			 System.out.println("greater no is:"+a);
			 
			}
			else
			{
				System.out.println("greater no is:"+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("greater no is:"+b);
			}
			else
			{
				System.out.println("greater no is:"+c);
			}
		}
	}
}

