package com.banks;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  String bName = "SBI";
		  int size = 10;
		  Bank b1 = new Bank(bName,size);
		  int log = b1.login();
		  if(log == 0)
		  {
		  int choice;
		  do 
		  {
		   System.out.println("1 Create Account");
		   System.out.println("2 Delete Account");
		   System.out.println("3 Update Account");
		   System.out.println("4 Account Activites");
		   System.out.println("5 Display Details");
		   System.out.println("6 Daily Report");
		   System.out.println("Enter the choice : ");
		   choice = sc.nextInt();
		   switch(choice)
		   {
		   case 1:
		    {
		     b1.CreateAccount();
		     break;
		    }
		    case 2:
		    {
		     b1.DeleteAccount();
		     break;
		    }
		    case 3:
		    {
		    b1.UpdateAccount();
		    break;
		    }
		    case 4:
		    {
		     b1.Activites();
		     break;
		    }
		    case 5:
		    {
		     b1.Display();
		     break;
		    }
		    case 6:
		    {
		    b1.DailyReport();
		    }
		   }
		  }while(choice != 7);
		  
		  }else
		  {
			  System.out.println("login Again");
		  }
		  
		 }
}



