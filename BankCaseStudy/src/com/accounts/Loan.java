
package com.accounts;

public class Loan extends Account
{
	double loanamount;
    static final double linterest = 0.08;
	public Loan() {
		
	}
	public Loan(int accno, String name, double balance,double loanamount) {
		super(accno,name,balance);
		this.loanamount = loanamount;
	}
	public double getLoan_amount() {
		return loanamount;
	}
	public void setLoan_amount(double loanamount) {
		this.loanamount = loanamount;
	}
	public static double getInterestRate() {
		return linterest;
	}
	public void display()
	{
		super.Display();
		System.out.println("Loan Amount : "+loanamount);
	}
	public void withdraw(double amount)
	{
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	        System.out.println("your balance is:"+balance);
	}
	    @Override
	    public void calInterest(double amount )
	    {
	        double interest = getBalance() * linterest / 12;
	        Withdraw(interest);
	    }
}

