package corejavapractice;

public class Constructors {

	int a; // instance var
	String b;

	// default constructor
	Constructors() {

		a = 5;
		b = "akshay";
		System.out.println(a + "  " + b);
	}

	// parameterized constructor
	Constructors(int a, int b) {

		System.out.println(a + " " + b);
	}

	// private constructor
	private Constructors(String name) {

		System.out.println(name);
	}

	// copy constructor
	Constructors(Constructors obj) {

		int c = obj.a;
		String d = obj.b;
		System.out.println(c + " " + d);
	}

	public static void main(String[] args) {

		Constructors ref = new Constructors(); // default constructor object create
		Constructors ref1 = new Constructors(20, 10); // parameterized constructor object create
		Constructors ref2 = new Constructors("AkshayBijave"); //// private constructor object create
		Constructors ref3 = new Constructors(ref); // copy constructor object create and copy the obj of default
													// constructor
	}

}
