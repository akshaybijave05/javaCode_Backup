package A_simpleProgram;

import java.util.Scanner;
public class H_ForLoop
 {
    
	public static void main(String[] args)
	 { 
		int a;
		int num;
		System.out.println("enter any no ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
	    for( a=0;a<=10;a++)//know looping repeatation so use for loop
	     {
		  System.out.println("hello");
		  System.out.println("\n"+num*a);		 
	     }
	 	 
	
	     System.out.println("enter while loop value");
	     int b=s.nextInt();
	 
	 
         while(b>=0)//dont know loop repeatation so use while loop
          {
    	  if(b%2==0)
    	   {
    		System.out.println(b+"no. is even");
    		break;
    	   }
    	  else
    	   {
    		System.out.println(b+ " "+"no. is odd");
    		break;
    	   }
	 	 }
     
	}
 }
