package com.accounts;


public class Savings extends Account
{

	double minimumbal=10000;
	double intrest;
   public Savings() 
   {
	// TODO Auto-generated constructor stub
   }
   public Savings(int accno, String name, double balance, double intrest) {
	    super(accno, name, balance);
//	    this.minimumbal = minimumbal;
	    this.intrest = intrest;
	}
public double getminimumbal() {
	return minimumbal;
}
public void setminimumbal(double minimumbal) {
	this.minimumbal = minimumbal;
}
public double getIntrest() {
	return intrest;
}
public void setIntrest(double intrest) {
	this.intrest = intrest;
}
public void withdraw(double amount)
{
	if (balance-amount>=minimumbal)
	{
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("after withdraw balance is:"+balance);
    } 
	else 
	{
        System.out.println("insufficient balance");
    }
}

public void Deposit(double amount)
{
	
	if (amount > 0)
	{
        balance += amount;
        System.out.println("Deposited: " + amount);
    	System.out.println("your balance is:"+balance);
    } 
	else 
	{
        System.out.println("Invalid deposit amount");
    }
}
 public void calInterest(double intrest_rate)
 {
   double monthlyInterest = (balance * intrest_rate)/12;
        balance += monthlyInterest;
        System.out.println("Interest of your account: " + monthlyInterest);
    }
 
 public void Display()
	{
		super.Display();
	}
}
