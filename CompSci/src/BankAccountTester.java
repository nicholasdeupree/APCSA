import java.util.Scanner;

public class BankAccountTester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Fox Funds.");
		System.out.println("Enter your name: ");
		String name = kb.nextLine();
		System.out.println("Enter the starting balance of " +name + ": ");
		double x = kb.nextDouble();
		double balance = x;
		kb.nextLine();
		BankAccount user1 = new BankAccount(x,name);
		while(true) {
			System.out.println("Would you like to Withdraw, Deposit, or Exit? ");
			String c = kb.nextLine();
			if(c.equalsIgnoreCase("withdraw"))
			{
				System.out.println("Enter the amount you want to withdraw: ");
				double a = kb.nextDouble();
				kb.nextLine();
				user1.withdraw(a);
				balance -=a;
				System.out.println("You withdrew " + a);
				System.out.println("The " +name+ " balance is, $"+ balance+".");
			}
			else if(c.equalsIgnoreCase("deposit"))
			{
				System.out.println("Enter the amount to deposit: ");
				double d = kb.nextDouble();
				kb.nextLine();
				user1.deposit(d);
				balance+=d;
				System.out.println("You deposited "+d);
				System.out.println("The " +name+ " balance is, $"+ balance+".");
			}
			else if(c.equalsIgnoreCase("Exit"))
			{
				System.out.println("Have a nice day!");
				break;
			}
			else
			{
				System.out.println("Please enter \"withdraw\", \"deposit\", Or \"exit\".");
			}
		}
		
	}
}
