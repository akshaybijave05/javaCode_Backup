/* A package arrange no. of classes,interfaces & sub_packages of same type into a particular group.
types 1)pre-defined(lang,util,io,applet,awt,etc) 2)user defined
Advantage_Reusability,Security,Fast searching,code hiding.*/
//the package which are create by java user for their own use are called user definedd package
//private access modifier used

package E_package; //user defined package
public class A_PrivatePackage 
{
	private void show()//private access modifier only access within class.
	{
		System.out.println("hello it is a private  method");
	}
	public static void main(String[]args)
	{
		A_PrivatePackage obj=new A_PrivatePackage();
		obj.show();
	}

}
