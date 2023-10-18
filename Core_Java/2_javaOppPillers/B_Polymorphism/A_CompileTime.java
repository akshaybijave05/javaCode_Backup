package B_Polymorphism;

/*polymorphism_ same object having different behaviour means if one task 
is performed in different ways it is called as polymorphism.
Types of polymorphism 1)compile time and 2)runtime
compile time polymorphism_ A polymorphism which is exists at the time of 
compilation is called compile time or static polymorphism.*/

//compile time/static  polymorphism achieve by using method overloading


class HelloAkshay {
	
	void add() {
		int a, b, c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.println(c);
	}

	void add(int x, int y) {

		int z = x + y;
		System.out.println(z);
	}

	void add(int p, double q) {

		double r = p + q;
		System.out.println(r);

	}
}

public class A_CompileTime {

	public static void main(String[] args) {
		
		HelloAkshay obj = new HelloAkshay();
		obj.add();
		obj.add(55, 25);
		obj.add(22, 18.55);

	}

}
