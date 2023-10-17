package C_Abstraction;

/*interface just like a class,contain only abstract method (100% abstraction achieve)
To achieve interface in java by the help of "implements/interface" keyword.
and interface cant create object*/

//interface example

interface vehicle // interface just like a class,contain only abstract method
{
	String name = "TVs";//interface var by default public+static+final
	int speed = 100;

	void start(); // interface method by default abstract + public
	void stop();
	//from jdk 1.8 onward interface can have default & static methods.
	default void color()
	{
		System.out.println("TVS color is red");
	}
	static void speed()
	{
		System.out.println("TVS speed is 100 km/hr");
	}
}
class customer implements vehicle {
	@Override
	public void start()
	{
		System.out.println("start():insert key and press start button");
	}
    @Override
	public void stop()
	{
		System.out.println("stop():exit key then stop vehicle");
	}
}
public class C_Interface
{
	public static void main(String[] args)
	{
		customer ref = new customer();
		ref.start();
		ref.stop();
		ref.color();
		vehicle.speed();
	}
}
