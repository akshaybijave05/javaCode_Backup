package corejavapractice;


public class Constructor {
	
	int a;
	String b;

	
	//default constructor 
	Constructor(){
		a=5;
		b="akshay";
		System.out.println(a +"  "+b);		
	}

	//parameterized constructor
    Constructor(int a,int b){	
    	 
		System.out.println(a+" "+b);			
	}
    
    //private constructor
    private Constructor(String name) {
    	
        System.out.println(name);
    }
     
 
    //copy constructor
    Constructor(Constructor obj){
    	int c=obj.a;
    	String d=obj.b;
    	System.out.println(c+" "+d);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor ref=new Constructor();
		Constructor ref1=new Constructor(20,10);
		Constructor ref2=new Constructor("AkshayBijave");
		Constructor ref3=new Constructor(ref);
	}

}
