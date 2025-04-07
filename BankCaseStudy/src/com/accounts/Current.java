package com.accounts;

public class Current extends Account
{
	double overdraftLimit;
	public Current() {
		// TODO Auto-generated constructor stub
		overdraftLimit=0;
	}
	public Current(int accno, String name, double balance, double overdraftLimit) {
	    super(accno, name, balance);
	    this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public void withdraw(double amount)
	{
		if(balance+overdraftLimit>=amount)
		{
			 balance -= amount;
		        System.out.println("Withdrawn: " + amount);
		        System.out.println("your balance is:"+balance);
		}
		else
		{
			System.out.println("overdraft limit is insufficient ");
		}
	}
	 public void calInterest(double intrest)
	 {
	        double monInterest = (balance * intrest)/12;
	        balance += monInterest;
	        System.out.println("Interest Calculated: " + monInterest);
	  }
	public void display()
	{
		super.Display();
	}
	@Override
	public void Deposit(double amount)
	{
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    	System.out.println("your balance is:"+balance);
	}

}

