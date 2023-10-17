package B_Super_and_This;

//super keyword use at parameterized constructor 

class Hello
{
	Hello(int a)
	{
		System.out.println("this is super class constructor "+a);
	}
}


class Hii extends Hello
{
 Hii()
 {   
  super(100);//parameterized constructor self defined but default constructor java compiler by default add.
  System.out.println("this is subclass constructor");
 }

}


class D_SuperKeyParaConstructor
{
	public static void main(String[] args)
	{
		Hii ref=new Hii();
		
	}

}
