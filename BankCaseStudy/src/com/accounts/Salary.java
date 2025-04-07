package com.accounts;

import java.time.LocalDate;

public class Salary extends Savings
{
	 LocalDate lasttransection;
	 public Salary() 
	 {
		// TODO Auto-generated constructor stub
	}
	 public Salary(int accno, String name, double balance, double intrest) {
		    super(accno, name, balance, intrest);
		 
		}
	public LocalDate getLasttransection() {
		return lasttransection;
	}
	public void setLasttransection(LocalDate lasttransection) {
		this.lasttransection =  LocalDate.now();
	}
	public LocalDate AccountActive()
	{
		LocalDate twomonago=LocalDate.now().minusMonths(2);
		if(lasttransection.isAfter(twomonago))
		{
			return lasttransection;
		}
		else
		{
			return null;
		}
	} 
	  public void Deposite(double balance)
	  {
		  if(AccountActive()!=null)
		  {
			  super.Deposit(balance);
			  this.lasttransection=LocalDate.now();
		  }
		  else
		  {
			  super.Deposit(balance);
			  System.out.println("your accoint is frozen");
		  }
	  }
	  public void Withdraw(double amount)
	  {
		  if(AccountActive()!=null)
		  {
			  super.withdraw(amount);
			  this.lasttransection=LocalDate.now();
		  }
		  else
		  {
			  System.out.println("your account is frozen");
		  }
		 
	  }
}
