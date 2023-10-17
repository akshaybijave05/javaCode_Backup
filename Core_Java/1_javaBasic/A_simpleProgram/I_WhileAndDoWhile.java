package A_simpleProgram;

import java.util.Scanner;

public class I_WhileAndDoWhile
{

	public static void main(String[] args) 
	{
		int i=10;
		while(i<=20)//dont know condition use while loop
		{
			System.out.println(i);
			i++;
		}
/////////////////////////////////////////////////////////////////////////		
		
		
		

		int k=0;
		do  //do while loop at least one time execute then check condition 
		{
			System.out.println("do while loop "+k);
			k++;	
		}
		while(k<5);
		
		
		
	   System.out.println("second do while loop"); 
	   int j=10;
	   do//do_while loop at least one iteration then check condition 
	   {
		   System.out.println(j);
		   j++;
	   }
	   while(j<5);
	}
	
}
