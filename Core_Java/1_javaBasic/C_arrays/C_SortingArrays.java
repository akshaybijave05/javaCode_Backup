package C_arrays;

import java.util.Arrays;

public class C_SortingArrays {
	
	public static void main(String[] args) {
		
		int a[] = { 10, 9, 8, 40, 5 };// one diamensional array
		System.out.println("array third value print:");
		System.out.println(a[2]);
		
		// for each loop only use with an array
		System.out.println("sorting array");
		Arrays.sort(a);//sorting array help of the sort()
		
		for (int b : a)// for each loop help print all arays elements
		{
			System.out.print(b + "   ");
		}

	}

}
