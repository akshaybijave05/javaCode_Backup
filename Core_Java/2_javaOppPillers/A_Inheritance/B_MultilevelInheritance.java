package A_Inheritance;
/*multilevel inheritance we have only one super class&multiple 
sub classes called multilevel inheritance*/

class Aaaa   //super class
{
	int a,b,c;
	void add()
	{
		a=10;b=20;
		c=a+b;
		System.out.println("addi is:"+c);
	}
	void sub()
	{
		a=10;b=20;
		c=a-b;
		System.out.println("sub is:"+c);
		
	}
}
class Bbbb extends Aaaa  //sub1 class
{
	void mul()
	{
		a=10; b=20;
		c=a*b;
		System.out.println("mul is:"+c);
		
	}
	void div()
	{
		a=10;b=20;
		c=a/b;
		System.out.println("div is:"+c);
		
	}
}
class Cccc extends Bbbb  //sub2 class
{
	void rem()
	{
		a=10;b=20;
		c=a%b;
		System.out.println("rem is:"+c);
	}
}
public class B_MultilevelInheritance 
{

	public static void main(String[] args)
	{ 
		Cccc obj=new Cccc();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.rem();

	}

}
