package A_Constructors;


/*parametrized constructor- a constructor through which we can pass one or more parameters is call 
parametrized constructor*/ 


class PConst
{    
	 PConst(int a,int b)//parametrized constructor declare
	 {  
		 System.out.println("test is double parameterized constructor");
		 System.out.println("value of a:"+a);
		 System.out.println("value of b:"+b);
	 }
}

class C_ParaConstructor
{
	public static void main(String[] args)
	{
	 	PConst ref=new PConst(10,20);
	 	PConst refe=new PConst(20,30);
	}
}