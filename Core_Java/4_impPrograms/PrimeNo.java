/*prime no._a prime no. can be divided,without a remainder only by itself and by 1
exa_ 17 can be divided only by 17 and by 1.*/

import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}

		}
		if (count == 2)
			System.out.println(number + "  is a prime number");
		else
			System.out.println(number + "  is a not a prime number");
	}
}
