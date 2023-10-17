package A_Constructors;

//copy constructor- whenever we pass object reference to the constructor then is called copy constructor
//why use?-copy the all content of one object into another object or another constructor.

class a
 {

   int a;String b;
   a()
   {
	 a=05;
	 b="akshaybijave";
     System.out.println(a+" "+b);
   }

   a(a ref )//create class type reference. 
   {
	int c=ref.a; 
	String d =ref.b;
	 System.out.println(c+" "+d);
   }

}


class D_CopyConstructor
{
	public static void main(String[] args) 
	{
	  a ref=new a();
	  a refe=new a(ref);//pass 1st constructor ref
	}
}
 
