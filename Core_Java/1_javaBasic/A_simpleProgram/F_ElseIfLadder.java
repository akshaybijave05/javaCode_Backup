package A_simpleProgram;

import java.util.Scanner;

class F_ElseIfLadder {
	
	public static void main(String args[]) {
		
		System.out.println("hey enter your percentage");
		Scanner s = new Scanner(System.in);
		int per = s.nextInt();

		
		if (per >= 60 && per <= 100) {
			System.out.println("first division");
		} else if (per >= 45 && per <= 59)// if else ladder. multiple condition to be used
		{
			System.out.println("second division");
		} else if (per >= 35 && per <= 44) {
			System.out.println("third division");
		} else {
			System.out.println("failed!");
		}
		
	}
	
}
