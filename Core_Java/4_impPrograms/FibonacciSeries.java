//fibonnacci series start with 0 or 1 means 0 1 1 2 3 5 8 etc.
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		System.out.print(a + ",");
		
		for (int i = 1; i <= 10; i++)// printing first 10 no. of fibonacci series
		{
			System.out.print(b + ",");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
