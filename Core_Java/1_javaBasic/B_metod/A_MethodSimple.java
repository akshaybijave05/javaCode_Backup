package B_metod;


//method is a group/block of code which take input from the user,processed it and gives output.
//method runs only when it called.
//code reusability
//types of method 1)pre-defined (length(),sort()) 2)user defined


public class A_MethodSimple 
{
	int addition(int a,int b )//user defined method body
	{
		return a+b;
	}

	public static void main(String[] args) 
	{
		A_MethodSimple s=new A_MethodSimple();
		
		System.out.println(s.addition(10,10));//call method
	}

}
