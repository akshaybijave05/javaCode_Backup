package A_Constructors;


/*consstrustor is a special type of method whose name is same as class name.
note-1)the main purpose of constructor is initialize the object.
2)every java class has a one default constructor.
3)a constructor is automatically called at the time of object create.
4)a constructor never contain any return type including void.*/

public class A_SimpleConstructor 
{ 
	int a;String s;//instance var
    A_SimpleConstructor() //constructor
	{
	  a=5;s="akshay";
	  System.out.print(a+" "+s);
	}
    
	

	public static void main(String[] args)
	{
	  A_SimpleConstructor ref=new A_SimpleConstructor();//constructor call
	}
}
