package A_Inheritance;

/*A inheritance which contain only one super class and multiple sub class and all sub class 
directly extends super class called hierachical inheritance*/

class Aaaaa //super class
{
	void input()
	{
		System.out.println("enter your name");
	}

}

class Bbbbb extends Aaaaa//sup 1 class
{
	void show()
	{
		System.out.println("my name is:Aniket");
	}

}

class Ccccc extends Aaaaa   //sub2 class
{
	void display()
	{
		System.out.println("my name is:Abhijit");
	}

}

public class D_HierarchicalInheritance
{

	public static void main(String[] args)
	{
		Bbbbb obj1=new Bbbbb();
		Ccccc obj2=new Ccccc();
		obj1.input();
		obj1.show();
		obj2.input();
		obj2.display();
		

	}

}
