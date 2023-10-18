package A_simpleProgram;

//switch() case  is a multiple choice dicision making selection statement
//it is used when we want to select only one case out of multiple cases.

import java.util.*;

public class J_SwitchCase {
	
	public static void main(String[] args) {
		
		System.out.println("enter a and b values");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("perform any one operation pleasse press any one button");
		System.out.println("1 addition\n2 minus\n3 multiplication\n4 division");
		int choice = s.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			System.out.println(a / b);
			break;
		default:
			System.out.println("invalid input no any operation perform");
			
		}

	}

}