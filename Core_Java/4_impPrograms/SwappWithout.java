//swapping a value without  any third variable 
public class SwappWithout {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swapping values are   a="+a+" b="+b);
		//swapping
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping values are    a="+a+" b="+b);
		
		
	}

}
