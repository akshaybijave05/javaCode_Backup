package A_Inheritance;

class phone
{
	public void on() 
	{
		System.out.println("phone is on ");
	}
}
class smartphone extends phone
{
	@Override
	public void on() 
	{
		System.out.println("smartphone is on ");
	}
}
public class DynamicMethods
{
	

	public static void main(String[] args) 
	{
		phone obj=new smartphone();//call only ssmartphone obj  and overloading and override method call (this is called as run time polymorphism)
		obj.on();

	}

}
