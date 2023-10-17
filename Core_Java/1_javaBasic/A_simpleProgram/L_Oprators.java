package A_simpleProgram;

public class L_Oprators {

	public static void main(String[] args) {

		int a=20,b=30;
		//relational operators
		System.out.println("relational operators");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		//logical operators
		System.out.println("\n\nlogical operators");
		System.out.println(a==b && a!=b);//t t = t
		System.out.println(a==b || a!=b);//f f = f
		System.out.println(!(a>b));//t=f

	}

}
