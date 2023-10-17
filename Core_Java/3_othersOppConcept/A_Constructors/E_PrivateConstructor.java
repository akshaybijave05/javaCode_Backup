package A_Constructors;


/*private constructor-in java it is possible to write a constructor as a private but according
 to the rule we cant access private member outside of class*/ 


class E_PrivateConstructor
{   
	int a;
	String b;

	private E_PrivateConstructor()//private constructor does not access another class i.e. data is private
	{
	 a=50;
	 b="akshay";
	 System.out.println(a+" "+b);
	}


	public static void main(String[] args)
	{
		E_PrivateConstructor ref=new E_PrivateConstructor();

	}

}