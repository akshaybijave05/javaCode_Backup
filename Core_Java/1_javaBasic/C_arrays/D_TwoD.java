package C_arrays;
//2 diamensional array means basically performed matrix operation row ans column

import java.util.Scanner;

public class D_TwoD
{

	public static void main(String[] args)
	{
		int a[][]=new int[2][2];
		System.out.print("enter two dia.arrays values");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			 a[i][j]=s.nextInt();	
			}
		}
        System.out.println("this is matrix");
	
     	for(int i=0;i<2;i++)
	    {
     		for(int j=0;j<2;j++)
     		{
     				
     				System.out.print(a[i]  [j]+" ");	
     		}
     		System.out.println();
	    }
   }
}
