package B_Super_and_This;


/*super keyword refer to the objects of super class,it is used when we want to call the
 super class var,method&const through sub class object
 1)whenever the super class&sub class var. and method name both are same then it can be used only.
 2)to avoid the confusion between super cls & sub cls vars.and methods that have same name we
 should use super keyword.*/


/*1.super keyword use at variable level*/


class Ak //super class
  {
	  int a=10; //variable name is same 
  }


class Bk extends Ak //subclass
  {
	  int a=30; //class Ak var name is same
	  void display()
	  {
		  System.out.println(a);
		  System.out.println(super.a);//super var call by super keyword
	  }
  }


public class A_SuperKeyVar
{

 public static void main(String[] args) 

  {
		 Bk ref=new Bk();
		 ref.display();
  }

}