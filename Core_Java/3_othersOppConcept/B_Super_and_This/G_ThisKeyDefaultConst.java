package B_Super_and_This;


//this keyword used we want to  call the default constructor of its own class.


public class G_ThisKeyDefaultConst
{
G_ThisKeyDefaultConst() //default constructor
{
	System.out.println("this keywod used  to default constructor of it call own class");
}
G_ThisKeyDefaultConst(int a)
{
	
	this();//call default constructor
	System.out.println(a);
}

	public static void main(String[] args)
	{
		G_ThisKeyDefaultConst ref=new G_ThisKeyDefaultConst(100 );
	}

}

