package C_arrays;

import java.util.Scanner;
import java.util.Arrays;


public class B_SortingArrays {

	public static void main(String[] args) {
		
		System.out.println("array sort means assending order print");
		int a[] = new int[5];
		System.out.println("enter array elements");
		Scanner s = new Scanner(System.in);

		
		for (int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
		}

		
		Arrays.sort(a);// help of the sort() method sorting arrys
		System.out.println("sorted Array elements:");

		
		for (int b : a)// for each loop
		{
			System.out.print(b + " ");
		}

	}

}
