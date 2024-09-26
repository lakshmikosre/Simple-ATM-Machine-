package Java.Oops;

import java.util.Scanner;

class ATM
{
	float Balance;
	int PIN = 5555;
    
	public void greet()
	{
		System.out.println("Hello Dear user 🤗" + "\n" + "Welcome to our ATM Machine");
		System.out.println("__________________________________________________");
	}
	public void Bye()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Happy transaction " +"\n" +"Come again😁");
	}
	public void checkpin()
	{
		System.out.println("     ");
		System.out.println("Enter your pin: - ");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		
		if(enteredpin==PIN)
		{
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
			menu();
		
		}
		
	}
	
	@SuppressWarnings("resource")
	public void menu()
	{
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw money");
		System.out.println("3. Deposit Money");
		System.out.println("4 .EXIT");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt == 1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
			Bye();
			return;
        
		}
		else {
			System.out.println("Enter a valid choice");
		}
	
	}
	public void checkBalance()
	{
		System.out.println("Balance: "+Balance);
		menu();
	}
	public void withdrawMoney()
	{
		System.out.println("Enter amount to Withdraw:  ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
	
		if(amount>Balance)
		{
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance  - amount ;
			System.out.println("Money Withdraw Successful");
		}
		menu();
	}
	
	@SuppressWarnings("resource")
	public void depositMoney()
	{
		System.out.println("Enter the amount");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance =Balance + amount ;
		System.out.println("Money Deposited Successfully");
		
		menu();
		
		System.out.println("     ");
	}
	
}
public class ATMMachine {

	public static void main(String[] args) {
	       
		ATM obj = new ATM();
		obj.greet();
		obj.checkpin();
	}


}
