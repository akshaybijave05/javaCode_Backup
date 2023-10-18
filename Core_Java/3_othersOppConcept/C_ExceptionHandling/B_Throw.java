package C_ExceptionHandling;

/*throw exception is used to throw the user define exceptions.
 multiple exceptions cannot be thrown.
why used exception handling(error handling)-normal execution flow of program maintaining

*/

public class B_Throw {

	public static void main(String[] args) {
		
		System.out.println(10 / 0);
		throw new ArithmeticException("/by zero");

	}

}
