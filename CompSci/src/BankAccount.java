public class BankAccount{
	public String name;
	public double balance;
	public BankAccount(String nm, double amt){
		name = nm;
		balance = amt;
	}
	public void deposit(double dp){
		balance = balance + dp;
		System.out.println("You depostied " + dp);
		System.out.println("The " + name + " account balance is $" + balance);
	}
	public void withdraw(double wd){
		balance = balance - wd;
		System.out.println("You withdrew " + wd);
		System.out.println("The " + name + " account balance is $" + balance);
	}
}