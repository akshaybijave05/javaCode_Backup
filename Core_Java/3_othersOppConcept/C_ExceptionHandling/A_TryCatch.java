package C_ExceptionHandling;

/*Exception is an unwanted or unexpected event, which occurs during the execution of a program, 
i.e. at run time, that disrupts the normal flow of the programs instructions.
 
#Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException,
IOException, SQLException, RemoteException, etc.

1)try  2)catch 3)throw 4)throws 5)finally    */

//exception handling by using try and catch exception 
//try and catch exception only executed predefined exception.
//why used exception handling(error handling)-normal execution flow of program maintaining



public class A_TryCatch
{

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		int a,b,c;
		try
		{
			a=10;b=0;
			c=a/b;
			System.out.println("division is:"+c);
		}
		catch(Exception e) // e is a reference var 
		{
			System.out.println(e);
		}
		System.out.println("main method ended");
		

	}

}
