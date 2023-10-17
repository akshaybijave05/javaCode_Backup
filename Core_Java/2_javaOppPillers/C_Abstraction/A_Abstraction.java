package C_Abstraction;

/*Abstraction: is nothing but hinding the essential info and
highlight the only set of services.*/
//abstractoin:is provided the security & data hiding simple bank example.

import java.util.Scanner;
abstract class sbiBank
{
	public String name="state bank of india";
	public String ifsc="SBIN0008449";
	 
	public void BankDetail()
	{
		System.out.println("Bank Name:"+name+"\nIFSC CODE:"+ifsc);
	}
	abstract void Deposite();//abstract method does not body
	abstract void Withdraw();
	abstract void checkBalance();
}
class BankServices extends sbiBank
{
	private double bal=50000;
	private int psd;
	public double money;
	
	public void Deposite()
	{
		System.out.println("enter your passaword");
		Scanner s=new Scanner(System.in);
		psd=s.nextInt();
		if(psd==123)
		{	
			System.out.println("enter deposite amount:");
			money=s.nextInt();
	    	bal=bal+money;
	    	System.out.println("deposite money:"+ money);
		    System.out.println("total balance:"+bal);
		}
		else
		{
			System.out.println("wrong passaward\n enter your correct passaward");
		}
	}
	public void withdraw()
	{
		System.out.println("enter your passaward");
		Scanner s=new Scanner(System.in);
		psd=s.nextInt();
		if(psd==123)
		{
			System.out.println("enter withdraw amount:");
			money=s.nextInt();
			bal=bal-money;
			System.out.println("withdraw money:"+money);
			System.out.println("total balance:"+bal);
		}
		else
		{
			System.out.println("wrong passaward\n please enter correct passaward");
		}
	}
	public void checkBalance()
	{
		System.out.println("enter your passaward");
		Scanner s=new Scanner(System.in);
		psd=s.nextInt();
		if(psd==123)
		{
			System.out.println("total balance:"+bal);
			
		}
		else
		{
			System.out.println("wrong passaward\nplease enter correct passaward");
		}
	}
	
	@Override//ignore override method
	void Withdraw() 
	{
		
	}
}
public class A_Abstraction 
{
	public static void main(String[] args) 
	{
	 BankServices ref=new BankServices();
	 ref.BankDetail();
	 System.out.println("\nbank provided services\n1.Deposite\n2.Withdraw\n3.checkBalance\nenter your choice");
	 int ch;
	 Scanner s2=new Scanner(System.in);
	 ch=s2.nextInt();
	 switch(ch)
	 {
	 case 1:ref.Deposite();
	        break;
	 case 2:ref.Withdraw();
	        break;
	 case 3:ref.checkBalance();
	        break;
	 default:System.out.println("enter valid no");
	 }
   }
}
