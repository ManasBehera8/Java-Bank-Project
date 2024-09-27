/**
*Thats a banking application mini project using class, object, method,conditional Statement and Method calling
*That Banking project Perfrom operations Like
   >Deposit
   >Withdrawl
   >Check_Balance
   >Display User_information
*/



class BankAccount 
{
	//Static Variable Creation//Variable declaration
	static long AccountNo;
	static String   CName;
	static String  Branch;
	static Double Balance;
    
	
	static void Display(){
		//Display Account information to User 
		System.out.println("Enter Name\t\t\t:"           +CName);
		System.out.println("Enter AccountNo\t\t\t:"  +AccountNo);
		System.out.println("Enter Branch\t\t\t:"        +Branch);
		System.out.println("Enter Current Balance\t\t:"+Balance);
			
	}
	
	
	static double Deposit(double Amount){
		//Deposit Balance to Your account and Show Your Current balance 
		return Amount+Balance;
		
	}
	
	static double Withdrawl(double Amount){
	
		//Withdrawl balance from your account and Shows Balance after withdrawl to user 
		return Balance-Amount;
		
	}
	static Double check_balane(){
		//check balance to check balance
		return Balance;
	}
	
	
}
