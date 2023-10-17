package D_Encapsulation;

import java.util.Scanner;

//encapsulation provided security so bank example and data members should be private and methods are public.

class bank
{
	private double bal=50000; //data memb.always private in encapsulation 
	private int psd;          //encapsulation provided the security
  public void deposite(double money)  //methods always public 
  {
	System.out.println("enter password");
	Scanner s=new Scanner(System.in);
	psd=s.nextInt();
	if(psd==123)
	{
		bal=bal+money;
		System.out.println("deposite money:"+money);
		System.out.println("total balance:"+bal);
		
	}
	else
	{
		System.out.println("wrong password");
		
	}
  }	
  
   public void withdraw(double money)	
   {
	   System.out.println("enter password");
	   Scanner s=new Scanner(System.in);
	   psd=s.nextInt();
	   if(psd==123)
	   {
		   bal=bal-money;
		   System.out.println("withdrol money:"+money);
		   System.out.println("total balance:"+bal);
		   
	   }
	   else
	   {
		   System.out.println("wrong passward");
		   
	   }
   }
 
   public void checkbal()
   {
	   System.out.println("enter password");
	   Scanner s=new Scanner(System.in);
	   psd=s.nextInt();
	   if(psd==123)
	   {
		   System.out.println("total balance:"+bal);
	   }
	   else
	   {
		   System.out.println("wrong passward");
	   }
   }
}
public class B_BankServices 
{
	public static void main(String[]args)	
	{
		bank ref=new bank();
		
		System.out.println("1.deposite\n2.withdrol\n3.checkbalance.\n\nenter your choise");
		Scanner s2=new Scanner(System.in);
		int ch;
		ch=s2.nextInt();
		switch(ch)
		{
		case 1: ref.deposite(10000);
		        break;
		case 2: ref.withdraw(5000); 
		        break;
		case 3: ref.checkbal();
		        break;
		default:System.out.println("wrong input plz correct input enter");
		}
	}

}
