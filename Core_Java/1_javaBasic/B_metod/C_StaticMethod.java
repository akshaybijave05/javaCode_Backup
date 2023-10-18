package B_metod;

//static method no need object without obj access method i.e. static 

public class C_StaticMethod {
	
	static int add(int a, int b) // static method
	{

		return a + b;
	}

	static void display() {
		
		System.out.println("hello bro, welcome to the static method");
	}

	public static void main(String[] args) {
		
		System.out.println(add(10, 20));
		display();
	}

}
