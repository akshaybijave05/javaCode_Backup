package B_Polymorphism;

/*runtime polymorphism_ a polymorphism which exists at the time of
execution of program is called runtime or dynamic polymorphism. 
*/

//runtime/dynamic polymorphism achieve in java by using method,constructor overriding.


class shape
{
	void draw()
	{
	  System.out.println("can't say shape type");	
	}
}

class square extends shape
{
	@Override
	void draw()   //method override only achieve by using inheritance
	{
	  System.out.println("square shape");
	}
}

public class B_Runtime
{

	public static void main(String[] args) 
	{
   
          shape obj=new square();
          obj.draw();

	}

}

