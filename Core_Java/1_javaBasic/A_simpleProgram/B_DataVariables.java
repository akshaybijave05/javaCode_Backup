package A_simpleProgram;

//data types and variable types in java

public class B_DataVariables {
	
	final float GRA_VITY = 9.8f;// constant defined
	int a = 10;// instance var dont access without class object so create obj.
	static double b = 10.5;// static var&local var access without object create.

	public static void main(String[] args) {
		
		boolean c = true;// local var is declare in method or block
		B_DataVariables s = new B_DataVariables();
		System.out.println(s.a);// instance variable
		System.out.println(b); // static var
		System.out.println(c); // local var
		System.out.print(s.GRA_VITY);// constant
		
	}
}
