package B_Super_and_This;

//this keyword used we want to  call the  parameterized constructor of its own class.

class H_ThisKeyParaConst {
	
	H_ThisKeyParaConst() {
		
		this(100); // call the parameterized constructor.
		System.out.println("this keywod used to parameterized constructor of it call own class");

	}

	H_ThisKeyParaConst(int a) {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		H_ThisKeyParaConst ref = new H_ThisKeyParaConst();
	}
}