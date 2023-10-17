package A_class_And_object;

/*class is a group of elements having common properties and behaviours 
(i.e. collections of data types and methods constructor) class does not any memory.
note.1) class is virtual(logical part) 2) object is real
types.1) user defined like person 2)pre-defined like System,String,Scanner,etc*/


public class ClassAndObject
{
	int age=24;//common properties
	int weight=57;
	String colour="brown";
	
	/*void sleep();
	{
		System.out.println("I'm sleeping");
	}*/
	void eat()//common behaviours
	{
		System.out.println("I'm eating");
	}
	public static void main(String[] args)
	{
	  ClassAndObject p=new ClassAndObject();//object create 
	  System.out.println(p.age);
	  System.out.println(p.weight);
	  System.out.println(p.colour);
	  p.eat();
	}

}
