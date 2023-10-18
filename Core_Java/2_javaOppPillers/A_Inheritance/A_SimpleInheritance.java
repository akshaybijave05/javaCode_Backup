package A_Inheritance;

/*one of the key features of OOP that allows us to create a new class from existing class means
 a class to derive properties and behaviors from another class is called as inheritance.
 # in java "extends" keyword is used to perform inheritance
 # it provides code reusability.
 # we cant access private member of class through inheritance.
 # a sub class contain all the feature of super class so,we should create the object of sub class.
 # method overriding only possible through inheritance. */

/*simple/single inheritance nothng but which contain only one super class and only one sub class is
called as simple inheritance */

class Student // super class
{
	int rollNo, marks;
	String name;
	private String batch;// private data member cant inherite.

	void input() {
		System.out.println("enter you rollNo and name and marks");
	}

}

class AkshayBijave extends Student // sub class
{
	void display() {
		rollNo = 55;
		name = "akshay bijave";
		marks = 123;
		System.out.println("rollNo:" + rollNo + "\nname:" + name + "\nmarks:" + marks);
	}

}

public class A_SimpleInheritance {
	
	public static void main(String[] args) {
		
		AkshayBijave obj = new AkshayBijave();
		obj.input();
		obj.display();
	}
}
