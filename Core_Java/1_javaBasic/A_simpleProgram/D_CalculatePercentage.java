package A_simpleProgram;


//calculate percentage AND FIND THE RESULT PASS OR NOT 
import java.util.Scanner;//by user input use scanner

class D_CalculatePercentage 
{
	public static void main(String[] args) 
	{
		System.out.println("enter your subjects marks(out of 100)");
		System.out.println("subject 1....");
		Scanner O = new Scanner(System.in);// scanner class obj create
		int a = O.nextInt();
		System.out.println("subject 2....");
		int b = O.nextInt();
		System.out.println("subjects3....");
		int c = O.nextInt();
		System.out.println("subject4.....");
		int d = O.nextInt();
		System.out.println("subject5.....");
		int e = O.nextInt();
		int total = a + b + c + d + e;
		System.out.println("obtaine total marks out of 500:" + total);
	
		float percentage = total*100/500;
		System.out.println("my percentage : " + percentage);
		
		if (percentage >= 35) 
		{
			System.out.println("your percentage is:" + percentage);
			System.out.println("you are pass");
		} 
		else
			System.out.println("sry you fail!");
	}
}
