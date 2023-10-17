package B_Super_and_This;

//this keyword refers to the current object inside a method or constructor

//this keyword simple example refer to the current obj 

public class E_ThisKey
{  
 
void display() 
{
	System.out.println(this);//this keyword refer to the current obj .
}
	public static void main(String[] args)
	{ 
	  
	  E_ThisKey ref=new E_ThisKey();
	  System.out.println(ref);
	  ref.display();
	 
	  
	}

}
