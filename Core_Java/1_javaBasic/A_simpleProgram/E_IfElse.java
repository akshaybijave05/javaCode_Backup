package A_simpleProgram;

import java.util.Scanner;


public class E_IfElse 
{
	public static void main(String[] args) 
	{
		System.out.println("enter your password");
		Scanner s=new Scanner(System.in);
	    int psd=s.nextInt();
		if(psd==123) //conditional statements
		{
		  System.out.println("Hello Welcome To my Profile!\n");
		  System.out.println("Name:akshay ashok bijave");
		  System.out.println("age:26yrs\ncontact:9545755694");
		}
		else
		{
			System.out.println("wrong password..!\nplease enter currect password");
		}
	}
}

