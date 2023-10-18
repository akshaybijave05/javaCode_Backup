package D_Encapsulation;

/*encapsulation is a mechanism through which we can binding the data members(var) and member methods
 in a single unit.i.e. encapsulation security purpose used
i.e.Encapsulation in Java is a process of wrapping code and data together into a single unit
or hide the data and showing only service is called as encapsulation.*/
/*advantages---
a.Flexible programs b.Easy debugging&testing c.Reusability d.Hiding Data e.data secusrity
why used_ data is safe (security purpose)
*/

//binding data with methods is called as encapsulation


class student {
	private int age; // Private is using to hide the data
	private String name;

	
	// setters and getters
	public int getAge() {
		return age;
	}

	public void setAge(int age)// set the value
	{
		this.age = age;
	}

	public String getName() // get the value
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class A_Encapsulation {
	
	public static void main(String[] args) {
		
		student ref = new student();
		ref.setAge(25);
		System.out.println(ref.getAge());
		ref.setName("akshay");
		System.out.println(ref.getName());
		
	}
}
