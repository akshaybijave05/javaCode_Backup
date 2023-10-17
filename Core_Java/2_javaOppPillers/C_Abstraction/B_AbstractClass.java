package C_Abstraction;

/*in java we can achieve abstraction two ways...
1)abstract class(0 - 100% abstraction achieve)
2)interface(100% abstraction achieve).


Abstract class_
1)if a class contain at least one abstract method is called as abstract class.
2)we cant create object for abstract class.
3)if contain both abstract and non abstract methods.
4)whenever the action is common but implementations are different than we should use abstract method.*/


//abstract class example..action common but beheviour different so used to abtract


abstract class animal  // this is a abstract class beacause abstract methods present in a class
{
	void legs()
	{
		System.out.println("all animals have 4 legs");
		
	}
	abstract void sound();  //abstract method and all abstract methods any class extends so all methods compulsory defined in extends class
	abstract void eat();
}

class dog extends animal
{
	@Override
	void sound()
	{
		System.out.println("boww bowww");
	}  

	void eat()
	{
		System.out.println("meat eating");
	}
}

class cow extends animal
{
	@Override
	void sound()
	{
		System.out.println("hmmbaa hmmbaa");
	}

	void eat()
	{
		System.out.println("grass eating");
	}
	
}

public class B_AbstractClass
{

	public static void main(String[] args)
	{
          dog ref=new dog();// abstract class cant create object.
          cow ref1=new cow();
          ref.legs();
          ref.sound();
          ref.eat();
          ref1.legs();
          ref1.sound();
          ref1.eat();
   
	}

}
