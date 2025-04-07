package com.banks;
import com.accounts.*;
import java.time.LocalDateTime;

import java.util.Scanner;

public class Bank {

	Scanner sc = new Scanner(System.in);
	 int size;
	 int count;
	Account[] account;
    DailyReport[] reportarr=new DailyReport[50];
    int transection=0;
	 
	 public Bank(String bankName, int size)
	 { 
	  this.size = size;
	  this.count = 0;
	  account = new Account[size];
	 }
	 
	 public int login()
	 {
		 System.out.println("Enter user id : ");
		 String user = sc.nextLine();
		 System.out.println("Enter user password :");
		 int pass = sc.nextInt();
		 
		 String datauser = "rushi";
		 int datapass = 2312;
		 
		 if(datauser.equals(user)==true  &&  datapass == pass)
		 {
			 System.out.println("login Succesfull");
		 }else
		 {
			 System.out.println("login Failed");
			 return -1;
		 }
		return 0;
	 }		 
	 
	 int accountNo = 123;
	 
	 public void CreateAccount()
	 {
	  System.out.println("1 Current Account");	 
	  System.out.println("2 Saving Account");
	  System.out.println("3 Salary Account");
	  System.out.println("4 Loan Account");
	  
	  int ch = sc.nextInt();
	  
	  switch(ch)
	  {
	   case 1:
	   {
		    System.out.println("Enter the Holder Name : ");
		    sc.nextLine();
		    String name = sc.nextLine();
		    System.out.println("Enter the balance : ");
		    double balance = sc.nextDouble();
		    double OverdraftLimit = 20000;
		    accountNo++;
		    account[count] = new Current (accountNo,name, balance,OverdraftLimit );
		    reportarr[transection] = new DailyReport(account[count].getAccno(),account[count].getName(),LocalDateTime.now(), "accunt created");
		    transection++;
		    System.out.println("Account is Created Succesfully\n");
		    System.out.println("Your Account Number is : " + this.accountNo);
		    count++;
		    break;
	   }
	   case 2:
	   {
		    System.out.println("Enter the Holder Name : ");
		    sc.nextLine();
		    String accholdername = sc.nextLine();
		    System.out.println("Enter the balance : ");
		    double balance = sc.nextDouble();
		    double intrest=0.05;
		     accountNo++;
		     account[count] = new Savings(accountNo,accholdername,balance,intrest);
		     reportarr[transection] = new DailyReport(account[count].getAccno() , account[count].getName(), LocalDateTime.now(), "accunt created");
		     transection++;
		     System.out.println("Account is Created Succesfully\n");
		     System.out.println("Your Account Number is : " + this.accountNo);
		     count++;
		    break;
	  
	   }
	   case 3:
	   {
		   System.out.println("Enter the Holder Name : ");
		    sc.nextLine();
		    String name = sc.nextLine();
		    System.out.println("Enter the balance : ");
		    double balance = sc.nextDouble();
		    double intrest_rate=-0.05;
		 
		     accountNo++;
		     account[count] = new Salary (accountNo, name, balance, intrest_rate); 
		     reportarr[transection] = new DailyReport(account[count].getAccno(),account[count].getName(),LocalDateTime.now(), "accunt created");
		     transection++;
		     System.out.println("Account is Created Succesfully\n");
		     System.out.println("Your Account Number is : " + this.accountNo);
		     count++;
		    break;
	   }
	   case 4:
	   {
	    System.out.println("Enter the Holder Name : ");
	    sc.nextLine();
	    String name = sc.nextLine();
       System.out.println("Enter the balance : ");
	    double balance = sc.nextDouble();
	    System.out.println("Enter the Loan Amount : ");
	    double Loan_Ammount = sc.nextDouble();
	    accountNo++;
	    account[count] = new Loan (accountNo, name, balance, Loan_Ammount);
	    reportarr[transection] = new DailyReport(account[count].getAccno() , account[count].getName(), LocalDateTime.now(), "accunt created");
	      transection++;
	    System.out.println("Account is Created Succesfully\n");
	    System.out.println("Your Account Number is : " + this.accountNo);
	    count++;
	    break;
		   
		 
     }
     default: 
     {
         System.out.println("Invalid....");
     }
 }
	  
	   }
	 public void DeleteAccount() 
	 {
	  System.out.println("Enter the Account Number : ");
	  int accNum = sc.nextInt();
	  for(int i=0; i<=count; i++) 
	  {
	        if(account[i].accno == accNum)
	          {
	            for(int j=i; j<=count; j++) 
	              {
	                 account[j] = account[j+1];
	              }
	              count--;
	              System.out.println("Account is Deleted...");
	              break;
	           }else
	           {
	        	   System.out.println("Invalid Account Number...");
	           }
	   
	  }
	 }
	 public void UpdateAccount()
	 {
		 System.out.println("Enter Account Number : ");
		 int accNum = sc.nextInt();
		 int result = 0;
		 for(int i=0;i<count;i++)
		 {
			 if(account[i].accno == accNum)
			 {
				 result = i;
				 System.out.println("Account are found");
			 }else
			 {
				 result = -1;
			 }
			 break;
		 }
		 if(result != -1)
		 {
		 System.out.println("Enter account Holder name to update");
		 sc.nextLine();
		 String newname = sc.nextLine();
		 account[result].setName(newname);
		 System.out.println("account updated succesfully");
		 return;
		 }else
		 {
			 System.out.println("Account are not found");
		 }
	 }
	 public void Activites() 
	 {
	  System.out.println("Enter the Account Number : ");
	  int accNum = sc.nextInt();
	  for(int i=0; i<=count; i++) 
	  {
		  if (account[i].getAccno() == accNum)
	   {
	    System.out.println("1 Deposite Account");	  
	    System.out.println("2 Withdraw Account");
	    System.out.println("3 Calculate Interest");
	    int ch = sc.nextInt();
	    switch(ch)
	    {
	     case 1:
	     {
	    	  System.out.println("Deposite Amount : ");
		      int amount = sc.nextInt();
		      account[i].Deposit(amount);
		      reportarr[transection] = new DailyReport(account[i].getAccno() , account[i].getName(), LocalDateTime.now(), "deposit");
		      transection++;
		      break;
	     }
	     case 2:
	     {
	    	  System.out.println("Withdraw Amount : ");
		      int wamount = sc.nextInt();
		      account[i].Withdraw(wamount);
		      reportarr[transection] = new DailyReport(account[i].getAccno(),account[i].getName(),LocalDateTime.now(),"withdraw");
		      transection++;
		    
		      break;
	     }
	     case 3:
	     {
	      account[i].calInterest(0.07);
	      break;
	     }
	    }
	    break;
	   }
	  }
	 }
	 public void Display()
	 {
	     for(int i=0; i<count; i++)
	     {
	         account[i].Display();
	        System.out.println();
	     }
	 }
	public void DailyReport()
	 {
		 for (int i = 0; i < transection; i++) {
		        DailyReport report = reportarr[i];
		            System.out.println("Account number :"+report.getAccno());
		            System.out.println("Holder name    :"+report.getHolderName());
		            System.out.println("Date and time  :"+report.getTime());
		 }
		    if (transection == 0) {
		        System.out.println("There are no DailyReports today.");
		    }
	 }
}
