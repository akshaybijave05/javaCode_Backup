package A_Inheritance;

/*Multiple inheritance doesn't support but by using interface achieve multiple inheritance in java.
why multiple inheritance is not supported in java?
Consider a case where class B extends class A and Class C and both class A and class C 
have the same method display(). Now java compiler cannot decide, which display method it should inherit.
To prevent such situation, multiple inheritance is not allowed in java.*/ 


interface Aaa    //super  1
{
	void show();  //(public+abstract)
	void display();
}
interface Bbb   //super 2
{
	void show();  //(public+abstract)
}
class C implements Aaa,Bbb  //sup
{
	public void show() 
	{
		System.out.println("interface A and B ");
	}
	public void display()
	{
		System.out.println("interface A");
	}
}
public class C_MultipleInheritance
{
	public static void main(String[] args)
	{
	  C obj=new C();
	  obj.show();
	  obj.display();
	}
}
