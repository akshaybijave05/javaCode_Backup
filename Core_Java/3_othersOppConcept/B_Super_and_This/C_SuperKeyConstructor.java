package B_Super_and_This;

//super keyword at constructor level  


class AA {
	
	AA() {
		System.out.println("this is super class constructor");
	}
}

class BB extends AA {
	
	BB() {
		// super(); default constructor by default java compiler add but para_meterized
		// const.add by user
		System.out.println("this is subclass constructor");
	}
}

public class C_SuperKeyConstructor {
	
	public static void main(String[] args) {
		
		BB ref = new BB();

	}
}
