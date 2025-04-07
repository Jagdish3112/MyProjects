package com.accounts;

public class Account 
{
	  public int accno;
	  String name;
	  double balance;
	  
	  public Account() {
		// TODO Auto-generated constructor stub
		  accno=0;
		  name="not";
		  balance=0;
	}
	public Account(int accno, String name, double balance) 
	{
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		
	}
	public  int getAccno() 
	{
		return accno;
	}
	public void setAccno(int accno) 
	{
		this.accno = accno;
	}
	public  String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void Deposit(double amount) {
	    balance = balance + amount;
	    System.out.println("Deposit Amount is :"+amount);
	    System.out.println("Balance After Deposit is : "+balance);
	}

	public void Withdraw(double amount) 
	{
	    if (balance >= amount) 
	    {
	        balance = balance - amount;
	        System.out.println("Deposit Amount is :"+amount);
	        System.out.println("your Balance is : "+balance);
	    } 
	    else 
	    {
	        System.out.println("Insufficient balance.");
	    }
	}
	public void Display()
	{
		System.out.println("Account number is:         "+accno);
		System.out.println("Holder name is:            " +name);
		System.out.println("Balance in you account is :"+balance);
	}
	public  void calInterest(double intrest)
	{
		
	}
}
