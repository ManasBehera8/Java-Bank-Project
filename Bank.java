import java.util.Scanner;

/**
*Bank Class Created
*/
class Bank 
{
	public static void main(String[] args) 
	{
		//calling method from main method
		Scanner S = new Scanner(System.in);
		/*Scanner object Creation For taking input from keyboard*/
		System.out.print("Enter Your Name Here:");
		BankAccount.CName     = S.nextLine();
		
		
		System.out.print("Enter Your AccountNo here:");
		BankAccount.AccountNo = S.nextLong();
		S.nextLine();
		
		System.out.print("Enter Your Bank Branch Here:");
		BankAccount.Branch    = S.nextLine();
		
		
		System.out.print("Enter Your Current Balance Here:");
		BankAccount.Balance   = S.nextDouble();
		
		System.out.println();
		System.out.println();
		
		System.out.println("========================================================");
		BankAccount.Display();
		System.out.println("========================================================");
		
		System.out.println();
		System.out.println();
		
		System.out.println("========================================================");
		System.out.print("Enter Action Which one You Want to Do :");
		/*Action variable created for which operation you want to perform*/
		String Actions = S.next();
		
		
		if (Actions.equalsIgnoreCase("Deposit"))
		{
			System.out.println("========================================================");
		    System.out.print("Enter Deposit amount here:");
		    double Amount = S.nextDouble();
		    double Credit = BankAccount.Deposit(Amount);
		    System.out.println("Your Current Account Balance:"+Credit);
		    System.out.println("Your  " +Amount+ "  Sucessfully Credited to your Account");
		    System.out.println("========================================================");
		}else if (Actions.equalsIgnoreCase("Withdrawl"))
		{
			System.out.println("========================================================");
		    System.out.print("Enter Withdrawl amount here:");
		    double Amount = S.nextDouble();
		    double Debit = BankAccount.Withdrawl(Amount);
		    System.out.println("Your Current Account Balance:"+Debit);
		    System.out.println("Your  " +Amount+ " Sucessfully Debited from your Account");
		    System.out.println("========================================================");
		}else if (Actions.equalsIgnoreCase("CheckBalance"))
		{
			System.out.println("========================================================");
		    double Balance = BankAccount.Balance;
		    System.out.println("Your Current Account Balance:"+Balance);
		    //System.out.println("Your  " +Amount+ " Sucessfully Debited from your Account");
		    System.out.println("========================================================");
		}
		else{
			System.out.println("invalid Action You Want To Perform");
		}
		
		
		
		
	}
}
