package C_ExceptionHandling;
/*throws is used when we doesnt want to handle the exception and try to send the exception to the jvm.
multiple exceptions can be declared using the throws.
exception not self-handling so used throws and bypass caller.
why used exception handling(error handling)-normal execution flow of program maintaining*/

public class C_Throws {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(i);
			Thread.sleep(1000);// 1000 thead means 1second
		}

	}

}
