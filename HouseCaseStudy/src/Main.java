import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Automated obj = new Automated();
		int choice = 0;
		do {
			
			System.out.println("\n---menu-----");
            System.out.println("1.Add new Room");
            System.out.println("2.Add Device to Room");
            System.out.println("3.On Device");
            System.out.println("4.Off Device");
            
            choice = sc.nextInt();
            
            switch(choice)
            {
              case 1 :
              {
            	  obj.addRoom();
              }
              case 2 :
              {
            	  obj.addDevice();
              }
              case 3 :
              {
            	  obj.turnOnDevice();
              }
              case 4 :
              {
            	  obj.turnOffDevice();
              }
              case 5 :
              {
            	  obj.checkStatus();
              }
            }
            
		}while(choice != 0);
	}
}