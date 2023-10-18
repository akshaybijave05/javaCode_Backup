package B_metod;


public class B_Method {
	
	void add()// non static method
	{
		System.out.println("call method");
	}

	//return type int because return int value
	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		B_Method s = new B_Method();
		s.add();// call method
		System.out.println(s.add(10, 10));// method calling

	}

}
