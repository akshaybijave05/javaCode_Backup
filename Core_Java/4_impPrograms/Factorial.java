import java.util.Scanner;

/*factorial -it is the product of all positive no. which is multiply to itself to its decreasing no.
 ex-5!=5*4*3*2*1=120 */

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a any number");
		int number = sc.nextInt();
		// logic
		int fact = 1;
		
		for (int i = number; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("factorial of " + number + "is__" + fact);
	}
}
