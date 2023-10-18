package A_simpleProgram;

//addition example

import java.util.Scanner;//Scanner class-user runtime input

public class C_Addition {
	
	public static void main(String[] args) {
		
		System.out.print("enter any two nos ");
		Scanner S = new Scanner(System.in);
		int a = S.nextInt();
		int b = S.nextInt();
		int c = a + b;
		System.out.print("addition is " + c);
		
	}
}
