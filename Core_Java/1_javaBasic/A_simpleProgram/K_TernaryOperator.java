package A_simpleProgram;

//find the greater no help of the ternary op i.e. conditional op.


import java.util.Scanner;


public class K_TernaryOperator 
{
	public static void main(String[] args) 
	{
	System.out.println("enter a and b and c values");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int greater=(a>b)?(a>c?a:c):(b>c?b:c);//ternary operator 
	System.out.println("greater no is:"+greater);
	}
}
