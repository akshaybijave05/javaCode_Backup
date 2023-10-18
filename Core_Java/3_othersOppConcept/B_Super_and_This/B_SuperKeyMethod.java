package B_Super_and_This;

//super keyword at methods level


class AAA
{
	
	void display()//super cls and sub cls both methods name are same
	{
	  System.out.println("this is super class method ");
	}
}


class BBB extends AAA
{
	
	void display()
	{   
		super.display();//call super method
		System.out.println("this is subclass method");
	}
}


class B_SuperKeyMethod
{

	public static void main(String[] args) 
	{
	 BBB ref=new BBB();
	 ref.display();
	}

}
