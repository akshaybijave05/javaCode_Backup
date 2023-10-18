package A_Constructors;

/*types of constructor---1 default constructor 2.parametrized 3.copy 4.private  

//default constructor
a constructor which does not have any parameter is called default constructor*/

public class B_DefaultConstructor {
	
	int a;
	String name;
	boolean b;

	B_DefaultConstructor()// default constructor or parameterless or zero argument constructor
	{
		a = 10;
		name = "akshay";
		b = true;
		System.out.println(a + "\n" + name + "\n" + b);

	}

	public static void main(String[] args) {
		
		B_DefaultConstructor ref = new B_DefaultConstructor();

	}

}
