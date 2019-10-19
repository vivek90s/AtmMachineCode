import java.util.Scanner;


public class ATM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int balance = 50000, deposit , withdrawl ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 for deposite");
		System.out.println("Enter 2 for withdrawl");
		System.out.println("Enter 3 for checking balance");
		System.out.println("Enter 4 to exit");
		System.out.println("choose one num wisely");
		int n = s.nextInt();
		switch (n)
		{
		case 1:
			System.out.println("Enter the amt u want to deposit");
			 deposit = s.nextInt();
		
			balance = balance + deposit;
		System.out.println("Balance: " + balance);
		
		break;
		case 2 :
			System.out.println("Enter the amt u want to withdraw");
			withdrawl = s.nextInt();
			
			balance = balance - withdrawl;
			System.out.println("Balance: " +  "$"  + balance);
		break;
		case 3:
		
			System.out.print("checking balance");
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(2000);
			System.out.println("Balance: " + "$"  + balance);
			
		break;
		case 4 :
		
			System.out.println("exit from transaction process");
		
		}
}
	
	}

