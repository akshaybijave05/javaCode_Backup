/*default access modifier used
default modifier by default don't need write a default keyword.*/

package E_package;
class boy1  
{
	void display() //default within a package anywere used to.
	{
		System.out.println("boy is handsome..!");
	}
} 
class B_DefaultPackage
{
	public static void main(String[] args) 
	{
		boy1 obj=new boy1();
		obj.display();
    }
}
