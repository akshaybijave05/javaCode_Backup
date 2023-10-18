package B_Super_and_This;

/*whenever the name of instance & local var.bothe are same then runtime environment jvm gets confused
that which one is local var & which one is instance var, to avoid this problem we should use this keyword.*/

public class F_ThisKeyVar {
	
	int a; // instance var

	F_ThisKeyVar(int a) // local var
	{
		this.a = a; // this keyword use to local and instance var same and jvm confuse,so this
					// keyword avoid the problem.
		System.out.println(a); // this.a is instance var and print
	}

	public static void main(String[] args) {
		
		F_ThisKeyVar ref = new F_ThisKeyVar(100);
	}

}
